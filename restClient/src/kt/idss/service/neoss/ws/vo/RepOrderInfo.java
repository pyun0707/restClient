/**
 * RepOrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kt.idss.service.neoss.ws.vo;

public class RepOrderInfo  implements java.io.Serializable {
    private java.lang.String strCmpInAncDt;

    private java.lang.String strOrdChangdesc;

    private java.lang.String strOrdRcpDt;

    private java.lang.String strOrdTrtDesc;

    private java.lang.String strOrdTrtStatDesc;

    private java.lang.String strProgrOrdYn;

    private java.lang.String strResltCd;

    private java.lang.String strResltMsg;

    public RepOrderInfo() {
    }

    public RepOrderInfo(
           java.lang.String strCmpInAncDt,
           java.lang.String strOrdChangdesc,
           java.lang.String strOrdRcpDt,
           java.lang.String strOrdTrtDesc,
           java.lang.String strOrdTrtStatDesc,
           java.lang.String strProgrOrdYn,
           java.lang.String strResltCd,
           java.lang.String strResltMsg) {
           this.strCmpInAncDt = strCmpInAncDt;
           this.strOrdChangdesc = strOrdChangdesc;
           this.strOrdRcpDt = strOrdRcpDt;
           this.strOrdTrtDesc = strOrdTrtDesc;
           this.strOrdTrtStatDesc = strOrdTrtStatDesc;
           this.strProgrOrdYn = strProgrOrdYn;
           this.strResltCd = strResltCd;
           this.strResltMsg = strResltMsg;
    }


    /**
     * Gets the strCmpInAncDt value for this RepOrderInfo.
     * 
     * @return strCmpInAncDt
     */
    public java.lang.String getStrCmpInAncDt() {
        return strCmpInAncDt;
    }


    /**
     * Sets the strCmpInAncDt value for this RepOrderInfo.
     * 
     * @param strCmpInAncDt
     */
    public void setStrCmpInAncDt(java.lang.String strCmpInAncDt) {
        this.strCmpInAncDt = strCmpInAncDt;
    }


    /**
     * Gets the strOrdChangdesc value for this RepOrderInfo.
     * 
     * @return strOrdChangdesc
     */
    public java.lang.String getStrOrdChangdesc() {
        return strOrdChangdesc;
    }


    /**
     * Sets the strOrdChangdesc value for this RepOrderInfo.
     * 
     * @param strOrdChangdesc
     */
    public void setStrOrdChangdesc(java.lang.String strOrdChangdesc) {
        this.strOrdChangdesc = strOrdChangdesc;
    }


    /**
     * Gets the strOrdRcpDt value for this RepOrderInfo.
     * 
     * @return strOrdRcpDt
     */
    public java.lang.String getStrOrdRcpDt() {
        return strOrdRcpDt;
    }


    /**
     * Sets the strOrdRcpDt value for this RepOrderInfo.
     * 
     * @param strOrdRcpDt
     */
    public void setStrOrdRcpDt(java.lang.String strOrdRcpDt) {
        this.strOrdRcpDt = strOrdRcpDt;
    }


    /**
     * Gets the strOrdTrtDesc value for this RepOrderInfo.
     * 
     * @return strOrdTrtDesc
     */
    public java.lang.String getStrOrdTrtDesc() {
        return strOrdTrtDesc;
    }


    /**
     * Sets the strOrdTrtDesc value for this RepOrderInfo.
     * 
     * @param strOrdTrtDesc
     */
    public void setStrOrdTrtDesc(java.lang.String strOrdTrtDesc) {
        this.strOrdTrtDesc = strOrdTrtDesc;
    }


    /**
     * Gets the strOrdTrtStatDesc value for this RepOrderInfo.
     * 
     * @return strOrdTrtStatDesc
     */
    public java.lang.String getStrOrdTrtStatDesc() {
        return strOrdTrtStatDesc;
    }


    /**
     * Sets the strOrdTrtStatDesc value for this RepOrderInfo.
     * 
     * @param strOrdTrtStatDesc
     */
    public void setStrOrdTrtStatDesc(java.lang.String strOrdTrtStatDesc) {
        this.strOrdTrtStatDesc = strOrdTrtStatDesc;
    }


    /**
     * Gets the strProgrOrdYn value for this RepOrderInfo.
     * 
     * @return strProgrOrdYn
     */
    public java.lang.String getStrProgrOrdYn() {
        return strProgrOrdYn;
    }


    /**
     * Sets the strProgrOrdYn value for this RepOrderInfo.
     * 
     * @param strProgrOrdYn
     */
    public void setStrProgrOrdYn(java.lang.String strProgrOrdYn) {
        this.strProgrOrdYn = strProgrOrdYn;
    }


    /**
     * Gets the strResltCd value for this RepOrderInfo.
     * 
     * @return strResltCd
     */
    public java.lang.String getStrResltCd() {
        return strResltCd;
    }


    /**
     * Sets the strResltCd value for this RepOrderInfo.
     * 
     * @param strResltCd
     */
    public void setStrResltCd(java.lang.String strResltCd) {
        this.strResltCd = strResltCd;
    }


    /**
     * Gets the strResltMsg value for this RepOrderInfo.
     * 
     * @return strResltMsg
     */
    public java.lang.String getStrResltMsg() {
        return strResltMsg;
    }


    /**
     * Sets the strResltMsg value for this RepOrderInfo.
     * 
     * @param strResltMsg
     */
    public void setStrResltMsg(java.lang.String strResltMsg) {
        this.strResltMsg = strResltMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RepOrderInfo)) return false;
        RepOrderInfo other = (RepOrderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCmpInAncDt==null && other.getStrCmpInAncDt()==null) || 
             (this.strCmpInAncDt!=null &&
              this.strCmpInAncDt.equals(other.getStrCmpInAncDt()))) &&
            ((this.strOrdChangdesc==null && other.getStrOrdChangdesc()==null) || 
             (this.strOrdChangdesc!=null &&
              this.strOrdChangdesc.equals(other.getStrOrdChangdesc()))) &&
            ((this.strOrdRcpDt==null && other.getStrOrdRcpDt()==null) || 
             (this.strOrdRcpDt!=null &&
              this.strOrdRcpDt.equals(other.getStrOrdRcpDt()))) &&
            ((this.strOrdTrtDesc==null && other.getStrOrdTrtDesc()==null) || 
             (this.strOrdTrtDesc!=null &&
              this.strOrdTrtDesc.equals(other.getStrOrdTrtDesc()))) &&
            ((this.strOrdTrtStatDesc==null && other.getStrOrdTrtStatDesc()==null) || 
             (this.strOrdTrtStatDesc!=null &&
              this.strOrdTrtStatDesc.equals(other.getStrOrdTrtStatDesc()))) &&
            ((this.strProgrOrdYn==null && other.getStrProgrOrdYn()==null) || 
             (this.strProgrOrdYn!=null &&
              this.strProgrOrdYn.equals(other.getStrProgrOrdYn()))) &&
            ((this.strResltCd==null && other.getStrResltCd()==null) || 
             (this.strResltCd!=null &&
              this.strResltCd.equals(other.getStrResltCd()))) &&
            ((this.strResltMsg==null && other.getStrResltMsg()==null) || 
             (this.strResltMsg!=null &&
              this.strResltMsg.equals(other.getStrResltMsg())));
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
        if (getStrCmpInAncDt() != null) {
            _hashCode += getStrCmpInAncDt().hashCode();
        }
        if (getStrOrdChangdesc() != null) {
            _hashCode += getStrOrdChangdesc().hashCode();
        }
        if (getStrOrdRcpDt() != null) {
            _hashCode += getStrOrdRcpDt().hashCode();
        }
        if (getStrOrdTrtDesc() != null) {
            _hashCode += getStrOrdTrtDesc().hashCode();
        }
        if (getStrOrdTrtStatDesc() != null) {
            _hashCode += getStrOrdTrtStatDesc().hashCode();
        }
        if (getStrProgrOrdYn() != null) {
            _hashCode += getStrProgrOrdYn().hashCode();
        }
        if (getStrResltCd() != null) {
            _hashCode += getStrResltCd().hashCode();
        }
        if (getStrResltMsg() != null) {
            _hashCode += getStrResltMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RepOrderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "RepOrderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCmpInAncDt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strCmpInAncDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOrdChangdesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strOrdChangdesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOrdRcpDt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strOrdRcpDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOrdTrtDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strOrdTrtDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOrdTrtStatDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strOrdTrtStatDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strProgrOrdYn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strProgrOrdYn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strResltCd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strResltCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strResltMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.ws.neoss.service.idss.kt", "strResltMsg"));
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
