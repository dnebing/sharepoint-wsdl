/**
 * Template.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class Template  implements java.io.Serializable {
    private int ID;  // attribute

    private java.lang.String title;  // attribute

    private java.lang.String name;  // attribute

    private boolean isUnique;  // attribute

    private boolean isHidden;  // attribute

    private java.lang.String description;  // attribute

    private java.lang.String imageUrl;  // attribute

    private boolean isCustom;  // attribute

    private boolean isSubWebOnly;  // attribute

    private boolean isRootWebOnly;  // attribute

    private java.lang.String displayCategory;  // attribute

    private java.lang.String filterCategories;  // attribute

    private boolean hasProvisionClass;  // attribute

    public Template() {
    }

    public Template(
           int ID,
           java.lang.String title,
           java.lang.String name,
           boolean isUnique,
           boolean isHidden,
           java.lang.String description,
           java.lang.String imageUrl,
           boolean isCustom,
           boolean isSubWebOnly,
           boolean isRootWebOnly,
           java.lang.String displayCategory,
           java.lang.String filterCategories,
           boolean hasProvisionClass) {
           this.ID = ID;
           this.title = title;
           this.name = name;
           this.isUnique = isUnique;
           this.isHidden = isHidden;
           this.description = description;
           this.imageUrl = imageUrl;
           this.isCustom = isCustom;
           this.isSubWebOnly = isSubWebOnly;
           this.isRootWebOnly = isRootWebOnly;
           this.displayCategory = displayCategory;
           this.filterCategories = filterCategories;
           this.hasProvisionClass = hasProvisionClass;
    }


    /**
     * Gets the ID value for this Template.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Template.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }


    /**
     * Gets the title value for this Template.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Template.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the name value for this Template.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Template.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isUnique value for this Template.
     * 
     * @return isUnique
     */
    public boolean isIsUnique() {
        return isUnique;
    }


    /**
     * Sets the isUnique value for this Template.
     * 
     * @param isUnique
     */
    public void setIsUnique(boolean isUnique) {
        this.isUnique = isUnique;
    }


    /**
     * Gets the isHidden value for this Template.
     * 
     * @return isHidden
     */
    public boolean isIsHidden() {
        return isHidden;
    }


    /**
     * Sets the isHidden value for this Template.
     * 
     * @param isHidden
     */
    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }


    /**
     * Gets the description value for this Template.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Template.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the imageUrl value for this Template.
     * 
     * @return imageUrl
     */
    public java.lang.String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this Template.
     * 
     * @param imageUrl
     */
    public void setImageUrl(java.lang.String imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the isCustom value for this Template.
     * 
     * @return isCustom
     */
    public boolean isIsCustom() {
        return isCustom;
    }


    /**
     * Sets the isCustom value for this Template.
     * 
     * @param isCustom
     */
    public void setIsCustom(boolean isCustom) {
        this.isCustom = isCustom;
    }


    /**
     * Gets the isSubWebOnly value for this Template.
     * 
     * @return isSubWebOnly
     */
    public boolean isIsSubWebOnly() {
        return isSubWebOnly;
    }


    /**
     * Sets the isSubWebOnly value for this Template.
     * 
     * @param isSubWebOnly
     */
    public void setIsSubWebOnly(boolean isSubWebOnly) {
        this.isSubWebOnly = isSubWebOnly;
    }


    /**
     * Gets the isRootWebOnly value for this Template.
     * 
     * @return isRootWebOnly
     */
    public boolean isIsRootWebOnly() {
        return isRootWebOnly;
    }


    /**
     * Sets the isRootWebOnly value for this Template.
     * 
     * @param isRootWebOnly
     */
    public void setIsRootWebOnly(boolean isRootWebOnly) {
        this.isRootWebOnly = isRootWebOnly;
    }


    /**
     * Gets the displayCategory value for this Template.
     * 
     * @return displayCategory
     */
    public java.lang.String getDisplayCategory() {
        return displayCategory;
    }


    /**
     * Sets the displayCategory value for this Template.
     * 
     * @param displayCategory
     */
    public void setDisplayCategory(java.lang.String displayCategory) {
        this.displayCategory = displayCategory;
    }


    /**
     * Gets the filterCategories value for this Template.
     * 
     * @return filterCategories
     */
    public java.lang.String getFilterCategories() {
        return filterCategories;
    }


    /**
     * Sets the filterCategories value for this Template.
     * 
     * @param filterCategories
     */
    public void setFilterCategories(java.lang.String filterCategories) {
        this.filterCategories = filterCategories;
    }


    /**
     * Gets the hasProvisionClass value for this Template.
     * 
     * @return hasProvisionClass
     */
    public boolean isHasProvisionClass() {
        return hasProvisionClass;
    }


    /**
     * Sets the hasProvisionClass value for this Template.
     * 
     * @param hasProvisionClass
     */
    public void setHasProvisionClass(boolean hasProvisionClass) {
        this.hasProvisionClass = hasProvisionClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Template)) return false;
        Template other = (Template) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ID == other.getID() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.isUnique == other.isIsUnique() &&
            this.isHidden == other.isIsHidden() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl()))) &&
            this.isCustom == other.isIsCustom() &&
            this.isSubWebOnly == other.isIsSubWebOnly() &&
            this.isRootWebOnly == other.isIsRootWebOnly() &&
            ((this.displayCategory==null && other.getDisplayCategory()==null) || 
             (this.displayCategory!=null &&
              this.displayCategory.equals(other.getDisplayCategory()))) &&
            ((this.filterCategories==null && other.getFilterCategories()==null) || 
             (this.filterCategories!=null &&
              this.filterCategories.equals(other.getFilterCategories()))) &&
            this.hasProvisionClass == other.isHasProvisionClass();
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
        _hashCode += getID();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isIsUnique() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        _hashCode += (isIsCustom() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsSubWebOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsRootWebOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDisplayCategory() != null) {
            _hashCode += getDisplayCategory().hashCode();
        }
        if (getFilterCategories() != null) {
            _hashCode += getFilterCategories().hashCode();
        }
        _hashCode += (isHasProvisionClass() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Template.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Template"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("title");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isUnique");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsUnique"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isHidden");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsHidden"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("imageUrl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImageUrl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isCustom");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsCustom"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isSubWebOnly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsSubWebOnly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isRootWebOnly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsRootWebOnly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("displayCategory");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DisplayCategory"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("filterCategories");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FilterCategories"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hasProvisionClass");
        attrField.setXmlName(new javax.xml.namespace.QName("", "HasProvisionClass"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
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
