/**
 * GetMeetingWorkspacesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public class GetMeetingWorkspacesResponse  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingWorkspacesResponseGetMeetingWorkspacesResult getMeetingWorkspacesResult;

    public GetMeetingWorkspacesResponse() {
    }

    public GetMeetingWorkspacesResponse(
           com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingWorkspacesResponseGetMeetingWorkspacesResult getMeetingWorkspacesResult) {
           this.getMeetingWorkspacesResult = getMeetingWorkspacesResult;
    }


    /**
     * Gets the getMeetingWorkspacesResult value for this GetMeetingWorkspacesResponse.
     * 
     * @return getMeetingWorkspacesResult
     */
    public com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingWorkspacesResponseGetMeetingWorkspacesResult getGetMeetingWorkspacesResult() {
        return getMeetingWorkspacesResult;
    }


    /**
     * Sets the getMeetingWorkspacesResult value for this GetMeetingWorkspacesResponse.
     * 
     * @param getMeetingWorkspacesResult
     */
    public void setGetMeetingWorkspacesResult(com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingWorkspacesResponseGetMeetingWorkspacesResult getMeetingWorkspacesResult) {
        this.getMeetingWorkspacesResult = getMeetingWorkspacesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMeetingWorkspacesResponse)) return false;
        GetMeetingWorkspacesResponse other = (GetMeetingWorkspacesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMeetingWorkspacesResult==null && other.getGetMeetingWorkspacesResult()==null) || 
             (this.getMeetingWorkspacesResult!=null &&
              this.getMeetingWorkspacesResult.equals(other.getGetMeetingWorkspacesResult())));
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
        if (getGetMeetingWorkspacesResult() != null) {
            _hashCode += getGetMeetingWorkspacesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMeetingWorkspacesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">GetMeetingWorkspacesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMeetingWorkspacesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "GetMeetingWorkspacesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", ">>GetMeetingWorkspacesResponse>GetMeetingWorkspacesResult"));
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
