/**
 * ListsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public interface ListsSoap extends java.rmi.Remote {
    public com.microsoft.schemas.sharepoint.soap.GetListResponseGetListResult getList(java.lang.String listName) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseGetListAndViewResult getListAndView(java.lang.String listName, java.lang.String viewName) throws java.rmi.RemoteException;
    public void deleteList(java.lang.String listName) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.AddListResponseAddListResult addList(java.lang.String listName, java.lang.String description, int templateID) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseAddListFromFeatureResult addListFromFeature(java.lang.String listName, java.lang.String description, java.lang.String featureID, int templateID) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.UpdateListResponseUpdateListResult updateList(java.lang.String listName, com.microsoft.schemas.sharepoint.soap.UpdateListListProperties listProperties, com.microsoft.schemas.sharepoint.soap.UpdateListNewFields newFields, com.microsoft.schemas.sharepoint.soap.UpdateListUpdateFields updateFields, com.microsoft.schemas.sharepoint.soap.UpdateListDeleteFields deleteFields, java.lang.String listVersion) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseGetListCollectionResult getListCollection() throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetListItemsResponseGetListItemsResult getListItems(java.lang.String listName, java.lang.String viewName, com.microsoft.schemas.sharepoint.soap.GetListItemsQuery query, com.microsoft.schemas.sharepoint.soap.GetListItemsViewFields viewFields, java.lang.String rowLimit, com.microsoft.schemas.sharepoint.soap.GetListItemsQueryOptions queryOptions, java.lang.String webID) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseGetListItemChangesResult getListItemChanges(java.lang.String listName, com.microsoft.schemas.sharepoint.soap.GetListItemChangesViewFields viewFields, java.lang.String since, com.microsoft.schemas.sharepoint.soap.GetListItemChangesContains contains) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseGetListItemChangesSinceTokenResult getListItemChangesSinceToken(java.lang.String listName, java.lang.String viewName, com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenQuery query, com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenViewFields viewFields, java.lang.String rowLimit, com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenQueryOptions queryOptions, java.lang.String changeToken, com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenContains contains) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseUpdateListItemsResult updateListItems(java.lang.String listName, com.microsoft.schemas.sharepoint.soap.UpdateListItemsUpdates updates) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseAddDiscussionBoardItemResult addDiscussionBoardItem(java.lang.String listName, byte[] message) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseGetVersionCollectionResult getVersionCollection(java.lang.String strlistID, java.lang.String strlistItemID, java.lang.String strFieldName) throws java.rmi.RemoteException;
    public java.lang.String addAttachment(java.lang.String listName, java.lang.String listItemID, java.lang.String fileName, byte[] attachment) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseGetAttachmentCollectionResult getAttachmentCollection(java.lang.String listName, java.lang.String listItemID) throws java.rmi.RemoteException;
    public void deleteAttachment(java.lang.String listName, java.lang.String listItemID, java.lang.String url) throws java.rmi.RemoteException;
    public boolean checkOutFile(java.lang.String pageUrl, java.lang.String checkoutToLocal, java.lang.String lastmodified) throws java.rmi.RemoteException;
    public boolean undoCheckOut(java.lang.String pageUrl) throws java.rmi.RemoteException;
    public boolean checkInFile(java.lang.String pageUrl, java.lang.String comment, java.lang.String checkinType) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseGetListContentTypesResult getListContentTypes(java.lang.String listName, java.lang.String contentTypeId) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseGetListContentTypeResult getListContentType(java.lang.String listName, java.lang.String contentTypeId) throws java.rmi.RemoteException;
    public java.lang.String createContentType(java.lang.String listName, java.lang.String displayName, java.lang.String parentType, com.microsoft.schemas.sharepoint.soap.CreateContentTypeFields fields, com.microsoft.schemas.sharepoint.soap.CreateContentTypeContentTypeProperties contentTypeProperties, java.lang.String addToView) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseUpdateContentTypeResult updateContentType(java.lang.String listName, java.lang.String contentTypeId, com.microsoft.schemas.sharepoint.soap.UpdateContentTypeContentTypeProperties contentTypeProperties, com.microsoft.schemas.sharepoint.soap.UpdateContentTypeNewFields newFields, com.microsoft.schemas.sharepoint.soap.UpdateContentTypeUpdateFields updateFields, com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDeleteFields deleteFields, java.lang.String addToView) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDeleteContentTypeResult deleteContentType(java.lang.String listName, java.lang.String contentTypeId) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseUpdateContentTypeXmlDocumentResult updateContentTypeXmlDocument(java.lang.String listName, java.lang.String contentTypeId, com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentNewDocument newDocument) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseUpdateContentTypesXmlDocumentResult updateContentTypesXmlDocument(java.lang.String listName, com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentNewDocument newDocument) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDeleteContentTypeXmlDocumentResult deleteContentTypeXmlDocument(java.lang.String listName, java.lang.String contentTypeId, java.lang.String documentUri) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseApplyContentTypeToListResult applyContentTypeToList(java.lang.String webUrl, java.lang.String contentTypeId, java.lang.String listName) throws java.rmi.RemoteException;
}
