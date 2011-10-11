/**
 * AddMeetingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class AddMeetingResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.meetings.AddMeetingResponseAddMeetingResult addMeetingResult;

    public AddMeetingResponse() {
    }

    public AddMeetingResponse(
           com.microsoft.schemas.sharepoint.soap.meetings.AddMeetingResponseAddMeetingResult addMeetingResult) {
           this.addMeetingResult = addMeetingResult;
    }


    /**
     * Gets the addMeetingResult value for this AddMeetingResponse.
     * 
     * @return addMeetingResult
     */
    public com.microsoft.schemas.sharepoint.soap.meetings.AddMeetingResponseAddMeetingResult getAddMeetingResult() {
        return addMeetingResult;
    }


    /**
     * Sets the addMeetingResult value for this AddMeetingResponse.
     * 
     * @param addMeetingResult
     */
    public void setAddMeetingResult(com.microsoft.schemas.sharepoint.soap.meetings.AddMeetingResponseAddMeetingResult addMeetingResult) {
        this.addMeetingResult = addMeetingResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddMeetingResponse)) return false;
        AddMeetingResponse other = (AddMeetingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addMeetingResult==null && other.getAddMeetingResult()==null) || 
             (this.addMeetingResult!=null &&
              this.addMeetingResult.equals(other.getAddMeetingResult())));
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
        if (getAddMeetingResult() != null) {
            _hashCode += getAddMeetingResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddMeetingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">AddMeetingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addMeetingResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "AddMeetingResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">>AddMeetingResponse>AddMeetingResult"));
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
