/**
 * TimeProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.injenity;

public interface TimeProvider extends javax.xml.rpc.Service {
    public java.lang.String getTimeProviderHttpSoap11EndpointAddress();

    public net.injenity.TimeProviderPortType getTimeProviderHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public net.injenity.TimeProviderPortType getTimeProviderHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
