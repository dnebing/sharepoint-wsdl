/**
 * SitesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class SitesLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.Sites {

    public SitesLocator() {
    }


    public SitesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SitesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SitesSoap12
    private java.lang.String SitesSoap12_address = "http://freesharepointhosting.net/_vti_bin/Sites.asmx";

    public java.lang.String getSitesSoap12Address() {
        return SitesSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SitesSoap12WSDDServiceName = "SitesSoap12";

    public java.lang.String getSitesSoap12WSDDServiceName() {
        return SitesSoap12WSDDServiceName;
    }

    public void setSitesSoap12WSDDServiceName(java.lang.String name) {
        SitesSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.SitesSoap getSitesSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SitesSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSitesSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.SitesSoap getSitesSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.SitesSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.SitesSoap12Stub(portAddress, this);
            _stub.setPortName(getSitesSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSitesSoap12EndpointAddress(java.lang.String address) {
        SitesSoap12_address = address;
    }


    // Use to get a proxy class for SitesSoap
    private java.lang.String SitesSoap_address = "http://freesharepointhosting.net/_vti_bin/Sites.asmx";

    public java.lang.String getSitesSoapAddress() {
        return SitesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SitesSoapWSDDServiceName = "SitesSoap";

    public java.lang.String getSitesSoapWSDDServiceName() {
        return SitesSoapWSDDServiceName;
    }

    public void setSitesSoapWSDDServiceName(java.lang.String name) {
        SitesSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.SitesSoap getSitesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SitesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSitesSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.SitesSoap getSitesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.SitesSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.SitesSoapStub(portAddress, this);
            _stub.setPortName(getSitesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSitesSoapEndpointAddress(java.lang.String address) {
        SitesSoap_address = address;
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
            if (com.microsoft.schemas.sharepoint.soap.SitesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.SitesSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.SitesSoap12Stub(new java.net.URL(SitesSoap12_address), this);
                _stub.setPortName(getSitesSoap12WSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.SitesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.SitesSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.SitesSoapStub(new java.net.URL(SitesSoap_address), this);
                _stub.setPortName(getSitesSoapWSDDServiceName());
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
        if ("SitesSoap12".equals(inputPortName)) {
            return getSitesSoap12();
        }
        else if ("SitesSoap".equals(inputPortName)) {
            return getSitesSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Sites");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "SitesSoap12"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "SitesSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SitesSoap12".equals(portName)) {
            setSitesSoap12EndpointAddress(address);
        }
        else 
if ("SitesSoap".equals(portName)) {
            setSitesSoapEndpointAddress(address);
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
