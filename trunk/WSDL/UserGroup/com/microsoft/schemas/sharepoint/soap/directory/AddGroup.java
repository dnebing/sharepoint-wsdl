/**
 * AddGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class AddGroup  implements java.io.Serializable {
    private java.lang.String groupName;

    private java.lang.String ownerIdentifier;

    private java.lang.String ownerType;

    private java.lang.String defaultUserLoginName;

    private java.lang.String description;

    public AddGroup() {
    }

    public AddGroup(
           java.lang.String groupName,
           java.lang.String ownerIdentifier,
           java.lang.String ownerType,
           java.lang.String defaultUserLoginName,
           java.lang.String description) {
           this.groupName = groupName;
           this.ownerIdentifier = ownerIdentifier;
           this.ownerType = ownerType;
           this.defaultUserLoginName = defaultUserLoginName;
           this.description = description;
    }


    /**
     * Gets the groupName value for this AddGroup.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this AddGroup.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the ownerIdentifier value for this AddGroup.
     * 
     * @return ownerIdentifier
     */
    public java.lang.String getOwnerIdentifier() {
        return ownerIdentifier;
    }


    /**
     * Sets the ownerIdentifier value for this AddGroup.
     * 
     * @param ownerIdentifier
     */
    public void setOwnerIdentifier(java.lang.String ownerIdentifier) {
        this.ownerIdentifier = ownerIdentifier;
    }


    /**
     * Gets the ownerType value for this AddGroup.
     * 
     * @return ownerType
     */
    public java.lang.String getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this AddGroup.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.String ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the defaultUserLoginName value for this AddGroup.
     * 
     * @return defaultUserLoginName
     */
    public java.lang.String getDefaultUserLoginName() {
        return defaultUserLoginName;
    }


    /**
     * Sets the defaultUserLoginName value for this AddGroup.
     * 
     * @param defaultUserLoginName
     */
    public void setDefaultUserLoginName(java.lang.String defaultUserLoginName) {
        this.defaultUserLoginName = defaultUserLoginName;
    }


    /**
     * Gets the description value for this AddGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AddGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddGroup)) return false;
        AddGroup other = (AddGroup) obj;
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
            ((this.ownerIdentifier==null && other.getOwnerIdentifier()==null) || 
             (this.ownerIdentifier!=null &&
              this.ownerIdentifier.equals(other.getOwnerIdentifier()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.defaultUserLoginName==null && other.getDefaultUserLoginName()==null) || 
             (this.defaultUserLoginName!=null &&
              this.defaultUserLoginName.equals(other.getDefaultUserLoginName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getOwnerIdentifier() != null) {
            _hashCode += getOwnerIdentifier().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getDefaultUserLoginName() != null) {
            _hashCode += getDefaultUserLoginName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">AddGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "ownerIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "ownerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultUserLoginName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "defaultUserLoginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "description"));
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
