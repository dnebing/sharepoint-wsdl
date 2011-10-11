/**
 * GetRoleCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetRoleCollection  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionRoleNamesXml roleNamesXml;

    public GetRoleCollection() {
    }

    public GetRoleCollection(
           com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionRoleNamesXml roleNamesXml) {
           this.roleNamesXml = roleNamesXml;
    }


    /**
     * Gets the roleNamesXml value for this GetRoleCollection.
     * 
     * @return roleNamesXml
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionRoleNamesXml getRoleNamesXml() {
        return roleNamesXml;
    }


    /**
     * Sets the roleNamesXml value for this GetRoleCollection.
     * 
     * @param roleNamesXml
     */
    public void setRoleNamesXml(com.microsoft.schemas.sharepoint.soap.directory.GetRoleCollectionRoleNamesXml roleNamesXml) {
        this.roleNamesXml = roleNamesXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRoleCollection)) return false;
        GetRoleCollection other = (GetRoleCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roleNamesXml==null && other.getRoleNamesXml()==null) || 
             (this.roleNamesXml!=null &&
              this.roleNamesXml.equals(other.getRoleNamesXml())));
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
        if (getRoleNamesXml() != null) {
            _hashCode += getRoleNamesXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRoleCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetRoleCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleNamesXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "roleNamesXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetRoleCollection>roleNamesXml"));
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
