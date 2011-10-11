/**
 * GetUserLoginFromEmail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetUserLoginFromEmail  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetUserLoginFromEmailEmailXml emailXml;

    public GetUserLoginFromEmail() {
    }

    public GetUserLoginFromEmail(
           com.microsoft.schemas.sharepoint.soap.directory.GetUserLoginFromEmailEmailXml emailXml) {
           this.emailXml = emailXml;
    }


    /**
     * Gets the emailXml value for this GetUserLoginFromEmail.
     * 
     * @return emailXml
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetUserLoginFromEmailEmailXml getEmailXml() {
        return emailXml;
    }


    /**
     * Sets the emailXml value for this GetUserLoginFromEmail.
     * 
     * @param emailXml
     */
    public void setEmailXml(com.microsoft.schemas.sharepoint.soap.directory.GetUserLoginFromEmailEmailXml emailXml) {
        this.emailXml = emailXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserLoginFromEmail)) return false;
        GetUserLoginFromEmail other = (GetUserLoginFromEmail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailXml==null && other.getEmailXml()==null) || 
             (this.emailXml!=null &&
              this.emailXml.equals(other.getEmailXml())));
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
        if (getEmailXml() != null) {
            _hashCode += getEmailXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserLoginFromEmail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetUserLoginFromEmail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "emailXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetUserLoginFromEmail>emailXml"));
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
