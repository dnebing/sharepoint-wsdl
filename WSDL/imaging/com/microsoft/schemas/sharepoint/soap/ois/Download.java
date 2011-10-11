/**
 * Download.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.ois;

public class Download  implements java.io.Serializable {
    private java.lang.String strListName;

    private java.lang.String strFolder;

    private java.lang.String[] itemFileNames;

    private org.apache.axis.types.UnsignedInt type;

    private boolean fFetchOriginalIfNotAvailable;

    public Download() {
    }

    public Download(
           java.lang.String strListName,
           java.lang.String strFolder,
           java.lang.String[] itemFileNames,
           org.apache.axis.types.UnsignedInt type,
           boolean fFetchOriginalIfNotAvailable) {
           this.strListName = strListName;
           this.strFolder = strFolder;
           this.itemFileNames = itemFileNames;
           this.type = type;
           this.fFetchOriginalIfNotAvailable = fFetchOriginalIfNotAvailable;
    }


    /**
     * Gets the strListName value for this Download.
     * 
     * @return strListName
     */
    public java.lang.String getStrListName() {
        return strListName;
    }


    /**
     * Sets the strListName value for this Download.
     * 
     * @param strListName
     */
    public void setStrListName(java.lang.String strListName) {
        this.strListName = strListName;
    }


    /**
     * Gets the strFolder value for this Download.
     * 
     * @return strFolder
     */
    public java.lang.String getStrFolder() {
        return strFolder;
    }


    /**
     * Sets the strFolder value for this Download.
     * 
     * @param strFolder
     */
    public void setStrFolder(java.lang.String strFolder) {
        this.strFolder = strFolder;
    }


    /**
     * Gets the itemFileNames value for this Download.
     * 
     * @return itemFileNames
     */
    public java.lang.String[] getItemFileNames() {
        return itemFileNames;
    }


    /**
     * Sets the itemFileNames value for this Download.
     * 
     * @param itemFileNames
     */
    public void setItemFileNames(java.lang.String[] itemFileNames) {
        this.itemFileNames = itemFileNames;
    }


    /**
     * Gets the type value for this Download.
     * 
     * @return type
     */
    public org.apache.axis.types.UnsignedInt getType() {
        return type;
    }


    /**
     * Sets the type value for this Download.
     * 
     * @param type
     */
    public void setType(org.apache.axis.types.UnsignedInt type) {
        this.type = type;
    }


    /**
     * Gets the fFetchOriginalIfNotAvailable value for this Download.
     * 
     * @return fFetchOriginalIfNotAvailable
     */
    public boolean isFFetchOriginalIfNotAvailable() {
        return fFetchOriginalIfNotAvailable;
    }


    /**
     * Sets the fFetchOriginalIfNotAvailable value for this Download.
     * 
     * @param fFetchOriginalIfNotAvailable
     */
    public void setFFetchOriginalIfNotAvailable(boolean fFetchOriginalIfNotAvailable) {
        this.fFetchOriginalIfNotAvailable = fFetchOriginalIfNotAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Download)) return false;
        Download other = (Download) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strListName==null && other.getStrListName()==null) || 
             (this.strListName!=null &&
              this.strListName.equals(other.getStrListName()))) &&
            ((this.strFolder==null && other.getStrFolder()==null) || 
             (this.strFolder!=null &&
              this.strFolder.equals(other.getStrFolder()))) &&
            ((this.itemFileNames==null && other.getItemFileNames()==null) || 
             (this.itemFileNames!=null &&
              java.util.Arrays.equals(this.itemFileNames, other.getItemFileNames()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.fFetchOriginalIfNotAvailable == other.isFFetchOriginalIfNotAvailable();
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
        if (getStrListName() != null) {
            _hashCode += getStrListName().hashCode();
        }
        if (getStrFolder() != null) {
            _hashCode += getStrFolder().hashCode();
        }
        if (getItemFileNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemFileNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemFileNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += (isFFetchOriginalIfNotAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Download.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", ">Download"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strListName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "strListName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "strFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFileNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "itemFileNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FFetchOriginalIfNotAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "fFetchOriginalIfNotAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
