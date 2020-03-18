import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class APImain {
	static connection connect=new connection();
	static GetInfo info=new GetInfo();
	
	public static void main(String[] args) throws IOException {
	     try {
	        connect.call_me();
	        } catch (Exception e) {
	         e.printStackTrace();
	       }
	     
	     HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
			server.createContext("/test", new MyHandler());
			server.setExecutor(null); 
			server.start();
	     }
	
	
	
}
