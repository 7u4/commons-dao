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

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JPatternTemplateTestItem;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JPatternTemplateTestItemRecord extends UpdatableRecordImpl<JPatternTemplateTestItemRecord> implements Record2<Long, Long> {

	private static final long serialVersionUID = 171011607;

	/**
	 * Setter for <code>public.pattern_template_test_item.pattern_id</code>.
	 */
	public void setPatternId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.pattern_template_test_item.pattern_id</code>.
	 */
	public Long getPatternId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.pattern_template_test_item.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.pattern_template_test_item.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Long, Long> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM.PATTERN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getPatternId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component2() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getPatternId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JPatternTemplateTestItemRecord value1(Long value) {
		setPatternId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JPatternTemplateTestItemRecord value2(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JPatternTemplateTestItemRecord values(Long value1, Long value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JPatternTemplateTestItemRecord
	 */
	public JPatternTemplateTestItemRecord() {
		super(JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM);
	}

	/**
	 * Create a detached, initialised JPatternTemplateTestItemRecord
	 */
	public JPatternTemplateTestItemRecord(Long patternId, Long itemId) {
		super(JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM);

		set(0, patternId);
		set(1, itemId);
	}
}
