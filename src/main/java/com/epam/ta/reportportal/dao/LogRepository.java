/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.entity.log.Log;
import com.google.api.client.util.Lists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.epam.ta.reportportal.dao.util.RecordMappers.ATTACHMENT_MAPPER;
import static com.epam.ta.reportportal.dao.util.RecordMappers.LOG_MAPPER;
import static com.epam.ta.reportportal.jooq.Tables.LOG;

/**
 * @author Pavel Bortnik
 */
public interface LogRepository extends LogRepositoryCustom {

	Optional<Log> findByUuid(String uuid);

	List<Log> findLogsByLogTime(Timestamp timestamp);

	void updateLaunchIdByLaunchId(@Param("currentLaunchId") Long currentLaunchId, @Param("newLaunchId") Long newLaunchId);

	int updateClusterIdByIdIn(@Param("clusterId") Long clusterId, @Param("ids") Collection<Long> ids);

	int updateClusterIdSetNullByLaunchId(@Param("launchId") Long launchId);

	int updateClusterIdSetNullByItemIds(@Param("itemIds") Collection<Long> itemIds);

	List<Log> findAllById(Iterable<Long> ids);

	Optional<Log> findById(Long logId);

	Log save(Log log);

	List<Log> saveAll(Iterable<Log> logs);

	void flush();

	Log saveAndFlush(Log log);
}
