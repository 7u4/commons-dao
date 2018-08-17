/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.enums.JActivityEntityEnum;
import com.epam.ta.reportportal.jooq.tables.JActivity;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JActivityRecord extends UpdatableRecordImpl<JActivityRecord> implements Record6<Long, Long, JActivityEntityEnum, String, Object, Timestamp> {

    private static final long serialVersionUID = -979424959;

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
     * Setter for <code>public.activity.entity</code>.
     */
    public void setEntity(JActivityEntityEnum value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.activity.entity</code>.
     */
    public JActivityEntityEnum getEntity() {
        return (JActivityEntityEnum) get(2);
    }

    /**
     * Setter for <code>public.activity.action</code>.
     */
    public void setAction(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.activity.action</code>.
     */
    public String getAction() {
        return (String) get(3);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setDetails(Object value) {
        set(4, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getDetails() {
        return get(4);
    }

    /**
     * Setter for <code>public.activity.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.activity.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, JActivityEntityEnum, String, Object, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, JActivityEntityEnum, String, Object, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JActivity.ACTIVITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JActivity.ACTIVITY.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JActivityEntityEnum> field3() {
        return JActivity.ACTIVITY.ENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JActivity.ACTIVITY.ACTION;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field5() {
        return JActivity.ACTIVITY.DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return JActivity.ACTIVITY.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityEntityEnum component3() {
        return getEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAction();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component5() {
        return getDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityEntityEnum value3() {
        return getEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAction();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value5() {
        return getDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value3(JActivityEntityEnum value) {
        setEntity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value4(String value) {
        setAction(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public JActivityRecord value5(Object value) {
        setDetails(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value6(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord values(Long value1, Long value2, JActivityEntityEnum value3, String value4, Object value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
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
    public JActivityRecord(Long id, Long userId, JActivityEntityEnum entity, String action, Object details, Timestamp creationDate) {
        super(JActivity.ACTIVITY);

        set(0, id);
        set(1, userId);
        set(2, entity);
        set(3, action);
        set(4, details);
        set(5, creationDate);
    }
}
