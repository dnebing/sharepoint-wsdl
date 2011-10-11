/**
 * AddUserCollectionToGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class AddUserCollectionToGroup  implements java.io.Serializable {
    private java.lang.String groupName;

    private com.microsoft.schemas.sharepoint.soap.directory.AddUserCollectionToGroupUsersInfoXml usersInfoXml;

    public AddUserCollectionToGroup() {
    }

    public AddUserCollectionToGroup(
           java.lang.String groupName,
           com.microsoft.schemas.sharepoint.soap.directory.AddUserCollectionToGroupUsersInfoXml usersInfoXml) {
           this.groupName = groupName;
           this.usersInfoXml = usersInfoXml;
    }


    /**
     * Gets the groupName value for this AddUserCollectionToGroup.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this AddUserCollectionToGroup.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the usersInfoXml value for this AddUserCollectionToGroup.
     * 
     * @return usersInfoXml
     */
    public com.microsoft.schemas.sharepoint.soap.directory.AddUserCollectionToGroupUsersInfoXml getUsersInfoXml() {
        return usersInfoXml;
    }


    /**
     * Sets the usersInfoXml value for this AddUserCollectionToGroup.
     * 
     * @param usersInfoXml
     */
    public void setUsersInfoXml(com.microsoft.schemas.sharepoint.soap.directory.AddUserCollectionToGroupUsersInfoXml usersInfoXml) {
        this.usersInfoXml = usersInfoXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddUserCollectionToGroup)) return false;
        AddUserCollectionToGroup other = (AddUserCollectionToGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.usersInfoXml==null && other.getUsersInfoXml()==null) || 
             (this.usersInfoXml!=null &&
              this.usersInfoXml.equals(other.getUsersInfoXml())));
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
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getUsersInfoXml() != null) {
            _hashCode += getUsersInfoXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddUserCollectionToGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">AddUserCollectionToGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usersInfoXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "usersInfoXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>AddUserCollectionToGroup>usersInfoXml"));
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
