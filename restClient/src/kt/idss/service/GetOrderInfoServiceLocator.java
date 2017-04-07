/**
 * GetOrderInfoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kt.idss.service;

public class GetOrderInfoServiceLocator extends org.apache.axis.client.Service implements kt.idss.service.GetOrderInfoService {

    public GetOrderInfoServiceLocator() {
    }


    public GetOrderInfoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetOrderInfoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetOrderInfoServicePort
    private java.lang.String GetOrderInfoServicePort_address = "http://192.168.10.4:8700/idssws/services/GetOrderInfo";

    public java.lang.String getGetOrderInfoServicePortAddress() {
        return GetOrderInfoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetOrderInfoServicePortWSDDServiceName = "GetOrderInfoServicePort";

    public java.lang.String getGetOrderInfoServicePortWSDDServiceName() {
        return GetOrderInfoServicePortWSDDServiceName;
    }

    public void setGetOrderInfoServicePortWSDDServiceName(java.lang.String name) {
        GetOrderInfoServicePortWSDDServiceName = name;
    }

    public kt.idss.service.GetOrderInfoServicePortType getGetOrderInfoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetOrderInfoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetOrderInfoServicePort(endpoint);
    }

    public kt.idss.service.GetOrderInfoServicePortType getGetOrderInfoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kt.idss.service.GetOrderInfoServiceSoapBindingStub _stub = new kt.idss.service.GetOrderInfoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetOrderInfoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetOrderInfoServicePortEndpointAddress(java.lang.String address) {
        GetOrderInfoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kt.idss.service.GetOrderInfoServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                kt.idss.service.GetOrderInfoServiceSoapBindingStub _stub = new kt.idss.service.GetOrderInfoServiceSoapBindingStub(new java.net.URL(GetOrderInfoServicePort_address), this);
                _stub.setPortName(getGetOrderInfoServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GetOrderInfoServicePort".equals(inputPortName)) {
            return getGetOrderInfoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.idss.kt", "GetOrderInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.idss.kt", "GetOrderInfoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetOrderInfoServicePort".equals(portName)) {
            setGetOrderInfoServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
