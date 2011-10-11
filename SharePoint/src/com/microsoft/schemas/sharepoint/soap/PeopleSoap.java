/**
 * PeopleSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public interface PeopleSoap extends java.rmi.Remote {
    public com.microsoft.schemas.sharepoint.soap.PrincipalInfo[] resolvePrincipals(java.lang.String[] principalKeys, java.lang.String[] principalType, boolean addToUserInfoList) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.PrincipalInfo[] searchPrincipals(java.lang.String searchText, int maxResults, java.lang.String[] principalType) throws java.rmi.RemoteException;
}
