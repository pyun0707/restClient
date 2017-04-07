/**
 * ReqBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kt.idss.service.neoss.ws.vo;

public class ReqBasic  implements java.io.Serializable {
    private java.lang.String strProdTypeCd;

    private java.lang.String strScn;

    public ReqBasic() {
    }

    public ReqBasic(
           java.lang.String strProdTypeCd,
           java.lang.String strScn) {
           this.strProdTypeCd = strProdTypeCd;
           this.strScn = strScn;
    }


    /**
     * Gets the strProdTypeCd value for this ReqBasic.
     * 
     * @return strProdTypeCd
     */
    public java.lang.String getStrProdTypeCd() {
        return strProdTypeCd;
    }


    /**
     * Sets the strProdTypeCd value for this ReqBasic.
     * 
     * @param strProdTypeCd
     */
    public void setStrProdTypeCd(java.lang.String strProdTypeCd) {
        this.strProdTypeCd = strProdTypeCd;
    }


    /**
     * Gets the strScn value for this ReqBasic.
     * 
     * @return strScn
     */
    public java.lang.String getStrScn() {
        return strScn;
    }


    /**
     * Sets the strScn value for this ReqBasic.
     * 
     * @param strScn
     */
    public void setStrScn(java.lang.String strScn) {
        this.strScn = strScn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReqBasic)) return false;
        ReqBasic other = (ReqBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strProdTypeCd==null && other.getStrProdTypeCd()==null) || 
             (this.strProdTypeCd!=null &&
              this.strProdTypeCd.equals(other.getStrProdTypeCd()))) &&
            ((this.strScn==null && other.getStrScn()==null) || 
             (this.strScn!=null &&
              this.strScn.equals(other.getStrScn())));
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
        if (getStrProdTypeCd() != null) {
            _hashCode += getStrProdTypeCd().hashCode();
        }
        if (getStrScn() != null) {
            _hashCode += getStrScn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReqBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "ReqBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strProdTypeCd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strProdTypeCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strScn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strScn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
