/**
 * Edit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.ois;

public class Edit  implements java.io.Serializable {
    private java.lang.String strListName;

    private java.lang.String strFolder;

    private java.lang.String itemFileName;

    private com.microsoft.schemas.sharepoint.soap.ois.EditRecipe recipe;

    public Edit() {
    }

    public Edit(
           java.lang.String strListName,
           java.lang.String strFolder,
           java.lang.String itemFileName,
           com.microsoft.schemas.sharepoint.soap.ois.EditRecipe recipe) {
           this.strListName = strListName;
           this.strFolder = strFolder;
           this.itemFileName = itemFileName;
           this.recipe = recipe;
    }


    /**
     * Gets the strListName value for this Edit.
     * 
     * @return strListName
     */
    public java.lang.String getStrListName() {
        return strListName;
    }


    /**
     * Sets the strListName value for this Edit.
     * 
     * @param strListName
     */
    public void setStrListName(java.lang.String strListName) {
        this.strListName = strListName;
    }


    /**
     * Gets the strFolder value for this Edit.
     * 
     * @return strFolder
     */
    public java.lang.String getStrFolder() {
        return strFolder;
    }


    /**
     * Sets the strFolder value for this Edit.
     * 
     * @param strFolder
     */
    public void setStrFolder(java.lang.String strFolder) {
        this.strFolder = strFolder;
    }


    /**
     * Gets the itemFileName value for this Edit.
     * 
     * @return itemFileName
     */
    public java.lang.String getItemFileName() {
        return itemFileName;
    }


    /**
     * Sets the itemFileName value for this Edit.
     * 
     * @param itemFileName
     */
    public void setItemFileName(java.lang.String itemFileName) {
        this.itemFileName = itemFileName;
    }


    /**
     * Gets the recipe value for this Edit.
     * 
     * @return recipe
     */
    public com.microsoft.schemas.sharepoint.soap.ois.EditRecipe getRecipe() {
        return recipe;
    }


    /**
     * Sets the recipe value for this Edit.
     * 
     * @param recipe
     */
    public void setRecipe(com.microsoft.schemas.sharepoint.soap.ois.EditRecipe recipe) {
        this.recipe = recipe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Edit)) return false;
        Edit other = (Edit) obj;
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
            ((this.itemFileName==null && other.getItemFileName()==null) || 
             (this.itemFileName!=null &&
              this.itemFileName.equals(other.getItemFileName()))) &&
            ((this.recipe==null && other.getRecipe()==null) || 
             (this.recipe!=null &&
              this.recipe.equals(other.getRecipe())));
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
        if (getItemFileName() != null) {
            _hashCode += getItemFileName().hashCode();
        }
        if (getRecipe() != null) {
            _hashCode += getRecipe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Edit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", ">Edit"));
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
        elemField.setFieldName("itemFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "itemFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "recipe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", ">>Edit>recipe"));
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
