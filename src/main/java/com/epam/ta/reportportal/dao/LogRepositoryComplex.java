package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.elastic.dao.LogMessageRepository;
import com.epam.ta.reportportal.entity.attachment.Attachment;
import com.epam.ta.reportportal.entity.log.Log;
import com.epam.ta.reportportal.entity.log.LogMessage;
import com.google.api.client.util.Lists;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.epam.ta.reportportal.dao.util.RecordMappers.ATTACHMENT_MAPPER;
import static com.epam.ta.reportportal.dao.util.RecordMappers.LOG_MAPPER;
import static com.epam.ta.reportportal.jooq.Tables.CLUSTERS;
import static com.epam.ta.reportportal.jooq.Tables.LOG;
import static com.epam.ta.reportportal.jooq.tables.JAttachment.ATTACHMENT;

/**
 * This repository has two aims.
 * 1. To combine data for logs from relational DB(Postgresql) and nosql DB(ES).
 * 2. First step to avoid using JPA repository at all in favor of jooq like repositories.
 * But we need to remove using EntityManger carefully.
 */
@Component
public class LogRepositoryComplex extends LogRepositoryCustomImpl implements LogRepository {

    private final JpaRepositoryImplementation<Log, Long> simpleJpaRepository;
    private final LogMessageRepository logMessageRepository;
    private final AttachmentRepository attachmentRepository;

    @Autowired
    public LogRepositoryComplex(EntityManager entityManager, LogMessageRepository logMessageRepository,
                                AttachmentRepository attachmentRepository) {
        this.simpleJpaRepository = new SimpleJpaRepository<>(Log.class, entityManager);
        this.logMessageRepository = logMessageRepository;
        this.attachmentRepository = attachmentRepository;
    }

    public DSLContext getDsl() {
        return dsl;
    }

    private Log fillLogMessage(Log log) {
        Optional<LogMessage> optionalLogMessage = logMessageRepository.findById(log.getId());
        optionalLogMessage.ifPresent(logMessage -> log.setLogMessage(logMessage.getLogMessage()));
        return log;
    }

    @Override
    public Optional<Log> findByUuid(String uuid) {
        return Optional.ofNullable(dsl.select()
                .from(LOG)
                .leftJoin(ATTACHMENT)
                .on(LOG.ATTACHMENT_ID.eq(ATTACHMENT.ID))
                .where(LOG.UUID.eq(uuid))
                .fetchSingle()
                .map(r -> LOG_MAPPER.apply(r, ATTACHMENT_MAPPER)));
    }

    @Override
    public List<Log> findLogsByLogTime(Timestamp timestamp) {
        return dsl.select()
                .from(LOG)
                .leftJoin(ATTACHMENT)
                .on(LOG.ATTACHMENT_ID.eq(ATTACHMENT.ID))
                .where(LOG.LOG_TIME.eq(timestamp))
                .fetch()
                .map(r -> LOG_MAPPER.apply(r, ATTACHMENT_MAPPER));
    }

    public List<Log> findAllById(Iterable<Long> ids) {
        return dsl.select()
                .from(LOG)
                .leftJoin(ATTACHMENT)
                .on(LOG.ATTACHMENT_ID.eq(ATTACHMENT.ID))
                .where(LOG.ID.in(Lists.newArrayList(ids)))
                .fetch()
                .map(r -> LOG_MAPPER.apply(r, ATTACHMENT_MAPPER));
    }

    public Optional<Log> findById(Long logId) {
        return Optional.ofNullable(dsl.select()
                .from(LOG)
                .leftJoin(ATTACHMENT)
                .on(LOG.ATTACHMENT_ID.eq(ATTACHMENT.ID))
                .where(LOG.ID.eq(logId))
                .fetchSingle()
                .map(r -> LOG_MAPPER.apply(r, ATTACHMENT_MAPPER)));
    }

    public Log save(Log log) {
        attachmentRepository.save(log.getAttachment());
        return simpleJpaRepository.save(log);
    }

    public List<Log> saveAll(Iterable<Log> logs) {
        if (logs == null) {
            return null;
        }

        List<Attachment> attachmentList = new ArrayList<>();
        for (Log log : logs) {
            attachmentList.add(log.getAttachment());
        }
        attachmentRepository.saveAll(attachmentList);

        return simpleJpaRepository.saveAll(logs);
    }

    public void flush() {
        simpleJpaRepository.flush();
    }

    public Log saveAndFlush(Log log) {
        Log result = save(log);
        flush();

        return result;
    }

    // 1. Simple query
    // 2. But maybe we need to do something with entity in entity manager
    @Override
    public void updateLaunchIdByLaunchId(Long currentLaunchId, Long newLaunchId) {
        dsl.update(LOG).set(LOG.LAUNCH_ID, newLaunchId).where(LOG.LAUNCH_ID.eq(currentLaunchId)).execute();
    }

    @Override
    public int updateClusterIdByIdIn(Long clusterId, Collection<Long> ids) {
        return dsl.update(LOG).set(LOG.CLUSTER_ID, clusterId)
                .where(LOG.ID.in(ids))
                .execute();
    }

    @Override
    public int updateClusterIdSetNullByLaunchId(Long launchId) {
        var clusterIds = dsl.select(CLUSTERS.ID).from(CLUSTERS).where(CLUSTERS.LAUNCH_ID.eq(launchId));
        return dsl.update(LOG).setNull(LOG.CLUSTER_ID).where(LOG.CLUSTER_ID.in(clusterIds)).execute();
    }

    @Override
    public int updateClusterIdSetNullByItemIds(Collection<Long> itemIds) {
        return dsl.update(LOG).setNull(LOG.CLUSTER_ID)
                .where(LOG.CLUSTER_ID.isNotNull()).and(LOG.ITEM_ID.in(itemIds))
                .execute();
    }

    public void deleteById(Long logId) {
        // delete attachment by logId
        simpleJpaRepository.deleteById(logId);
    }

    public void delete(Log log) {
        attachmentRepository.delete(log.getAttachment());
        simpleJpaRepository.delete(log);
    }
    //////////////
}
