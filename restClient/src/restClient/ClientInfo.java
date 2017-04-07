package restClient;
 
public class ClientInfo 
{
	private String SYSTEM_ID ;
	private String SYSTEM_IP ;
	private String WORKER_ID ;
	private String CMD       ;
	private String REQ_URL   ;
	
	public String getREQ_URL() {
		return REQ_URL;
	}
	public void setREQ_URL(String req_url) {
		REQ_URL = req_url;
	}
	public String getCMD() {
		return CMD;
	}
	public void setCMD(String cmd) {
		CMD = cmd;
	}
	public String getSYSTEM_ID() {
		return SYSTEM_ID;
	}
	public void setSYSTEM_ID(String system_id) {
		SYSTEM_ID = system_id;
	}
	public String getSYSTEM_IP() {
		return SYSTEM_IP;
	}
	public void setSYSTEM_IP(String system_ip) {
		SYSTEM_IP = system_ip;
	}
	public String getWORKER_ID() {
		return WORKER_ID;
	}
	public void setWORKER_ID(String worker_id) {
		WORKER_ID = worker_id;
	}
}
