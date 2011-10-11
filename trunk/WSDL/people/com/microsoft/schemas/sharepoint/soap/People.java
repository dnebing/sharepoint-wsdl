/**
 * People.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public interface People extends javax.xml.rpc.Service {
    public java.lang.String getPeopleSoapAddress();

    public com.microsoft.schemas.sharepoint.soap.PeopleSoap getPeopleSoap() throws javax.xml.rpc.ServiceException;

    public com.microsoft.schemas.sharepoint.soap.PeopleSoap getPeopleSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPeopleSoap12Address();

    public com.microsoft.schemas.sharepoint.soap.PeopleSoap getPeopleSoap12() throws javax.xml.rpc.ServiceException;

    public com.microsoft.schemas.sharepoint.soap.PeopleSoap getPeopleSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
