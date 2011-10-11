/**
 * AlertsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap._2002._1.alerts;

public interface AlertsSoap extends java.rmi.Remote {
    public com.microsoft.schemas.sharepoint.soap._2002._1.alerts.AlertInfo getAlerts() throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap._2002._1.alerts.DeleteFailure[] deleteAlerts(java.lang.String[] IDs) throws java.rmi.RemoteException;
}
