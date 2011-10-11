/**
 * QueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.dsp;

public class QueryRequest  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.dsp.DSQuery dsQuery;

    private com.microsoft.schemas.sharepoint.dsp.PTQuery ptQuery;

    public QueryRequest() {
    }

    public QueryRequest(
           com.microsoft.schemas.sharepoint.dsp.DSQuery dsQuery,
           com.microsoft.schemas.sharepoint.dsp.PTQuery ptQuery) {
           this.dsQuery = dsQuery;
           this.ptQuery = ptQuery;
    }


    /**
     * Gets the dsQuery value for this QueryRequest.
     * 
     * @return dsQuery
     */
    public com.microsoft.schemas.sharepoint.dsp.DSQuery getDsQuery() {
        return dsQuery;
    }


    /**
     * Sets the dsQuery value for this QueryRequest.
     * 
     * @param dsQuery
     */
    public void setDsQuery(com.microsoft.schemas.sharepoint.dsp.DSQuery dsQuery) {
        this.dsQuery = dsQuery;
    }


    /**
     * Gets the ptQuery value for this QueryRequest.
     * 
     * @return ptQuery
     */
    public com.microsoft.schemas.sharepoint.dsp.PTQuery getPtQuery() {
        return ptQuery;
    }


    /**
     * Sets the ptQuery value for this QueryRequest.
     * 
     * @param ptQuery
     */
    public void setPtQuery(com.microsoft.schemas.sharepoint.dsp.PTQuery ptQuery) {
        this.ptQuery = ptQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryRequest)) return false;
        QueryRequest other = (QueryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dsQuery==null && other.getDsQuery()==null) || 
             (this.dsQuery!=null &&
              this.dsQuery.equals(other.getDsQuery()))) &&
            ((this.ptQuery==null && other.getPtQuery()==null) || 
             (this.ptQuery!=null &&
              this.ptQuery.equals(other.getPtQuery())));
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
        if (getDsQuery() != null) {
            _hashCode += getDsQuery().hashCode();
        }
        if (getPtQuery() != null) {
            _hashCode += getPtQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "QueryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "dsQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "DSQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "ptQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "PTQuery"));
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
