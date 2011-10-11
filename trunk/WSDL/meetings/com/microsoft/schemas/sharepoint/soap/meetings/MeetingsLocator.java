/**
 * MeetingsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class MeetingsLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.meetings.Meetings {

    public MeetingsLocator() {
    }


    public MeetingsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MeetingsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MeetingsSoap12
    private java.lang.String MeetingsSoap12_address = "http://freesharepointhosting.net/_vti_bin/Meetings.asmx";

    public java.lang.String getMeetingsSoap12Address() {
        return MeetingsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MeetingsSoap12WSDDServiceName = "MeetingsSoap12";

    public java.lang.String getMeetingsSoap12WSDDServiceName() {
        return MeetingsSoap12WSDDServiceName;
    }

    public void setMeetingsSoap12WSDDServiceName(java.lang.String name) {
        MeetingsSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap getMeetingsSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MeetingsSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMeetingsSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap getMeetingsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap12Stub(portAddress, this);
            _stub.setPortName(getMeetingsSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMeetingsSoap12EndpointAddress(java.lang.String address) {
        MeetingsSoap12_address = address;
    }


    // Use to get a proxy class for MeetingsSoap
    private java.lang.String MeetingsSoap_address = "http://freesharepointhosting.net/_vti_bin/Meetings.asmx";

    public java.lang.String getMeetingsSoapAddress() {
        return MeetingsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MeetingsSoapWSDDServiceName = "MeetingsSoap";

    public java.lang.String getMeetingsSoapWSDDServiceName() {
        return MeetingsSoapWSDDServiceName;
    }

    public void setMeetingsSoapWSDDServiceName(java.lang.String name) {
        MeetingsSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap getMeetingsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MeetingsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMeetingsSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap getMeetingsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoapStub(portAddress, this);
            _stub.setPortName(getMeetingsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMeetingsSoapEndpointAddress(java.lang.String address) {
        MeetingsSoap_address = address;
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
            if (com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap12Stub(new java.net.URL(MeetingsSoap12_address), this);
                _stub.setPortName(getMeetingsSoap12WSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoapStub(new java.net.URL(MeetingsSoap_address), this);
                _stub.setPortName(getMeetingsSoapWSDDServiceName());
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
        if ("MeetingsSoap12".equals(inputPortName)) {
            return getMeetingsSoap12();
        }
        else if ("MeetingsSoap".equals(inputPortName)) {
            return getMeetingsSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "Meetings");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "MeetingsSoap12"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "MeetingsSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MeetingsSoap12".equals(portName)) {
            setMeetingsSoap12EndpointAddress(address);
        }
        else 
if ("MeetingsSoap".equals(portName)) {
            setMeetingsSoapEndpointAddress(address);
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
