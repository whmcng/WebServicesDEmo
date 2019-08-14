/*
 * An XML document type.
 * Localname: getCalendar
 * Namespace: http://injenity.net
 * Java type: net.injenity.GetCalendarDocument
 *
 * Automatically generated - do not modify.
 */
package net.injenity.impl;
/**
 * A document containing one getCalendar(@http://injenity.net) element.
 *
 * This is a complex type.
 */
public class GetCalendarDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.injenity.GetCalendarDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCalendarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCALENDAR$0 = 
        new javax.xml.namespace.QName("http://injenity.net", "getCalendar");
    
    
    /**
     * Gets the "getCalendar" element
     */
    public net.injenity.GetCalendarDocument.GetCalendar getGetCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.injenity.GetCalendarDocument.GetCalendar target = null;
            target = (net.injenity.GetCalendarDocument.GetCalendar)get_store().find_element_user(GETCALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCalendar" element
     */
    public void setGetCalendar(net.injenity.GetCalendarDocument.GetCalendar getCalendar)
    {
        generatedSetterHelperImpl(getCalendar, GETCALENDAR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCalendar" element
     */
    public net.injenity.GetCalendarDocument.GetCalendar addNewGetCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.injenity.GetCalendarDocument.GetCalendar target = null;
            target = (net.injenity.GetCalendarDocument.GetCalendar)get_store().add_element_user(GETCALENDAR$0);
            return target;
        }
    }
    /**
     * An XML getCalendar(@http://injenity.net).
     *
     * This is a complex type.
     */
    public static class GetCalendarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.injenity.GetCalendarDocument.GetCalendar
    {
        private static final long serialVersionUID = 1L;
        
        public GetCalendarImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CAL$0 = 
            new javax.xml.namespace.QName("http://injenity.net", "cal");
        
        
        /**
         * Gets the "cal" element
         */
        public java.util.xsd.GregorianCalendar getCal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.xsd.GregorianCalendar target = null;
                target = (java.util.xsd.GregorianCalendar)get_store().find_element_user(CAL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "cal" element
         */
        public boolean isNilCal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.xsd.GregorianCalendar target = null;
                target = (java.util.xsd.GregorianCalendar)get_store().find_element_user(CAL$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "cal" element
         */
        public boolean isSetCal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CAL$0) != 0;
            }
        }
        
        /**
         * Sets the "cal" element
         */
        public void setCal(java.util.xsd.GregorianCalendar cal)
        {
            generatedSetterHelperImpl(cal, CAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "cal" element
         */
        public java.util.xsd.GregorianCalendar addNewCal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.xsd.GregorianCalendar target = null;
                target = (java.util.xsd.GregorianCalendar)get_store().add_element_user(CAL$0);
                return target;
            }
        }
        
        /**
         * Nils the "cal" element
         */
        public void setNilCal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.xsd.GregorianCalendar target = null;
                target = (java.util.xsd.GregorianCalendar)get_store().find_element_user(CAL$0, 0);
                if (target == null)
                {
                    target = (java.util.xsd.GregorianCalendar)get_store().add_element_user(CAL$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "cal" element
         */
        public void unsetCal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CAL$0, 0);
            }
        }
    }
}
