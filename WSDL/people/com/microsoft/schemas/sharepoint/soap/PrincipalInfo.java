/**
 * PrincipalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class PrincipalInfo  implements java.io.Serializable {
    private java.lang.String accountName;

    private int userInfoID;

    private java.lang.String displayName;

    private java.lang.String email;

    private java.lang.String department;

    private java.lang.String title;

    private boolean isResolved;

    private com.microsoft.schemas.sharepoint.soap.PrincipalInfo[] moreMatches;

    private java.lang.String[] principalType;

    public PrincipalInfo() {
    }

    public PrincipalInfo(
           java.lang.String accountName,
           int userInfoID,
           java.lang.String displayName,
           java.lang.String email,
           java.lang.String department,
           java.lang.String title,
           boolean isResolved,
           com.microsoft.schemas.sharepoint.soap.PrincipalInfo[] moreMatches,
           java.lang.String[] principalType) {
           this.accountName = accountName;
           this.userInfoID = userInfoID;
           this.displayName = displayName;
           this.email = email;
           this.department = department;
           this.title = title;
           this.isResolved = isResolved;
           this.moreMatches = moreMatches;
           this.principalType = principalType;
    }


    /**
     * Gets the accountName value for this PrincipalInfo.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this PrincipalInfo.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the userInfoID value for this PrincipalInfo.
     * 
     * @return userInfoID
     */
    public int getUserInfoID() {
        return userInfoID;
    }


    /**
     * Sets the userInfoID value for this PrincipalInfo.
     * 
     * @param userInfoID
     */
    public void setUserInfoID(int userInfoID) {
        this.userInfoID = userInfoID;
    }


    /**
     * Gets the displayName value for this PrincipalInfo.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this PrincipalInfo.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the email value for this PrincipalInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PrincipalInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the department value for this PrincipalInfo.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PrincipalInfo.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the title value for this PrincipalInfo.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PrincipalInfo.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the isResolved value for this PrincipalInfo.
     * 
     * @return isResolved
     */
    public boolean isIsResolved() {
        return isResolved;
    }


    /**
     * Sets the isResolved value for this PrincipalInfo.
     * 
     * @param isResolved
     */
    public void setIsResolved(boolean isResolved) {
        this.isResolved = isResolved;
    }


    /**
     * Gets the moreMatches value for this PrincipalInfo.
     * 
     * @return moreMatches
     */
    public com.microsoft.schemas.sharepoint.soap.PrincipalInfo[] getMoreMatches() {
        return moreMatches;
    }


    /**
     * Sets the moreMatches value for this PrincipalInfo.
     * 
     * @param moreMatches
     */
    public void setMoreMatches(com.microsoft.schemas.sharepoint.soap.PrincipalInfo[] moreMatches) {
        this.moreMatches = moreMatches;
    }


    /**
     * Gets the principalType value for this PrincipalInfo.
     * 
     * @return principalType
     */
    public java.lang.String[] getPrincipalType() {
        return principalType;
    }


    /**
     * Sets the principalType value for this PrincipalInfo.
     * 
     * @param principalType
     */
    public void setPrincipalType(java.lang.String[] principalType) {
        this.principalType = principalType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrincipalInfo)) return false;
        PrincipalInfo other = (PrincipalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            this.userInfoID == other.getUserInfoID() &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            this.isResolved == other.isIsResolved() &&
            ((this.moreMatches==null && other.getMoreMatches()==null) || 
             (this.moreMatches!=null &&
              java.util.Arrays.equals(this.moreMatches, other.getMoreMatches()))) &&
            ((this.principalType==null && other.getPrincipalType()==null) || 
             (this.principalType!=null &&
              java.util.Arrays.equals(this.principalType, other.getPrincipalType())));
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
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        _hashCode += getUserInfoID();
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        _hashCode += (isIsResolved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMoreMatches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMoreMatches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMoreMatches(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrincipalType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrincipalType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrincipalType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrincipalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "PrincipalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UserInfoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isResolved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "IsResolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreMatches");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "MoreMatches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "PrincipalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "PrincipalInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "PrincipalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "SPPrincipalType"));
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
