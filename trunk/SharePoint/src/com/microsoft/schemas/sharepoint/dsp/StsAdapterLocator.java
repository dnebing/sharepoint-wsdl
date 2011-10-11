/**
 * StsAdapterLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.dsp;

public class StsAdapterLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.dsp.StsAdapter {

    public StsAdapterLocator() {
    }


    public StsAdapterLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StsAdapterLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StsAdapterSoap12
    private java.lang.String StsAdapterSoap12_address = "http://freesharepointhosting.net/_vti_bin/dspsts.asmx";

    public java.lang.String getStsAdapterSoap12Address() {
        return StsAdapterSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StsAdapterSoap12WSDDServiceName = "StsAdapterSoap12";

    public java.lang.String getStsAdapterSoap12WSDDServiceName() {
        return StsAdapterSoap12WSDDServiceName;
    }

    public void setStsAdapterSoap12WSDDServiceName(java.lang.String name) {
        StsAdapterSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap getStsAdapterSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StsAdapterSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStsAdapterSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap getStsAdapterSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap12Stub _stub = new com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap12Stub(portAddress, this);
            _stub.setPortName(getStsAdapterSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStsAdapterSoap12EndpointAddress(java.lang.String address) {
        StsAdapterSoap12_address = address;
    }


    // Use to get a proxy class for StsAdapterSoap
    private java.lang.String StsAdapterSoap_address = "http://freesharepointhosting.net/_vti_bin/dspsts.asmx";

    public java.lang.String getStsAdapterSoapAddress() {
        return StsAdapterSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StsAdapterSoapWSDDServiceName = "StsAdapterSoap";

    public java.lang.String getStsAdapterSoapWSDDServiceName() {
        return StsAdapterSoapWSDDServiceName;
    }

    public void setStsAdapterSoapWSDDServiceName(java.lang.String name) {
        StsAdapterSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap getStsAdapterSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StsAdapterSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStsAdapterSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap getStsAdapterSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.dsp.StsAdapterSoapStub _stub = new com.microsoft.schemas.sharepoint.dsp.StsAdapterSoapStub(portAddress, this);
            _stub.setPortName(getStsAdapterSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStsAdapterSoapEndpointAddress(java.lang.String address) {
        StsAdapterSoap_address = address;
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
            if (com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap12Stub _stub = new com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap12Stub(new java.net.URL(StsAdapterSoap12_address), this);
                _stub.setPortName(getStsAdapterSoap12WSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.dsp.StsAdapterSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.dsp.StsAdapterSoapStub _stub = new com.microsoft.schemas.sharepoint.dsp.StsAdapterSoapStub(new java.net.URL(StsAdapterSoap_address), this);
                _stub.setPortName(getStsAdapterSoapWSDDServiceName());
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
        if ("StsAdapterSoap12".equals(inputPortName)) {
            return getStsAdapterSoap12();
        }
        else if ("StsAdapterSoap".equals(inputPortName)) {
            return getStsAdapterSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "StsAdapter");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "StsAdapterSoap12"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "StsAdapterSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StsAdapterSoap12".equals(portName)) {
            setStsAdapterSoap12EndpointAddress(address);
        }
        else 
if ("StsAdapterSoap".equals(portName)) {
            setStsAdapterSoapEndpointAddress(address);
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
