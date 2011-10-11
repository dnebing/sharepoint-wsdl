/**
 * RemoveMeeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class RemoveMeeting  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt recurrenceId;

    private java.lang.String uid;

    private org.apache.axis.types.UnsignedInt sequence;

    private java.util.Calendar utcDateStamp;

    private boolean cancelMeeting;

    public RemoveMeeting() {
    }

    public RemoveMeeting(
           org.apache.axis.types.UnsignedInt recurrenceId,
           java.lang.String uid,
           org.apache.axis.types.UnsignedInt sequence,
           java.util.Calendar utcDateStamp,
           boolean cancelMeeting) {
           this.recurrenceId = recurrenceId;
           this.uid = uid;
           this.sequence = sequence;
           this.utcDateStamp = utcDateStamp;
           this.cancelMeeting = cancelMeeting;
    }


    /**
     * Gets the recurrenceId value for this RemoveMeeting.
     * 
     * @return recurrenceId
     */
    public org.apache.axis.types.UnsignedInt getRecurrenceId() {
        return recurrenceId;
    }


    /**
     * Sets the recurrenceId value for this RemoveMeeting.
     * 
     * @param recurrenceId
     */
    public void setRecurrenceId(org.apache.axis.types.UnsignedInt recurrenceId) {
        this.recurrenceId = recurrenceId;
    }


    /**
     * Gets the uid value for this RemoveMeeting.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this RemoveMeeting.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }


    /**
     * Gets the sequence value for this RemoveMeeting.
     * 
     * @return sequence
     */
    public org.apache.axis.types.UnsignedInt getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this RemoveMeeting.
     * 
     * @param sequence
     */
    public void setSequence(org.apache.axis.types.UnsignedInt sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the utcDateStamp value for this RemoveMeeting.
     * 
     * @return utcDateStamp
     */
    public java.util.Calendar getUtcDateStamp() {
        return utcDateStamp;
    }


    /**
     * Sets the utcDateStamp value for this RemoveMeeting.
     * 
     * @param utcDateStamp
     */
    public void setUtcDateStamp(java.util.Calendar utcDateStamp) {
        this.utcDateStamp = utcDateStamp;
    }


    /**
     * Gets the cancelMeeting value for this RemoveMeeting.
     * 
     * @return cancelMeeting
     */
    public boolean isCancelMeeting() {
        return cancelMeeting;
    }


    /**
     * Sets the cancelMeeting value for this RemoveMeeting.
     * 
     * @param cancelMeeting
     */
    public void setCancelMeeting(boolean cancelMeeting) {
        this.cancelMeeting = cancelMeeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveMeeting)) return false;
        RemoveMeeting other = (RemoveMeeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recurrenceId==null && other.getRecurrenceId()==null) || 
             (this.recurrenceId!=null &&
              this.recurrenceId.equals(other.getRecurrenceId()))) &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.utcDateStamp==null && other.getUtcDateStamp()==null) || 
             (this.utcDateStamp!=null &&
              this.utcDateStamp.equals(other.getUtcDateStamp()))) &&
            this.cancelMeeting == other.isCancelMeeting();
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
        if (getRecurrenceId() != null) {
            _hashCode += getRecurrenceId().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getUtcDateStamp() != null) {
            _hashCode += getUtcDateStamp().hashCode();
        }
        _hashCode += (isCancelMeeting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveMeeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">RemoveMeeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "recurrenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "uid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utcDateStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "utcDateStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelMeeting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "cancelMeeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
