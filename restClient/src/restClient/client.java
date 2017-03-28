package restClient;

import java.io.IOException;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import sun.net.www.http.HttpClient;

 
public class client {
    public static void main(String[] args) {
        try {
            
                Scanner sc = new Scanner(System.in);
                System.out.println(" 연동 방법을 입력하세요 :( 1:HTTP / 2:HTTPS) ");
                String type = sc.nextLine();
                if (type.equals("1")){
                     
                    System.out.println("=============http 연동을 시작합니다============");
                    HttpPost httpPost = new HttpPost("http://192.168.10.4:8700/idssws/services/rest/restTest");
                    @SuppressWarnings("deprecation")
                    DefaultHttpClient httpClient = new DefaultHttpClient();
                                    
                    System.out.println(" id를 입력하세요 ");
                    String id = sc.nextLine();
                    
                    RequestVo params = new RequestVo();
                    params.setId(id);
                    
                    com.google.gson.Gson gson = new com.google.gson.Gson();
                    StringEntity strEntity = new StringEntity(gson.toJson(params),
                            "UTF-8");
                    strEntity.setContentType("application/json");
                    httpPost.setEntity(strEntity);
                     
                    try { 
                        HttpResponse response = httpClient.execute(httpPost);
                       /* ResponseVo responseVo = new ResponseVo();
                        */
                        HttpEntity respEntity = response.getEntity();
                        if (respEntity != null) {
                            // EntityUtils to get the reponse content
                            System.out.println( "=============retrun=============");
                            String content = EntityUtils.toString(respEntity);
                            System.out.println(content);
                           
                        }else{
                            System.out.println("리턴 값이 없습니다");
                        }
                    } catch (ClientProtocolException e) { 
                        // writing exception to log 
                        e.printStackTrace(); 
                    } catch (IOException e) { 
                        // writing exception to log 
                        e.printStackTrace();
                    }
                }else if(type.equals("2")){
                    
                    CloseableHttpClient httpclient = null;
                    CloseableHttpResponse response = null;
                   
                    System.out.println("=============https 연동을 시작합니다============");
                    /*HttpPost httpsPost = new HttpPost("https://192.168.10.4:8750/idssws/services/rest/restTest");*/

                    String http_url = "https://192.168.10.4:8750/idssws/services/rest/test2";
                    System.out.println("Homecam Host URL : [" + http_url + "]");

                    SSLContext sslContext = SSLContexts.custom()
                            .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                            .build();
                    SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                            sslContext,
                            SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
                    
                    httpclient = HttpClients.custom().setSSLSocketFactory(sslsf)
                            .build();

                    HttpPost post = new HttpPost(http_url);
                    /*RequestConfig requestConfig = RequestConfig.custom()
                            .setSocketTimeout(1000).setConnectTimeout(1000)
                            .setConnectionRequestTimeout(1000).build();
                    post.setConfig(requestConfig);*/
                    // Json 데이타 셋팅
                    // 헤더셋팅 :
                    // https://hc.apache.org/httpcomponents-core-ga/httpcore/apidocs/constant-values.html
                    
                    System.out.println(" id를 입력하세요 ");
                    String id = sc.nextLine();
                    
                    RequestVo params = new RequestVo();
                    params.setId(id);
                    com.google.gson.Gson gson = new com.google.gson.Gson();
                    StringEntity strEntity = new StringEntity(gson.toJson(params),
                            "UTF-8");
                    strEntity.setContentType("application/json");
                    post.setEntity(strEntity);
                    post.setHeader(org.apache.http.HttpHeaders.ACCEPT,
                            "application/json");
                    post.setHeader(org.apache.http.HttpHeaders.CONTENT_TYPE,
                            "application/json; charset=utf-8");

                    System.out.println("Executing request : " + post.getRequestLine());
                    System.out.println("----------------------------------------");
                    System.out.println("-- REQUEST");
                    System.out.println(EntityUtils.toString(post.getEntity()));
                    
                    try {

                        response = httpclient.execute(post);
                        System.out.println("----------------------------------------");
                        System.out.println("-- RESPONSE");
                        System.out.println("----------------------------------------");
                        System.out.println(response.getStatusLine());
                        System.out.println("----------------------------------------");
                        
                        int responseCode = response.getStatusLine().getStatusCode();
                        String responseMsg = response.getStatusLine().getReasonPhrase();
                        String responseBody = EntityUtils
                                .toString(response.getEntity());

                        System.out.println("----------------------------------------");
                        System.out.println("-- responseBody :" + responseBody);
                        System.out.println("----------------------------------------");

                    }catch (Exception e) {
                        e.printStackTrace();
                        // TODO: handle exception
                    }
                }
               
               

        }catch (Exception e) {
            // TODO: handle exception
        }
    }
}