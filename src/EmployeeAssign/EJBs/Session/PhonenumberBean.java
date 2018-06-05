/**
 * PhonenumberBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package EmployeeAssign.EJBs.Session;

public class PhonenumberBean  implements java.io.Serializable {
    private java.lang.String number;

    private int phoneid;

    private java.lang.String phonetype;

    public PhonenumberBean() {
    }

    public PhonenumberBean(
           java.lang.String number,
           int phoneid,
           java.lang.String phonetype) {
           this.number = number;
           this.phoneid = phoneid;
           this.phonetype = phonetype;
    }


    /**
     * Gets the number value for this PhonenumberBean.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this PhonenumberBean.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the phoneid value for this PhonenumberBean.
     * 
     * @return phoneid
     */
    public int getPhoneid() {
        return phoneid;
    }


    /**
     * Sets the phoneid value for this PhonenumberBean.
     * 
     * @param phoneid
     */
    public void setPhoneid(int phoneid) {
        this.phoneid = phoneid;
    }


    /**
     * Gets the phonetype value for this PhonenumberBean.
     * 
     * @return phonetype
     */
    public java.lang.String getPhonetype() {
        return phonetype;
    }


    /**
     * Sets the phonetype value for this PhonenumberBean.
     * 
     * @param phonetype
     */
    public void setPhonetype(java.lang.String phonetype) {
        this.phonetype = phonetype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhonenumberBean)) return false;
        PhonenumberBean other = (PhonenumberBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            this.phoneid == other.getPhoneid() &&
            ((this.phonetype==null && other.getPhonetype()==null) || 
             (this.phonetype!=null &&
              this.phonetype.equals(other.getPhonetype())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        _hashCode += getPhoneid();
        if (getPhonetype() != null) {
            _hashCode += getPhonetype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhonenumberBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Session.EJBs.EmployeeAssign/", "phonenumberBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phonetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phonetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
