/*
 * An XML document type.
 * Localname: getDateResponse
 * Namespace: http://injenity.net
 * Java type: net.injenity.GetDateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.injenity.impl;
/**
 * A document containing one getDateResponse(@http://injenity.net) element.
 *
 * This is a complex type.
 */
public class GetDateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.injenity.GetDateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://injenity.net", "getDateResponse");
    
    
    /**
     * Gets the "getDateResponse" element
     */
    public net.injenity.GetDateResponseDocument.GetDateResponse getGetDateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.injenity.GetDateResponseDocument.GetDateResponse target = null;
            target = (net.injenity.GetDateResponseDocument.GetDateResponse)get_store().find_element_user(GETDATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDateResponse" element
     */
    public void setGetDateResponse(net.injenity.GetDateResponseDocument.GetDateResponse getDateResponse)
    {
        generatedSetterHelperImpl(getDateResponse, GETDATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getDateResponse" element
     */
    public net.injenity.GetDateResponseDocument.GetDateResponse addNewGetDateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.injenity.GetDateResponseDocument.GetDateResponse target = null;
            target = (net.injenity.GetDateResponseDocument.GetDateResponse)get_store().add_element_user(GETDATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getDateResponse(@http://injenity.net).
     *
     * This is a complex type.
     */
    public static class GetDateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.injenity.GetDateResponseDocument.GetDateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetDateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://injenity.net", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.util.Calendar getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlDate xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RETURN$0, 0);
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
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RETURN$0, 0);
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
        public void setReturn(java.util.Calendar xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setCalendarValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlDate xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
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
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(RETURN$0);
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
