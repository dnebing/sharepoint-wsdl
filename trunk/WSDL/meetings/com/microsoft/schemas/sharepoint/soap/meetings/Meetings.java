/**
 * Meetings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public interface Meetings extends javax.xml.rpc.Service {
    public java.lang.String getMeetingsSoap12Address();

    public com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap getMeetingsSoap12() throws javax.xml.rpc.ServiceException;

    public com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap getMeetingsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getMeetingsSoapAddress();

    public com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap getMeetingsSoap() throws javax.xml.rpc.ServiceException;

    public com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoap getMeetingsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
