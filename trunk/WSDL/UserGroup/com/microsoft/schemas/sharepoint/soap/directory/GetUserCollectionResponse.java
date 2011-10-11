/**
 * GetUserCollectionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetUserCollectionResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetUserCollectionResponseGetUserCollectionResult getUserCollectionResult;

    public GetUserCollectionResponse() {
    }

    public GetUserCollectionResponse(
           com.microsoft.schemas.sharepoint.soap.directory.GetUserCollectionResponseGetUserCollectionResult getUserCollectionResult) {
           this.getUserCollectionResult = getUserCollectionResult;
    }


    /**
     * Gets the getUserCollectionResult value for this GetUserCollectionResponse.
     * 
     * @return getUserCollectionResult
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetUserCollectionResponseGetUserCollectionResult getGetUserCollectionResult() {
        return getUserCollectionResult;
    }


    /**
     * Sets the getUserCollectionResult value for this GetUserCollectionResponse.
     * 
     * @param getUserCollectionResult
     */
    public void setGetUserCollectionResult(com.microsoft.schemas.sharepoint.soap.directory.GetUserCollectionResponseGetUserCollectionResult getUserCollectionResult) {
        this.getUserCollectionResult = getUserCollectionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserCollectionResponse)) return false;
        GetUserCollectionResponse other = (GetUserCollectionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUserCollectionResult==null && other.getGetUserCollectionResult()==null) || 
             (this.getUserCollectionResult!=null &&
              this.getUserCollectionResult.equals(other.getGetUserCollectionResult())));
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
        if (getGetUserCollectionResult() != null) {
            _hashCode += getGetUserCollectionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserCollectionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetUserCollectionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUserCollectionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "GetUserCollectionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetUserCollectionResponse>GetUserCollectionResult"));
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
