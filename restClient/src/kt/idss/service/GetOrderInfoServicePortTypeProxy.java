package kt.idss.service;

public class GetOrderInfoServicePortTypeProxy implements kt.idss.service.GetOrderInfoServicePortType {
  private String _endpoint = null;
  private kt.idss.service.GetOrderInfoServicePortType getOrderInfoServicePortType = null;
  
  public GetOrderInfoServicePortTypeProxy() {
    _initGetOrderInfoServicePortTypeProxy();
  }
  
  public GetOrderInfoServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetOrderInfoServicePortTypeProxy();
  }
  
  private void _initGetOrderInfoServicePortTypeProxy() {
    try {
      getOrderInfoServicePortType = (new kt.idss.service.GetOrderInfoServiceLocator()).getGetOrderInfoServicePort();
      if (getOrderInfoServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getOrderInfoServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getOrderInfoServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getOrderInfoServicePortType != null)
      ((javax.xml.rpc.Stub)getOrderInfoServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public kt.idss.service.GetOrderInfoServicePortType getGetOrderInfoServicePortType() {
    if (getOrderInfoServicePortType == null)
      _initGetOrderInfoServicePortTypeProxy();
    return getOrderInfoServicePortType;
  }
  
  public kt.idss.service.neoss.ws.vo.RepOrderInfo getOrderInfo(kt.idss.service.neoss.ws.vo.ReqBasic arg0) throws java.rmi.RemoteException{
    if (getOrderInfoServicePortType == null)
      _initGetOrderInfoServicePortTypeProxy();
    return getOrderInfoServicePortType.getOrderInfo(arg0);
  }
  
  
}