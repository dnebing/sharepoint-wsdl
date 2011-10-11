/**
 * GetUserCollectionFromGroupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetUserCollectionFromGroupResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetUserCollectionFromGroupResponseGetUserCollectionFromGroupResult getUserCollectionFromGroupResult;

    public GetUserCollectionFromGroupResponse() {
    }

    public GetUserCollectionFromGroupResponse(
           com.microsoft.schemas.sharepoint.soap.directory.GetUserCollectionFromGroupResponseGetUserCollectionFromGroupResult getUserCollectionFromGroupResult) {
           this.getUserCollectionFromGroupResult = getUserCollectionFromGroupResult;
    }


    /**
     * Gets the getUserCollectionFromGroupResult value for this GetUserCollectionFromGroupResponse.
     * 
     * @return getUserCollectionFromGroupResult
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetUserCollectionFromGroupResponseGetUserCollectionFromGroupResult getGetUserCollectionFromGroupResult() {
        return getUserCollectionFromGroupResult;
    }


    /**
     * Sets the getUserCollectionFromGroupResult value for this GetUserCollectionFromGroupResponse.
     * 
     * @param getUserCollectionFromGroupResult
     */
    public void setGetUserCollectionFromGroupResult(com.microsoft.schemas.sharepoint.soap.directory.GetUserCollectionFromGroupResponseGetUserCollectionFromGroupResult getUserCollectionFromGroupResult) {
        this.getUserCollectionFromGroupResult = getUserCollectionFromGroupResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserCollectionFromGroupResponse)) return false;
        GetUserCollectionFromGroupResponse other = (GetUserCollectionFromGroupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUserCollectionFromGroupResult==null && other.getGetUserCollectionFromGroupResult()==null) || 
             (this.getUserCollectionFromGroupResult!=null &&
              this.getUserCollectionFromGroupResult.equals(other.getGetUserCollectionFromGroupResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetUserCollectionFromGroupResult() != null) {
            _hashCode += getGetUserCollectionFromGroupResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserCollectionFromGroupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetUserCollectionFromGroupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUserCollectionFromGroupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "GetUserCollectionFromGroupResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetUserCollectionFromGroupResponse>GetUserCollectionFromGroupResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
