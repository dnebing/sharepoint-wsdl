/**
 * DwsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.dws;

public class DwsLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.dws.Dws {

    public DwsLocator() {
    }


    public DwsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DwsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DwsSoap12
    private java.lang.String DwsSoap12_address = "http://freesharepointhosting.net/_vti_bin/dws.asmx";

    public java.lang.String getDwsSoap12Address() {
        return DwsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DwsSoap12WSDDServiceName = "DwsSoap12";

    public java.lang.String getDwsSoap12WSDDServiceName() {
        return DwsSoap12WSDDServiceName;
    }

    public void setDwsSoap12WSDDServiceName(java.lang.String name) {
        DwsSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.dws.DwsSoap getDwsSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DwsSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDwsSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.dws.DwsSoap getDwsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.dws.DwsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.dws.DwsSoap12Stub(portAddress, this);
            _stub.setPortName(getDwsSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDwsSoap12EndpointAddress(java.lang.String address) {
        DwsSoap12_address = address;
    }


    // Use to get a proxy class for DwsSoap
    private java.lang.String DwsSoap_address = "http://freesharepointhosting.net/_vti_bin/dws.asmx";

    public java.lang.String getDwsSoapAddress() {
        return DwsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DwsSoapWSDDServiceName = "DwsSoap";

    public java.lang.String getDwsSoapWSDDServiceName() {
        return DwsSoapWSDDServiceName;
    }

    public void setDwsSoapWSDDServiceName(java.lang.String name) {
        DwsSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.dws.DwsSoap getDwsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DwsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDwsSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.dws.DwsSoap getDwsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.dws.DwsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.dws.DwsSoapStub(portAddress, this);
            _stub.setPortName(getDwsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDwsSoapEndpointAddress(java.lang.String address) {
        DwsSoap_address = address;
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
            if (com.microsoft.schemas.sharepoint.soap.dws.DwsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.dws.DwsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.dws.DwsSoap12Stub(new java.net.URL(DwsSoap12_address), this);
                _stub.setPortName(getDwsSoap12WSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.dws.DwsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.dws.DwsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.dws.DwsSoapStub(new java.net.URL(DwsSoap_address), this);
                _stub.setPortName(getDwsSoapWSDDServiceName());
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
        if ("DwsSoap12".equals(inputPortName)) {
            return getDwsSoap12();
        }
        else if ("DwsSoap".equals(inputPortName)) {
            return getDwsSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/dws/", "Dws");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/dws/", "DwsSoap12"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/dws/", "DwsSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DwsSoap12".equals(portName)) {
            setDwsSoap12EndpointAddress(address);
        }
        else 
if ("DwsSoap".equals(portName)) {
            setDwsSoapEndpointAddress(address);
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
