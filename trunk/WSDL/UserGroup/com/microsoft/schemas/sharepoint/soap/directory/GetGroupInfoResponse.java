/**
 * GetGroupInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetGroupInfoResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetGroupInfoResponseGetGroupInfoResult getGroupInfoResult;

    public GetGroupInfoResponse() {
    }

    public GetGroupInfoResponse(
           com.microsoft.schemas.sharepoint.soap.directory.GetGroupInfoResponseGetGroupInfoResult getGroupInfoResult) {
           this.getGroupInfoResult = getGroupInfoResult;
    }


    /**
     * Gets the getGroupInfoResult value for this GetGroupInfoResponse.
     * 
     * @return getGroupInfoResult
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetGroupInfoResponseGetGroupInfoResult getGetGroupInfoResult() {
        return getGroupInfoResult;
    }


    /**
     * Sets the getGroupInfoResult value for this GetGroupInfoResponse.
     * 
     * @param getGroupInfoResult
     */
    public void setGetGroupInfoResult(com.microsoft.schemas.sharepoint.soap.directory.GetGroupInfoResponseGetGroupInfoResult getGroupInfoResult) {
        this.getGroupInfoResult = getGroupInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGroupInfoResponse)) return false;
        GetGroupInfoResponse other = (GetGroupInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGroupInfoResult==null && other.getGetGroupInfoResult()==null) || 
             (this.getGroupInfoResult!=null &&
              this.getGroupInfoResult.equals(other.getGetGroupInfoResult())));
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
        if (getGetGroupInfoResult() != null) {
            _hashCode += getGetGroupInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGroupInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetGroupInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGroupInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "GetGroupInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetGroupInfoResponse>GetGroupInfoResult"));
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
