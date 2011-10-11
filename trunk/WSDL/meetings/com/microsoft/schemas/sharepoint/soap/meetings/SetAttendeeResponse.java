/**
 * SetAttendeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class SetAttendeeResponse  implements java.io.Serializable {
    private java.lang.String attendeeEmail;

    private org.apache.axis.types.UnsignedInt recurrenceId;

    private java.lang.String uid;

    private org.apache.axis.types.UnsignedInt sequence;

    private java.util.Calendar utcDateTimeOrganizerCriticalChange;

    private java.util.Calendar utcDateTimeAttendeeCriticalChange;

    private com.microsoft.schemas.sharepoint.soap.meetings.AttendeeResponse response;

    public SetAttendeeResponse() {
    }

    public SetAttendeeResponse(
           java.lang.String attendeeEmail,
           org.apache.axis.types.UnsignedInt recurrenceId,
           java.lang.String uid,
           org.apache.axis.types.UnsignedInt sequence,
           java.util.Calendar utcDateTimeOrganizerCriticalChange,
           java.util.Calendar utcDateTimeAttendeeCriticalChange,
           com.microsoft.schemas.sharepoint.soap.meetings.AttendeeResponse response) {
           this.attendeeEmail = attendeeEmail;
           this.recurrenceId = recurrenceId;
           this.uid = uid;
           this.sequence = sequence;
           this.utcDateTimeOrganizerCriticalChange = utcDateTimeOrganizerCriticalChange;
           this.utcDateTimeAttendeeCriticalChange = utcDateTimeAttendeeCriticalChange;
           this.response = response;
    }


    /**
     * Gets the attendeeEmail value for this SetAttendeeResponse.
     * 
     * @return attendeeEmail
     */
    public java.lang.String getAttendeeEmail() {
        return attendeeEmail;
    }


    /**
     * Sets the attendeeEmail value for this SetAttendeeResponse.
     * 
     * @param attendeeEmail
     */
    public void setAttendeeEmail(java.lang.String attendeeEmail) {
        this.attendeeEmail = attendeeEmail;
    }


    /**
     * Gets the recurrenceId value for this SetAttendeeResponse.
     * 
     * @return recurrenceId
     */
    public org.apache.axis.types.UnsignedInt getRecurrenceId() {
        return recurrenceId;
    }


    /**
     * Sets the recurrenceId value for this SetAttendeeResponse.
     * 
     * @param recurrenceId
     */
    public void setRecurrenceId(org.apache.axis.types.UnsignedInt recurrenceId) {
        this.recurrenceId = recurrenceId;
    }


    /**
     * Gets the uid value for this SetAttendeeResponse.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this SetAttendeeResponse.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }


    /**
     * Gets the sequence value for this SetAttendeeResponse.
     * 
     * @return sequence
     */
    public org.apache.axis.types.UnsignedInt getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this SetAttendeeResponse.
     * 
     * @param sequence
     */
    public void setSequence(org.apache.axis.types.UnsignedInt sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the utcDateTimeOrganizerCriticalChange value for this SetAttendeeResponse.
     * 
     * @return utcDateTimeOrganizerCriticalChange
     */
    public java.util.Calendar getUtcDateTimeOrganizerCriticalChange() {
        return utcDateTimeOrganizerCriticalChange;
    }


    /**
     * Sets the utcDateTimeOrganizerCriticalChange value for this SetAttendeeResponse.
     * 
     * @param utcDateTimeOrganizerCriticalChange
     */
    public void setUtcDateTimeOrganizerCriticalChange(java.util.Calendar utcDateTimeOrganizerCriticalChange) {
        this.utcDateTimeOrganizerCriticalChange = utcDateTimeOrganizerCriticalChange;
    }


    /**
     * Gets the utcDateTimeAttendeeCriticalChange value for this SetAttendeeResponse.
     * 
     * @return utcDateTimeAttendeeCriticalChange
     */
    public java.util.Calendar getUtcDateTimeAttendeeCriticalChange() {
        return utcDateTimeAttendeeCriticalChange;
    }


    /**
     * Sets the utcDateTimeAttendeeCriticalChange value for this SetAttendeeResponse.
     * 
     * @param utcDateTimeAttendeeCriticalChange
     */
    public void setUtcDateTimeAttendeeCriticalChange(java.util.Calendar utcDateTimeAttendeeCriticalChange) {
        this.utcDateTimeAttendeeCriticalChange = utcDateTimeAttendeeCriticalChange;
    }


    /**
     * Gets the response value for this SetAttendeeResponse.
     * 
     * @return response
     */
    public com.microsoft.schemas.sharepoint.soap.meetings.AttendeeResponse getResponse() {
        return response;
    }


    /**
     * Sets the response value for this SetAttendeeResponse.
     * 
     * @param response
     */
    public void setResponse(com.microsoft.schemas.sharepoint.soap.meetings.AttendeeResponse response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetAttendeeResponse)) return false;
        SetAttendeeResponse other = (SetAttendeeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attendeeEmail==null && other.getAttendeeEmail()==null) || 
             (this.attendeeEmail!=null &&
              this.attendeeEmail.equals(other.getAttendeeEmail()))) &&
            ((this.recurrenceId==null && other.getRecurrenceId()==null) || 
             (this.recurrenceId!=null &&
              this.recurrenceId.equals(other.getRecurrenceId()))) &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.utcDateTimeOrganizerCriticalChange==null && other.getUtcDateTimeOrganizerCriticalChange()==null) || 
             (this.utcDateTimeOrganizerCriticalChange!=null &&
              this.utcDateTimeOrganizerCriticalChange.equals(other.getUtcDateTimeOrganizerCriticalChange()))) &&
            ((this.utcDateTimeAttendeeCriticalChange==null && other.getUtcDateTimeAttendeeCriticalChange()==null) || 
             (this.utcDateTimeAttendeeCriticalChange!=null &&
              this.utcDateTimeAttendeeCriticalChange.equals(other.getUtcDateTimeAttendeeCriticalChange()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getAttendeeEmail() != null) {
            _hashCode += getAttendeeEmail().hashCode();
        }
        if (getRecurrenceId() != null) {
            _hashCode += getRecurrenceId().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getUtcDateTimeOrganizerCriticalChange() != null) {
            _hashCode += getUtcDateTimeOrganizerCriticalChange().hashCode();
        }
        if (getUtcDateTimeAttendeeCriticalChange() != null) {
            _hashCode += getUtcDateTimeAttendeeCriticalChange().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetAttendeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">SetAttendeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendeeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "attendeeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("utcDateTimeOrganizerCriticalChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "utcDateTimeOrganizerCriticalChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utcDateTimeAttendeeCriticalChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "utcDateTimeAttendeeCriticalChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "AttendeeResponse"));
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
