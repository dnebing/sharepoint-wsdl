/**
 * WebPartPagesWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public class WebPartPagesWebServiceLocator extends org.apache.axis.client.Service implements com.microsoft.sharepoint.webpartpages.WebPartPagesWebService {

    public WebPartPagesWebServiceLocator() {
    }


    public WebPartPagesWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebPartPagesWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebPartPagesWebServiceSoap
    private java.lang.String WebPartPagesWebServiceSoap_address = "http://freesharepointhosting.net/_vti_bin/WebPartPages.asmx";

    public java.lang.String getWebPartPagesWebServiceSoapAddress() {
        return WebPartPagesWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebPartPagesWebServiceSoapWSDDServiceName = "WebPartPagesWebServiceSoap";

    public java.lang.String getWebPartPagesWebServiceSoapWSDDServiceName() {
        return WebPartPagesWebServiceSoapWSDDServiceName;
    }

    public void setWebPartPagesWebServiceSoapWSDDServiceName(java.lang.String name) {
        WebPartPagesWebServiceSoapWSDDServiceName = name;
    }

    public com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap getWebPartPagesWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebPartPagesWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebPartPagesWebServiceSoap(endpoint);
    }

    public com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap getWebPartPagesWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoapStub _stub = new com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getWebPartPagesWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebPartPagesWebServiceSoapEndpointAddress(java.lang.String address) {
        WebPartPagesWebServiceSoap_address = address;
    }


    // Use to get a proxy class for WebPartPagesWebServiceSoap12
    private java.lang.String WebPartPagesWebServiceSoap12_address = "http://freesharepointhosting.net/_vti_bin/WebPartPages.asmx";

    public java.lang.String getWebPartPagesWebServiceSoap12Address() {
        return WebPartPagesWebServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebPartPagesWebServiceSoap12WSDDServiceName = "WebPartPagesWebServiceSoap12";

    public java.lang.String getWebPartPagesWebServiceSoap12WSDDServiceName() {
        return WebPartPagesWebServiceSoap12WSDDServiceName;
    }

    public void setWebPartPagesWebServiceSoap12WSDDServiceName(java.lang.String name) {
        WebPartPagesWebServiceSoap12WSDDServiceName = name;
    }

    public com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap getWebPartPagesWebServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebPartPagesWebServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebPartPagesWebServiceSoap12(endpoint);
    }

    public com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap getWebPartPagesWebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap12Stub _stub = new com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getWebPartPagesWebServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebPartPagesWebServiceSoap12EndpointAddress(java.lang.String address) {
        WebPartPagesWebServiceSoap12_address = address;
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
            if (com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoapStub _stub = new com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoapStub(new java.net.URL(WebPartPagesWebServiceSoap_address), this);
                _stub.setPortName(getWebPartPagesWebServiceSoapWSDDServiceName());
                return _stub;
            }
            if (com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap12Stub _stub = new com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoap12Stub(new java.net.URL(WebPartPagesWebServiceSoap12_address), this);
                _stub.setPortName(getWebPartPagesWebServiceSoap12WSDDServiceName());
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
        if ("WebPartPagesWebServiceSoap".equals(inputPortName)) {
            return getWebPartPagesWebServiceSoap();
        }
        else if ("WebPartPagesWebServiceSoap12".equals(inputPortName)) {
            return getWebPartPagesWebServiceSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "WebPartPagesWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "WebPartPagesWebServiceSoap"));
            ports.add(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "WebPartPagesWebServiceSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebPartPagesWebServiceSoap".equals(portName)) {
            setWebPartPagesWebServiceSoapEndpointAddress(address);
        }
        else 
if ("WebPartPagesWebServiceSoap12".equals(portName)) {
            setWebPartPagesWebServiceSoap12EndpointAddress(address);
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
