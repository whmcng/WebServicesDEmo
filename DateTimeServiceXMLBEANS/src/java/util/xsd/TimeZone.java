/*
 * XML Type:  TimeZone
 * Namespace: http://util.java/xsd
 * Java type: java.util.xsd.TimeZone
 *
 * Automatically generated - do not modify.
 */
package java.util.xsd;


/**
 * An XML TimeZone(@http://util.java/xsd).
 *
 * This is a complex type.
 */
public interface TimeZone extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeZone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4FBB4742F9DD056330AAFC71F6CD935").resolveHandle("timezone06d4type");
    
    /**
     * Gets the "DSTSavings" element
     */
    int getDSTSavings();
    
    /**
     * Gets (as xml) the "DSTSavings" element
     */
    org.apache.xmlbeans.XmlInt xgetDSTSavings();
    
    /**
     * True if has "DSTSavings" element
     */
    boolean isSetDSTSavings();
    
    /**
     * Sets the "DSTSavings" element
     */
    void setDSTSavings(int dstSavings);
    
    /**
     * Sets (as xml) the "DSTSavings" element
     */
    void xsetDSTSavings(org.apache.xmlbeans.XmlInt dstSavings);
    
    /**
     * Unsets the "DSTSavings" element
     */
    void unsetDSTSavings();
    
    /**
     * Gets the "ID" element
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.apache.xmlbeans.XmlString xgetID();
    
    /**
     * Tests for nil "ID" element
     */
    boolean isNilID();
    
    /**
     * True if has "ID" element
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.apache.xmlbeans.XmlString id);
    
    /**
     * Nils the "ID" element
     */
    void setNilID();
    
    /**
     * Unsets the "ID" element
     */
    void unsetID();
    
    /**
     * Gets the "displayName" element
     */
    java.lang.String getDisplayName();
    
    /**
     * Gets (as xml) the "displayName" element
     */
    org.apache.xmlbeans.XmlString xgetDisplayName();
    
    /**
     * Tests for nil "displayName" element
     */
    boolean isNilDisplayName();
    
    /**
     * True if has "displayName" element
     */
    boolean isSetDisplayName();
    
    /**
     * Sets the "displayName" element
     */
    void setDisplayName(java.lang.String displayName);
    
    /**
     * Sets (as xml) the "displayName" element
     */
    void xsetDisplayName(org.apache.xmlbeans.XmlString displayName);
    
    /**
     * Nils the "displayName" element
     */
    void setNilDisplayName();
    
    /**
     * Unsets the "displayName" element
     */
    void unsetDisplayName();
    
    /**
     * Gets the "rawOffset" element
     */
    int getRawOffset();
    
    /**
     * Gets (as xml) the "rawOffset" element
     */
    org.apache.xmlbeans.XmlInt xgetRawOffset();
    
    /**
     * True if has "rawOffset" element
     */
    boolean isSetRawOffset();
    
    /**
     * Sets the "rawOffset" element
     */
    void setRawOffset(int rawOffset);
    
    /**
     * Sets (as xml) the "rawOffset" element
     */
    void xsetRawOffset(org.apache.xmlbeans.XmlInt rawOffset);
    
    /**
     * Unsets the "rawOffset" element
     */
    void unsetRawOffset();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static java.util.xsd.TimeZone newInstance() {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static java.util.xsd.TimeZone newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static java.util.xsd.TimeZone parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static java.util.xsd.TimeZone parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static java.util.xsd.TimeZone parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static java.util.xsd.TimeZone parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static java.util.xsd.TimeZone parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static java.util.xsd.TimeZone parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static java.util.xsd.TimeZone parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static java.util.xsd.TimeZone parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static java.util.xsd.TimeZone parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static java.util.xsd.TimeZone parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static java.util.xsd.TimeZone parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static java.util.xsd.TimeZone parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static java.util.xsd.TimeZone parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static java.util.xsd.TimeZone parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static java.util.xsd.TimeZone parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static java.util.xsd.TimeZone parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (java.util.xsd.TimeZone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
