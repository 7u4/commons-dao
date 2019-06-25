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

import com.epam.ta.reportportal.jooq.tables.JFilter;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JFilterRecord extends UpdatableRecordImpl<JFilterRecord> implements Record4<Long, String, String, String> {

	private static final long serialVersionUID = -1903267573;

	/**
	 * Setter for <code>public.filter.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.filter.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.filter.name</code>.
	 */
	public void setName(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.filter.name</code>.
	 */
	public String getName() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.filter.target</code>.
	 */
	public void setTarget(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.filter.target</code>.
	 */
	public String getTarget() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>public.filter.description</code>.
	 */
	public void setDescription(String value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.filter.description</code>.
	 */
	public String getDescription() {
		return (String) get(3);
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
	public Row4<Long, String, String, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, String, String, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JFilter.FILTER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JFilter.FILTER.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JFilter.FILTER.TARGET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return JFilter.FILTER.DESCRIPTION;
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
	public String component2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getTarget();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component4() {
		return getDescription();
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
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTarget();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JFilterRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JFilterRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JFilterRecord value3(String value) {
		setTarget(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JFilterRecord value4(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JFilterRecord values(Long value1, String value2, String value3, String value4) {
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
	 * Create a detached JFilterRecord
	 */
	public JFilterRecord() {
		super(JFilter.FILTER);
	}

	/**
	 * Create a detached, initialised JFilterRecord
	 */
	public JFilterRecord(Long id, String name, String target, String description) {
		super(JFilter.FILTER);

		set(0, id);
		set(1, name);
		set(2, target);
		set(3, description);
	}
}
