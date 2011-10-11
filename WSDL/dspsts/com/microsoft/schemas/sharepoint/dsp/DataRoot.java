/**
 * DataRoot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.dsp;

public class DataRoot  implements java.io.Serializable {
    private java.lang.String root;

    private boolean allowRemoteDataAccess;  // attribute

    public DataRoot() {
    }

    public DataRoot(
           java.lang.String root,
           boolean allowRemoteDataAccess) {
           this.root = root;
           this.allowRemoteDataAccess = allowRemoteDataAccess;
    }


    /**
     * Gets the root value for this DataRoot.
     * 
     * @return root
     */
    public java.lang.String getRoot() {
        return root;
    }


    /**
     * Sets the root value for this DataRoot.
     * 
     * @param root
     */
    public void setRoot(java.lang.String root) {
        this.root = root;
    }


    /**
     * Gets the allowRemoteDataAccess value for this DataRoot.
     * 
     * @return allowRemoteDataAccess
     */
    public boolean isAllowRemoteDataAccess() {
        return allowRemoteDataAccess;
    }


    /**
     * Sets the allowRemoteDataAccess value for this DataRoot.
     * 
     * @param allowRemoteDataAccess
     */
    public void setAllowRemoteDataAccess(boolean allowRemoteDataAccess) {
        this.allowRemoteDataAccess = allowRemoteDataAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataRoot)) return false;
        DataRoot other = (DataRoot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.root==null && other.getRoot()==null) || 
             (this.root!=null &&
              this.root.equals(other.getRoot()))) &&
            this.allowRemoteDataAccess == other.isAllowRemoteDataAccess();
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
        if (getRoot() != null) {
            _hashCode += getRoot().hashCode();
        }
        _hashCode += (isAllowRemoteDataAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataRoot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "DataRoot"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("allowRemoteDataAccess");
        attrField.setXmlName(new javax.xml.namespace.QName("", "allowRemoteDataAccess"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "root"));
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
