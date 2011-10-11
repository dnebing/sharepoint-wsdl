/**
 * SPPrincipalTypeNull.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class SPPrincipalTypeNull implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SPPrincipalTypeNull(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _User = "User";
    public static final java.lang.String _DistributionList = "DistributionList";
    public static final java.lang.String _SecurityGroup = "SecurityGroup";
    public static final java.lang.String _SharePointGroup = "SharePointGroup";
    public static final java.lang.String _All = "All";
    public static final SPPrincipalTypeNull None = new SPPrincipalTypeNull(_None);
    public static final SPPrincipalTypeNull User = new SPPrincipalTypeNull(_User);
    public static final SPPrincipalTypeNull DistributionList = new SPPrincipalTypeNull(_DistributionList);
    public static final SPPrincipalTypeNull SecurityGroup = new SPPrincipalTypeNull(_SecurityGroup);
    public static final SPPrincipalTypeNull SharePointGroup = new SPPrincipalTypeNull(_SharePointGroup);
    public static final SPPrincipalTypeNull All = new SPPrincipalTypeNull(_All);
    public java.lang.String getValue() { return _value_;}
    public static SPPrincipalTypeNull fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SPPrincipalTypeNull enumeration = (SPPrincipalTypeNull)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SPPrincipalTypeNull fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPPrincipalTypeNull.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "SPPrincipalType>null"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
