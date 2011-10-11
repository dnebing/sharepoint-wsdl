/**
 * AddMeetingFromICal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class AddMeetingFromICal  implements java.io.Serializable {
    private java.lang.String organizerEmail;

    private java.lang.String icalText;

    public AddMeetingFromICal() {
    }

    public AddMeetingFromICal(
           java.lang.String organizerEmail,
           java.lang.String icalText) {
           this.organizerEmail = organizerEmail;
           this.icalText = icalText;
    }


    /**
     * Gets the organizerEmail value for this AddMeetingFromICal.
     * 
     * @return organizerEmail
     */
    public java.lang.String getOrganizerEmail() {
        return organizerEmail;
    }


    /**
     * Sets the organizerEmail value for this AddMeetingFromICal.
     * 
     * @param organizerEmail
     */
    public void setOrganizerEmail(java.lang.String organizerEmail) {
        this.organizerEmail = organizerEmail;
    }


    /**
     * Gets the icalText value for this AddMeetingFromICal.
     * 
     * @return icalText
     */
    public java.lang.String getIcalText() {
        return icalText;
    }


    /**
     * Sets the icalText value for this AddMeetingFromICal.
     * 
     * @param icalText
     */
    public void setIcalText(java.lang.String icalText) {
        this.icalText = icalText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddMeetingFromICal)) return false;
        AddMeetingFromICal other = (AddMeetingFromICal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organizerEmail==null && other.getOrganizerEmail()==null) || 
             (this.organizerEmail!=null &&
              this.organizerEmail.equals(other.getOrganizerEmail()))) &&
            ((this.icalText==null && other.getIcalText()==null) || 
             (this.icalText!=null &&
              this.icalText.equals(other.getIcalText())));
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
        if (getOrganizerEmail() != null) {
            _hashCode += getOrganizerEmail().hashCode();
        }
        if (getIcalText() != null) {
            _hashCode += getIcalText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddMeetingFromICal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">AddMeetingFromICal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "organizerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icalText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "icalText"));
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
