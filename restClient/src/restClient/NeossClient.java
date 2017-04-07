package restClient;

import org.apache.axis.client.Service;

import kt.idss.service.GetOrderInfoServiceLocator;
import kt.idss.service.GetOrderInfoServiceSoapBindingStub;
import kt.idss.service.neoss.ws.vo.RepOrderInfo;
import kt.idss.service.neoss.ws.vo.ReqBasic;

public class NeossClient implements ClientService {
    
    private GetOrderInfoServiceLocator _locator;
    private GetOrderInfoServiceSoapBindingStub _binding;
    private String[] testData = null;
    int index = 0;


    @Override
    public void execute(Service service, ClientInfo info, String data) throws Exception {
        // TODO Auto-generated method stub
        System.out.println( "정상호출 : "+info.getREQ_URL());
        _locator = (GetOrderInfoServiceLocator) service;
        _locator.setGetOrderInfoServicePortEndpointAddress(info.getREQ_URL() + "/idssws/services/GetOrderInfo");
        _binding = (GetOrderInfoServiceSoapBindingStub) _locator.getGetOrderInfoServicePort();
        _binding.setTimeout(60000);
        
        
        getOrderInfo();
        
    }


    private void getOrderInfo() throws Exception {
        try{
            ReqBasic        reqBasic         =      new ReqBasic();
            RepOrderInfo    reqOrderInfo        =      null;
            
            reqBasic.setStrProdTypeCd       ("1");
            reqBasic.setStrScn              ("1");

            System.out.println("\n>>>>> ReqBasic");

            System.out.println("STRPRODTYPECD    : " + reqBasic.getStrProdTypeCd    ());
            System.out.println("STRSCN           : " + reqBasic.getStrScn           ());

            System.out.println( "리턴요구 전");
            reqOrderInfo = _binding.getOrderInfo(reqBasic);
            System.out.println( "리턴요구 후");
            if (reqOrderInfo != null){
                System.out.println("\n>>>>> ReqOrderInfo");
                System.out.println("STRRESLTCD          : " + reqOrderInfo.getStrResltCd    ());
                System.out.println("STRRESLTMSG         : " + reqOrderInfo.getStrResltMsg   ());
                System.out.println("STRPROGRORDYN       : " + reqOrderInfo.getStrProgrOrdYn    ());
                System.out.println("STRORDTRTDESC       : " + reqOrderInfo.getStrOrdTrtDesc    ());
                System.out.println("STRORDCHANGDESC     : " + reqOrderInfo.getStrOrdChangdesc           ());
                System.out.println("STRORDRCPDT         : " + reqOrderInfo.getStrOrdRcpDt       ());
                System.out.println("STRORDTRTSTATDESC   : " + reqOrderInfo.getStrOrdTrtStatDesc     ());
                System.out.println("STRCMPINANCDT       : " + reqOrderInfo.getStrCmpInAncDt         ());
            }
        } catch (Exception e) {
            System.out.println("에러내용 : " + e.getMessage());
            e.printStackTrace();
       }
    }
    private String nullValue(String arg)
        {
            String retnValue = "";

            if("XX".equals(arg))       retnValue = null;
            else if ("YY".equals(arg)) retnValue = "";
            else                       retnValue = arg;

            return retnValue;
        }
}
