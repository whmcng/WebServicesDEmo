/*
 * An XML document type.
 * Localname: getCalendarResponse
 * Namespace: http://injenity.net
 * Java type: net.injenity.GetCalendarResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.injenity.impl;
/**
 * A document containing one getCalendarResponse(@http://injenity.net) element.
 *
 * This is a complex type.
 */
public class GetCalendarResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.injenity.GetCalendarResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCalendarResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCALENDARRESPONSE$0 = 
        new javax.xml.namespace.QName("http://injenity.net", "getCalendarResponse");
    
    
    /**
     * Gets the "getCalendarResponse" element
     */
    public net.injenity.GetCalendarResponseDocument.GetCalendarResponse getGetCalendarResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.injenity.GetCalendarResponseDocument.GetCalendarResponse target = null;
            target = (net.injenity.GetCalendarResponseDocument.GetCalendarResponse)get_store().find_element_user(GETCALENDARRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCalendarResponse" element
     */
    public void setGetCalendarResponse(net.injenity.GetCalendarResponseDocument.GetCalendarResponse getCalendarResponse)
    {
        generatedSetterHelperImpl(getCalendarResponse, GETCALENDARRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCalendarResponse" element
     */
    public net.injenity.GetCalendarResponseDocument.GetCalendarResponse addNewGetCalendarResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.injenity.GetCalendarResponseDocument.GetCalendarResponse target = null;
            target = (net.injenity.GetCalendarResponseDocument.GetCalendarResponse)get_store().add_element_user(GETCALENDARRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getCalendarResponse(@http://injenity.net).
     *
     * This is a complex type.
     */
    public static class GetCalendarResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.injenity.GetCalendarResponseDocument.GetCalendarResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCalendarResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://injenity.net", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.util.xsd.GregorianCalendar getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.xsd.GregorianCalendar target = null;
                target = (java.util.xsd.GregorianCalendar)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.xsd.GregorianCalendar target = null;
                target = (java.util.xsd.GregorianCalendar)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.util.xsd.GregorianCalendar xreturn)
        {
            generatedSetterHelperImpl(xreturn, RETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public java.util.xsd.GregorianCalendar addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.xsd.GregorianCalendar target = null;
                target = (java.util.xsd.GregorianCalendar)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.xsd.GregorianCalendar target = null;
                target = (java.util.xsd.GregorianCalendar)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (java.util.xsd.GregorianCalendar)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
