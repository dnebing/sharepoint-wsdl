/**
 * UserGroupLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class UserGroupLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.directory.UserGroup {

    public UserGroupLocator() {
    }


    public UserGroupLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserGroupLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserGroupSoap
    private java.lang.String UserGroupSoap_address = "http://freesharepointhosting.net/_vti_bin/UserGroup.asmx";

    public java.lang.String getUserGroupSoapAddress() {
        return UserGroupSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserGroupSoapWSDDServiceName = "UserGroupSoap";

    public java.lang.String getUserGroupSoapWSDDServiceName() {
        return UserGroupSoapWSDDServiceName;
    }

    public void setUserGroupSoapWSDDServiceName(java.lang.String name) {
        UserGroupSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap getUserGroupSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserGroupSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserGroupSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap getUserGroupSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoapStub(portAddress, this);
            _stub.setPortName(getUserGroupSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserGroupSoapEndpointAddress(java.lang.String address) {
        UserGroupSoap_address = address;
    }


    // Use to get a proxy class for UserGroupSoap12
    private java.lang.String UserGroupSoap12_address = "http://freesharepointhosting.net/_vti_bin/UserGroup.asmx";

    public java.lang.String getUserGroupSoap12Address() {
        return UserGroupSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserGroupSoap12WSDDServiceName = "UserGroupSoap12";

    public java.lang.String getUserGroupSoap12WSDDServiceName() {
        return UserGroupSoap12WSDDServiceName;
    }

    public void setUserGroupSoap12WSDDServiceName(java.lang.String name) {
        UserGroupSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap getUserGroupSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserGroupSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserGroupSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap getUserGroupSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap12Stub(portAddress, this);
            _stub.setPortName(getUserGroupSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserGroupSoap12EndpointAddress(java.lang.String address) {
        UserGroupSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoapStub(new java.net.URL(UserGroupSoap_address), this);
                _stub.setPortName(getUserGroupSoapWSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoap12Stub(new java.net.URL(UserGroupSoap12_address), this);
                _stub.setPortName(getUserGroupSoap12WSDDServiceName());
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
        if ("UserGroupSoap".equals(inputPortName)) {
            return getUserGroupSoap();
        }
        else if ("UserGroupSoap12".equals(inputPortName)) {
            return getUserGroupSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroup");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroupSoap"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroupSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserGroupSoap".equals(portName)) {
            setUserGroupSoapEndpointAddress(address);
        }
        else 
if ("UserGroupSoap12".equals(portName)) {
            setUserGroupSoap12EndpointAddress(address);
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
