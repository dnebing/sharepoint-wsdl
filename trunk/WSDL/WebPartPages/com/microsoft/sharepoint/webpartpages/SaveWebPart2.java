/**
 * SaveWebPart2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public class SaveWebPart2  implements java.io.Serializable {
    private java.lang.String pageUrl;

    private java.lang.String storageKey;

    private java.lang.String webPartXml;

    private com.microsoft.sharepoint.webpartpages.Storage storage;

    private boolean allowTypeChange;

    public SaveWebPart2() {
    }

    public SaveWebPart2(
           java.lang.String pageUrl,
           java.lang.String storageKey,
           java.lang.String webPartXml,
           com.microsoft.sharepoint.webpartpages.Storage storage,
           boolean allowTypeChange) {
           this.pageUrl = pageUrl;
           this.storageKey = storageKey;
           this.webPartXml = webPartXml;
           this.storage = storage;
           this.allowTypeChange = allowTypeChange;
    }


    /**
     * Gets the pageUrl value for this SaveWebPart2.
     * 
     * @return pageUrl
     */
    public java.lang.String getPageUrl() {
        return pageUrl;
    }


    /**
     * Sets the pageUrl value for this SaveWebPart2.
     * 
     * @param pageUrl
     */
    public void setPageUrl(java.lang.String pageUrl) {
        this.pageUrl = pageUrl;
    }


    /**
     * Gets the storageKey value for this SaveWebPart2.
     * 
     * @return storageKey
     */
    public java.lang.String getStorageKey() {
        return storageKey;
    }


    /**
     * Sets the storageKey value for this SaveWebPart2.
     * 
     * @param storageKey
     */
    public void setStorageKey(java.lang.String storageKey) {
        this.storageKey = storageKey;
    }


    /**
     * Gets the webPartXml value for this SaveWebPart2.
     * 
     * @return webPartXml
     */
    public java.lang.String getWebPartXml() {
        return webPartXml;
    }


    /**
     * Sets the webPartXml value for this SaveWebPart2.
     * 
     * @param webPartXml
     */
    public void setWebPartXml(java.lang.String webPartXml) {
        this.webPartXml = webPartXml;
    }


    /**
     * Gets the storage value for this SaveWebPart2.
     * 
     * @return storage
     */
    public com.microsoft.sharepoint.webpartpages.Storage getStorage() {
        return storage;
    }


    /**
     * Sets the storage value for this SaveWebPart2.
     * 
     * @param storage
     */
    public void setStorage(com.microsoft.sharepoint.webpartpages.Storage storage) {
        this.storage = storage;
    }


    /**
     * Gets the allowTypeChange value for this SaveWebPart2.
     * 
     * @return allowTypeChange
     */
    public boolean isAllowTypeChange() {
        return allowTypeChange;
    }


    /**
     * Sets the allowTypeChange value for this SaveWebPart2.
     * 
     * @param allowTypeChange
     */
    public void setAllowTypeChange(boolean allowTypeChange) {
        this.allowTypeChange = allowTypeChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveWebPart2)) return false;
        SaveWebPart2 other = (SaveWebPart2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageUrl==null && other.getPageUrl()==null) || 
             (this.pageUrl!=null &&
              this.pageUrl.equals(other.getPageUrl()))) &&
            ((this.storageKey==null && other.getStorageKey()==null) || 
             (this.storageKey!=null &&
              this.storageKey.equals(other.getStorageKey()))) &&
            ((this.webPartXml==null && other.getWebPartXml()==null) || 
             (this.webPartXml!=null &&
              this.webPartXml.equals(other.getWebPartXml()))) &&
            ((this.storage==null && other.getStorage()==null) || 
             (this.storage!=null &&
              this.storage.equals(other.getStorage()))) &&
            this.allowTypeChange == other.isAllowTypeChange();
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
        if (getPageUrl() != null) {
            _hashCode += getPageUrl().hashCode();
        }
        if (getStorageKey() != null) {
            _hashCode += getStorageKey().hashCode();
        }
        if (getWebPartXml() != null) {
            _hashCode += getWebPartXml().hashCode();
        }
        if (getStorage() != null) {
            _hashCode += getStorage().hashCode();
        }
        _hashCode += (isAllowTypeChange() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveWebPart2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">SaveWebPart2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "pageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "storageKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webPartXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "webPartXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "storage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "Storage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowTypeChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "allowTypeChange"));
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
