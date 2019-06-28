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
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.enums.JPasswordEncoderType;
import com.epam.ta.reportportal.jooq.tables.records.JLdapConfigRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JLdapConfig extends TableImpl<JLdapConfigRecord> {

    private static final long serialVersionUID = -877468538;

    /**
     * The reference instance of <code>public.ldap_config</code>
     */
    public static final JLdapConfig LDAP_CONFIG = new JLdapConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JLdapConfigRecord> getRecordType() {
        return JLdapConfigRecord.class;
    }

    /**
     * The column <code>public.ldap_config.id</code>.
     */
    public final TableField<JLdapConfigRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.ldap_config.url</code>.
     */
    public final TableField<JLdapConfigRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.base_dn</code>.
     */
    public final TableField<JLdapConfigRecord, String> BASE_DN = createField("base_dn", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.sync_attributes_id</code>.
     */
    public final TableField<JLdapConfigRecord, Long> SYNC_ATTRIBUTES_ID = createField("sync_attributes_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.ldap_config.user_dn_pattern</code>.
     */
    public final TableField<JLdapConfigRecord, String> USER_DN_PATTERN = createField("user_dn_pattern", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.user_search_filter</code>.
     */
    public final TableField<JLdapConfigRecord, String> USER_SEARCH_FILTER = createField("user_search_filter", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.group_search_base</code>.
     */
    public final TableField<JLdapConfigRecord, String> GROUP_SEARCH_BASE = createField("group_search_base", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.group_search_filter</code>.
     */
    public final TableField<JLdapConfigRecord, String> GROUP_SEARCH_FILTER = createField("group_search_filter", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.password_attributes</code>.
     */
    public final TableField<JLdapConfigRecord, String> PASSWORD_ATTRIBUTES = createField("password_attributes", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.manager_dn</code>.
     */
    public final TableField<JLdapConfigRecord, String> MANAGER_DN = createField("manager_dn", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.manager_password</code>.
     */
    public final TableField<JLdapConfigRecord, String> MANAGER_PASSWORD = createField("manager_password", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.ldap_config.passwordencodertype</code>.
     */
    public final TableField<JLdapConfigRecord, JPasswordEncoderType> PASSWORDENCODERTYPE = createField("passwordencodertype", org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.jooq.enums.JPasswordEncoderType.class), this, "");

    /**
     * Create a <code>public.ldap_config</code> table reference
     */
    public JLdapConfig() {
        this(DSL.name("ldap_config"), null);
    }

    /**
     * Create an aliased <code>public.ldap_config</code> table reference
     */
    public JLdapConfig(String alias) {
        this(DSL.name(alias), LDAP_CONFIG);
    }

    /**
     * Create an aliased <code>public.ldap_config</code> table reference
     */
    public JLdapConfig(Name alias) {
        this(alias, LDAP_CONFIG);
    }

    private JLdapConfig(Name alias, Table<JLdapConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private JLdapConfig(Name alias, Table<JLdapConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JLdapConfig(Table<O> child, ForeignKey<O, JLdapConfigRecord> key) {
        super(child, key, LDAP_CONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LDAP_CONFIG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JLdapConfigRecord> getPrimaryKey() {
        return Keys.LDAP_CONFIG_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JLdapConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<JLdapConfigRecord>>asList(Keys.LDAP_CONFIG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JLdapConfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JLdapConfigRecord, ?>>asList(Keys.LDAP_CONFIG__LDAP_CONFIG_ID_FKEY, Keys.LDAP_CONFIG__LDAP_CONFIG_SYNC_ATTRIBUTES_ID_FKEY);
    }

    public JIntegration integration() {
        return new JIntegration(this, Keys.LDAP_CONFIG__LDAP_CONFIG_ID_FKEY);
    }

    public JLdapSynchronizationAttributes ldapSynchronizationAttributes() {
        return new JLdapSynchronizationAttributes(this, Keys.LDAP_CONFIG__LDAP_CONFIG_SYNC_ATTRIBUTES_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfig as(String alias) {
        return new JLdapConfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfig as(Name alias) {
        return new JLdapConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JLdapConfig rename(String name) {
        return new JLdapConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JLdapConfig rename(Name name) {
        return new JLdapConfig(name, null);
    }
}
