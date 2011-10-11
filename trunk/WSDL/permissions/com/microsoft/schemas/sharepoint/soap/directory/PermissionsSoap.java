/**
 * PermissionsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public interface PermissionsSoap extends java.rmi.Remote {
    public com.microsoft.schemas.sharepoint.soap.directory.GetPermissionCollectionResponseGetPermissionCollectionResult getPermissionCollection(java.lang.String objectName, java.lang.String objectType) throws java.rmi.RemoteException;
    public void addPermission(java.lang.String objectName, java.lang.String objectType, java.lang.String permissionIdentifier, java.lang.String permissionType, int permissionMask) throws java.rmi.RemoteException;
    public void addPermissionCollection(java.lang.String objectName, java.lang.String objectType, com.microsoft.schemas.sharepoint.soap.directory.AddPermissionCollectionPermissionsInfoXml permissionsInfoXml) throws java.rmi.RemoteException;
    public void updatePermission(java.lang.String objectName, java.lang.String objectType, java.lang.String permissionIdentifier, java.lang.String permissionType, int permissionMask) throws java.rmi.RemoteException;
    public void removePermission(java.lang.String objectName, java.lang.String objectType, java.lang.String permissionIdentifier, java.lang.String permissionType) throws java.rmi.RemoteException;
    public void removePermissionCollection(java.lang.String objectName, java.lang.String objectType, com.microsoft.schemas.sharepoint.soap.directory.RemovePermissionCollectionMemberIdsXml memberIdsXml) throws java.rmi.RemoteException;
}
