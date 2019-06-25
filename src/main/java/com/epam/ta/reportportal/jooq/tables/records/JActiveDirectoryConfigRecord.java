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

import com.epam.ta.reportportal.jooq.tables.JActiveDirectoryConfig;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JActiveDirectoryConfigRecord extends UpdatableRecordImpl<JActiveDirectoryConfigRecord> implements Record5<Long, String, String, Long, String> {

	private static final long serialVersionUID = -607966288;

	/**
	 * Setter for <code>public.active_directory_config.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.active_directory_config.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.active_directory_config.url</code>.
	 */
	public void setUrl(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.active_directory_config.url</code>.
	 */
	public String getUrl() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.active_directory_config.base_dn</code>.
	 */
	public void setBaseDn(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.active_directory_config.base_dn</code>.
	 */
	public String getBaseDn() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>public.active_directory_config.sync_attributes_id</code>.
	 */
	public void setSyncAttributesId(Long value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.active_directory_config.sync_attributes_id</code>.
	 */
	public Long getSyncAttributesId() {
		return (Long) get(3);
	}

	/**
	 * Setter for <code>public.active_directory_config.domain</code>.
	 */
	public void setDomain(String value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.active_directory_config.domain</code>.
	 */
	public String getDomain() {
		return (String) get(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, String, String, Long, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, String, String, Long, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG.BASE_DN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG.SYNC_ATTRIBUTES_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG.DOMAIN;
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
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getBaseDn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component4() {
		return getSyncAttributesId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component5() {
		return getDomain();
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
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBaseDn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getSyncAttributesId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDomain();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JActiveDirectoryConfigRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JActiveDirectoryConfigRecord value2(String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JActiveDirectoryConfigRecord value3(String value) {
		setBaseDn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JActiveDirectoryConfigRecord value4(Long value) {
		setSyncAttributesId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JActiveDirectoryConfigRecord value5(String value) {
		setDomain(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JActiveDirectoryConfigRecord values(Long value1, String value2, String value3, Long value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JActiveDirectoryConfigRecord
	 */
	public JActiveDirectoryConfigRecord() {
		super(JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG);
	}

	/**
	 * Create a detached, initialised JActiveDirectoryConfigRecord
	 */
	public JActiveDirectoryConfigRecord(Long id, String url, String baseDn, Long syncAttributesId, String domain) {
		super(JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG);

		set(0, id);
		set(1, url);
		set(2, baseDn);
		set(3, syncAttributesId);
		set(4, domain);
	}
}
