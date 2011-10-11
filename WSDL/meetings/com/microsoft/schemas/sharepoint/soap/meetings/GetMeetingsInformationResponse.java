/**
 * GetMeetingsInformationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class GetMeetingsInformationResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingsInformationResponseGetMeetingsInformationResult getMeetingsInformationResult;

    public GetMeetingsInformationResponse() {
    }

    public GetMeetingsInformationResponse(
           com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingsInformationResponseGetMeetingsInformationResult getMeetingsInformationResult) {
           this.getMeetingsInformationResult = getMeetingsInformationResult;
    }


    /**
     * Gets the getMeetingsInformationResult value for this GetMeetingsInformationResponse.
     * 
     * @return getMeetingsInformationResult
     */
    public com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingsInformationResponseGetMeetingsInformationResult getGetMeetingsInformationResult() {
        return getMeetingsInformationResult;
    }


    /**
     * Sets the getMeetingsInformationResult value for this GetMeetingsInformationResponse.
     * 
     * @param getMeetingsInformationResult
     */
    public void setGetMeetingsInformationResult(com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingsInformationResponseGetMeetingsInformationResult getMeetingsInformationResult) {
        this.getMeetingsInformationResult = getMeetingsInformationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMeetingsInformationResponse)) return false;
        GetMeetingsInformationResponse other = (GetMeetingsInformationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMeetingsInformationResult==null && other.getGetMeetingsInformationResult()==null) || 
             (this.getMeetingsInformationResult!=null &&
              this.getMeetingsInformationResult.equals(other.getGetMeetingsInformationResult())));
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
        if (getGetMeetingsInformationResult() != null) {
            _hashCode += getGetMeetingsInformationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMeetingsInformationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">GetMeetingsInformationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMeetingsInformationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "GetMeetingsInformationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">>GetMeetingsInformationResponse>GetMeetingsInformationResult"));
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
