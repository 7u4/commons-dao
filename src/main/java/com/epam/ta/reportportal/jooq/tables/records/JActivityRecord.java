/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JActivity;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JActivityRecord extends UpdatableRecordImpl<JActivityRecord> implements Record9<Long, Long, String, Long, String, String, JSONB, Timestamp, Long> {

    private static final long serialVersionUID = -636424269;

    /**
     * Setter for <code>public.activity.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.activity.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.activity.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.activity.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.activity.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.activity.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.activity.project_id</code>.
     */
    public void setProjectId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.activity.project_id</code>.
     */
    public Long getProjectId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.activity.entity</code>.
     */
    public void setEntity(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.activity.entity</code>.
     */
    public String getEntity() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.activity.action</code>.
     */
    public void setAction(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.activity.action</code>.
     */
    public String getAction() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.activity.details</code>.
     */
    public void setDetails(JSONB value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.activity.details</code>.
     */
    public JSONB getDetails() {
        return (JSONB) get(6);
    }

    /**
     * Setter for <code>public.activity.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.activity.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>public.activity.object_id</code>.
     */
    public void setObjectId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.activity.object_id</code>.
     */
    public Long getObjectId() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, Long, String, String, JSONB, Timestamp, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, String, Long, String, String, JSONB, Timestamp, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return JActivity.ACTIVITY.ID;
    }

    @Override
    public Field<Long> field2() {
        return JActivity.ACTIVITY.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return JActivity.ACTIVITY.USERNAME;
    }

    @Override
    public Field<Long> field4() {
        return JActivity.ACTIVITY.PROJECT_ID;
    }

    @Override
    public Field<String> field5() {
        return JActivity.ACTIVITY.ENTITY;
    }

    @Override
    public Field<String> field6() {
        return JActivity.ACTIVITY.ACTION;
    }

    @Override
    public Field<JSONB> field7() {
        return JActivity.ACTIVITY.DETAILS;
    }

    @Override
    public Field<Timestamp> field8() {
        return JActivity.ACTIVITY.CREATION_DATE;
    }

    @Override
    public Field<Long> field9() {
        return JActivity.ACTIVITY.OBJECT_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getUsername();
    }

    @Override
    public Long component4() {
        return getProjectId();
    }

    @Override
    public String component5() {
        return getEntity();
    }

    @Override
    public String component6() {
        return getAction();
    }

    @Override
    public JSONB component7() {
        return getDetails();
    }

    @Override
    public Timestamp component8() {
        return getCreationDate();
    }

    @Override
    public Long component9() {
        return getObjectId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getUsername();
    }

    @Override
    public Long value4() {
        return getProjectId();
    }

    @Override
    public String value5() {
        return getEntity();
    }

    @Override
    public String value6() {
        return getAction();
    }

    @Override
    public JSONB value7() {
        return getDetails();
    }

    @Override
    public Timestamp value8() {
        return getCreationDate();
    }

    @Override
    public Long value9() {
        return getObjectId();
    }

    @Override
    public JActivityRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public JActivityRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public JActivityRecord value3(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public JActivityRecord value4(Long value) {
        setProjectId(value);
        return this;
    }

    @Override
    public JActivityRecord value5(String value) {
        setEntity(value);
        return this;
    }

    @Override
    public JActivityRecord value6(String value) {
        setAction(value);
        return this;
    }

    @Override
    public JActivityRecord value7(JSONB value) {
        setDetails(value);
        return this;
    }

    @Override
    public JActivityRecord value8(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    @Override
    public JActivityRecord value9(Long value) {
        setObjectId(value);
        return this;
    }

    @Override
    public JActivityRecord values(Long value1, Long value2, String value3, Long value4, String value5, String value6, JSONB value7, Timestamp value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JActivityRecord
     */
    public JActivityRecord() {
        super(JActivity.ACTIVITY);
    }

    /**
     * Create a detached, initialised JActivityRecord
     */
    public JActivityRecord(Long id, Long userId, String username, Long projectId, String entity, String action, JSONB details, Timestamp creationDate, Long objectId) {
        super(JActivity.ACTIVITY);

        set(0, id);
        set(1, userId);
        set(2, username);
        set(3, projectId);
        set(4, entity);
        set(5, action);
        set(6, details);
        set(7, creationDate);
        set(8, objectId);
    }
}
