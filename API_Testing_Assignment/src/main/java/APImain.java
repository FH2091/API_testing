import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class APImain {
	static GetInfo GetInfo=new GetInfo();
	static connection connect=new connection();
	static GetInfo info=new GetInfo();
	static IntegrationTesting s=new IntegrationTesting();
	public static void main(String[] args) throws Exception {
	    /* try {
	        connect.call_me();
	         info.CountryName(); 
	        info.CapitalName();    
	        info.population(); 
	        } catch (Exception e) {
	         e.printStackTrace();
	       }*/
	     //System.out.println(s.testconnect());
		
	     System.out.println(GetInfo.integrationtest4());
	     
	     
	     HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
			server.createContext("/test", new MyHandler());
			server.setExecutor(null); // creates a default executor
			server.start();
	     }
}
