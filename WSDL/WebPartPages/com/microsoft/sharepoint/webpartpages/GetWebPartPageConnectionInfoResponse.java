/**
 * GetWebPartPageConnectionInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public class GetWebPartPageConnectionInfoResponse  implements java.io.Serializable {
    private java.lang.String getWebPartPageConnectionInfoResult;

    public GetWebPartPageConnectionInfoResponse() {
    }

    public GetWebPartPageConnectionInfoResponse(
           java.lang.String getWebPartPageConnectionInfoResult) {
           this.getWebPartPageConnectionInfoResult = getWebPartPageConnectionInfoResult;
    }


    /**
     * Gets the getWebPartPageConnectionInfoResult value for this GetWebPartPageConnectionInfoResponse.
     * 
     * @return getWebPartPageConnectionInfoResult
     */
    public java.lang.String getGetWebPartPageConnectionInfoResult() {
        return getWebPartPageConnectionInfoResult;
    }


    /**
     * Sets the getWebPartPageConnectionInfoResult value for this GetWebPartPageConnectionInfoResponse.
     * 
     * @param getWebPartPageConnectionInfoResult
     */
    public void setGetWebPartPageConnectionInfoResult(java.lang.String getWebPartPageConnectionInfoResult) {
        this.getWebPartPageConnectionInfoResult = getWebPartPageConnectionInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebPartPageConnectionInfoResponse)) return false;
        GetWebPartPageConnectionInfoResponse other = (GetWebPartPageConnectionInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWebPartPageConnectionInfoResult==null && other.getGetWebPartPageConnectionInfoResult()==null) || 
             (this.getWebPartPageConnectionInfoResult!=null &&
              this.getWebPartPageConnectionInfoResult.equals(other.getGetWebPartPageConnectionInfoResult())));
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
        if (getGetWebPartPageConnectionInfoResult() != null) {
            _hashCode += getGetWebPartPageConnectionInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWebPartPageConnectionInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">GetWebPartPageConnectionInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWebPartPageConnectionInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "GetWebPartPageConnectionInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
