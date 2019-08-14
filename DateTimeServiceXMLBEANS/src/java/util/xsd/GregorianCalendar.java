/*
 * XML Type:  GregorianCalendar
 * Namespace: http://util.java/xsd
 * Java type: java.util.xsd.GregorianCalendar
 *
 * Automatically generated - do not modify.
 */
package java.util.xsd;


/**
 * An XML GregorianCalendar(@http://util.java/xsd).
 *
 * This is a complex type.
 */
public interface GregorianCalendar extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GregorianCalendar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4FBB4742F9DD056330AAFC71F6CD935").resolveHandle("gregoriancalendar113btype");
    
    /**
     * Gets the "calendarType" element
     */
    java.lang.String getCalendarType();
    
    /**
     * Gets (as xml) the "calendarType" element
     */
    org.apache.xmlbeans.XmlString xgetCalendarType();
    
    /**
     * Tests for nil "calendarType" element
     */
    boolean isNilCalendarType();
    
    /**
     * True if has "calendarType" element
     */
    boolean isSetCalendarType();
    
    /**
     * Sets the "calendarType" element
     */
    void setCalendarType(java.lang.String calendarType);
    
    /**
     * Sets (as xml) the "calendarType" element
     */
    void xsetCalendarType(org.apache.xmlbeans.XmlString calendarType);
    
    /**
     * Nils the "calendarType" element
     */
    void setNilCalendarType();
    
    /**
     * Unsets the "calendarType" element
     */
    void unsetCalendarType();
    
    /**
     * Gets the "gregorianChange" element
     */
    java.util.Calendar getGregorianChange();
    
    /**
     * Gets (as xml) the "gregorianChange" element
     */
    org.apache.xmlbeans.XmlDate xgetGregorianChange();
    
    /**
     * Tests for nil "gregorianChange" element
     */
    boolean isNilGregorianChange();
    
    /**
     * True if has "gregorianChange" element
     */
    boolean isSetGregorianChange();
    
    /**
     * Sets the "gregorianChange" element
     */
    void setGregorianChange(java.util.Calendar gregorianChange);
    
    /**
     * Sets (as xml) the "gregorianChange" element
     */
    void xsetGregorianChange(org.apache.xmlbeans.XmlDate gregorianChange);
    
    /**
     * Nils the "gregorianChange" element
     */
    void setNilGregorianChange();
    
    /**
     * Unsets the "gregorianChange" element
     */
    void unsetGregorianChange();
    
    /**
     * Gets the "timeZone" element
     */
    java.util.xsd.TimeZone getTimeZone();
    
    /**
     * Tests for nil "timeZone" element
     */
    boolean isNilTimeZone();
    
    /**
     * True if has "timeZone" element
     */
    boolean isSetTimeZone();
    
    /**
     * Sets the "timeZone" element
     */
    void setTimeZone(java.util.xsd.TimeZone timeZone);
    
    /**
     * Appends and returns a new empty "timeZone" element
     */
    java.util.xsd.TimeZone addNewTimeZone();
    
    /**
     * Nils the "timeZone" element
     */
    void setNilTimeZone();
    
    /**
     * Unsets the "timeZone" element
     */
    void unsetTimeZone();
    
    /**
     * Gets the "weekDateSupported" element
     */
    boolean getWeekDateSupported();
    
    /**
     * Gets (as xml) the "weekDateSupported" element
     */
    org.apache.xmlbeans.XmlBoolean xgetWeekDateSupported();
    
    /**
     * True if has "weekDateSupported" element
     */
    boolean isSetWeekDateSupported();
    
    /**
     * Sets the "weekDateSupported" element
     */
    void setWeekDateSupported(boolean weekDateSupported);
    
    /**
     * Sets (as xml) the "weekDateSupported" element
     */
    void xsetWeekDateSupported(org.apache.xmlbeans.XmlBoolean weekDateSupported);
    
    /**
     * Unsets the "weekDateSupported" element
     */
    void unsetWeekDateSupported();
    
    /**
     * Gets the "weekYear" element
     */
    int getWeekYear();
    
    /**
     * Gets (as xml) the "weekYear" element
     */
    org.apache.xmlbeans.XmlInt xgetWeekYear();
    
    /**
     * True if has "weekYear" element
     */
    boolean isSetWeekYear();
    
    /**
     * Sets the "weekYear" element
     */
    void setWeekYear(int weekYear);
    
    /**
     * Sets (as xml) the "weekYear" element
     */
    void xsetWeekYear(org.apache.xmlbeans.XmlInt weekYear);
    
    /**
     * Unsets the "weekYear" element
     */
    void unsetWeekYear();
    
    /**
     * Gets the "weeksInWeekYear" element
     */
    int getWeeksInWeekYear();
    
    /**
     * Gets (as xml) the "weeksInWeekYear" element
     */
    org.apache.xmlbeans.XmlInt xgetWeeksInWeekYear();
    
    /**
     * True if has "weeksInWeekYear" element
     */
    boolean isSetWeeksInWeekYear();
    
    /**
     * Sets the "weeksInWeekYear" element
     */
    void setWeeksInWeekYear(int weeksInWeekYear);
    
    /**
     * Sets (as xml) the "weeksInWeekYear" element
     */
    void xsetWeeksInWeekYear(org.apache.xmlbeans.XmlInt weeksInWeekYear);
    
    /**
     * Unsets the "weeksInWeekYear" element
     */
    void unsetWeeksInWeekYear();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static java.util.xsd.GregorianCalendar newInstance() {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static java.util.xsd.GregorianCalendar newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static java.util.xsd.GregorianCalendar parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static java.util.xsd.GregorianCalendar parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static java.util.xsd.GregorianCalendar parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static java.util.xsd.GregorianCalendar parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static java.util.xsd.GregorianCalendar parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static java.util.xsd.GregorianCalendar parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static java.util.xsd.GregorianCalendar parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static java.util.xsd.GregorianCalendar parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static java.util.xsd.GregorianCalendar parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static java.util.xsd.GregorianCalendar parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static java.util.xsd.GregorianCalendar parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static java.util.xsd.GregorianCalendar parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static java.util.xsd.GregorianCalendar parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static java.util.xsd.GregorianCalendar parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static java.util.xsd.GregorianCalendar parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static java.util.xsd.GregorianCalendar parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (java.util.xsd.GregorianCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
