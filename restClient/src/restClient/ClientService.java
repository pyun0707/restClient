package restClient;

public interface ClientService 
{
	public void execute(org.apache.axis.client.Service service, ClientInfo info, String data) throws Exception;
}
