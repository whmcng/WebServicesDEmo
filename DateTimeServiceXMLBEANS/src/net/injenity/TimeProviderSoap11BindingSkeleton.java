/**
 * TimeProviderSoap11BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.injenity;

public class TimeProviderSoap11BindingSkeleton implements net.injenity.TimeProviderPortType, org.apache.axis.wsdl.Skeleton {
    private net.injenity.TimeProviderPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getDate", _params, new javax.xml.namespace.QName("http://injenity.net", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://injenity.net", "getDate"));
        _oper.setSoapAction("urn:getDate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDate") == null) {
            _myOperations.put("getDate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDate")).add(_oper);
    }

    public TimeProviderSoap11BindingSkeleton() {
        this.impl = new net.injenity.TimeProviderSoap11BindingImpl();
    }

    public TimeProviderSoap11BindingSkeleton(net.injenity.TimeProviderPortType impl) {
        this.impl = impl;
    }
    public java.util.Date getDate() throws java.rmi.RemoteException
    {
        java.util.Date ret = impl.getDate();
        return ret;
    }

}
