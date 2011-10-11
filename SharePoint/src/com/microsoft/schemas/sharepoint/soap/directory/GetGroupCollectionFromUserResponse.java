/**
 * GetGroupCollectionFromUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetGroupCollectionFromUserResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionFromUserResponseGetGroupCollectionFromUserResult getGroupCollectionFromUserResult;

    public GetGroupCollectionFromUserResponse() {
    }

    public GetGroupCollectionFromUserResponse(
           com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionFromUserResponseGetGroupCollectionFromUserResult getGroupCollectionFromUserResult) {
           this.getGroupCollectionFromUserResult = getGroupCollectionFromUserResult;
    }


    /**
     * Gets the getGroupCollectionFromUserResult value for this GetGroupCollectionFromUserResponse.
     * 
     * @return getGroupCollectionFromUserResult
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionFromUserResponseGetGroupCollectionFromUserResult getGetGroupCollectionFromUserResult() {
        return getGroupCollectionFromUserResult;
    }


    /**
     * Sets the getGroupCollectionFromUserResult value for this GetGroupCollectionFromUserResponse.
     * 
     * @param getGroupCollectionFromUserResult
     */
    public void setGetGroupCollectionFromUserResult(com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionFromUserResponseGetGroupCollectionFromUserResult getGroupCollectionFromUserResult) {
        this.getGroupCollectionFromUserResult = getGroupCollectionFromUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGroupCollectionFromUserResponse)) return false;
        GetGroupCollectionFromUserResponse other = (GetGroupCollectionFromUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGroupCollectionFromUserResult==null && other.getGetGroupCollectionFromUserResult()==null) || 
             (this.getGroupCollectionFromUserResult!=null &&
              this.getGroupCollectionFromUserResult.equals(other.getGetGroupCollectionFromUserResult())));
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
        if (getGetGroupCollectionFromUserResult() != null) {
            _hashCode += getGetGroupCollectionFromUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGroupCollectionFromUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetGroupCollectionFromUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGroupCollectionFromUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "GetGroupCollectionFromUserResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetGroupCollectionFromUserResponse>GetGroupCollectionFromUserResult"));
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
