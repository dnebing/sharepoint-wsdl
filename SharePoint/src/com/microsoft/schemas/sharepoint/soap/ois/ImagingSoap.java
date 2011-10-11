/**
 * ImagingSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.ois;

public interface ImagingSoap extends java.rmi.Remote {
    public com.microsoft.schemas.sharepoint.soap.ois.ListPictureLibraryResponseListPictureLibraryResult listPictureLibrary() throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.UploadResponseUploadResult upload(java.lang.String strListName, java.lang.String strFolder, byte[] bytes, java.lang.String fileName, boolean fOverWriteIfExist) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.GetItemsXMLDataResponseGetItemsXMLDataResult getItemsXMLData(java.lang.String strListName, java.lang.String strFolder, java.lang.String[] itemFileNames) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.GetItemsByIdsResponseGetItemsByIdsResult getItemsByIds(java.lang.String strListName, org.apache.axis.types.UnsignedInt[] ids) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.DeleteResponseDeleteResult delete(java.lang.String strListName, java.lang.String strFolder, java.lang.String[] itemFileNames) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.DownloadResponseDownloadResult download(java.lang.String strListName, java.lang.String strFolder, java.lang.String[] itemFileNames, org.apache.axis.types.UnsignedInt type, boolean fFetchOriginalIfNotAvailable) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.EditResponseEditResult edit(java.lang.String strListName, java.lang.String strFolder, java.lang.String itemFileName, com.microsoft.schemas.sharepoint.soap.ois.EditRecipe recipe) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.GetListItemsResponseGetListItemsResult getListItems(java.lang.String strListName, java.lang.String strFolder) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.CheckSubwebAndListResponseCheckSubwebAndListResult checkSubwebAndList(java.lang.String strUrl) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.RenameResponseRenameResult rename(java.lang.String strListName, java.lang.String strFolder, com.microsoft.schemas.sharepoint.soap.ois.RenameRequest request) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.ois.CreateNewFolderResponseCreateNewFolderResult createNewFolder(java.lang.String strListName, java.lang.String strParentFolder) throws java.rmi.RemoteException;
}
