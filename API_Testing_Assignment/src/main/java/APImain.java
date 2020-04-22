import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Scanner;

import com.sun.net.httpserver.HttpServer;

public class APImain {
	static connection connect=new connection();
	static chaching chaching =new chaching();
	static GetInfo info=new GetInfo();
	
	public static void main(String[] args) throws IOException {
	     try {
	    	 
	      //  connect.call_me();
	        //chaching.switch_to_json();

	    	 System.out.println("enter the country name : ");
	    	 Scanner sc= new Scanner(System.in); 
	    	 String country= sc.nextLine();
	    	 
	    	 
	    	 chaching.Read(country);
	    	 
	        } catch (Exception e) {
	         e.printStackTrace();
	       }
	     
	     HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
			server.createContext("/test", new MyHandler());
			server.setExecutor(null); 
			server.start();
	     }
	
	
	
}
