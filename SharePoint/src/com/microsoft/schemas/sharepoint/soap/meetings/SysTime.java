/**
 * SysTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class SysTime  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort year;

    private org.apache.axis.types.UnsignedShort month;

    private org.apache.axis.types.UnsignedShort dayOfWeek;

    private org.apache.axis.types.UnsignedShort day;

    private org.apache.axis.types.UnsignedShort hour;

    private org.apache.axis.types.UnsignedShort minute;

    private org.apache.axis.types.UnsignedShort second;

    private org.apache.axis.types.UnsignedShort milliseconds;

    public SysTime() {
    }

    public SysTime(
           org.apache.axis.types.UnsignedShort year,
           org.apache.axis.types.UnsignedShort month,
           org.apache.axis.types.UnsignedShort dayOfWeek,
           org.apache.axis.types.UnsignedShort day,
           org.apache.axis.types.UnsignedShort hour,
           org.apache.axis.types.UnsignedShort minute,
           org.apache.axis.types.UnsignedShort second,
           org.apache.axis.types.UnsignedShort milliseconds) {
           this.year = year;
           this.month = month;
           this.dayOfWeek = dayOfWeek;
           this.day = day;
           this.hour = hour;
           this.minute = minute;
           this.second = second;
           this.milliseconds = milliseconds;
    }


    /**
     * Gets the year value for this SysTime.
     * 
     * @return year
     */
    public org.apache.axis.types.UnsignedShort getYear() {
        return year;
    }


    /**
     * Sets the year value for this SysTime.
     * 
     * @param year
     */
    public void setYear(org.apache.axis.types.UnsignedShort year) {
        this.year = year;
    }


    /**
     * Gets the month value for this SysTime.
     * 
     * @return month
     */
    public org.apache.axis.types.UnsignedShort getMonth() {
        return month;
    }


    /**
     * Sets the month value for this SysTime.
     * 
     * @param month
     */
    public void setMonth(org.apache.axis.types.UnsignedShort month) {
        this.month = month;
    }


    /**
     * Gets the dayOfWeek value for this SysTime.
     * 
     * @return dayOfWeek
     */
    public org.apache.axis.types.UnsignedShort getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this SysTime.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(org.apache.axis.types.UnsignedShort dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the day value for this SysTime.
     * 
     * @return day
     */
    public org.apache.axis.types.UnsignedShort getDay() {
        return day;
    }


    /**
     * Sets the day value for this SysTime.
     * 
     * @param day
     */
    public void setDay(org.apache.axis.types.UnsignedShort day) {
        this.day = day;
    }


    /**
     * Gets the hour value for this SysTime.
     * 
     * @return hour
     */
    public org.apache.axis.types.UnsignedShort getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this SysTime.
     * 
     * @param hour
     */
    public void setHour(org.apache.axis.types.UnsignedShort hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this SysTime.
     * 
     * @return minute
     */
    public org.apache.axis.types.UnsignedShort getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this SysTime.
     * 
     * @param minute
     */
    public void setMinute(org.apache.axis.types.UnsignedShort minute) {
        this.minute = minute;
    }


    /**
     * Gets the second value for this SysTime.
     * 
     * @return second
     */
    public org.apache.axis.types.UnsignedShort getSecond() {
        return second;
    }


    /**
     * Sets the second value for this SysTime.
     * 
     * @param second
     */
    public void setSecond(org.apache.axis.types.UnsignedShort second) {
        this.second = second;
    }


    /**
     * Gets the milliseconds value for this SysTime.
     * 
     * @return milliseconds
     */
    public org.apache.axis.types.UnsignedShort getMilliseconds() {
        return milliseconds;
    }


    /**
     * Sets the milliseconds value for this SysTime.
     * 
     * @param milliseconds
     */
    public void setMilliseconds(org.apache.axis.types.UnsignedShort milliseconds) {
        this.milliseconds = milliseconds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SysTime)) return false;
        SysTime other = (SysTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute()))) &&
            ((this.second==null && other.getSecond()==null) || 
             (this.second!=null &&
              this.second.equals(other.getSecond()))) &&
            ((this.milliseconds==null && other.getMilliseconds()==null) || 
             (this.milliseconds!=null &&
              this.milliseconds.equals(other.getMilliseconds())));
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        if (getSecond() != null) {
            _hashCode += getSecond().hashCode();
        }
        if (getMilliseconds() != null) {
            _hashCode += getMilliseconds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SysTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "SysTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milliseconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "milliseconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
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
