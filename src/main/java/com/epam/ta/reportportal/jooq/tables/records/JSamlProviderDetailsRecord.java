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

import com.epam.ta.reportportal.jooq.tables.JSamlProviderDetails;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JSamlProviderDetailsRecord extends UpdatableRecordImpl<JSamlProviderDetailsRecord> implements Record11<Long, String, String, String, String, String, String, String, String, String, Boolean> {

	private static final long serialVersionUID = 975405709;

	/**
	 * Setter for <code>public.saml_provider_details.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.saml_provider_details.idp_name</code>.
	 */
	public void setIdpName(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.idp_name</code>.
	 */
	public String getIdpName() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.saml_provider_details.idp_metadata_url</code>.
	 */
	public void setIdpMetadataUrl(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.idp_metadata_url</code>.
	 */
	public String getIdpMetadataUrl() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>public.saml_provider_details.idp_name_id</code>.
	 */
	public void setIdpNameId(String value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.idp_name_id</code>.
	 */
	public String getIdpNameId() {
		return (String) get(3);
	}

	/**
	 * Setter for <code>public.saml_provider_details.idp_alias</code>.
	 */
	public void setIdpAlias(String value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.idp_alias</code>.
	 */
	public String getIdpAlias() {
		return (String) get(4);
	}

	/**
	 * Setter for <code>public.saml_provider_details.idp_url</code>.
	 */
	public void setIdpUrl(String value) {
		set(5, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.idp_url</code>.
	 */
	public String getIdpUrl() {
		return (String) get(5);
	}

	/**
	 * Setter for <code>public.saml_provider_details.full_name_attribute_id</code>.
	 */
	public void setFullNameAttributeId(String value) {
		set(6, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.full_name_attribute_id</code>.
	 */
	public String getFullNameAttributeId() {
		return (String) get(6);
	}

	/**
	 * Setter for <code>public.saml_provider_details.first_name_attribute_id</code>.
	 */
	public void setFirstNameAttributeId(String value) {
		set(7, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.first_name_attribute_id</code>.
	 */
	public String getFirstNameAttributeId() {
		return (String) get(7);
	}

	/**
	 * Setter for <code>public.saml_provider_details.last_name_attribute_id</code>.
	 */
	public void setLastNameAttributeId(String value) {
		set(8, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.last_name_attribute_id</code>.
	 */
	public String getLastNameAttributeId() {
		return (String) get(8);
	}

	/**
	 * Setter for <code>public.saml_provider_details.email_attribute_id</code>.
	 */
	public void setEmailAttributeId(String value) {
		set(9, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.email_attribute_id</code>.
	 */
	public String getEmailAttributeId() {
		return (String) get(9);
	}

	/**
	 * Setter for <code>public.saml_provider_details.enabled</code>.
	 */
	public void setEnabled(Boolean value) {
		set(10, value);
	}

	/**
	 * Getter for <code>public.saml_provider_details.enabled</code>.
	 */
	public Boolean getEnabled() {
		return (Boolean) get(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Long, String, String, String, String, String, String, String, String, String, Boolean> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Long, String, String, String, String, String, String, String, String, String, Boolean> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.IDP_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.IDP_METADATA_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.IDP_NAME_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.IDP_ALIAS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.IDP_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.FULL_NAME_ATTRIBUTE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.FIRST_NAME_ATTRIBUTE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.LAST_NAME_ATTRIBUTE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.EMAIL_ATTRIBUTE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field11() {
		return JSamlProviderDetails.SAML_PROVIDER_DETAILS.ENABLED;
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
		return getIdpName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getIdpMetadataUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component4() {
		return getIdpNameId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component5() {
		return getIdpAlias();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component6() {
		return getIdpUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component7() {
		return getFullNameAttributeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component8() {
		return getFirstNameAttributeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component9() {
		return getLastNameAttributeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component10() {
		return getEmailAttributeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean component11() {
		return getEnabled();
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
		return getIdpName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getIdpMetadataUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getIdpNameId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getIdpAlias();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getIdpUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getFullNameAttributeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getFirstNameAttributeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getLastNameAttributeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getEmailAttributeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value11() {
		return getEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value2(String value) {
		setIdpName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value3(String value) {
		setIdpMetadataUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value4(String value) {
		setIdpNameId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value5(String value) {
		setIdpAlias(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value6(String value) {
		setIdpUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value7(String value) {
		setFullNameAttributeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value8(String value) {
		setFirstNameAttributeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value9(String value) {
		setLastNameAttributeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value10(String value) {
		setEmailAttributeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord value11(Boolean value) {
		setEnabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSamlProviderDetailsRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Boolean value11) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JSamlProviderDetailsRecord
	 */
	public JSamlProviderDetailsRecord() {
		super(JSamlProviderDetails.SAML_PROVIDER_DETAILS);
	}

	/**
	 * Create a detached, initialised JSamlProviderDetailsRecord
	 */
	public JSamlProviderDetailsRecord(Long id, String idpName, String idpMetadataUrl, String idpNameId, String idpAlias, String idpUrl, String fullNameAttributeId, String firstNameAttributeId, String lastNameAttributeId, String emailAttributeId, Boolean enabled) {
		super(JSamlProviderDetails.SAML_PROVIDER_DETAILS);

		set(0, id);
		set(1, idpName);
		set(2, idpMetadataUrl);
		set(3, idpNameId);
		set(4, idpAlias);
		set(5, idpUrl);
		set(6, fullNameAttributeId);
		set(7, firstNameAttributeId);
		set(8, lastNameAttributeId);
		set(9, emailAttributeId);
		set(10, enabled);
	}
}
