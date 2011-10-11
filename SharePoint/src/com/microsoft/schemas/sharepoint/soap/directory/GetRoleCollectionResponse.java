/**
 * GetRoleCollectionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetRoleCollectionResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionResponseGetRoleCollectionResult getRoleCollectionResult;

    public GetRoleCollectionResponse() {
    }

    public GetRoleCollectionResponse(
           com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionResponseGetRoleCollectionResult getRoleCollectionResult) {
           this.getRoleCollectionResult = getRoleCollectionResult;
    }


    /**
     * Gets the getRoleCollectionResult value for this GetRoleCollectionResponse.
     * 
     * @return getRoleCollectionResult
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionResponseGetRoleCollectionResult getGetRoleCollectionResult() {
        return getRoleCollectionResult;
    }


    /**
     * Sets the getRoleCollectionResult value for this GetRoleCollectionResponse.
     * 
     * @param getRoleCollectionResult
     */
    public void setGetRoleCollectionResult(com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionResponseGetRoleCollectionResult getRoleCollectionResult) {
        this.getRoleCollectionResult = getRoleCollectionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRoleCollectionResponse)) return false;
        GetRoleCollectionResponse other = (GetRoleCollectionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRoleCollectionResult==null && other.getGetRoleCollectionResult()==null) || 
             (this.getRoleCollectionResult!=null &&
              this.getRoleCollectionResult.equals(other.getGetRoleCollectionResult())));
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
        if (getGetRoleCollectionResult() != null) {
            _hashCode += getGetRoleCollectionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRoleCollectionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetRoleCollectionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRoleCollectionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "GetRoleCollectionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetRoleCollectionResponse>GetRoleCollectionResult"));
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
