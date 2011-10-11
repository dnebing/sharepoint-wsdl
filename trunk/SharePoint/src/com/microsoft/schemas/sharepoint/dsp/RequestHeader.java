/**
 * RequestHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.dsp;

public class RequestHeader  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.dsp.DocumentType document;  // attribute

    private com.microsoft.schemas.sharepoint.dsp.MethodType method;  // attribute

    public RequestHeader() {
    }

    public RequestHeader(
           com.microsoft.schemas.sharepoint.dsp.DocumentType document,
           com.microsoft.schemas.sharepoint.dsp.MethodType method) {
           this.document = document;
           this.method = method;
    }


    /**
     * Gets the document value for this RequestHeader.
     * 
     * @return document
     */
    public com.microsoft.schemas.sharepoint.dsp.DocumentType getDocument() {
        return document;
    }


    /**
     * Sets the document value for this RequestHeader.
     * 
     * @param document
     */
    public void setDocument(com.microsoft.schemas.sharepoint.dsp.DocumentType document) {
        this.document = document;
    }


    /**
     * Gets the method value for this RequestHeader.
     * 
     * @return method
     */
    public com.microsoft.schemas.sharepoint.dsp.MethodType getMethod() {
        return method;
    }


    /**
     * Sets the method value for this RequestHeader.
     * 
     * @param method
     */
    public void setMethod(com.microsoft.schemas.sharepoint.dsp.MethodType method) {
        this.method = method;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHeader)) return false;
        RequestHeader other = (RequestHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod())));
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
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "RequestHeader"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("document");
        attrField.setXmlName(new javax.xml.namespace.QName("", "document"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "DocumentType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("method");
        attrField.setXmlName(new javax.xml.namespace.QName("", "method"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "MethodType"));
        typeDesc.addFieldDesc(attrField);
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
