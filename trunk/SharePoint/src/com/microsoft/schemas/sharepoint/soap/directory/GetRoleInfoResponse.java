/**
 * GetRoleInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetRoleInfoResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetRoleInfoResponseGetRoleInfoResult getRoleInfoResult;

    public GetRoleInfoResponse() {
    }

    public GetRoleInfoResponse(
           com.microsoft.schemas.sharepoint.soap.directory.GetRoleInfoResponseGetRoleInfoResult getRoleInfoResult) {
           this.getRoleInfoResult = getRoleInfoResult;
    }


    /**
     * Gets the getRoleInfoResult value for this GetRoleInfoResponse.
     * 
     * @return getRoleInfoResult
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetRoleInfoResponseGetRoleInfoResult getGetRoleInfoResult() {
        return getRoleInfoResult;
    }


    /**
     * Sets the getRoleInfoResult value for this GetRoleInfoResponse.
     * 
     * @param getRoleInfoResult
     */
    public void setGetRoleInfoResult(com.microsoft.schemas.sharepoint.soap.directory.GetRoleInfoResponseGetRoleInfoResult getRoleInfoResult) {
        this.getRoleInfoResult = getRoleInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRoleInfoResponse)) return false;
        GetRoleInfoResponse other = (GetRoleInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRoleInfoResult==null && other.getGetRoleInfoResult()==null) || 
             (this.getRoleInfoResult!=null &&
              this.getRoleInfoResult.equals(other.getGetRoleInfoResult())));
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
        if (getGetRoleInfoResult() != null) {
            _hashCode += getGetRoleInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRoleInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetRoleInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRoleInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "GetRoleInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetRoleInfoResponse>GetRoleInfoResult"));
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
