/*
 * Copyright 2018 EPAM Systems
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

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JStatisticsField;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JStatisticsFieldRecord extends UpdatableRecordImpl<JStatisticsFieldRecord> implements Record2<Long, String> {

	private static final long serialVersionUID = 1282583548;

	/**
	 * Setter for <code>public.statistics_field.sf_id</code>.
	 */
	public void setSfId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.statistics_field.sf_id</code>.
	 */
	public Long getSfId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.statistics_field.name</code>.
	 */
	public void setName(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.statistics_field.name</code>.
	 */
	public String getName() {
		return (String) get(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JStatisticsField.STATISTICS_FIELD.SF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JStatisticsField.STATISTICS_FIELD.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getSfId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getSfId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JStatisticsFieldRecord value1(Long value) {
		setSfId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JStatisticsFieldRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JStatisticsFieldRecord values(Long value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JStatisticsFieldRecord
	 */
	public JStatisticsFieldRecord() {
		super(JStatisticsField.STATISTICS_FIELD);
	}

	/**
	 * Create a detached, initialised JStatisticsFieldRecord
	 */
	public JStatisticsFieldRecord(Long sfId, String name) {
		super(JStatisticsField.STATISTICS_FIELD);

		set(0, sfId);
		set(1, name);
	}
}
