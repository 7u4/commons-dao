/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq;


import com.epam.ta.reportportal.jooq.tables.*;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import javax.annotation.processing.Generated;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACL_CLASS_PKEY = Indexes0.ACL_CLASS_PKEY;
    public static final Index UNIQUE_UK_2 = Indexes0.UNIQUE_UK_2;
    public static final Index ACL_ENTRY_PKEY = Indexes0.ACL_ENTRY_PKEY;
    public static final Index UNIQUE_UK_4 = Indexes0.UNIQUE_UK_4;
    public static final Index ACL_OBJECT_IDENTITY_PKEY = Indexes0.ACL_OBJECT_IDENTITY_PKEY;
    public static final Index UNIQUE_UK_3 = Indexes0.UNIQUE_UK_3;
    public static final Index ACL_SID_IDX = Indexes0.ACL_SID_IDX;
    public static final Index ACL_SID_PKEY = Indexes0.ACL_SID_PKEY;
    public static final Index UNIQUE_UK_1 = Indexes0.UNIQUE_UK_1;
    public static final Index ACTIVITY_CREATION_DATE_IDX = Indexes0.ACTIVITY_CREATION_DATE_IDX;
    public static final Index ACTIVITY_OBJECT_IDX = Indexes0.ACTIVITY_OBJECT_IDX;
    public static final Index ACTIVITY_PK = Indexes0.ACTIVITY_PK;
    public static final Index ACTIVITY_PROJECT_IDX = Indexes0.ACTIVITY_PROJECT_IDX;
    public static final Index ATT_ITEM_IDX = Indexes0.ATT_ITEM_IDX;
    public static final Index ATT_LAUNCH_IDX = Indexes0.ATT_LAUNCH_IDX;
    public static final Index ATT_PROJECT_IDX = Indexes0.ATT_PROJECT_IDX;
    public static final Index ATTACHMENT_PK = Indexes0.ATTACHMENT_PK;
    public static final Index ATTACHMENT_PROJECT_ID_CREATION_TIME_IDX = Indexes0.ATTACHMENT_PROJECT_ID_CREATION_TIME_IDX;
    public static final Index ATTACHMENT_DELETION_PKEY = Indexes0.ATTACHMENT_DELETION_PKEY;
    public static final Index ATTRIBUTE_PK = Indexes0.ATTRIBUTE_PK;
    public static final Index CLUSTER_INDEX_ID_IDX = Indexes0.CLUSTER_INDEX_ID_IDX;
    public static final Index CLUSTER_LAUNCH_IDX = Indexes0.CLUSTER_LAUNCH_IDX;
    public static final Index CLUSTER_PROJECT_IDX = Indexes0.CLUSTER_PROJECT_IDX;
    public static final Index CLUSTERS_PK = Indexes0.CLUSTERS_PK;
    public static final Index INDEX_ID_LAUNCH_ID_UNQ = Indexes0.INDEX_ID_LAUNCH_ID_UNQ;
    public static final Index CLUSTER_ITEM_CLUSTER_IDX = Indexes0.CLUSTER_ITEM_CLUSTER_IDX;
    public static final Index CLUSTER_ITEM_ITEM_IDX = Indexes0.CLUSTER_ITEM_ITEM_IDX;
    public static final Index CLUSTER_ITEM_UNQ = Indexes0.CLUSTER_ITEM_UNQ;
    public static final Index CONTENT_FIELD_IDX = Indexes0.CONTENT_FIELD_IDX;
    public static final Index CONTENT_FIELD_WIDGET_IDX = Indexes0.CONTENT_FIELD_WIDGET_IDX;
    public static final Index DASHBOARD_PKEY = Indexes0.DASHBOARD_PKEY;
    public static final Index DASHBOARD_WIDGET_PK = Indexes0.DASHBOARD_WIDGET_PK;
    public static final Index WIDGET_ON_DASHBOARD_UNQ = Indexes0.WIDGET_ON_DASHBOARD_UNQ;
    public static final Index FILTER_PKEY = Indexes0.FILTER_PKEY;
    public static final Index FILTER_COND_FILTER_IDX = Indexes0.FILTER_COND_FILTER_IDX;
    public static final Index FILTER_CONDITION_PK = Indexes0.FILTER_CONDITION_PK;
    public static final Index FILTER_SORT_FILTER_IDX = Indexes0.FILTER_SORT_FILTER_IDX;
    public static final Index FILTER_SORT_PK = Indexes0.FILTER_SORT_PK;
    public static final Index INTEGR_PROJECT_IDX = Indexes0.INTEGR_PROJECT_IDX;
    public static final Index INTEGRATION_PK = Indexes0.INTEGRATION_PK;
    public static final Index UNIQUE_GLOBAL_INTEGRATION_NAME = Indexes0.UNIQUE_GLOBAL_INTEGRATION_NAME;
    public static final Index UNIQUE_PROJECT_INTEGRATION_NAME = Indexes0.UNIQUE_PROJECT_INTEGRATION_NAME;
    public static final Index INTEGRATION_TYPE_NAME_KEY = Indexes0.INTEGRATION_TYPE_NAME_KEY;
    public static final Index INTEGRATION_TYPE_PK = Indexes0.INTEGRATION_TYPE_PK;
    public static final Index ISSUE_IT_IDX = Indexes0.ISSUE_IT_IDX;
    public static final Index ISSUE_PK = Indexes0.ISSUE_PK;
    public static final Index ISSUE_GROUP_PK = Indexes0.ISSUE_GROUP_PK;
    public static final Index ISSUE_TICKET_PK = Indexes0.ISSUE_TICKET_PK;
    public static final Index ISSUE_TYPE_GROUP_IDX = Indexes0.ISSUE_TYPE_GROUP_IDX;
    public static final Index ISSUE_TYPE_LOCATOR_KEY = Indexes0.ISSUE_TYPE_LOCATOR_KEY;
    public static final Index ISSUE_TYPE_PK = Indexes0.ISSUE_TYPE_PK;
    public static final Index ISSUE_TYPE_PROJECT_PK = Indexes0.ISSUE_TYPE_PROJECT_PK;
    public static final Index ITEM_ATTR_LAUNCH_IDX = Indexes0.ITEM_ATTR_LAUNCH_IDX;
    public static final Index ITEM_ATTR_TI_IDX = Indexes0.ITEM_ATTR_TI_IDX;
    public static final Index ITEM_ATTRIBUTE_PK = Indexes0.ITEM_ATTRIBUTE_PK;
    public static final Index LAUNCH_PK = Indexes0.LAUNCH_PK;
    public static final Index LAUNCH_PROJECT_START_TIME_IDX = Indexes0.LAUNCH_PROJECT_START_TIME_IDX;
    public static final Index LAUNCH_USER_IDX = Indexes0.LAUNCH_USER_IDX;
    public static final Index LAUNCH_UUID_KEY = Indexes0.LAUNCH_UUID_KEY;
    public static final Index UNQ_NAME_NUMBER = Indexes0.UNQ_NAME_NUMBER;
    public static final Index L_ATTR_RL_SEND_CASE_IDX = Indexes0.L_ATTR_RL_SEND_CASE_IDX;
    public static final Index LAUNCH_ATTRIBUTE_RULES_PK = Indexes0.LAUNCH_ATTRIBUTE_RULES_PK;
    public static final Index LN_SEND_CASE_IDX = Indexes0.LN_SEND_CASE_IDX;
    public static final Index LAUNCH_NUMBER_PK = Indexes0.LAUNCH_NUMBER_PK;
    public static final Index UNQ_PROJECT_NAME = Indexes0.UNQ_PROJECT_NAME;
    public static final Index LOG_ATTACH_ID_IDX = Indexes0.LOG_ATTACH_ID_IDX;
    public static final Index LOG_CLUSTER_IDX = Indexes0.LOG_CLUSTER_IDX;
    public static final Index LOG_LAUNCH_ID_IDX = Indexes0.LOG_LAUNCH_ID_IDX;
    public static final Index LOG_MESSAGE_TRGM_IDX = Indexes0.LOG_MESSAGE_TRGM_IDX;
    public static final Index LOG_PK = Indexes0.LOG_PK;
    public static final Index LOG_PROJECT_ID_LOG_TIME_IDX = Indexes0.LOG_PROJECT_ID_LOG_TIME_IDX;
    public static final Index LOG_PROJECT_IDX = Indexes0.LOG_PROJECT_IDX;
    public static final Index LOG_TI_IDX = Indexes0.LOG_TI_IDX;
    public static final Index OAUTH_ACCESS_TOKEN_PKEY = Indexes0.OAUTH_ACCESS_TOKEN_PKEY;
    public static final Index OAUTH_AT_USER_IDX = Indexes0.OAUTH_AT_USER_IDX;
    public static final Index USERS_ACCESS_TOKEN_UNIQUE = Indexes0.USERS_ACCESS_TOKEN_UNIQUE;
    public static final Index OAUTH_REGISTRATION_CLIENT_ID_KEY = Indexes0.OAUTH_REGISTRATION_CLIENT_ID_KEY;
    public static final Index OAUTH_REGISTRATION_PKEY = Indexes0.OAUTH_REGISTRATION_PKEY;
    public static final Index OAUTH_REGISTRATION_RESTRICTION_PK = Indexes0.OAUTH_REGISTRATION_RESTRICTION_PK;
    public static final Index OAUTH_REGISTRATION_RESTRICTION_UNIQUE = Indexes0.OAUTH_REGISTRATION_RESTRICTION_UNIQUE;
    public static final Index OAUTH_REGISTRATION_SCOPE_PK = Indexes0.OAUTH_REGISTRATION_SCOPE_PK;
    public static final Index OAUTH_REGISTRATION_SCOPE_UNIQUE = Indexes0.OAUTH_REGISTRATION_SCOPE_UNIQUE;
    public static final Index ONBOARDING_PK = Indexes0.ONBOARDING_PK;
    public static final Index PARAMETER_TI_IDX = Indexes0.PARAMETER_TI_IDX;
    public static final Index PATTERN_TEMPLATE_PK = Indexes0.PATTERN_TEMPLATE_PK;
    public static final Index UNQ_NAME_PROJECTID = Indexes0.UNQ_NAME_PROJECTID;
    public static final Index PATTERN_ITEM_ITEM_ID_IDX = Indexes0.PATTERN_ITEM_ITEM_ID_IDX;
    public static final Index PATTERN_ITEM_UNQ = Indexes0.PATTERN_ITEM_UNQ;
    public static final Index PROJECT_NAME_KEY = Indexes0.PROJECT_NAME_KEY;
    public static final Index PROJECT_PK = Indexes0.PROJECT_PK;
    public static final Index UNIQUE_ATTRIBUTE_PER_PROJECT = Indexes0.UNIQUE_ATTRIBUTE_PER_PROJECT;
    public static final Index USERS_PROJECT_PK = Indexes0.USERS_PROJECT_PK;
    public static final Index RCPNT_SEND_CASE_IDX = Indexes0.RCPNT_SEND_CASE_IDX;
    public static final Index RESTORE_PASSWORD_BID_EMAIL_KEY = Indexes0.RESTORE_PASSWORD_BID_EMAIL_KEY;
    public static final Index RESTORE_PASSWORD_BID_PK = Indexes0.RESTORE_PASSWORD_BID_PK;
    public static final Index SENDER_CASE_PK = Indexes0.SENDER_CASE_PK;
    public static final Index SENDER_CASE_PROJECT_IDX = Indexes0.SENDER_CASE_PROJECT_IDX;
    public static final Index SERVER_SETTINGS_ID = Indexes0.SERVER_SETTINGS_ID;
    public static final Index SERVER_SETTINGS_KEY_KEY = Indexes0.SERVER_SETTINGS_KEY_KEY;
    public static final Index SHAREABLE_PK = Indexes0.SHAREABLE_PK;
    public static final Index SHARED_ENTITY_OWNERX = Indexes0.SHARED_ENTITY_OWNERX;
    public static final Index SHARED_ENTITY_PROJECT_IDX = Indexes0.SHARED_ENTITY_PROJECT_IDX;
    public static final Index STALE_MATERIALIZED_VIEW_NAME_KEY = Indexes0.STALE_MATERIALIZED_VIEW_NAME_KEY;
    public static final Index STALE_MATERIALIZED_VIEW_PKEY = Indexes0.STALE_MATERIALIZED_VIEW_PKEY;
    public static final Index STALE_MV_CREATION_DATE_IDX = Indexes0.STALE_MV_CREATION_DATE_IDX;
    public static final Index STATISTICS_LAUNCH_IDX = Indexes0.STATISTICS_LAUNCH_IDX;
    public static final Index STATISTICS_PK = Indexes0.STATISTICS_PK;
    public static final Index STATISTICS_TI_IDX = Indexes0.STATISTICS_TI_IDX;
    public static final Index UNIQUE_STATS_ITEM = Indexes0.UNIQUE_STATS_ITEM;
    public static final Index UNIQUE_STATS_LAUNCH = Indexes0.UNIQUE_STATS_LAUNCH;
    public static final Index STATISTICS_FIELD_NAME_KEY = Indexes0.STATISTICS_FIELD_NAME_KEY;
    public static final Index STATISTICS_FIELD_PK = Indexes0.STATISTICS_FIELD_PK;
    public static final Index ITEM_TEST_CASE_ID_LAUNCH_ID_IDX = Indexes0.ITEM_TEST_CASE_ID_LAUNCH_ID_IDX;
    public static final Index PATH_GIST_IDX = Indexes0.PATH_GIST_IDX;
    public static final Index PATH_IDX = Indexes0.PATH_IDX;
    public static final Index TEST_CASE_HASH_LAUNCH_ID_IDX = Indexes0.TEST_CASE_HASH_LAUNCH_ID_IDX;
    public static final Index TEST_ITEM_PK = Indexes0.TEST_ITEM_PK;
    public static final Index TEST_ITEM_UNIQUE_ID_LAUNCH_ID_IDX = Indexes0.TEST_ITEM_UNIQUE_ID_LAUNCH_ID_IDX;
    public static final Index TEST_ITEM_UUID_KEY = Indexes0.TEST_ITEM_UUID_KEY;
    public static final Index TI_LAUNCH_IDX = Indexes0.TI_LAUNCH_IDX;
    public static final Index TI_PARENT_IDX = Indexes0.TI_PARENT_IDX;
    public static final Index TI_RETRY_OF_IDX = Indexes0.TI_RETRY_OF_IDX;
    public static final Index TEST_ITEM_RESULTS_PK = Indexes0.TEST_ITEM_RESULTS_PK;
    public static final Index TICKET_ID_IDX = Indexes0.TICKET_ID_IDX;
    public static final Index TICKET_PK = Indexes0.TICKET_PK;
    public static final Index TICKET_SUBMITTER_IDX = Indexes0.TICKET_SUBMITTER_IDX;
    public static final Index USER_BID_PROJECT_IDX = Indexes0.USER_BID_PROJECT_IDX;
    public static final Index USER_CREATION_BID_PK = Indexes0.USER_CREATION_BID_PK;
    public static final Index USER_PREFERENCE_PK = Indexes0.USER_PREFERENCE_PK;
    public static final Index USER_PREFERENCE_UQ = Indexes0.USER_PREFERENCE_UQ;
    public static final Index USERS_EMAIL_KEY = Indexes0.USERS_EMAIL_KEY;
    public static final Index USERS_LOGIN_KEY = Indexes0.USERS_LOGIN_KEY;
    public static final Index USERS_PK = Indexes0.USERS_PK;
    public static final Index WIDGET_PKEY = Indexes0.WIDGET_PKEY;
    public static final Index WIDGET_FILTER_PK = Indexes0.WIDGET_FILTER_PK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACL_CLASS_PKEY = Internal.createIndex("acl_class_pkey", JAclClass.ACL_CLASS, new OrderField[] { JAclClass.ACL_CLASS.ID }, true);
        public static Index UNIQUE_UK_2 = Internal.createIndex("unique_uk_2", JAclClass.ACL_CLASS, new OrderField[] { JAclClass.ACL_CLASS.CLASS }, true);
        public static Index ACL_ENTRY_PKEY = Internal.createIndex("acl_entry_pkey", JAclEntry.ACL_ENTRY, new OrderField[] { JAclEntry.ACL_ENTRY.ID }, true);
        public static Index UNIQUE_UK_4 = Internal.createIndex("unique_uk_4", JAclEntry.ACL_ENTRY, new OrderField[] { JAclEntry.ACL_ENTRY.ACL_OBJECT_IDENTITY, JAclEntry.ACL_ENTRY.ACE_ORDER }, true);
        public static Index ACL_OBJECT_IDENTITY_PKEY = Internal.createIndex("acl_object_identity_pkey", JAclObjectIdentity.ACL_OBJECT_IDENTITY, new OrderField[] { JAclObjectIdentity.ACL_OBJECT_IDENTITY.ID }, true);
        public static Index UNIQUE_UK_3 = Internal.createIndex("unique_uk_3", JAclObjectIdentity.ACL_OBJECT_IDENTITY, new OrderField[] { JAclObjectIdentity.ACL_OBJECT_IDENTITY.OBJECT_ID_CLASS, JAclObjectIdentity.ACL_OBJECT_IDENTITY.OBJECT_ID_IDENTITY }, true);
        public static Index ACL_SID_IDX = Internal.createIndex("acl_sid_idx", JAclSid.ACL_SID, new OrderField[] { JAclSid.ACL_SID.SID }, false);
        public static Index ACL_SID_PKEY = Internal.createIndex("acl_sid_pkey", JAclSid.ACL_SID, new OrderField[] { JAclSid.ACL_SID.ID }, true);
        public static Index UNIQUE_UK_1 = Internal.createIndex("unique_uk_1", JAclSid.ACL_SID, new OrderField[] { JAclSid.ACL_SID.SID, JAclSid.ACL_SID.PRINCIPAL }, true);
        public static Index ACTIVITY_CREATION_DATE_IDX = Internal.createIndex("activity_creation_date_idx", JActivity.ACTIVITY, new OrderField[] { JActivity.ACTIVITY.CREATION_DATE }, false);
        public static Index ACTIVITY_OBJECT_IDX = Internal.createIndex("activity_object_idx", JActivity.ACTIVITY, new OrderField[] { JActivity.ACTIVITY.OBJECT_ID }, false);
        public static Index ACTIVITY_PK = Internal.createIndex("activity_pk", JActivity.ACTIVITY, new OrderField[] { JActivity.ACTIVITY.ID }, true);
        public static Index ACTIVITY_PROJECT_IDX = Internal.createIndex("activity_project_idx", JActivity.ACTIVITY, new OrderField[] { JActivity.ACTIVITY.PROJECT_ID }, false);
        public static Index ATT_ITEM_IDX = Internal.createIndex("att_item_idx", JAttachment.ATTACHMENT, new OrderField[] { JAttachment.ATTACHMENT.ITEM_ID }, false);
        public static Index ATT_LAUNCH_IDX = Internal.createIndex("att_launch_idx", JAttachment.ATTACHMENT, new OrderField[] { JAttachment.ATTACHMENT.LAUNCH_ID }, false);
        public static Index ATT_PROJECT_IDX = Internal.createIndex("att_project_idx", JAttachment.ATTACHMENT, new OrderField[] { JAttachment.ATTACHMENT.PROJECT_ID }, false);
        public static Index ATTACHMENT_PK = Internal.createIndex("attachment_pk", JAttachment.ATTACHMENT, new OrderField[] { JAttachment.ATTACHMENT.ID }, true);
        public static Index ATTACHMENT_PROJECT_ID_CREATION_TIME_IDX = Internal.createIndex("attachment_project_id_creation_time_idx", JAttachment.ATTACHMENT, new OrderField[] { JAttachment.ATTACHMENT.PROJECT_ID, JAttachment.ATTACHMENT.CREATION_DATE }, false);
        public static Index ATTACHMENT_DELETION_PKEY = Internal.createIndex("attachment_deletion_pkey", JAttachmentDeletion.ATTACHMENT_DELETION, new OrderField[] { JAttachmentDeletion.ATTACHMENT_DELETION.ID }, true);
        public static Index ATTRIBUTE_PK = Internal.createIndex("attribute_pk", JAttribute.ATTRIBUTE, new OrderField[] { JAttribute.ATTRIBUTE.ID }, true);
        public static Index CLUSTER_INDEX_ID_IDX = Internal.createIndex("cluster_index_id_idx", JClusters.CLUSTERS, new OrderField[] { JClusters.CLUSTERS.INDEX_ID }, false);
        public static Index CLUSTER_LAUNCH_IDX = Internal.createIndex("cluster_launch_idx", JClusters.CLUSTERS, new OrderField[] { JClusters.CLUSTERS.LAUNCH_ID }, false);
        public static Index CLUSTER_PROJECT_IDX = Internal.createIndex("cluster_project_idx", JClusters.CLUSTERS, new OrderField[] { JClusters.CLUSTERS.PROJECT_ID }, false);
        public static Index CLUSTERS_PK = Internal.createIndex("clusters_pk", JClusters.CLUSTERS, new OrderField[] { JClusters.CLUSTERS.ID }, true);
        public static Index INDEX_ID_LAUNCH_ID_UNQ = Internal.createIndex("index_id_launch_id_unq", JClusters.CLUSTERS, new OrderField[] { JClusters.CLUSTERS.INDEX_ID, JClusters.CLUSTERS.LAUNCH_ID }, true);
        public static Index CLUSTER_ITEM_CLUSTER_IDX = Internal.createIndex("cluster_item_cluster_idx", JClustersTestItem.CLUSTERS_TEST_ITEM, new OrderField[] { JClustersTestItem.CLUSTERS_TEST_ITEM.CLUSTER_ID }, false);
        public static Index CLUSTER_ITEM_ITEM_IDX = Internal.createIndex("cluster_item_item_idx", JClustersTestItem.CLUSTERS_TEST_ITEM, new OrderField[] { JClustersTestItem.CLUSTERS_TEST_ITEM.ITEM_ID }, false);
        public static Index CLUSTER_ITEM_UNQ = Internal.createIndex("cluster_item_unq", JClustersTestItem.CLUSTERS_TEST_ITEM, new OrderField[] { JClustersTestItem.CLUSTERS_TEST_ITEM.CLUSTER_ID, JClustersTestItem.CLUSTERS_TEST_ITEM.ITEM_ID }, true);
        public static Index CONTENT_FIELD_IDX = Internal.createIndex("content_field_idx", JContentField.CONTENT_FIELD, new OrderField[] { JContentField.CONTENT_FIELD.FIELD }, false);
        public static Index CONTENT_FIELD_WIDGET_IDX = Internal.createIndex("content_field_widget_idx", JContentField.CONTENT_FIELD, new OrderField[] { JContentField.CONTENT_FIELD.ID }, false);
        public static Index DASHBOARD_PKEY = Internal.createIndex("dashboard_pkey", JDashboard.DASHBOARD, new OrderField[] { JDashboard.DASHBOARD.ID }, true);
        public static Index DASHBOARD_WIDGET_PK = Internal.createIndex("dashboard_widget_pk", JDashboardWidget.DASHBOARD_WIDGET, new OrderField[] { JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_ID }, true);
        public static Index WIDGET_ON_DASHBOARD_UNQ = Internal.createIndex("widget_on_dashboard_unq", JDashboardWidget.DASHBOARD_WIDGET, new OrderField[] { JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_NAME, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_OWNER }, true);
        public static Index FILTER_PKEY = Internal.createIndex("filter_pkey", JFilter.FILTER, new OrderField[] { JFilter.FILTER.ID }, true);
        public static Index FILTER_COND_FILTER_IDX = Internal.createIndex("filter_cond_filter_idx", JFilterCondition.FILTER_CONDITION, new OrderField[] { JFilterCondition.FILTER_CONDITION.FILTER_ID }, false);
        public static Index FILTER_CONDITION_PK = Internal.createIndex("filter_condition_pk", JFilterCondition.FILTER_CONDITION, new OrderField[] { JFilterCondition.FILTER_CONDITION.ID }, true);
        public static Index FILTER_SORT_FILTER_IDX = Internal.createIndex("filter_sort_filter_idx", JFilterSort.FILTER_SORT, new OrderField[] { JFilterSort.FILTER_SORT.FILTER_ID }, false);
        public static Index FILTER_SORT_PK = Internal.createIndex("filter_sort_pk", JFilterSort.FILTER_SORT, new OrderField[] { JFilterSort.FILTER_SORT.ID }, true);
        public static Index INTEGR_PROJECT_IDX = Internal.createIndex("integr_project_idx", JIntegration.INTEGRATION, new OrderField[] { JIntegration.INTEGRATION.PROJECT_ID }, false);
        public static Index INTEGRATION_PK = Internal.createIndex("integration_pk", JIntegration.INTEGRATION, new OrderField[] { JIntegration.INTEGRATION.ID }, true);
        public static Index UNIQUE_GLOBAL_INTEGRATION_NAME = Internal.createIndex("unique_global_integration_name", JIntegration.INTEGRATION, new OrderField[] { JIntegration.INTEGRATION.NAME, JIntegration.INTEGRATION.TYPE }, true);
        public static Index UNIQUE_PROJECT_INTEGRATION_NAME = Internal.createIndex("unique_project_integration_name", JIntegration.INTEGRATION, new OrderField[] { JIntegration.INTEGRATION.NAME, JIntegration.INTEGRATION.TYPE, JIntegration.INTEGRATION.PROJECT_ID }, true);
        public static Index INTEGRATION_TYPE_NAME_KEY = Internal.createIndex("integration_type_name_key", JIntegrationType.INTEGRATION_TYPE, new OrderField[] { JIntegrationType.INTEGRATION_TYPE.NAME }, true);
        public static Index INTEGRATION_TYPE_PK = Internal.createIndex("integration_type_pk", JIntegrationType.INTEGRATION_TYPE, new OrderField[] { JIntegrationType.INTEGRATION_TYPE.ID }, true);
        public static Index ISSUE_IT_IDX = Internal.createIndex("issue_it_idx", JIssue.ISSUE, new OrderField[] { JIssue.ISSUE.ISSUE_TYPE }, false);
        public static Index ISSUE_PK = Internal.createIndex("issue_pk", JIssue.ISSUE, new OrderField[] { JIssue.ISSUE.ISSUE_ID }, true);
        public static Index ISSUE_GROUP_PK = Internal.createIndex("issue_group_pk", JIssueGroup.ISSUE_GROUP, new OrderField[] { JIssueGroup.ISSUE_GROUP.ISSUE_GROUP_ID }, true);
        public static Index ISSUE_TICKET_PK = Internal.createIndex("issue_ticket_pk", JIssueTicket.ISSUE_TICKET, new OrderField[] { JIssueTicket.ISSUE_TICKET.ISSUE_ID, JIssueTicket.ISSUE_TICKET.TICKET_ID }, true);
        public static Index ISSUE_TYPE_GROUP_IDX = Internal.createIndex("issue_type_group_idx", JIssueType.ISSUE_TYPE, new OrderField[] { JIssueType.ISSUE_TYPE.ISSUE_GROUP_ID }, false);
        public static Index ISSUE_TYPE_LOCATOR_KEY = Internal.createIndex("issue_type_locator_key", JIssueType.ISSUE_TYPE, new OrderField[] { JIssueType.ISSUE_TYPE.LOCATOR }, true);
        public static Index ISSUE_TYPE_PK = Internal.createIndex("issue_type_pk", JIssueType.ISSUE_TYPE, new OrderField[] { JIssueType.ISSUE_TYPE.ID }, true);
        public static Index ISSUE_TYPE_PROJECT_PK = Internal.createIndex("issue_type_project_pk", JIssueTypeProject.ISSUE_TYPE_PROJECT, new OrderField[] { JIssueTypeProject.ISSUE_TYPE_PROJECT.PROJECT_ID, JIssueTypeProject.ISSUE_TYPE_PROJECT.ISSUE_TYPE_ID }, true);
        public static Index ITEM_ATTR_LAUNCH_IDX = Internal.createIndex("item_attr_launch_idx", JItemAttribute.ITEM_ATTRIBUTE, new OrderField[] { JItemAttribute.ITEM_ATTRIBUTE.LAUNCH_ID }, false);
        public static Index ITEM_ATTR_TI_IDX = Internal.createIndex("item_attr_ti_idx", JItemAttribute.ITEM_ATTRIBUTE, new OrderField[] { JItemAttribute.ITEM_ATTRIBUTE.ITEM_ID }, false);
        public static Index ITEM_ATTRIBUTE_PK = Internal.createIndex("item_attribute_pk", JItemAttribute.ITEM_ATTRIBUTE, new OrderField[] { JItemAttribute.ITEM_ATTRIBUTE.ID }, true);
        public static Index LAUNCH_PK = Internal.createIndex("launch_pk", JLaunch.LAUNCH, new OrderField[] { JLaunch.LAUNCH.ID }, true);
        public static Index LAUNCH_PROJECT_START_TIME_IDX = Internal.createIndex("launch_project_start_time_idx", JLaunch.LAUNCH, new OrderField[] { JLaunch.LAUNCH.PROJECT_ID, JLaunch.LAUNCH.START_TIME }, false);
        public static Index LAUNCH_USER_IDX = Internal.createIndex("launch_user_idx", JLaunch.LAUNCH, new OrderField[] { JLaunch.LAUNCH.USER_ID }, false);
        public static Index LAUNCH_UUID_KEY = Internal.createIndex("launch_uuid_key", JLaunch.LAUNCH, new OrderField[] { JLaunch.LAUNCH.UUID }, true);
        public static Index UNQ_NAME_NUMBER = Internal.createIndex("unq_name_number", JLaunch.LAUNCH, new OrderField[] { JLaunch.LAUNCH.NAME, JLaunch.LAUNCH.NUMBER, JLaunch.LAUNCH.PROJECT_ID }, true);
        public static Index L_ATTR_RL_SEND_CASE_IDX = Internal.createIndex("l_attr_rl_send_case_idx", JLaunchAttributeRules.LAUNCH_ATTRIBUTE_RULES, new OrderField[] { JLaunchAttributeRules.LAUNCH_ATTRIBUTE_RULES.SENDER_CASE_ID }, false);
        public static Index LAUNCH_ATTRIBUTE_RULES_PK = Internal.createIndex("launch_attribute_rules_pk", JLaunchAttributeRules.LAUNCH_ATTRIBUTE_RULES, new OrderField[] { JLaunchAttributeRules.LAUNCH_ATTRIBUTE_RULES.ID }, true);
        public static Index LN_SEND_CASE_IDX = Internal.createIndex("ln_send_case_idx", JLaunchNames.LAUNCH_NAMES, new OrderField[] { JLaunchNames.LAUNCH_NAMES.SENDER_CASE_ID }, false);
        public static Index LAUNCH_NUMBER_PK = Internal.createIndex("launch_number_pk", JLaunchNumber.LAUNCH_NUMBER, new OrderField[] { JLaunchNumber.LAUNCH_NUMBER.ID }, true);
        public static Index UNQ_PROJECT_NAME = Internal.createIndex("unq_project_name", JLaunchNumber.LAUNCH_NUMBER, new OrderField[] { JLaunchNumber.LAUNCH_NUMBER.PROJECT_ID, JLaunchNumber.LAUNCH_NUMBER.LAUNCH_NAME }, true);
        public static Index LOG_ATTACH_ID_IDX = Internal.createIndex("log_attach_id_idx", JLog.LOG, new OrderField[] { JLog.LOG.ATTACHMENT_ID }, false);
        public static Index LOG_CLUSTER_IDX = Internal.createIndex("log_cluster_idx", JLog.LOG, new OrderField[] { JLog.LOG.CLUSTER_ID }, false);
        public static Index LOG_LAUNCH_ID_IDX = Internal.createIndex("log_launch_id_idx", JLog.LOG, new OrderField[] { JLog.LOG.LAUNCH_ID }, false);
        public static Index LOG_MESSAGE_TRGM_IDX = Internal.createIndex("log_message_trgm_idx", JLog.LOG, new OrderField[] { JLog.LOG.LOG_MESSAGE }, false);
        public static Index LOG_PK = Internal.createIndex("log_pk", JLog.LOG, new OrderField[] { JLog.LOG.ID }, true);
        public static Index LOG_PROJECT_ID_LOG_TIME_IDX = Internal.createIndex("log_project_id_log_time_idx", JLog.LOG, new OrderField[] { JLog.LOG.PROJECT_ID, JLog.LOG.LOG_TIME }, false);
        public static Index LOG_PROJECT_IDX = Internal.createIndex("log_project_idx", JLog.LOG, new OrderField[] { JLog.LOG.PROJECT_ID }, false);
        public static Index LOG_TI_IDX = Internal.createIndex("log_ti_idx", JLog.LOG, new OrderField[] { JLog.LOG.ITEM_ID }, false);
        public static Index OAUTH_ACCESS_TOKEN_PKEY = Internal.createIndex("oauth_access_token_pkey", JOauthAccessToken.OAUTH_ACCESS_TOKEN, new OrderField[] { JOauthAccessToken.OAUTH_ACCESS_TOKEN.ID }, true);
        public static Index OAUTH_AT_USER_IDX = Internal.createIndex("oauth_at_user_idx", JOauthAccessToken.OAUTH_ACCESS_TOKEN, new OrderField[] { JOauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID }, false);
        public static Index USERS_ACCESS_TOKEN_UNIQUE = Internal.createIndex("users_access_token_unique", JOauthAccessToken.OAUTH_ACCESS_TOKEN, new OrderField[] { JOauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN_ID, JOauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID }, true);
        public static Index OAUTH_REGISTRATION_CLIENT_ID_KEY = Internal.createIndex("oauth_registration_client_id_key", JOauthRegistration.OAUTH_REGISTRATION, new OrderField[] { JOauthRegistration.OAUTH_REGISTRATION.CLIENT_ID }, true);
        public static Index OAUTH_REGISTRATION_PKEY = Internal.createIndex("oauth_registration_pkey", JOauthRegistration.OAUTH_REGISTRATION, new OrderField[] { JOauthRegistration.OAUTH_REGISTRATION.ID }, true);
        public static Index OAUTH_REGISTRATION_RESTRICTION_PK = Internal.createIndex("oauth_registration_restriction_pk", JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION, new OrderField[] { JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.ID }, true);
        public static Index OAUTH_REGISTRATION_RESTRICTION_UNIQUE = Internal.createIndex("oauth_registration_restriction_unique", JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION, new OrderField[] { JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.TYPE, JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.VALUE, JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.OAUTH_REGISTRATION_FK }, true);
        public static Index OAUTH_REGISTRATION_SCOPE_PK = Internal.createIndex("oauth_registration_scope_pk", JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, new OrderField[] { JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.ID }, true);
        public static Index OAUTH_REGISTRATION_SCOPE_UNIQUE = Internal.createIndex("oauth_registration_scope_unique", JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, new OrderField[] { JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.SCOPE, JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.OAUTH_REGISTRATION_FK }, true);
        public static Index ONBOARDING_PK = Internal.createIndex("onboarding_pk", JOnboarding.ONBOARDING, new OrderField[] { JOnboarding.ONBOARDING.ID }, true);
        public static Index PARAMETER_TI_IDX = Internal.createIndex("parameter_ti_idx", JParameter.PARAMETER, new OrderField[] { JParameter.PARAMETER.ITEM_ID }, false);
        public static Index PATTERN_TEMPLATE_PK = Internal.createIndex("pattern_template_pk", JPatternTemplate.PATTERN_TEMPLATE, new OrderField[] { JPatternTemplate.PATTERN_TEMPLATE.ID }, true);
        public static Index UNQ_NAME_PROJECTID = Internal.createIndex("unq_name_projectid", JPatternTemplate.PATTERN_TEMPLATE, new OrderField[] { JPatternTemplate.PATTERN_TEMPLATE.NAME, JPatternTemplate.PATTERN_TEMPLATE.PROJECT_ID }, true);
        public static Index PATTERN_ITEM_ITEM_ID_IDX = Internal.createIndex("pattern_item_item_id_idx", JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM, new OrderField[] { JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM.ITEM_ID }, false);
        public static Index PATTERN_ITEM_UNQ = Internal.createIndex("pattern_item_unq", JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM, new OrderField[] { JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM.PATTERN_ID, JPatternTemplateTestItem.PATTERN_TEMPLATE_TEST_ITEM.ITEM_ID }, true);
        public static Index PROJECT_NAME_KEY = Internal.createIndex("project_name_key", JProject.PROJECT, new OrderField[] { JProject.PROJECT.NAME }, true);
        public static Index PROJECT_PK = Internal.createIndex("project_pk", JProject.PROJECT, new OrderField[] { JProject.PROJECT.ID }, true);
        public static Index UNIQUE_ATTRIBUTE_PER_PROJECT = Internal.createIndex("unique_attribute_per_project", JProjectAttribute.PROJECT_ATTRIBUTE, new OrderField[] { JProjectAttribute.PROJECT_ATTRIBUTE.ATTRIBUTE_ID, JProjectAttribute.PROJECT_ATTRIBUTE.PROJECT_ID }, true);
        public static Index USERS_PROJECT_PK = Internal.createIndex("users_project_pk", JProjectUser.PROJECT_USER, new OrderField[] { JProjectUser.PROJECT_USER.USER_ID, JProjectUser.PROJECT_USER.PROJECT_ID }, true);
        public static Index RCPNT_SEND_CASE_IDX = Internal.createIndex("rcpnt_send_case_idx", JRecipients.RECIPIENTS, new OrderField[] { JRecipients.RECIPIENTS.SENDER_CASE_ID }, false);
        public static Index RESTORE_PASSWORD_BID_EMAIL_KEY = Internal.createIndex("restore_password_bid_email_key", JRestorePasswordBid.RESTORE_PASSWORD_BID, new OrderField[] { JRestorePasswordBid.RESTORE_PASSWORD_BID.EMAIL }, true);
        public static Index RESTORE_PASSWORD_BID_PK = Internal.createIndex("restore_password_bid_pk", JRestorePasswordBid.RESTORE_PASSWORD_BID, new OrderField[] { JRestorePasswordBid.RESTORE_PASSWORD_BID.UUID }, true);
        public static Index SENDER_CASE_PK = Internal.createIndex("sender_case_pk", JSenderCase.SENDER_CASE, new OrderField[] { JSenderCase.SENDER_CASE.ID }, true);
        public static Index SENDER_CASE_PROJECT_IDX = Internal.createIndex("sender_case_project_idx", JSenderCase.SENDER_CASE, new OrderField[] { JSenderCase.SENDER_CASE.PROJECT_ID }, false);
        public static Index SERVER_SETTINGS_ID = Internal.createIndex("server_settings_id", JServerSettings.SERVER_SETTINGS, new OrderField[] { JServerSettings.SERVER_SETTINGS.ID }, true);
        public static Index SERVER_SETTINGS_KEY_KEY = Internal.createIndex("server_settings_key_key", JServerSettings.SERVER_SETTINGS, new OrderField[] { JServerSettings.SERVER_SETTINGS.KEY }, true);
        public static Index SHAREABLE_PK = Internal.createIndex("shareable_pk", JShareableEntity.SHAREABLE_ENTITY, new OrderField[] { JShareableEntity.SHAREABLE_ENTITY.ID }, true);
        public static Index SHARED_ENTITY_OWNERX = Internal.createIndex("shared_entity_ownerx", JShareableEntity.SHAREABLE_ENTITY, new OrderField[] { JShareableEntity.SHAREABLE_ENTITY.OWNER }, false);
        public static Index SHARED_ENTITY_PROJECT_IDX = Internal.createIndex("shared_entity_project_idx", JShareableEntity.SHAREABLE_ENTITY, new OrderField[] { JShareableEntity.SHAREABLE_ENTITY.PROJECT_ID }, false);
        public static Index STALE_MATERIALIZED_VIEW_NAME_KEY = Internal.createIndex("stale_materialized_view_name_key", JStaleMaterializedView.STALE_MATERIALIZED_VIEW, new OrderField[] { JStaleMaterializedView.STALE_MATERIALIZED_VIEW.NAME }, true);
        public static Index STALE_MATERIALIZED_VIEW_PKEY = Internal.createIndex("stale_materialized_view_pkey", JStaleMaterializedView.STALE_MATERIALIZED_VIEW, new OrderField[] { JStaleMaterializedView.STALE_MATERIALIZED_VIEW.ID }, true);
        public static Index STALE_MV_CREATION_DATE_IDX = Internal.createIndex("stale_mv_creation_date_idx", JStaleMaterializedView.STALE_MATERIALIZED_VIEW, new OrderField[] { JStaleMaterializedView.STALE_MATERIALIZED_VIEW.CREATION_DATE }, false);
        public static Index STATISTICS_LAUNCH_IDX = Internal.createIndex("statistics_launch_idx", JStatistics.STATISTICS, new OrderField[] { JStatistics.STATISTICS.LAUNCH_ID }, false);
        public static Index STATISTICS_PK = Internal.createIndex("statistics_pk", JStatistics.STATISTICS, new OrderField[] { JStatistics.STATISTICS.S_ID }, true);
        public static Index STATISTICS_TI_IDX = Internal.createIndex("statistics_ti_idx", JStatistics.STATISTICS, new OrderField[] { JStatistics.STATISTICS.ITEM_ID }, false);
        public static Index UNIQUE_STATS_ITEM = Internal.createIndex("unique_stats_item", JStatistics.STATISTICS, new OrderField[] { JStatistics.STATISTICS.STATISTICS_FIELD_ID, JStatistics.STATISTICS.ITEM_ID }, true);
        public static Index UNIQUE_STATS_LAUNCH = Internal.createIndex("unique_stats_launch", JStatistics.STATISTICS, new OrderField[] { JStatistics.STATISTICS.STATISTICS_FIELD_ID, JStatistics.STATISTICS.LAUNCH_ID }, true);
        public static Index STATISTICS_FIELD_NAME_KEY = Internal.createIndex("statistics_field_name_key", JStatisticsField.STATISTICS_FIELD, new OrderField[] { JStatisticsField.STATISTICS_FIELD.NAME }, true);
        public static Index STATISTICS_FIELD_PK = Internal.createIndex("statistics_field_pk", JStatisticsField.STATISTICS_FIELD, new OrderField[] { JStatisticsField.STATISTICS_FIELD.SF_ID }, true);
        public static Index ITEM_TEST_CASE_ID_LAUNCH_ID_IDX = Internal.createIndex("item_test_case_id_launch_id_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.TEST_CASE_ID, JTestItem.TEST_ITEM.LAUNCH_ID }, false);
        public static Index PATH_GIST_IDX = Internal.createIndex("path_gist_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.PATH }, false);
        public static Index PATH_IDX = Internal.createIndex("path_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.PATH }, false);
        public static Index TEST_CASE_HASH_LAUNCH_ID_IDX = Internal.createIndex("test_case_hash_launch_id_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.TEST_CASE_HASH, JTestItem.TEST_ITEM.LAUNCH_ID }, false);
        public static Index TEST_ITEM_PK = Internal.createIndex("test_item_pk", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.ITEM_ID }, true);
        public static Index TEST_ITEM_UNIQUE_ID_LAUNCH_ID_IDX = Internal.createIndex("test_item_unique_id_launch_id_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.UNIQUE_ID, JTestItem.TEST_ITEM.LAUNCH_ID }, false);
        public static Index TEST_ITEM_UUID_KEY = Internal.createIndex("test_item_uuid_key", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.UUID }, true);
        public static Index TI_LAUNCH_IDX = Internal.createIndex("ti_launch_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.LAUNCH_ID }, false);
        public static Index TI_PARENT_IDX = Internal.createIndex("ti_parent_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.PARENT_ID }, false);
        public static Index TI_RETRY_OF_IDX = Internal.createIndex("ti_retry_of_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.RETRY_OF }, false);
        public static Index TEST_ITEM_RESULTS_PK = Internal.createIndex("test_item_results_pk", JTestItemResults.TEST_ITEM_RESULTS, new OrderField[] { JTestItemResults.TEST_ITEM_RESULTS.RESULT_ID }, true);
        public static Index TICKET_ID_IDX = Internal.createIndex("ticket_id_idx", JTicket.TICKET, new OrderField[] { JTicket.TICKET.TICKET_ID }, false);
        public static Index TICKET_PK = Internal.createIndex("ticket_pk", JTicket.TICKET, new OrderField[] { JTicket.TICKET.ID }, true);
        public static Index TICKET_SUBMITTER_IDX = Internal.createIndex("ticket_submitter_idx", JTicket.TICKET, new OrderField[] { JTicket.TICKET.SUBMITTER }, false);
        public static Index USER_BID_PROJECT_IDX = Internal.createIndex("user_bid_project_idx", JUserCreationBid.USER_CREATION_BID, new OrderField[] { JUserCreationBid.USER_CREATION_BID.DEFAULT_PROJECT_ID }, false);
        public static Index USER_CREATION_BID_PK = Internal.createIndex("user_creation_bid_pk", JUserCreationBid.USER_CREATION_BID, new OrderField[] { JUserCreationBid.USER_CREATION_BID.UUID }, true);
        public static Index USER_PREFERENCE_PK = Internal.createIndex("user_preference_pk", JUserPreference.USER_PREFERENCE, new OrderField[] { JUserPreference.USER_PREFERENCE.ID }, true);
        public static Index USER_PREFERENCE_UQ = Internal.createIndex("user_preference_uq", JUserPreference.USER_PREFERENCE, new OrderField[] { JUserPreference.USER_PREFERENCE.PROJECT_ID, JUserPreference.USER_PREFERENCE.USER_ID, JUserPreference.USER_PREFERENCE.FILTER_ID }, true);
        public static Index USERS_EMAIL_KEY = Internal.createIndex("users_email_key", JUsers.USERS, new OrderField[] { JUsers.USERS.EMAIL }, true);
        public static Index USERS_LOGIN_KEY = Internal.createIndex("users_login_key", JUsers.USERS, new OrderField[] { JUsers.USERS.LOGIN }, true);
        public static Index USERS_PK = Internal.createIndex("users_pk", JUsers.USERS, new OrderField[] { JUsers.USERS.ID }, true);
        public static Index WIDGET_PKEY = Internal.createIndex("widget_pkey", JWidget.WIDGET, new OrderField[] { JWidget.WIDGET.ID }, true);
        public static Index WIDGET_FILTER_PK = Internal.createIndex("widget_filter_pk", JWidgetFilter.WIDGET_FILTER, new OrderField[] { JWidgetFilter.WIDGET_FILTER.WIDGET_ID, JWidgetFilter.WIDGET_FILTER.FILTER_ID }, true);
    }
}
