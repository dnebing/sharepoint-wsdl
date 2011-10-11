/**
 * TimeZoneInf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class TimeZoneInf  implements java.io.Serializable {
    private int bias;

    private com.microsoft.schemas.sharepoint.soap.meetings.SysTime standardDate;

    private int standardBias;

    private com.microsoft.schemas.sharepoint.soap.meetings.SysTime daylightDate;

    private int daylightBias;

    public TimeZoneInf() {
    }

    public TimeZoneInf(
           int bias,
           com.microsoft.schemas.sharepoint.soap.meetings.SysTime standardDate,
           int standardBias,
           com.microsoft.schemas.sharepoint.soap.meetings.SysTime daylightDate,
           int daylightBias) {
           this.bias = bias;
           this.standardDate = standardDate;
           this.standardBias = standardBias;
           this.daylightDate = daylightDate;
           this.daylightBias = daylightBias;
    }


    /**
     * Gets the bias value for this TimeZoneInf.
     * 
     * @return bias
     */
    public int getBias() {
        return bias;
    }


    /**
     * Sets the bias value for this TimeZoneInf.
     * 
     * @param bias
     */
    public void setBias(int bias) {
        this.bias = bias;
    }


    /**
     * Gets the standardDate value for this TimeZoneInf.
     * 
     * @return standardDate
     */
    public com.microsoft.schemas.sharepoint.soap.meetings.SysTime getStandardDate() {
        return standardDate;
    }


    /**
     * Sets the standardDate value for this TimeZoneInf.
     * 
     * @param standardDate
     */
    public void setStandardDate(com.microsoft.schemas.sharepoint.soap.meetings.SysTime standardDate) {
        this.standardDate = standardDate;
    }


    /**
     * Gets the standardBias value for this TimeZoneInf.
     * 
     * @return standardBias
     */
    public int getStandardBias() {
        return standardBias;
    }


    /**
     * Sets the standardBias value for this TimeZoneInf.
     * 
     * @param standardBias
     */
    public void setStandardBias(int standardBias) {
        this.standardBias = standardBias;
    }


    /**
     * Gets the daylightDate value for this TimeZoneInf.
     * 
     * @return daylightDate
     */
    public com.microsoft.schemas.sharepoint.soap.meetings.SysTime getDaylightDate() {
        return daylightDate;
    }


    /**
     * Sets the daylightDate value for this TimeZoneInf.
     * 
     * @param daylightDate
     */
    public void setDaylightDate(com.microsoft.schemas.sharepoint.soap.meetings.SysTime daylightDate) {
        this.daylightDate = daylightDate;
    }


    /**
     * Gets the daylightBias value for this TimeZoneInf.
     * 
     * @return daylightBias
     */
    public int getDaylightBias() {
        return daylightBias;
    }


    /**
     * Sets the daylightBias value for this TimeZoneInf.
     * 
     * @param daylightBias
     */
    public void setDaylightBias(int daylightBias) {
        this.daylightBias = daylightBias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeZoneInf)) return false;
        TimeZoneInf other = (TimeZoneInf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bias == other.getBias() &&
            ((this.standardDate==null && other.getStandardDate()==null) || 
             (this.standardDate!=null &&
              this.standardDate.equals(other.getStandardDate()))) &&
            this.standardBias == other.getStandardBias() &&
            ((this.daylightDate==null && other.getDaylightDate()==null) || 
             (this.daylightDate!=null &&
              this.daylightDate.equals(other.getDaylightDate()))) &&
            this.daylightBias == other.getDaylightBias();
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
        _hashCode += getBias();
        if (getStandardDate() != null) {
            _hashCode += getStandardDate().hashCode();
        }
        _hashCode += getStandardBias();
        if (getDaylightDate() != null) {
            _hashCode += getDaylightDate().hashCode();
        }
        _hashCode += getDaylightBias();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeZoneInf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "TimeZoneInf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "bias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "standardDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "SysTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardBias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "standardBias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daylightDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "daylightDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "SysTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daylightBias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "daylightBias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
