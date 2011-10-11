/**
 * ViewsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class ViewsLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.Views {

    public ViewsLocator() {
    }


    public ViewsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ViewsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ViewsSoap
    private java.lang.String ViewsSoap_address = "http://freesharepointhosting.net/_vti_bin/Views.asmx";

    public java.lang.String getViewsSoapAddress() {
        return ViewsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ViewsSoapWSDDServiceName = "ViewsSoap";

    public java.lang.String getViewsSoapWSDDServiceName() {
        return ViewsSoapWSDDServiceName;
    }

    public void setViewsSoapWSDDServiceName(java.lang.String name) {
        ViewsSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.ViewsSoap getViewsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ViewsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getViewsSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.ViewsSoap getViewsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.ViewsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.ViewsSoapStub(portAddress, this);
            _stub.setPortName(getViewsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setViewsSoapEndpointAddress(java.lang.String address) {
        ViewsSoap_address = address;
    }


    // Use to get a proxy class for ViewsSoap12
    private java.lang.String ViewsSoap12_address = "http://freesharepointhosting.net/_vti_bin/Views.asmx";

    public java.lang.String getViewsSoap12Address() {
        return ViewsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ViewsSoap12WSDDServiceName = "ViewsSoap12";

    public java.lang.String getViewsSoap12WSDDServiceName() {
        return ViewsSoap12WSDDServiceName;
    }

    public void setViewsSoap12WSDDServiceName(java.lang.String name) {
        ViewsSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.ViewsSoap getViewsSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ViewsSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getViewsSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.ViewsSoap getViewsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.ViewsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.ViewsSoap12Stub(portAddress, this);
            _stub.setPortName(getViewsSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setViewsSoap12EndpointAddress(java.lang.String address) {
        ViewsSoap12_address = address;
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
            if (com.microsoft.schemas.sharepoint.soap.ViewsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.ViewsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.ViewsSoapStub(new java.net.URL(ViewsSoap_address), this);
                _stub.setPortName(getViewsSoapWSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.ViewsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.ViewsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.ViewsSoap12Stub(new java.net.URL(ViewsSoap12_address), this);
                _stub.setPortName(getViewsSoap12WSDDServiceName());
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
        if ("ViewsSoap".equals(inputPortName)) {
            return getViewsSoap();
        }
        else if ("ViewsSoap12".equals(inputPortName)) {
            return getViewsSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Views");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "ViewsSoap"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "ViewsSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ViewsSoap".equals(portName)) {
            setViewsSoapEndpointAddress(address);
        }
        else 
if ("ViewsSoap12".equals(portName)) {
            setViewsSoap12EndpointAddress(address);
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
