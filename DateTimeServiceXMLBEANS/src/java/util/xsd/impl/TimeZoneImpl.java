/*
 * XML Type:  TimeZone
 * Namespace: http://util.java/xsd
 * Java type: java.util.xsd.TimeZone
 *
 * Automatically generated - do not modify.
 */
package java.util.xsd.impl;
/**
 * An XML TimeZone(@http://util.java/xsd).
 *
 * This is a complex type.
 */
public class TimeZoneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements java.util.xsd.TimeZone
{
    private static final long serialVersionUID = 1L;
    
    public TimeZoneImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSTSAVINGS$0 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "DSTSavings");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "ID");
    private static final javax.xml.namespace.QName DISPLAYNAME$4 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "displayName");
    private static final javax.xml.namespace.QName RAWOFFSET$6 = 
        new javax.xml.namespace.QName("http://util.java/xsd", "rawOffset");
    
    
    /**
     * Gets the "DSTSavings" element
     */
    public int getDSTSavings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DSTSAVINGS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DSTSavings" element
     */
    public org.apache.xmlbeans.XmlInt xgetDSTSavings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DSTSAVINGS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DSTSavings" element
     */
    public boolean isSetDSTSavings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DSTSAVINGS$0) != 0;
        }
    }
    
    /**
     * Sets the "DSTSavings" element
     */
    public void setDSTSavings(int dstSavings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DSTSAVINGS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DSTSAVINGS$0);
            }
            target.setIntValue(dstSavings);
        }
    }
    
    /**
     * Sets (as xml) the "DSTSavings" element
     */
    public void xsetDSTSavings(org.apache.xmlbeans.XmlInt dstSavings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DSTSAVINGS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DSTSAVINGS$0);
            }
            target.set(dstSavings);
        }
    }
    
    /**
     * Unsets the "DSTSavings" element
     */
    public void unsetDSTSavings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DSTSAVINGS$0, 0);
        }
    }
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ID" element
     */
    public boolean isNilID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$2) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Nils the "ID" element
     */
    public void setNilID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$2, 0);
        }
    }
    
    /**
     * Gets the "displayName" element
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayName" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "displayName" element
     */
    public boolean isNilDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "displayName" element
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "displayName" element
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYNAME$4);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "displayName" element
     */
    public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$4);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Nils the "displayName" element
     */
    public void setNilDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "displayName" element
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$4, 0);
        }
    }
    
    /**
     * Gets the "rawOffset" element
     */
    public int getRawOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAWOFFSET$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "rawOffset" element
     */
    public org.apache.xmlbeans.XmlInt xgetRawOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RAWOFFSET$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "rawOffset" element
     */
    public boolean isSetRawOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RAWOFFSET$6) != 0;
        }
    }
    
    /**
     * Sets the "rawOffset" element
     */
    public void setRawOffset(int rawOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAWOFFSET$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RAWOFFSET$6);
            }
            target.setIntValue(rawOffset);
        }
    }
    
    /**
     * Sets (as xml) the "rawOffset" element
     */
    public void xsetRawOffset(org.apache.xmlbeans.XmlInt rawOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RAWOFFSET$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RAWOFFSET$6);
            }
            target.set(rawOffset);
        }
    }
    
    /**
     * Unsets the "rawOffset" element
     */
    public void unsetRawOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RAWOFFSET$6, 0);
        }
    }
}
