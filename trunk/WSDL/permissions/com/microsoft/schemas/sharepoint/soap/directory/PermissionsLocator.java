/**
 * PermissionsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class PermissionsLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.directory.Permissions {

    public PermissionsLocator() {
    }


    public PermissionsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PermissionsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PermissionsSoap
    private java.lang.String PermissionsSoap_address = "http://freesharepointhosting.net/_vti_bin/permissions.asmx";

    public java.lang.String getPermissionsSoapAddress() {
        return PermissionsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PermissionsSoapWSDDServiceName = "PermissionsSoap";

    public java.lang.String getPermissionsSoapWSDDServiceName() {
        return PermissionsSoapWSDDServiceName;
    }

    public void setPermissionsSoapWSDDServiceName(java.lang.String name) {
        PermissionsSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap getPermissionsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PermissionsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPermissionsSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap getPermissionsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoapStub(portAddress, this);
            _stub.setPortName(getPermissionsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPermissionsSoapEndpointAddress(java.lang.String address) {
        PermissionsSoap_address = address;
    }


    // Use to get a proxy class for PermissionsSoap12
    private java.lang.String PermissionsSoap12_address = "http://freesharepointhosting.net/_vti_bin/permissions.asmx";

    public java.lang.String getPermissionsSoap12Address() {
        return PermissionsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PermissionsSoap12WSDDServiceName = "PermissionsSoap12";

    public java.lang.String getPermissionsSoap12WSDDServiceName() {
        return PermissionsSoap12WSDDServiceName;
    }

    public void setPermissionsSoap12WSDDServiceName(java.lang.String name) {
        PermissionsSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap getPermissionsSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PermissionsSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPermissionsSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap getPermissionsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap12Stub(portAddress, this);
            _stub.setPortName(getPermissionsSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPermissionsSoap12EndpointAddress(java.lang.String address) {
        PermissionsSoap12_address = address;
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
            if (com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoapStub(new java.net.URL(PermissionsSoap_address), this);
                _stub.setPortName(getPermissionsSoapWSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoap12Stub(new java.net.URL(PermissionsSoap12_address), this);
                _stub.setPortName(getPermissionsSoap12WSDDServiceName());
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
        if ("PermissionsSoap".equals(inputPortName)) {
            return getPermissionsSoap();
        }
        else if ("PermissionsSoap12".equals(inputPortName)) {
            return getPermissionsSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "Permissions");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "PermissionsSoap"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "PermissionsSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PermissionsSoap".equals(portName)) {
            setPermissionsSoapEndpointAddress(address);
        }
        else 
if ("PermissionsSoap12".equals(portName)) {
            setPermissionsSoap12EndpointAddress(address);
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
