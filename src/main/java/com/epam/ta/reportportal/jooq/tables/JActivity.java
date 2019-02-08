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
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JActivityRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class JActivity extends TableImpl<JActivityRecord> {

    private static final long serialVersionUID = -2012198392;

    /**
     * The reference instance of <code>public.activity</code>
     */
    public static final JActivity ACTIVITY = new JActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JActivityRecord> getRecordType() {
        return JActivityRecord.class;
    }

    /**
     * The column <code>public.activity.id</code>.
     */
    public final TableField<JActivityRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('activity_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.activity.user_id</code>.
     */
    public final TableField<JActivityRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.activity.username</code>.
     */
    public final TableField<JActivityRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.activity.project_id</code>.
     */
    public final TableField<JActivityRecord, Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.activity.entity</code>.
     */
    public final TableField<JActivityRecord, String> ENTITY = createField("entity", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.activity.action</code>.
     */
    public final TableField<JActivityRecord, String> ACTION = createField("action", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.activity.details</code>.
     */
    public final TableField<JActivityRecord, Object> DETAILS = createField("details", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""), this, "");

    /**
     * The column <code>public.activity.creation_date</code>.
     */
    public final TableField<JActivityRecord, Timestamp> CREATION_DATE = createField("creation_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.activity.object_id</code>.
     */
    public final TableField<JActivityRecord, Long> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.activity</code> table reference
     */
    public JActivity() {
        this(DSL.name("activity"), null);
    }

    /**
     * Create an aliased <code>public.activity</code> table reference
     */
    public JActivity(String alias) {
        this(DSL.name(alias), ACTIVITY);
    }

    /**
     * Create an aliased <code>public.activity</code> table reference
     */
    public JActivity(Name alias) {
        this(alias, ACTIVITY);
    }

    private JActivity(Name alias, Table<JActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private JActivity(Name alias, Table<JActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JActivity(Table<O> child, ForeignKey<O, JActivityRecord> key) {
        super(child, key, ACTIVITY);
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
        return Arrays.<Index>asList(Indexes.ACTIVITY_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JActivityRecord, Long> getIdentity() {
        return Keys.IDENTITY_ACTIVITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JActivityRecord> getPrimaryKey() {
        return Keys.ACTIVITY_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JActivityRecord>> getKeys() {
        return Arrays.<UniqueKey<JActivityRecord>>asList(Keys.ACTIVITY_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JActivityRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JActivityRecord, ?>>asList(Keys.ACTIVITY__ACTIVITY_USER_ID_FKEY, Keys.ACTIVITY__ACTIVITY_PROJECT_ID_FKEY);
    }

    public JUsers users() {
        return new JUsers(this, Keys.ACTIVITY__ACTIVITY_USER_ID_FKEY);
    }

    public JProject project() {
        return new JProject(this, Keys.ACTIVITY__ACTIVITY_PROJECT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivity as(String alias) {
        return new JActivity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivity as(Name alias) {
        return new JActivity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JActivity rename(String name) {
        return new JActivity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JActivity rename(Name name) {
        return new JActivity(name, null);
    }
}
