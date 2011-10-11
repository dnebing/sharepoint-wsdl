/**
 * WebPartPagesWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public interface WebPartPagesWebServiceSoap extends java.rmi.Remote {
    public java.lang.String getWebPartPageDocument(java.lang.String documentName) throws java.rmi.RemoteException;
    public java.lang.String getWebPartPage(java.lang.String documentName, com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior) throws java.rmi.RemoteException;
    public java.lang.String renderWebPartForEdit(java.lang.String webPartXml) throws java.rmi.RemoteException;
    public java.lang.String getXmlDataFromDataSource(java.lang.String queryXml) throws java.rmi.RemoteException;
    public java.lang.String getFormCapabilityFromDataSourceControl(java.lang.String dscXml) throws java.rmi.RemoteException;
    public java.lang.String getDataFromDataSourceControl(java.lang.String dscXml, java.lang.String contextUrl) throws java.rmi.RemoteException;
    public java.lang.String fetchLegalWorkflowActions() throws java.rmi.RemoteException;
    public java.lang.String validateWorkflowMarkupAndCreateSupportObjects(java.lang.String workflowMarkupText, java.lang.String rulesText, java.lang.String configBlob, java.lang.String flag) throws java.rmi.RemoteException;
    public java.lang.String associateWorkflowMarkup(java.lang.String configUrl, java.lang.String configVersion) throws java.rmi.RemoteException;
    public java.lang.String removeWorkflowAssociation(java.lang.String configUrl, java.lang.String configVersion) throws java.rmi.RemoteException;
    public java.lang.String convertWebPartFormat(java.lang.String inputFormat, com.microsoft.sharepoint.webpartpages.FormatConversionOption formatConversionOption) throws java.rmi.RemoteException;
    public java.lang.String getAssemblyMetaData(java.lang.String assemblyName, java.lang.String baseTypes) throws java.rmi.RemoteException;
    public java.lang.String getBindingResourceData(java.lang.String resourceName) throws java.rmi.RemoteException;
    public java.lang.String executeProxyUpdates(java.lang.String updateData) throws java.rmi.RemoteException;
    public java.lang.String addWebPartToZone(java.lang.String pageUrl, java.lang.String webPartXml, com.microsoft.sharepoint.webpartpages.Storage storage, java.lang.String zoneId, int zoneIndex) throws java.rmi.RemoteException;
    public java.lang.String addWebPart(java.lang.String pageUrl, java.lang.String webPartXml, com.microsoft.sharepoint.webpartpages.Storage storage) throws java.rmi.RemoteException;
    public java.lang.String getWebPart(java.lang.String pageurl, java.lang.String storageKey, com.microsoft.sharepoint.webpartpages.Storage storage) throws java.rmi.RemoteException;
    public java.lang.String getWebPart2(java.lang.String pageurl, java.lang.String storageKey, com.microsoft.sharepoint.webpartpages.Storage storage, com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior) throws java.rmi.RemoteException;
    public com.microsoft.sharepoint.webpartpages.GetCustomControlListResponseGetCustomControlListResult getCustomControlList() throws java.rmi.RemoteException;
    public com.microsoft.sharepoint.webpartpages.GetSafeAssemblyInfoResponseGetSafeAssemblyInfoResult getSafeAssemblyInfo() throws java.rmi.RemoteException;
    public com.microsoft.sharepoint.webpartpages.GetWebPartPropertiesResponseGetWebPartPropertiesResult getWebPartProperties(java.lang.String pageUrl, com.microsoft.sharepoint.webpartpages.Storage storage) throws java.rmi.RemoteException;
    public com.microsoft.sharepoint.webpartpages.GetWebPartProperties2ResponseGetWebPartProperties2Result getWebPartProperties2(java.lang.String pageUrl, com.microsoft.sharepoint.webpartpages.Storage storage, com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior) throws java.rmi.RemoteException;
    public void saveWebPart(java.lang.String pageUrl, java.lang.String storageKey, java.lang.String webPartXml, com.microsoft.sharepoint.webpartpages.Storage storage) throws java.rmi.RemoteException;
    public void saveWebPart2(java.lang.String pageUrl, java.lang.String storageKey, java.lang.String webPartXml, com.microsoft.sharepoint.webpartpages.Storage storage, boolean allowTypeChange) throws java.rmi.RemoteException;
    public void deleteWebPart(java.lang.String pageUrl, java.lang.String storageKey, com.microsoft.sharepoint.webpartpages.Storage storage) throws java.rmi.RemoteException;
    public java.lang.String getWebPartPageConnectionInfo(java.lang.String sourcePageUrl, java.lang.String sourcePageContents, java.lang.String providerPartID, java.lang.String lcid) throws java.rmi.RemoteException;
    public java.lang.String getWebPartCrossPageCompatibility(java.lang.String sourcePageUrl, java.lang.String sourcePageContents, java.lang.String targetPageUrl, java.lang.String targetPageContents, java.lang.String providerPartID, java.lang.String lcid) throws java.rmi.RemoteException;
}
