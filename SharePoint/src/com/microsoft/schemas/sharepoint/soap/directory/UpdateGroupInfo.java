/**
 * UpdateGroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class UpdateGroupInfo  implements java.io.Serializable {
    private java.lang.String oldGroupName;

    private java.lang.String groupName;

    private java.lang.String ownerIdentifier;

    private java.lang.String ownerType;

    private java.lang.String description;

    public UpdateGroupInfo() {
    }

    public UpdateGroupInfo(
           java.lang.String oldGroupName,
           java.lang.String groupName,
           java.lang.String ownerIdentifier,
           java.lang.String ownerType,
           java.lang.String description) {
           this.oldGroupName = oldGroupName;
           this.groupName = groupName;
           this.ownerIdentifier = ownerIdentifier;
           this.ownerType = ownerType;
           this.description = description;
    }


    /**
     * Gets the oldGroupName value for this UpdateGroupInfo.
     * 
     * @return oldGroupName
     */
    public java.lang.String getOldGroupName() {
        return oldGroupName;
    }


    /**
     * Sets the oldGroupName value for this UpdateGroupInfo.
     * 
     * @param oldGroupName
     */
    public void setOldGroupName(java.lang.String oldGroupName) {
        this.oldGroupName = oldGroupName;
    }


    /**
     * Gets the groupName value for this UpdateGroupInfo.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this UpdateGroupInfo.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the ownerIdentifier value for this UpdateGroupInfo.
     * 
     * @return ownerIdentifier
     */
    public java.lang.String getOwnerIdentifier() {
        return ownerIdentifier;
    }


    /**
     * Sets the ownerIdentifier value for this UpdateGroupInfo.
     * 
     * @param ownerIdentifier
     */
    public void setOwnerIdentifier(java.lang.String ownerIdentifier) {
        this.ownerIdentifier = ownerIdentifier;
    }


    /**
     * Gets the ownerType value for this UpdateGroupInfo.
     * 
     * @return ownerType
     */
    public java.lang.String getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this UpdateGroupInfo.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.String ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the description value for this UpdateGroupInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateGroupInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateGroupInfo)) return false;
        UpdateGroupInfo other = (UpdateGroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldGroupName==null && other.getOldGroupName()==null) || 
             (this.oldGroupName!=null &&
              this.oldGroupName.equals(other.getOldGroupName()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.ownerIdentifier==null && other.getOwnerIdentifier()==null) || 
             (this.ownerIdentifier!=null &&
              this.ownerIdentifier.equals(other.getOwnerIdentifier()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
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
        if (getOldGroupName() != null) {
            _hashCode += getOldGroupName().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getOwnerIdentifier() != null) {
            _hashCode += getOwnerIdentifier().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateGroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">UpdateGroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "oldGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
