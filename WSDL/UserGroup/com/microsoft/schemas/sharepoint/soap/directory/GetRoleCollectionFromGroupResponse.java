/**
 * GetRoleCollectionFromGroupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetRoleCollectionFromGroupResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionFromGroupResponseGetRoleCollectionFromGroupResult getRoleCollectionFromGroupResult;

    public GetRoleCollectionFromGroupResponse() {
    }

    public GetRoleCollectionFromGroupResponse(
           com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionFromGroupResponseGetRoleCollectionFromGroupResult getRoleCollectionFromGroupResult) {
           this.getRoleCollectionFromGroupResult = getRoleCollectionFromGroupResult;
    }


    /**
     * Gets the getRoleCollectionFromGroupResult value for this GetRoleCollectionFromGroupResponse.
     * 
     * @return getRoleCollectionFromGroupResult
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionFromGroupResponseGetRoleCollectionFromGroupResult getGetRoleCollectionFromGroupResult() {
        return getRoleCollectionFromGroupResult;
    }


    /**
     * Sets the getRoleCollectionFromGroupResult value for this GetRoleCollectionFromGroupResponse.
     * 
     * @param getRoleCollectionFromGroupResult
     */
    public void setGetRoleCollectionFromGroupResult(com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionFromGroupResponseGetRoleCollectionFromGroupResult getRoleCollectionFromGroupResult) {
        this.getRoleCollectionFromGroupResult = getRoleCollectionFromGroupResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRoleCollectionFromGroupResponse)) return false;
        GetRoleCollectionFromGroupResponse other = (GetRoleCollectionFromGroupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRoleCollectionFromGroupResult==null && other.getGetRoleCollectionFromGroupResult()==null) || 
             (this.getRoleCollectionFromGroupResult!=null &&
              this.getRoleCollectionFromGroupResult.equals(other.getGetRoleCollectionFromGroupResult())));
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
        if (getGetRoleCollectionFromGroupResult() != null) {
            _hashCode += getGetRoleCollectionFromGroupResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRoleCollectionFromGroupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetRoleCollectionFromGroupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRoleCollectionFromGroupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "GetRoleCollectionFromGroupResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetRoleCollectionFromGroupResponse>GetRoleCollectionFromGroupResult"));
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
