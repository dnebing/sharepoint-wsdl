/**
 * DSQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.dsp;

public class DSQuery  implements java.io.Serializable {
    private com.microsoft.schemas.sharepoint.dsp.DspQuery query;

    private java.lang.String select;  // attribute

    private com.microsoft.schemas.sharepoint.dsp.ResultContentType resultContent;  // attribute

    private com.microsoft.schemas.sharepoint.dsp.ColumnMappingType columnMapping;  // attribute

    private java.lang.String resultNamespace;  // attribute

    private java.lang.String resultPrefix;  // attribute

    private java.lang.String resultRoot;  // attribute

    private java.lang.String resultRow;  // attribute

    private java.lang.String startPosition;  // attribute

    private java.lang.String comparisonLocale;  // attribute

    public DSQuery() {
    }

    public DSQuery(
           com.microsoft.schemas.sharepoint.dsp.DspQuery query,
           java.lang.String select,
           com.microsoft.schemas.sharepoint.dsp.ResultContentType resultContent,
           com.microsoft.schemas.sharepoint.dsp.ColumnMappingType columnMapping,
           java.lang.String resultNamespace,
           java.lang.String resultPrefix,
           java.lang.String resultRoot,
           java.lang.String resultRow,
           java.lang.String startPosition,
           java.lang.String comparisonLocale) {
           this.query = query;
           this.select = select;
           this.resultContent = resultContent;
           this.columnMapping = columnMapping;
           this.resultNamespace = resultNamespace;
           this.resultPrefix = resultPrefix;
           this.resultRoot = resultRoot;
           this.resultRow = resultRow;
           this.startPosition = startPosition;
           this.comparisonLocale = comparisonLocale;
    }


    /**
     * Gets the query value for this DSQuery.
     * 
     * @return query
     */
    public com.microsoft.schemas.sharepoint.dsp.DspQuery getQuery() {
        return query;
    }


    /**
     * Sets the query value for this DSQuery.
     * 
     * @param query
     */
    public void setQuery(com.microsoft.schemas.sharepoint.dsp.DspQuery query) {
        this.query = query;
    }


    /**
     * Gets the select value for this DSQuery.
     * 
     * @return select
     */
    public java.lang.String getSelect() {
        return select;
    }


    /**
     * Sets the select value for this DSQuery.
     * 
     * @param select
     */
    public void setSelect(java.lang.String select) {
        this.select = select;
    }


    /**
     * Gets the resultContent value for this DSQuery.
     * 
     * @return resultContent
     */
    public com.microsoft.schemas.sharepoint.dsp.ResultContentType getResultContent() {
        return resultContent;
    }


    /**
     * Sets the resultContent value for this DSQuery.
     * 
     * @param resultContent
     */
    public void setResultContent(com.microsoft.schemas.sharepoint.dsp.ResultContentType resultContent) {
        this.resultContent = resultContent;
    }


    /**
     * Gets the columnMapping value for this DSQuery.
     * 
     * @return columnMapping
     */
    public com.microsoft.schemas.sharepoint.dsp.ColumnMappingType getColumnMapping() {
        return columnMapping;
    }


    /**
     * Sets the columnMapping value for this DSQuery.
     * 
     * @param columnMapping
     */
    public void setColumnMapping(com.microsoft.schemas.sharepoint.dsp.ColumnMappingType columnMapping) {
        this.columnMapping = columnMapping;
    }


    /**
     * Gets the resultNamespace value for this DSQuery.
     * 
     * @return resultNamespace
     */
    public java.lang.String getResultNamespace() {
        return resultNamespace;
    }


    /**
     * Sets the resultNamespace value for this DSQuery.
     * 
     * @param resultNamespace
     */
    public void setResultNamespace(java.lang.String resultNamespace) {
        this.resultNamespace = resultNamespace;
    }


    /**
     * Gets the resultPrefix value for this DSQuery.
     * 
     * @return resultPrefix
     */
    public java.lang.String getResultPrefix() {
        return resultPrefix;
    }


    /**
     * Sets the resultPrefix value for this DSQuery.
     * 
     * @param resultPrefix
     */
    public void setResultPrefix(java.lang.String resultPrefix) {
        this.resultPrefix = resultPrefix;
    }


    /**
     * Gets the resultRoot value for this DSQuery.
     * 
     * @return resultRoot
     */
    public java.lang.String getResultRoot() {
        return resultRoot;
    }


    /**
     * Sets the resultRoot value for this DSQuery.
     * 
     * @param resultRoot
     */
    public void setResultRoot(java.lang.String resultRoot) {
        this.resultRoot = resultRoot;
    }


    /**
     * Gets the resultRow value for this DSQuery.
     * 
     * @return resultRow
     */
    public java.lang.String getResultRow() {
        return resultRow;
    }


    /**
     * Sets the resultRow value for this DSQuery.
     * 
     * @param resultRow
     */
    public void setResultRow(java.lang.String resultRow) {
        this.resultRow = resultRow;
    }


    /**
     * Gets the startPosition value for this DSQuery.
     * 
     * @return startPosition
     */
    public java.lang.String getStartPosition() {
        return startPosition;
    }


    /**
     * Sets the startPosition value for this DSQuery.
     * 
     * @param startPosition
     */
    public void setStartPosition(java.lang.String startPosition) {
        this.startPosition = startPosition;
    }


    /**
     * Gets the comparisonLocale value for this DSQuery.
     * 
     * @return comparisonLocale
     */
    public java.lang.String getComparisonLocale() {
        return comparisonLocale;
    }


    /**
     * Sets the comparisonLocale value for this DSQuery.
     * 
     * @param comparisonLocale
     */
    public void setComparisonLocale(java.lang.String comparisonLocale) {
        this.comparisonLocale = comparisonLocale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DSQuery)) return false;
        DSQuery other = (DSQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.select==null && other.getSelect()==null) || 
             (this.select!=null &&
              this.select.equals(other.getSelect()))) &&
            ((this.resultContent==null && other.getResultContent()==null) || 
             (this.resultContent!=null &&
              this.resultContent.equals(other.getResultContent()))) &&
            ((this.columnMapping==null && other.getColumnMapping()==null) || 
             (this.columnMapping!=null &&
              this.columnMapping.equals(other.getColumnMapping()))) &&
            ((this.resultNamespace==null && other.getResultNamespace()==null) || 
             (this.resultNamespace!=null &&
              this.resultNamespace.equals(other.getResultNamespace()))) &&
            ((this.resultPrefix==null && other.getResultPrefix()==null) || 
             (this.resultPrefix!=null &&
              this.resultPrefix.equals(other.getResultPrefix()))) &&
            ((this.resultRoot==null && other.getResultRoot()==null) || 
             (this.resultRoot!=null &&
              this.resultRoot.equals(other.getResultRoot()))) &&
            ((this.resultRow==null && other.getResultRow()==null) || 
             (this.resultRow!=null &&
              this.resultRow.equals(other.getResultRow()))) &&
            ((this.startPosition==null && other.getStartPosition()==null) || 
             (this.startPosition!=null &&
              this.startPosition.equals(other.getStartPosition()))) &&
            ((this.comparisonLocale==null && other.getComparisonLocale()==null) || 
             (this.comparisonLocale!=null &&
              this.comparisonLocale.equals(other.getComparisonLocale())));
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getSelect() != null) {
            _hashCode += getSelect().hashCode();
        }
        if (getResultContent() != null) {
            _hashCode += getResultContent().hashCode();
        }
        if (getColumnMapping() != null) {
            _hashCode += getColumnMapping().hashCode();
        }
        if (getResultNamespace() != null) {
            _hashCode += getResultNamespace().hashCode();
        }
        if (getResultPrefix() != null) {
            _hashCode += getResultPrefix().hashCode();
        }
        if (getResultRoot() != null) {
            _hashCode += getResultRoot().hashCode();
        }
        if (getResultRow() != null) {
            _hashCode += getResultRow().hashCode();
        }
        if (getStartPosition() != null) {
            _hashCode += getStartPosition().hashCode();
        }
        if (getComparisonLocale() != null) {
            _hashCode += getComparisonLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DSQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "DSQuery"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("select");
        attrField.setXmlName(new javax.xml.namespace.QName("", "select"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resultContent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "resultContent"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "ResultContentType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("columnMapping");
        attrField.setXmlName(new javax.xml.namespace.QName("", "columnMapping"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "ColumnMappingType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resultNamespace");
        attrField.setXmlName(new javax.xml.namespace.QName("", "resultNamespace"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resultPrefix");
        attrField.setXmlName(new javax.xml.namespace.QName("", "resultPrefix"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resultRoot");
        attrField.setXmlName(new javax.xml.namespace.QName("", "resultRoot"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resultRow");
        attrField.setXmlName(new javax.xml.namespace.QName("", "resultRow"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startPosition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "startPosition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("comparisonLocale");
        attrField.setXmlName(new javax.xml.namespace.QName("", "comparisonLocale"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/dsp", "DspQuery"));
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
