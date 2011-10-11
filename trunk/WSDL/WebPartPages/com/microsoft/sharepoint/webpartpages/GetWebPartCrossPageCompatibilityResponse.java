/**
 * GetWebPartCrossPageCompatibilityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public class GetWebPartCrossPageCompatibilityResponse  implements java.io.Serializable {
    private java.lang.String getWebPartCrossPageCompatibilityResult;

    public GetWebPartCrossPageCompatibilityResponse() {
    }

    public GetWebPartCrossPageCompatibilityResponse(
           java.lang.String getWebPartCrossPageCompatibilityResult) {
           this.getWebPartCrossPageCompatibilityResult = getWebPartCrossPageCompatibilityResult;
    }


    /**
     * Gets the getWebPartCrossPageCompatibilityResult value for this GetWebPartCrossPageCompatibilityResponse.
     * 
     * @return getWebPartCrossPageCompatibilityResult
     */
    public java.lang.String getGetWebPartCrossPageCompatibilityResult() {
        return getWebPartCrossPageCompatibilityResult;
    }


    /**
     * Sets the getWebPartCrossPageCompatibilityResult value for this GetWebPartCrossPageCompatibilityResponse.
     * 
     * @param getWebPartCrossPageCompatibilityResult
     */
    public void setGetWebPartCrossPageCompatibilityResult(java.lang.String getWebPartCrossPageCompatibilityResult) {
        this.getWebPartCrossPageCompatibilityResult = getWebPartCrossPageCompatibilityResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebPartCrossPageCompatibilityResponse)) return false;
        GetWebPartCrossPageCompatibilityResponse other = (GetWebPartCrossPageCompatibilityResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWebPartCrossPageCompatibilityResult==null && other.getGetWebPartCrossPageCompatibilityResult()==null) || 
             (this.getWebPartCrossPageCompatibilityResult!=null &&
              this.getWebPartCrossPageCompatibilityResult.equals(other.getGetWebPartCrossPageCompatibilityResult())));
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
        if (getGetWebPartCrossPageCompatibilityResult() != null) {
            _hashCode += getGetWebPartCrossPageCompatibilityResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWebPartCrossPageCompatibilityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">GetWebPartCrossPageCompatibilityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWebPartCrossPageCompatibilityResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "GetWebPartCrossPageCompatibilityResult"));
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
