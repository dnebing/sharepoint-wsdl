/**
 * PeopleLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class PeopleLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.People {

    public PeopleLocator() {
    }


    public PeopleLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PeopleLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PeopleSoap
    private java.lang.String PeopleSoap_address = "http://freesharepointhosting.net/_vti_bin/people.asmx";

    public java.lang.String getPeopleSoapAddress() {
        return PeopleSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PeopleSoapWSDDServiceName = "PeopleSoap";

    public java.lang.String getPeopleSoapWSDDServiceName() {
        return PeopleSoapWSDDServiceName;
    }

    public void setPeopleSoapWSDDServiceName(java.lang.String name) {
        PeopleSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.PeopleSoap getPeopleSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PeopleSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPeopleSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.PeopleSoap getPeopleSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.PeopleSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.PeopleSoapStub(portAddress, this);
            _stub.setPortName(getPeopleSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPeopleSoapEndpointAddress(java.lang.String address) {
        PeopleSoap_address = address;
    }


    // Use to get a proxy class for PeopleSoap12
    private java.lang.String PeopleSoap12_address = "http://freesharepointhosting.net/_vti_bin/people.asmx";

    public java.lang.String getPeopleSoap12Address() {
        return PeopleSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PeopleSoap12WSDDServiceName = "PeopleSoap12";

    public java.lang.String getPeopleSoap12WSDDServiceName() {
        return PeopleSoap12WSDDServiceName;
    }

    public void setPeopleSoap12WSDDServiceName(java.lang.String name) {
        PeopleSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.PeopleSoap getPeopleSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PeopleSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPeopleSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.PeopleSoap getPeopleSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.PeopleSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.PeopleSoap12Stub(portAddress, this);
            _stub.setPortName(getPeopleSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPeopleSoap12EndpointAddress(java.lang.String address) {
        PeopleSoap12_address = address;
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
            if (com.microsoft.schemas.sharepoint.soap.PeopleSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.PeopleSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.PeopleSoapStub(new java.net.URL(PeopleSoap_address), this);
                _stub.setPortName(getPeopleSoapWSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.PeopleSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.PeopleSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.PeopleSoap12Stub(new java.net.URL(PeopleSoap12_address), this);
                _stub.setPortName(getPeopleSoap12WSDDServiceName());
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
        if ("PeopleSoap".equals(inputPortName)) {
            return getPeopleSoap();
        }
        else if ("PeopleSoap12".equals(inputPortName)) {
            return getPeopleSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "People");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "PeopleSoap"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "PeopleSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PeopleSoap".equals(portName)) {
            setPeopleSoapEndpointAddress(address);
        }
        else 
if ("PeopleSoap12".equals(portName)) {
            setPeopleSoap12EndpointAddress(address);
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
