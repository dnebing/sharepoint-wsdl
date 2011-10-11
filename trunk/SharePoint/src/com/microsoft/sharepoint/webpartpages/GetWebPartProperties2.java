/**
 * GetWebPartProperties2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public class GetWebPartProperties2  implements java.io.Serializable {
    private java.lang.String pageUrl;

    private com.microsoft.sharepoint.webpartpages.Storage storage;

    private com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior;

    public GetWebPartProperties2() {
    }

    public GetWebPartProperties2(
           java.lang.String pageUrl,
           com.microsoft.sharepoint.webpartpages.Storage storage,
           com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior) {
           this.pageUrl = pageUrl;
           this.storage = storage;
           this.behavior = behavior;
    }


    /**
     * Gets the pageUrl value for this GetWebPartProperties2.
     * 
     * @return pageUrl
     */
    public java.lang.String getPageUrl() {
        return pageUrl;
    }


    /**
     * Sets the pageUrl value for this GetWebPartProperties2.
     * 
     * @param pageUrl
     */
    public void setPageUrl(java.lang.String pageUrl) {
        this.pageUrl = pageUrl;
    }


    /**
     * Gets the storage value for this GetWebPartProperties2.
     * 
     * @return storage
     */
    public com.microsoft.sharepoint.webpartpages.Storage getStorage() {
        return storage;
    }


    /**
     * Sets the storage value for this GetWebPartProperties2.
     * 
     * @param storage
     */
    public void setStorage(com.microsoft.sharepoint.webpartpages.Storage storage) {
        this.storage = storage;
    }


    /**
     * Gets the behavior value for this GetWebPartProperties2.
     * 
     * @return behavior
     */
    public com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior getBehavior() {
        return behavior;
    }


    /**
     * Sets the behavior value for this GetWebPartProperties2.
     * 
     * @param behavior
     */
    public void setBehavior(com.microsoft.sharepoint.webpartpages.SPWebServiceBehavior behavior) {
        this.behavior = behavior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebPartProperties2)) return false;
        GetWebPartProperties2 other = (GetWebPartProperties2) obj;
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
            ((this.storage==null && other.getStorage()==null) || 
             (this.storage!=null &&
              this.storage.equals(other.getStorage()))) &&
            ((this.behavior==null && other.getBehavior()==null) || 
             (this.behavior!=null &&
              this.behavior.equals(other.getBehavior())));
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
        if (getStorage() != null) {
            _hashCode += getStorage().hashCode();
        }
        if (getBehavior() != null) {
            _hashCode += getBehavior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWebPartProperties2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">GetWebPartProperties2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "pageUrl"));
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
        elemField.setFieldName("behavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "behavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "SPWebServiceBehavior"));
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
