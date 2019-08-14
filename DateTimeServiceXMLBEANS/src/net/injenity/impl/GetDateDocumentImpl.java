/*
 * An XML document type.
 * Localname: getDate
 * Namespace: http://injenity.net
 * Java type: net.injenity.GetDateDocument
 *
 * Automatically generated - do not modify.
 */
package net.injenity.impl;
/**
 * A document containing one getDate(@http://injenity.net) element.
 *
 * This is a complex type.
 */
public class GetDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.injenity.GetDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDATE$0 = 
        new javax.xml.namespace.QName("http://injenity.net", "getDate");
    
    
    /**
     * Gets the "getDate" element
     */
    public net.injenity.GetDateDocument.GetDate getGetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.injenity.GetDateDocument.GetDate target = null;
            target = (net.injenity.GetDateDocument.GetDate)get_store().find_element_user(GETDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDate" element
     */
    public void setGetDate(net.injenity.GetDateDocument.GetDate getDate)
    {
        generatedSetterHelperImpl(getDate, GETDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getDate" element
     */
    public net.injenity.GetDateDocument.GetDate addNewGetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.injenity.GetDateDocument.GetDate target = null;
            target = (net.injenity.GetDateDocument.GetDate)get_store().add_element_user(GETDATE$0);
            return target;
        }
    }
    /**
     * An XML getDate(@http://injenity.net).
     *
     * This is a complex type.
     */
    public static class GetDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.injenity.GetDateDocument.GetDate
    {
        private static final long serialVersionUID = 1L;
        
        public GetDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SET$0 = 
            new javax.xml.namespace.QName("http://injenity.net", "set");
        
        
        /**
         * Gets the "set" element
         */
        public java.util.Calendar getSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SET$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "set" element
         */
        public org.apache.xmlbeans.XmlDate xgetSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(SET$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "set" element
         */
        public boolean isNilSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(SET$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "set" element
         */
        public boolean isSetSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SET$0) != 0;
            }
        }
        
        /**
         * Sets the "set" element
         */
        public void setSet(java.util.Calendar set)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SET$0);
                }
                target.setCalendarValue(set);
            }
        }
        
        /**
         * Sets (as xml) the "set" element
         */
        public void xsetSet(org.apache.xmlbeans.XmlDate set)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(SET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(SET$0);
                }
                target.set(set);
            }
        }
        
        /**
         * Nils the "set" element
         */
        public void setNilSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(SET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(SET$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "set" element
         */
        public void unsetSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SET$0, 0);
            }
        }
    }
}
