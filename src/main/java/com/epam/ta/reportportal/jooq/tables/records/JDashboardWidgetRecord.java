/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JDashboardWidget;
import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record2;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class JDashboardWidgetRecord extends UpdatableRecordImpl<JDashboardWidgetRecord> implements Record10<Long, Long, String, String, String, Integer, Integer, Integer, Integer, Boolean> {

    private static final long serialVersionUID = 2078869904;

    /**
     * Setter for <code>public.dashboard_widget.dashboard_id</code>.
     */
    public void setDashboardId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.dashboard_id</code>.
     */
    public Long getDashboardId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_id</code>.
     */
    public void setWidgetId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_id</code>.
     */
    public Long getWidgetId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_name</code>.
     */
    public void setWidgetName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_name</code>.
     */
    public String getWidgetName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_owner</code>.
     */
    public void setWidgetOwner(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_owner</code>.
     */
    public String getWidgetOwner() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_type</code>.
     */
    public void setWidgetType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_type</code>.
     */
    public String getWidgetType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_width</code>.
     */
    public void setWidgetWidth(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_width</code>.
     */
    public Integer getWidgetWidth() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_height</code>.
     */
    public void setWidgetHeight(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_height</code>.
     */
    public Integer getWidgetHeight() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_position_x</code>.
     */
    public void setWidgetPositionX(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_position_x</code>.
     */
    public Integer getWidgetPositionX() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_position_y</code>.
     */
    public void setWidgetPositionY(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_position_y</code>.
     */
    public Integer getWidgetPositionY() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.dashboard_widget.is_created_on</code>.
     */
    public void setIsCreatedOn(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.is_created_on</code>.
     */
    public Boolean getIsCreatedOn() {
        return (Boolean) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, String, String, String, Integer, Integer, Integer, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, String, String, String, Integer, Integer, Integer, Integer, Boolean> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JDashboardWidget.DASHBOARD_WIDGET.WIDGET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JDashboardWidget.DASHBOARD_WIDGET.WIDGET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JDashboardWidget.DASHBOARD_WIDGET.WIDGET_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JDashboardWidget.DASHBOARD_WIDGET.WIDGET_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return JDashboardWidget.DASHBOARD_WIDGET.WIDGET_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return JDashboardWidget.DASHBOARD_WIDGET.WIDGET_HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return JDashboardWidget.DASHBOARD_WIDGET.WIDGET_POSITION_X;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return JDashboardWidget.DASHBOARD_WIDGET.WIDGET_POSITION_Y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return JDashboardWidget.DASHBOARD_WIDGET.IS_CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDashboardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getWidgetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getWidgetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getWidgetOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getWidgetType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getWidgetWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getWidgetHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getWidgetPositionX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getWidgetPositionY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getIsCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDashboardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getWidgetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getWidgetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getWidgetOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getWidgetType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getWidgetWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getWidgetHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getWidgetPositionX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getWidgetPositionY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getIsCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value1(Long value) {
        setDashboardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value2(Long value) {
        setWidgetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value3(String value) {
        setWidgetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value4(String value) {
        setWidgetOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value5(String value) {
        setWidgetType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value6(Integer value) {
        setWidgetWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value7(Integer value) {
        setWidgetHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value8(Integer value) {
        setWidgetPositionX(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value9(Integer value) {
        setWidgetPositionY(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord value10(Boolean value) {
        setIsCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDashboardWidgetRecord values(Long value1, Long value2, String value3, String value4, String value5, Integer value6, Integer value7, Integer value8, Integer value9, Boolean value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JDashboardWidgetRecord
     */
    public JDashboardWidgetRecord() {
        super(JDashboardWidget.DASHBOARD_WIDGET);
    }

    /**
     * Create a detached, initialised JDashboardWidgetRecord
     */
    public JDashboardWidgetRecord(Long dashboardId, Long widgetId, String widgetName, String widgetOwner, String widgetType, Integer widgetWidth, Integer widgetHeight, Integer widgetPositionX, Integer widgetPositionY, Boolean isCreatedOn) {
        super(JDashboardWidget.DASHBOARD_WIDGET);

        set(0, dashboardId);
        set(1, widgetId);
        set(2, widgetName);
        set(3, widgetOwner);
        set(4, widgetType);
        set(5, widgetWidth);
        set(6, widgetHeight);
        set(7, widgetPositionX);
        set(8, widgetPositionY);
        set(9, isCreatedOn);
    }
}
