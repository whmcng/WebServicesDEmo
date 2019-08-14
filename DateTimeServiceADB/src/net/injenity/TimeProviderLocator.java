/**
 * TimeProviderLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.injenity;

public class TimeProviderLocator extends org.apache.axis.client.Service implements net.injenity.TimeProvider {

    public TimeProviderLocator() {
    }


    public TimeProviderLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TimeProviderLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TimeProviderHttpSoap11Endpoint
    private java.lang.String TimeProviderHttpSoap11Endpoint_address = "http://localhost:9090/DateTimeService/services/TimeProvider.TimeProviderHttpSoap11Endpoint/";

    public java.lang.String getTimeProviderHttpSoap11EndpointAddress() {
        return TimeProviderHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TimeProviderHttpSoap11EndpointWSDDServiceName = "TimeProviderHttpSoap11Endpoint";

    public java.lang.String getTimeProviderHttpSoap11EndpointWSDDServiceName() {
        return TimeProviderHttpSoap11EndpointWSDDServiceName;
    }

    public void setTimeProviderHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        TimeProviderHttpSoap11EndpointWSDDServiceName = name;
    }

    public net.injenity.TimeProviderPortType getTimeProviderHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TimeProviderHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTimeProviderHttpSoap11Endpoint(endpoint);
    }

    public net.injenity.TimeProviderPortType getTimeProviderHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.injenity.TimeProviderSoap11BindingStub _stub = new net.injenity.TimeProviderSoap11BindingStub(portAddress, this);
            _stub.setPortName(getTimeProviderHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTimeProviderHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        TimeProviderHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.injenity.TimeProviderPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                net.injenity.TimeProviderSoap11BindingStub _stub = new net.injenity.TimeProviderSoap11BindingStub(new java.net.URL(TimeProviderHttpSoap11Endpoint_address), this);
                _stub.setPortName(getTimeProviderHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TimeProviderHttpSoap11Endpoint".equals(inputPortName)) {
            return getTimeProviderHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://injenity.net", "TimeProvider");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://injenity.net", "TimeProviderHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TimeProviderHttpSoap11Endpoint".equals(portName)) {
            setTimeProviderHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
