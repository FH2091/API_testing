import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Scanner;

import com.sun.net.httpserver.HttpServer;

public class APImain {
	static connection connect=new connection();
	
	static GetInfo info=new GetInfo();
	
	static GettingCountryName countryName=new GettingCountryName();
	
	static Main_Menu menu=new Main_Menu();
	public static void main(String[] args) throws IOException {
	     try {
	    	 
	      //  connect.call_me();
	        //chaching.switch_to_json();

	    	String country=countryName.getname();
	   menu.Menu(country);
	    	 
	        } catch (Exception e) {
	         e.printStackTrace();
	       }
	     
	     HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
			server.createContext("/test", new MyHandler());
			server.setExecutor(null); 
			server.start();
	     }
	
	
	
}
