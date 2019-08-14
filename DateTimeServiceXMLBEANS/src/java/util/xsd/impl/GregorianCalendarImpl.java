/*
 * XML Type:  GregorianCalendar
 * Namespace: http://util.java/xsd
 * Java type: java.util.xsd.GregorianCalendar
 *
 * Automatically generated - do not modify.
 */
package java.util.xsd.impl;
/**
 * An XML GregorianCalendar(@http://util.java/xsd).
 *
 * This is a complex type.
 */
public class GregorianCalendarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements java.util.xsd.GregorianCalendar
{
    private static final long serialVersionUID = 1L;
    
    public GregorianCalendarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALENDARTYPE$0 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "calendarType");
    private static final javax.xml.namespace.QName GREGORIANCHANGE$2 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "gregorianChange");
    private static final javax.xml.namespace.QName TIMEZONE$4 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "timeZone");
    private static final javax.xml.namespace.QName WEEKDATESUPPORTED$6 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "weekDateSupported");
    private static final javax.xml.namespace.QName WEEKYEAR$8 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "weekYear");
    private static final javax.xml.namespace.QName WEEKSINWEEKYEAR$10 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "weeksInWeekYear");
    
    
    /**
     * Gets the "calendarType" element
     */
    public java.lang.String getCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "calendarType" element
     */
    public org.apache.xmlbeans.XmlString xgetCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALENDARTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "calendarType" element
     */
    public boolean isNilCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALENDARTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "calendarType" element
     */
    public boolean isSetCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALENDARTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "calendarType" element
     */
    public void setCalendarType(java.lang.String calendarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALENDARTYPE$0);
            }
            target.setStringValue(calendarType);
        }
    }
    
    /**
     * Sets (as xml) the "calendarType" element
     */
    public void xsetCalendarType(org.apache.xmlbeans.XmlString calendarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALENDARTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALENDARTYPE$0);
            }
            target.set(calendarType);
        }
    }
    
    /**
     * Nils the "calendarType" element
     */
    public void setNilCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALENDARTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALENDARTYPE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "calendarType" element
     */
    public void unsetCalendarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALENDARTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "gregorianChange" element
     */
    public java.util.Calendar getGregorianChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GREGORIANCHANGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "gregorianChange" element
     */
    public org.apache.xmlbeans.XmlDate xgetGregorianChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(GREGORIANCHANGE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "gregorianChange" element
     */
    public boolean isNilGregorianChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(GREGORIANCHANGE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "gregorianChange" element
     */
    public boolean isSetGregorianChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GREGORIANCHANGE$2) != 0;
        }
    }
    
    /**
     * Sets the "gregorianChange" element
     */
    public void setGregorianChange(java.util.Calendar gregorianChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GREGORIANCHANGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GREGORIANCHANGE$2);
            }
            target.setCalendarValue(gregorianChange);
        }
    }
    
    /**
     * Sets (as xml) the "gregorianChange" element
     */
    public void xsetGregorianChange(org.apache.xmlbeans.XmlDate gregorianChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(GREGORIANCHANGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(GREGORIANCHANGE$2);
            }
            target.set(gregorianChange);
        }
    }
    
    /**
     * Nils the "gregorianChange" element
     */
    public void setNilGregorianChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(GREGORIANCHANGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(GREGORIANCHANGE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "gregorianChange" element
     */
    public void unsetGregorianChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GREGORIANCHANGE$2, 0);
        }
    }
    
    /**
     * Gets the "timeZone" element
     */
    public java.util.xsd.TimeZone getTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.xsd.TimeZone target = null;
            target = (java.util.xsd.TimeZone)get_store().find_element_user(TIMEZONE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "timeZone" element
     */
    public boolean isNilTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.xsd.TimeZone target = null;
            target = (java.util.xsd.TimeZone)get_store().find_element_user(TIMEZONE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "timeZone" element
     */
    public boolean isSetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONE$4) != 0;
        }
    }
    
    /**
     * Sets the "timeZone" element
     */
    public void setTimeZone(java.util.xsd.TimeZone timeZone)
    {
        generatedSetterHelperImpl(timeZone, TIMEZONE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeZone" element
     */
    public java.util.xsd.TimeZone addNewTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.xsd.TimeZone target = null;
            target = (java.util.xsd.TimeZone)get_store().add_element_user(TIMEZONE$4);
            return target;
        }
    }
    
    /**
     * Nils the "timeZone" element
     */
    public void setNilTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.xsd.TimeZone target = null;
            target = (java.util.xsd.TimeZone)get_store().find_element_user(TIMEZONE$4, 0);
            if (target == null)
            {
                target = (java.util.xsd.TimeZone)get_store().add_element_user(TIMEZONE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "timeZone" element
     */
    public void unsetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONE$4, 0);
        }
    }
    
    /**
     * Gets the "weekDateSupported" element
     */
    public boolean getWeekDateSupported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKDATESUPPORTED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "weekDateSupported" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWeekDateSupported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WEEKDATESUPPORTED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "weekDateSupported" element
     */
    public boolean isSetWeekDateSupported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEEKDATESUPPORTED$6) != 0;
        }
    }
    
    /**
     * Sets the "weekDateSupported" element
     */
    public void setWeekDateSupported(boolean weekDateSupported)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKDATESUPPORTED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEEKDATESUPPORTED$6);
            }
            target.setBooleanValue(weekDateSupported);
        }
    }
    
    /**
     * Sets (as xml) the "weekDateSupported" element
     */
    public void xsetWeekDateSupported(org.apache.xmlbeans.XmlBoolean weekDateSupported)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WEEKDATESUPPORTED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WEEKDATESUPPORTED$6);
            }
            target.set(weekDateSupported);
        }
    }
    
    /**
     * Unsets the "weekDateSupported" element
     */
    public void unsetWeekDateSupported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEEKDATESUPPORTED$6, 0);
        }
    }
    
    /**
     * Gets the "weekYear" element
     */
    public int getWeekYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKYEAR$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "weekYear" element
     */
    public org.apache.xmlbeans.XmlInt xgetWeekYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WEEKYEAR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "weekYear" element
     */
    public boolean isSetWeekYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEEKYEAR$8) != 0;
        }
    }
    
    /**
     * Sets the "weekYear" element
     */
    public void setWeekYear(int weekYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKYEAR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEEKYEAR$8);
            }
            target.setIntValue(weekYear);
        }
    }
    
    /**
     * Sets (as xml) the "weekYear" element
     */
    public void xsetWeekYear(org.apache.xmlbeans.XmlInt weekYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WEEKYEAR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WEEKYEAR$8);
            }
            target.set(weekYear);
        }
    }
    
    /**
     * Unsets the "weekYear" element
     */
    public void unsetWeekYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEEKYEAR$8, 0);
        }
    }
    
    /**
     * Gets the "weeksInWeekYear" element
     */
    public int getWeeksInWeekYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKSINWEEKYEAR$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "weeksInWeekYear" element
     */
    public org.apache.xmlbeans.XmlInt xgetWeeksInWeekYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WEEKSINWEEKYEAR$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "weeksInWeekYear" element
     */
    public boolean isSetWeeksInWeekYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEEKSINWEEKYEAR$10) != 0;
        }
    }
    
    /**
     * Sets the "weeksInWeekYear" element
     */
    public void setWeeksInWeekYear(int weeksInWeekYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKSINWEEKYEAR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEEKSINWEEKYEAR$10);
            }
            target.setIntValue(weeksInWeekYear);
        }
    }
    
    /**
     * Sets (as xml) the "weeksInWeekYear" element
     */
    public void xsetWeeksInWeekYear(org.apache.xmlbeans.XmlInt weeksInWeekYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WEEKSINWEEKYEAR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WEEKSINWEEKYEAR$10);
            }
            target.set(weeksInWeekYear);
        }
    }
    
    /**
     * Unsets the "weeksInWeekYear" element
     */
    public void unsetWeeksInWeekYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEEKSINWEEKYEAR$10, 0);
        }
    }
}
