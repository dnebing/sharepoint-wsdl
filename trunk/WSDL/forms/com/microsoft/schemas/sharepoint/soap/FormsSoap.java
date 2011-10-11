/**
 * FormsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public interface FormsSoap extends java.rmi.Remote {
    public com.microsoft.schemas.sharepoint.soap.GetFormCollectionResponseGetFormCollectionResult getFormCollection(java.lang.String listName) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetFormResponseGetFormResult getForm(java.lang.String listName, java.lang.String formUrl) throws java.rmi.RemoteException;
}
