/**
 * FormsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class FormsLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.Forms {

    public FormsLocator() {
    }


    public FormsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FormsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FormsSoap12
    private java.lang.String FormsSoap12_address = "http://freesharepointhosting.net/_vti_bin/forms.asmx";

    public java.lang.String getFormsSoap12Address() {
        return FormsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FormsSoap12WSDDServiceName = "FormsSoap12";

    public java.lang.String getFormsSoap12WSDDServiceName() {
        return FormsSoap12WSDDServiceName;
    }

    public void setFormsSoap12WSDDServiceName(java.lang.String name) {
        FormsSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.FormsSoap getFormsSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FormsSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFormsSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.FormsSoap getFormsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.FormsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.FormsSoap12Stub(portAddress, this);
            _stub.setPortName(getFormsSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFormsSoap12EndpointAddress(java.lang.String address) {
        FormsSoap12_address = address;
    }


    // Use to get a proxy class for FormsSoap
    private java.lang.String FormsSoap_address = "http://freesharepointhosting.net/_vti_bin/forms.asmx";

    public java.lang.String getFormsSoapAddress() {
        return FormsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FormsSoapWSDDServiceName = "FormsSoap";

    public java.lang.String getFormsSoapWSDDServiceName() {
        return FormsSoapWSDDServiceName;
    }

    public void setFormsSoapWSDDServiceName(java.lang.String name) {
        FormsSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.FormsSoap getFormsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FormsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFormsSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.FormsSoap getFormsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.FormsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.FormsSoapStub(portAddress, this);
            _stub.setPortName(getFormsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFormsSoapEndpointAddress(java.lang.String address) {
        FormsSoap_address = address;
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
            if (com.microsoft.schemas.sharepoint.soap.FormsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.FormsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.FormsSoap12Stub(new java.net.URL(FormsSoap12_address), this);
                _stub.setPortName(getFormsSoap12WSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.FormsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.FormsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.FormsSoapStub(new java.net.URL(FormsSoap_address), this);
                _stub.setPortName(getFormsSoapWSDDServiceName());
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
        if ("FormsSoap12".equals(inputPortName)) {
            return getFormsSoap12();
        }
        else if ("FormsSoap".equals(inputPortName)) {
            return getFormsSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Forms");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "FormsSoap12"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "FormsSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FormsSoap12".equals(portName)) {
            setFormsSoap12EndpointAddress(address);
        }
        else 
if ("FormsSoap".equals(portName)) {
            setFormsSoapEndpointAddress(address);
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
