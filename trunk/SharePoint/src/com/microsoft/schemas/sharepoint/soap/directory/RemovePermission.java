/**
 * RemovePermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class RemovePermission  implements java.io.Serializable {
    private java.lang.String objectName;

    private java.lang.String objectType;

    private java.lang.String permissionIdentifier;

    private java.lang.String permissionType;

    public RemovePermission() {
    }

    public RemovePermission(
           java.lang.String objectName,
           java.lang.String objectType,
           java.lang.String permissionIdentifier,
           java.lang.String permissionType) {
           this.objectName = objectName;
           this.objectType = objectType;
           this.permissionIdentifier = permissionIdentifier;
           this.permissionType = permissionType;
    }


    /**
     * Gets the objectName value for this RemovePermission.
     * 
     * @return objectName
     */
    public java.lang.String getObjectName() {
        return objectName;
    }


    /**
     * Sets the objectName value for this RemovePermission.
     * 
     * @param objectName
     */
    public void setObjectName(java.lang.String objectName) {
        this.objectName = objectName;
    }


    /**
     * Gets the objectType value for this RemovePermission.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this RemovePermission.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the permissionIdentifier value for this RemovePermission.
     * 
     * @return permissionIdentifier
     */
    public java.lang.String getPermissionIdentifier() {
        return permissionIdentifier;
    }


    /**
     * Sets the permissionIdentifier value for this RemovePermission.
     * 
     * @param permissionIdentifier
     */
    public void setPermissionIdentifier(java.lang.String permissionIdentifier) {
        this.permissionIdentifier = permissionIdentifier;
    }


    /**
     * Gets the permissionType value for this RemovePermission.
     * 
     * @return permissionType
     */
    public java.lang.String getPermissionType() {
        return permissionType;
    }


    /**
     * Sets the permissionType value for this RemovePermission.
     * 
     * @param permissionType
     */
    public void setPermissionType(java.lang.String permissionType) {
        this.permissionType = permissionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemovePermission)) return false;
        RemovePermission other = (RemovePermission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectName==null && other.getObjectName()==null) || 
             (this.objectName!=null &&
              this.objectName.equals(other.getObjectName()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.permissionIdentifier==null && other.getPermissionIdentifier()==null) || 
             (this.permissionIdentifier!=null &&
              this.permissionIdentifier.equals(other.getPermissionIdentifier()))) &&
            ((this.permissionType==null && other.getPermissionType()==null) || 
             (this.permissionType!=null &&
              this.permissionType.equals(other.getPermissionType())));
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
        if (getObjectName() != null) {
            _hashCode += getObjectName().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getPermissionIdentifier() != null) {
            _hashCode += getPermissionIdentifier().hashCode();
        }
        if (getPermissionType() != null) {
            _hashCode += getPermissionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovePermission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">RemovePermission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "objectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "permissionIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "permissionType"));
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
