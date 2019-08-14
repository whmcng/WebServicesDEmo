/*
 * An XML document type.
 * Localname: getCalendar
 * Namespace: http://injenity.net
 * Java type: net.injenity.GetCalendarDocument
 *
 * Automatically generated - do not modify.
 */
package net.injenity;


/**
 * A document containing one getCalendar(@http://injenity.net) element.
 *
 * This is a complex type.
 */
public interface GetCalendarDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCalendarDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4FBB4742F9DD056330AAFC71F6CD935").resolveHandle("getcalendar673cdoctype");
    
    /**
     * Gets the "getCalendar" element
     */
    net.injenity.GetCalendarDocument.GetCalendar getGetCalendar();
    
    /**
     * Sets the "getCalendar" element
     */
    void setGetCalendar(net.injenity.GetCalendarDocument.GetCalendar getCalendar);
    
    /**
     * Appends and returns a new empty "getCalendar" element
     */
    net.injenity.GetCalendarDocument.GetCalendar addNewGetCalendar();
    
    /**
     * An XML getCalendar(@http://injenity.net).
     *
     * This is a complex type.
     */
    public interface GetCalendar extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCalendar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4FBB4742F9DD056330AAFC71F6CD935").resolveHandle("getcalendar805celemtype");
        
        /**
         * Gets the "cal" element
         */
        java.util.xsd.GregorianCalendar getCal();
        
        /**
         * Tests for nil "cal" element
         */
        boolean isNilCal();
        
        /**
         * True if has "cal" element
         */
        boolean isSetCal();
        
        /**
         * Sets the "cal" element
         */
        void setCal(java.util.xsd.GregorianCalendar cal);
        
        /**
         * Appends and returns a new empty "cal" element
         */
        java.util.xsd.GregorianCalendar addNewCal();
        
        /**
         * Nils the "cal" element
         */
        void setNilCal();
        
        /**
         * Unsets the "cal" element
         */
        void unsetCal();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.injenity.GetCalendarDocument.GetCalendar newInstance() {
              return (net.injenity.GetCalendarDocument.GetCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.injenity.GetCalendarDocument.GetCalendar newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.injenity.GetCalendarDocument.GetCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.injenity.GetCalendarDocument newInstance() {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.injenity.GetCalendarDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.injenity.GetCalendarDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.injenity.GetCalendarDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.injenity.GetCalendarDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.injenity.GetCalendarDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.injenity.GetCalendarDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.injenity.GetCalendarDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.injenity.GetCalendarDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.injenity.GetCalendarDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.injenity.GetCalendarDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.injenity.GetCalendarDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.injenity.GetCalendarDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.injenity.GetCalendarDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.injenity.GetCalendarDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.injenity.GetCalendarDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.injenity.GetCalendarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.injenity.GetCalendarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.injenity.GetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
