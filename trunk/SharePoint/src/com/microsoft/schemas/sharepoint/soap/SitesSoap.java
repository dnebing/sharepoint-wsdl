/**
 * SitesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public interface SitesSoap extends java.rmi.Remote {
    public void getSiteTemplates(org.apache.axis.types.UnsignedInt LCID, org.apache.axis.holders.UnsignedIntHolder getSiteTemplatesResult, com.microsoft.schemas.sharepoint.soap.holders.ArrayOfTemplateHolder templateList) throws java.rmi.RemoteException;
    public java.lang.String getUpdatedFormDigest() throws java.rmi.RemoteException;
    public int exportWeb(java.lang.String jobName, java.lang.String webUrl, java.lang.String dataPath, boolean includeSubwebs, boolean includeUserSecurity, boolean overWrite, int cabSize) throws java.rmi.RemoteException;
    public int importWeb(java.lang.String jobName, java.lang.String webUrl, java.lang.String[] dataFiles, java.lang.String logPath, boolean includeUserSecurity, boolean overWrite) throws java.rmi.RemoteException;
}
