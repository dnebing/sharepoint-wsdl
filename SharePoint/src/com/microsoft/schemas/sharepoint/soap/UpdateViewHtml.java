/**
 * UpdateViewHtml.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class UpdateViewHtml  implements java.io.Serializable {
    private java.lang.String listName;

    private java.lang.String viewName;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewProperties viewProperties;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlToolbar toolbar;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewHeader viewHeader;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewBody viewBody;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewFooter viewFooter;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewEmpty viewEmpty;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlRowLimitExceeded rowLimitExceeded;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlQuery query;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewFields viewFields;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlAggregations aggregations;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlFormats formats;

    private com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlRowLimit rowLimit;

    public UpdateViewHtml() {
    }

    public UpdateViewHtml(
           java.lang.String listName,
           java.lang.String viewName,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewProperties viewProperties,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlToolbar toolbar,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewHeader viewHeader,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewBody viewBody,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewFooter viewFooter,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewEmpty viewEmpty,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlRowLimitExceeded rowLimitExceeded,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlQuery query,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewFields viewFields,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlAggregations aggregations,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlFormats formats,
           com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlRowLimit rowLimit) {
           this.listName = listName;
           this.viewName = viewName;
           this.viewProperties = viewProperties;
           this.toolbar = toolbar;
           this.viewHeader = viewHeader;
           this.viewBody = viewBody;
           this.viewFooter = viewFooter;
           this.viewEmpty = viewEmpty;
           this.rowLimitExceeded = rowLimitExceeded;
           this.query = query;
           this.viewFields = viewFields;
           this.aggregations = aggregations;
           this.formats = formats;
           this.rowLimit = rowLimit;
    }


    /**
     * Gets the listName value for this UpdateViewHtml.
     * 
     * @return listName
     */
    public java.lang.String getListName() {
        return listName;
    }


    /**
     * Sets the listName value for this UpdateViewHtml.
     * 
     * @param listName
     */
    public void setListName(java.lang.String listName) {
        this.listName = listName;
    }


    /**
     * Gets the viewName value for this UpdateViewHtml.
     * 
     * @return viewName
     */
    public java.lang.String getViewName() {
        return viewName;
    }


    /**
     * Sets the viewName value for this UpdateViewHtml.
     * 
     * @param viewName
     */
    public void setViewName(java.lang.String viewName) {
        this.viewName = viewName;
    }


    /**
     * Gets the viewProperties value for this UpdateViewHtml.
     * 
     * @return viewProperties
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewProperties getViewProperties() {
        return viewProperties;
    }


    /**
     * Sets the viewProperties value for this UpdateViewHtml.
     * 
     * @param viewProperties
     */
    public void setViewProperties(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewProperties viewProperties) {
        this.viewProperties = viewProperties;
    }


    /**
     * Gets the toolbar value for this UpdateViewHtml.
     * 
     * @return toolbar
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlToolbar getToolbar() {
        return toolbar;
    }


    /**
     * Sets the toolbar value for this UpdateViewHtml.
     * 
     * @param toolbar
     */
    public void setToolbar(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlToolbar toolbar) {
        this.toolbar = toolbar;
    }


    /**
     * Gets the viewHeader value for this UpdateViewHtml.
     * 
     * @return viewHeader
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewHeader getViewHeader() {
        return viewHeader;
    }


    /**
     * Sets the viewHeader value for this UpdateViewHtml.
     * 
     * @param viewHeader
     */
    public void setViewHeader(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewHeader viewHeader) {
        this.viewHeader = viewHeader;
    }


    /**
     * Gets the viewBody value for this UpdateViewHtml.
     * 
     * @return viewBody
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewBody getViewBody() {
        return viewBody;
    }


    /**
     * Sets the viewBody value for this UpdateViewHtml.
     * 
     * @param viewBody
     */
    public void setViewBody(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewBody viewBody) {
        this.viewBody = viewBody;
    }


    /**
     * Gets the viewFooter value for this UpdateViewHtml.
     * 
     * @return viewFooter
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewFooter getViewFooter() {
        return viewFooter;
    }


    /**
     * Sets the viewFooter value for this UpdateViewHtml.
     * 
     * @param viewFooter
     */
    public void setViewFooter(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewFooter viewFooter) {
        this.viewFooter = viewFooter;
    }


    /**
     * Gets the viewEmpty value for this UpdateViewHtml.
     * 
     * @return viewEmpty
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewEmpty getViewEmpty() {
        return viewEmpty;
    }


    /**
     * Sets the viewEmpty value for this UpdateViewHtml.
     * 
     * @param viewEmpty
     */
    public void setViewEmpty(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewEmpty viewEmpty) {
        this.viewEmpty = viewEmpty;
    }


    /**
     * Gets the rowLimitExceeded value for this UpdateViewHtml.
     * 
     * @return rowLimitExceeded
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlRowLimitExceeded getRowLimitExceeded() {
        return rowLimitExceeded;
    }


    /**
     * Sets the rowLimitExceeded value for this UpdateViewHtml.
     * 
     * @param rowLimitExceeded
     */
    public void setRowLimitExceeded(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlRowLimitExceeded rowLimitExceeded) {
        this.rowLimitExceeded = rowLimitExceeded;
    }


    /**
     * Gets the query value for this UpdateViewHtml.
     * 
     * @return query
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlQuery getQuery() {
        return query;
    }


    /**
     * Sets the query value for this UpdateViewHtml.
     * 
     * @param query
     */
    public void setQuery(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlQuery query) {
        this.query = query;
    }


    /**
     * Gets the viewFields value for this UpdateViewHtml.
     * 
     * @return viewFields
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewFields getViewFields() {
        return viewFields;
    }


    /**
     * Sets the viewFields value for this UpdateViewHtml.
     * 
     * @param viewFields
     */
    public void setViewFields(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlViewFields viewFields) {
        this.viewFields = viewFields;
    }


    /**
     * Gets the aggregations value for this UpdateViewHtml.
     * 
     * @return aggregations
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlAggregations getAggregations() {
        return aggregations;
    }


    /**
     * Sets the aggregations value for this UpdateViewHtml.
     * 
     * @param aggregations
     */
    public void setAggregations(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlAggregations aggregations) {
        this.aggregations = aggregations;
    }


    /**
     * Gets the formats value for this UpdateViewHtml.
     * 
     * @return formats
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlFormats getFormats() {
        return formats;
    }


    /**
     * Sets the formats value for this UpdateViewHtml.
     * 
     * @param formats
     */
    public void setFormats(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlFormats formats) {
        this.formats = formats;
    }


    /**
     * Gets the rowLimit value for this UpdateViewHtml.
     * 
     * @return rowLimit
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlRowLimit getRowLimit() {
        return rowLimit;
    }


    /**
     * Sets the rowLimit value for this UpdateViewHtml.
     * 
     * @param rowLimit
     */
    public void setRowLimit(com.microsoft.schemas.sharepoint.soap.UpdateViewHtmlRowLimit rowLimit) {
        this.rowLimit = rowLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateViewHtml)) return false;
        UpdateViewHtml other = (UpdateViewHtml) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listName==null && other.getListName()==null) || 
             (this.listName!=null &&
              this.listName.equals(other.getListName()))) &&
            ((this.viewName==null && other.getViewName()==null) || 
             (this.viewName!=null &&
              this.viewName.equals(other.getViewName()))) &&
            ((this.viewProperties==null && other.getViewProperties()==null) || 
             (this.viewProperties!=null &&
              this.viewProperties.equals(other.getViewProperties()))) &&
            ((this.toolbar==null && other.getToolbar()==null) || 
             (this.toolbar!=null &&
              this.toolbar.equals(other.getToolbar()))) &&
            ((this.viewHeader==null && other.getViewHeader()==null) || 
             (this.viewHeader!=null &&
              this.viewHeader.equals(other.getViewHeader()))) &&
            ((this.viewBody==null && other.getViewBody()==null) || 
             (this.viewBody!=null &&
              this.viewBody.equals(other.getViewBody()))) &&
            ((this.viewFooter==null && other.getViewFooter()==null) || 
             (this.viewFooter!=null &&
              this.viewFooter.equals(other.getViewFooter()))) &&
            ((this.viewEmpty==null && other.getViewEmpty()==null) || 
             (this.viewEmpty!=null &&
              this.viewEmpty.equals(other.getViewEmpty()))) &&
            ((this.rowLimitExceeded==null && other.getRowLimitExceeded()==null) || 
             (this.rowLimitExceeded!=null &&
              this.rowLimitExceeded.equals(other.getRowLimitExceeded()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.viewFields==null && other.getViewFields()==null) || 
             (this.viewFields!=null &&
              this.viewFields.equals(other.getViewFields()))) &&
            ((this.aggregations==null && other.getAggregations()==null) || 
             (this.aggregations!=null &&
              this.aggregations.equals(other.getAggregations()))) &&
            ((this.formats==null && other.getFormats()==null) || 
             (this.formats!=null &&
              this.formats.equals(other.getFormats()))) &&
            ((this.rowLimit==null && other.getRowLimit()==null) || 
             (this.rowLimit!=null &&
              this.rowLimit.equals(other.getRowLimit())));
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
        if (getListName() != null) {
            _hashCode += getListName().hashCode();
        }
        if (getViewName() != null) {
            _hashCode += getViewName().hashCode();
        }
        if (getViewProperties() != null) {
            _hashCode += getViewProperties().hashCode();
        }
        if (getToolbar() != null) {
            _hashCode += getToolbar().hashCode();
        }
        if (getViewHeader() != null) {
            _hashCode += getViewHeader().hashCode();
        }
        if (getViewBody() != null) {
            _hashCode += getViewBody().hashCode();
        }
        if (getViewFooter() != null) {
            _hashCode += getViewFooter().hashCode();
        }
        if (getViewEmpty() != null) {
            _hashCode += getViewEmpty().hashCode();
        }
        if (getRowLimitExceeded() != null) {
            _hashCode += getRowLimitExceeded().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getViewFields() != null) {
            _hashCode += getViewFields().hashCode();
        }
        if (getAggregations() != null) {
            _hashCode += getAggregations().hashCode();
        }
        if (getFormats() != null) {
            _hashCode += getFormats().hashCode();
        }
        if (getRowLimit() != null) {
            _hashCode += getRowLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateViewHtml.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">UpdateViewHtml"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>viewProperties"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolbar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "toolbar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>toolbar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>viewHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewBody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>viewBody"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewFooter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewFooter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>viewFooter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewEmpty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewEmpty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>viewEmpty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowLimitExceeded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "rowLimitExceeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>rowLimitExceeded"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>query"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>viewFields"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "aggregations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>aggregations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "formats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>formats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "rowLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", ">>UpdateViewHtml>rowLimit"));
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
