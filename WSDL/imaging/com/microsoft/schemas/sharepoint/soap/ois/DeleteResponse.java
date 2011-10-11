/**
 * DeleteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.ois;

public class DeleteResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.ois.DeleteResponseDeleteResult deleteResult;

    public DeleteResponse() {
    }

    public DeleteResponse(
           com.microsoft.schemas.sharepoint.soap.ois.DeleteResponseDeleteResult deleteResult) {
           this.deleteResult = deleteResult;
    }


    /**
     * Gets the deleteResult value for this DeleteResponse.
     * 
     * @return deleteResult
     */
    public com.microsoft.schemas.sharepoint.soap.ois.DeleteResponseDeleteResult getDeleteResult() {
        return deleteResult;
    }


    /**
     * Sets the deleteResult value for this DeleteResponse.
     * 
     * @param deleteResult
     */
    public void setDeleteResult(com.microsoft.schemas.sharepoint.soap.ois.DeleteResponseDeleteResult deleteResult) {
        this.deleteResult = deleteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteResponse)) return false;
        DeleteResponse other = (DeleteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteResult==null && other.getDeleteResult()==null) || 
             (this.deleteResult!=null &&
              this.deleteResult.equals(other.getDeleteResult())));
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
        if (getDeleteResult() != null) {
            _hashCode += getDeleteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", ">DeleteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "DeleteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", ">>DeleteResponse>DeleteResult"));
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
