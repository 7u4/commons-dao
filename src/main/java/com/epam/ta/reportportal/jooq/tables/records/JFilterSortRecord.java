/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JFilterSort;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class JFilterSortRecord extends UpdatableRecordImpl<JFilterSortRecord> implements Record4<Long, Long, String, Boolean> {

    private static final long serialVersionUID = -1594668109;

    /**
     * Setter for <code>public.filter_sort.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.filter_sort.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.filter_sort.filter_id</code>.
     */
    public void setFilterId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.filter_sort.filter_id</code>.
     */
    public Long getFilterId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.filter_sort.field</code>.
     */
    public void setField(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.filter_sort.field</code>.
     */
    public String getField() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.filter_sort.ascending</code>.
     */
    public void setAscending(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.filter_sort.ascending</code>.
     */
    public Boolean getAscending() {
        return (Boolean) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JFilterSort.FILTER_SORT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JFilterSort.FILTER_SORT.FILTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JFilterSort.FILTER_SORT.FIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return JFilterSort.FILTER_SORT.ASCENDING;
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
        return getFilterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getField();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getAscending();
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
        return getFilterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getField();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getAscending();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterSortRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterSortRecord value2(Long value) {
        setFilterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterSortRecord value3(String value) {
        setField(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterSortRecord value4(Boolean value) {
        setAscending(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterSortRecord values(Long value1, Long value2, String value3, Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JFilterSortRecord
     */
    public JFilterSortRecord() {
        super(JFilterSort.FILTER_SORT);
    }

    /**
     * Create a detached, initialised JFilterSortRecord
     */
    public JFilterSortRecord(Long id, Long filterId, String field, Boolean ascending) {
        super(JFilterSort.FILTER_SORT);

        set(0, id);
        set(1, filterId);
        set(2, field);
        set(3, ascending);
    }
}
