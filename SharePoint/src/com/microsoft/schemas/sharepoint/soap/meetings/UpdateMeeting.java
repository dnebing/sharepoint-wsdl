/**
 * UpdateMeeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class UpdateMeeting  implements java.io.Serializable {
    private java.lang.String uid;

    private org.apache.axis.types.UnsignedInt sequence;

    private java.util.Calendar utcDateStamp;

    private java.lang.String title;

    private java.lang.String location;

    private java.util.Calendar utcDateStart;

    private java.util.Calendar utcDateEnd;

    private boolean nonGregorian;

    public UpdateMeeting() {
    }

    public UpdateMeeting(
           java.lang.String uid,
           org.apache.axis.types.UnsignedInt sequence,
           java.util.Calendar utcDateStamp,
           java.lang.String title,
           java.lang.String location,
           java.util.Calendar utcDateStart,
           java.util.Calendar utcDateEnd,
           boolean nonGregorian) {
           this.uid = uid;
           this.sequence = sequence;
           this.utcDateStamp = utcDateStamp;
           this.title = title;
           this.location = location;
           this.utcDateStart = utcDateStart;
           this.utcDateEnd = utcDateEnd;
           this.nonGregorian = nonGregorian;
    }


    /**
     * Gets the uid value for this UpdateMeeting.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this UpdateMeeting.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }


    /**
     * Gets the sequence value for this UpdateMeeting.
     * 
     * @return sequence
     */
    public org.apache.axis.types.UnsignedInt getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this UpdateMeeting.
     * 
     * @param sequence
     */
    public void setSequence(org.apache.axis.types.UnsignedInt sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the utcDateStamp value for this UpdateMeeting.
     * 
     * @return utcDateStamp
     */
    public java.util.Calendar getUtcDateStamp() {
        return utcDateStamp;
    }


    /**
     * Sets the utcDateStamp value for this UpdateMeeting.
     * 
     * @param utcDateStamp
     */
    public void setUtcDateStamp(java.util.Calendar utcDateStamp) {
        this.utcDateStamp = utcDateStamp;
    }


    /**
     * Gets the title value for this UpdateMeeting.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this UpdateMeeting.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the location value for this UpdateMeeting.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this UpdateMeeting.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the utcDateStart value for this UpdateMeeting.
     * 
     * @return utcDateStart
     */
    public java.util.Calendar getUtcDateStart() {
        return utcDateStart;
    }


    /**
     * Sets the utcDateStart value for this UpdateMeeting.
     * 
     * @param utcDateStart
     */
    public void setUtcDateStart(java.util.Calendar utcDateStart) {
        this.utcDateStart = utcDateStart;
    }


    /**
     * Gets the utcDateEnd value for this UpdateMeeting.
     * 
     * @return utcDateEnd
     */
    public java.util.Calendar getUtcDateEnd() {
        return utcDateEnd;
    }


    /**
     * Sets the utcDateEnd value for this UpdateMeeting.
     * 
     * @param utcDateEnd
     */
    public void setUtcDateEnd(java.util.Calendar utcDateEnd) {
        this.utcDateEnd = utcDateEnd;
    }


    /**
     * Gets the nonGregorian value for this UpdateMeeting.
     * 
     * @return nonGregorian
     */
    public boolean isNonGregorian() {
        return nonGregorian;
    }


    /**
     * Sets the nonGregorian value for this UpdateMeeting.
     * 
     * @param nonGregorian
     */
    public void setNonGregorian(boolean nonGregorian) {
        this.nonGregorian = nonGregorian;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateMeeting)) return false;
        UpdateMeeting other = (UpdateMeeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.utcDateStamp==null && other.getUtcDateStamp()==null) || 
             (this.utcDateStamp!=null &&
              this.utcDateStamp.equals(other.getUtcDateStamp()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.utcDateStart==null && other.getUtcDateStart()==null) || 
             (this.utcDateStart!=null &&
              this.utcDateStart.equals(other.getUtcDateStart()))) &&
            ((this.utcDateEnd==null && other.getUtcDateEnd()==null) || 
             (this.utcDateEnd!=null &&
              this.utcDateEnd.equals(other.getUtcDateEnd()))) &&
            this.nonGregorian == other.isNonGregorian();
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
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getUtcDateStamp() != null) {
            _hashCode += getUtcDateStamp().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getUtcDateStart() != null) {
            _hashCode += getUtcDateStart().hashCode();
        }
        if (getUtcDateEnd() != null) {
            _hashCode += getUtcDateEnd().hashCode();
        }
        _hashCode += (isNonGregorian() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateMeeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">UpdateMeeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utcDateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "utcDateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utcDateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "utcDateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonGregorian");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "nonGregorian"));
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
