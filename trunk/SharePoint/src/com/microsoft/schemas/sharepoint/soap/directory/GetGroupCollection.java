/**
 * GetGroupCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.directory;

public class GetGroupCollection  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionGroupNamesXml groupNamesXml;

    public GetGroupCollection() {
    }

    public GetGroupCollection(
           com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionGroupNamesXml groupNamesXml) {
           this.groupNamesXml = groupNamesXml;
    }


    /**
     * Gets the groupNamesXml value for this GetGroupCollection.
     * 
     * @return groupNamesXml
     */
    public com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionGroupNamesXml getGroupNamesXml() {
        return groupNamesXml;
    }


    /**
     * Sets the groupNamesXml value for this GetGroupCollection.
     * 
     * @param groupNamesXml
     */
    public void setGroupNamesXml(com.microsoft.schemas.sharepoint.soap.directory.GetGroupCollectionGroupNamesXml groupNamesXml) {
        this.groupNamesXml = groupNamesXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGroupCollection)) return false;
        GetGroupCollection other = (GetGroupCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupNamesXml==null && other.getGroupNamesXml()==null) || 
             (this.groupNamesXml!=null &&
              this.groupNamesXml.equals(other.getGroupNamesXml())));
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
        if (getGroupNamesXml() != null) {
            _hashCode += getGroupNamesXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGroupCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">GetGroupCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNamesXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "groupNamesXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/directory/", ">>GetGroupCollection>groupNamesXml"));
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
