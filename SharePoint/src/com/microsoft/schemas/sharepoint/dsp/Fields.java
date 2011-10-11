/**
 * Fields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.dsp;

public class Fields  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.dsp.Field[] field;

    private com.microsoft.schemas.sharepoint.dsp.AllFields allFields;

    public Fields() {
    }

    public Fields(
           com.microsoft.schemas.sharepoint.dsp.Field[] field,
           com.microsoft.schemas.sharepoint.dsp.AllFields allFields) {
           this.field = field;
           this.allFields = allFields;
    }


    /**
     * Gets the field value for this Fields.
     * 
     * @return field
     */
    public com.microsoft.schemas.sharepoint.dsp.Field[] getField() {
        return field;
    }


    /**
     * Sets the field value for this Fields.
     * 
     * @param field
     */
    public void setField(com.microsoft.schemas.sharepoint.dsp.Field[] field) {
        this.field = field;
    }

    public com.microsoft.schemas.sharepoint.dsp.Field getField(int i) {
        return this.field[i];
    }

    public void setField(int i, com.microsoft.schemas.sharepoint.dsp.Field _value) {
        this.field[i] = _value;
    }


    /**
     * Gets the allFields value for this Fields.
     * 
     * @return allFields
     */
    public com.microsoft.schemas.sharepoint.dsp.AllFields getAllFields() {
        return allFields;
    }


    /**
     * Sets the allFields value for this Fields.
     * 
     * @param allFields
     */
    public void setAllFields(com.microsoft.schemas.sharepoint.dsp.AllFields allFields) {
        this.allFields = allFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fields)) return false;
        Fields other = (Fields) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              java.util.Arrays.equals(this.field, other.getField()))) &&
            ((this.allFields==null && other.getAllFields()==null) || 
             (this.allFields!=null &&
              this.allFields.equals(other.getAllFields())));
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
        if (getField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllFields() != null) {
            _hashCode += getAllFields().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fields.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "Fields"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "Field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "Field"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "AllFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "AllFields"));
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
