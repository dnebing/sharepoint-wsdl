/**
 * DspQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.dsp;

public class DspQuery  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.dsp.ServerParameterInfo serverParameterInfo;

    private com.microsoft.schemas.sharepoint.dsp.Fields fields;

    private com.microsoft.schemas.sharepoint.dsp.ServerParameter[] serverParameters;

    private com.microsoft.schemas.sharepoint.dsp.DspQueryWhere where;

    private com.microsoft.schemas.sharepoint.dsp.OrderField[] orderBy;

    private long rowLimit;  // attribute

    public DspQuery() {
    }

    public DspQuery(
           com.microsoft.schemas.sharepoint.dsp.ServerParameterInfo serverParameterInfo,
           com.microsoft.schemas.sharepoint.dsp.Fields fields,
           com.microsoft.schemas.sharepoint.dsp.ServerParameter[] serverParameters,
           com.microsoft.schemas.sharepoint.dsp.DspQueryWhere where,
           com.microsoft.schemas.sharepoint.dsp.OrderField[] orderBy,
           long rowLimit) {
           this.serverParameterInfo = serverParameterInfo;
           this.fields = fields;
           this.serverParameters = serverParameters;
           this.where = where;
           this.orderBy = orderBy;
           this.rowLimit = rowLimit;
    }


    /**
     * Gets the serverParameterInfo value for this DspQuery.
     * 
     * @return serverParameterInfo
     */
    public com.microsoft.schemas.sharepoint.dsp.ServerParameterInfo getServerParameterInfo() {
        return serverParameterInfo;
    }


    /**
     * Sets the serverParameterInfo value for this DspQuery.
     * 
     * @param serverParameterInfo
     */
    public void setServerParameterInfo(com.microsoft.schemas.sharepoint.dsp.ServerParameterInfo serverParameterInfo) {
        this.serverParameterInfo = serverParameterInfo;
    }


    /**
     * Gets the fields value for this DspQuery.
     * 
     * @return fields
     */
    public com.microsoft.schemas.sharepoint.dsp.Fields getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this DspQuery.
     * 
     * @param fields
     */
    public void setFields(com.microsoft.schemas.sharepoint.dsp.Fields fields) {
        this.fields = fields;
    }


    /**
     * Gets the serverParameters value for this DspQuery.
     * 
     * @return serverParameters
     */
    public com.microsoft.schemas.sharepoint.dsp.ServerParameter[] getServerParameters() {
        return serverParameters;
    }


    /**
     * Sets the serverParameters value for this DspQuery.
     * 
     * @param serverParameters
     */
    public void setServerParameters(com.microsoft.schemas.sharepoint.dsp.ServerParameter[] serverParameters) {
        this.serverParameters = serverParameters;
    }


    /**
     * Gets the where value for this DspQuery.
     * 
     * @return where
     */
    public com.microsoft.schemas.sharepoint.dsp.DspQueryWhere getWhere() {
        return where;
    }


    /**
     * Sets the where value for this DspQuery.
     * 
     * @param where
     */
    public void setWhere(com.microsoft.schemas.sharepoint.dsp.DspQueryWhere where) {
        this.where = where;
    }


    /**
     * Gets the orderBy value for this DspQuery.
     * 
     * @return orderBy
     */
    public com.microsoft.schemas.sharepoint.dsp.OrderField[] getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this DspQuery.
     * 
     * @param orderBy
     */
    public void setOrderBy(com.microsoft.schemas.sharepoint.dsp.OrderField[] orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the rowLimit value for this DspQuery.
     * 
     * @return rowLimit
     */
    public long getRowLimit() {
        return rowLimit;
    }


    /**
     * Sets the rowLimit value for this DspQuery.
     * 
     * @param rowLimit
     */
    public void setRowLimit(long rowLimit) {
        this.rowLimit = rowLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DspQuery)) return false;
        DspQuery other = (DspQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverParameterInfo==null && other.getServerParameterInfo()==null) || 
             (this.serverParameterInfo!=null &&
              this.serverParameterInfo.equals(other.getServerParameterInfo()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              this.fields.equals(other.getFields()))) &&
            ((this.serverParameters==null && other.getServerParameters()==null) || 
             (this.serverParameters!=null &&
              java.util.Arrays.equals(this.serverParameters, other.getServerParameters()))) &&
            ((this.where==null && other.getWhere()==null) || 
             (this.where!=null &&
              this.where.equals(other.getWhere()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              java.util.Arrays.equals(this.orderBy, other.getOrderBy()))) &&
            this.rowLimit == other.getRowLimit();
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
        if (getServerParameterInfo() != null) {
            _hashCode += getServerParameterInfo().hashCode();
        }
        if (getFields() != null) {
            _hashCode += getFields().hashCode();
        }
        if (getServerParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWhere() != null) {
            _hashCode += getWhere().hashCode();
        }
        if (getOrderBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getRowLimit()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DspQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "DspQuery"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rowLimit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RowLimit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverParameterInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "ServerParameterInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "ServerParameterInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "Fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "Fields"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "ServerParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "ServerParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "ServerParameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("where");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "Where"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", ">DspQuery>Where"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "OrderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "OrderField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "OrderField"));
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
