/**
 * GetGroupCollectionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetGroupCollectionResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionResponseGetGroupCollectionResult getGroupCollectionResult;

    public GetGroupCollectionResponse() {
    }

    public GetGroupCollectionResponse(
           com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionResponseGetGroupCollectionResult getGroupCollectionResult) {
           this.getGroupCollectionResult = getGroupCollectionResult;
    }


    /**
     * Gets the getGroupCollectionResult value for this GetGroupCollectionResponse.
     * 
     * @return getGroupCollectionResult
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionResponseGetGroupCollectionResult getGetGroupCollectionResult() {
        return getGroupCollectionResult;
    }


    /**
     * Sets the getGroupCollectionResult value for this GetGroupCollectionResponse.
     * 
     * @param getGroupCollectionResult
     */
    public void setGetGroupCollectionResult(com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionResponseGetGroupCollectionResult getGroupCollectionResult) {
        this.getGroupCollectionResult = getGroupCollectionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGroupCollectionResponse)) return false;
        GetGroupCollectionResponse other = (GetGroupCollectionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGroupCollectionResult==null && other.getGetGroupCollectionResult()==null) || 
             (this.getGroupCollectionResult!=null &&
              this.getGroupCollectionResult.equals(other.getGetGroupCollectionResult())));
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
        if (getGetGroupCollectionResult() != null) {
            _hashCode += getGetGroupCollectionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGroupCollectionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetGroupCollectionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGroupCollectionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "GetGroupCollectionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetGroupCollectionResponse>GetGroupCollectionResult"));
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
