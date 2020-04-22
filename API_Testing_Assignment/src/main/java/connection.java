

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;
public class connection {
	
   static StringBuffer response = new StringBuffer();	
	public static String getname() {

	 System.out.println("enter the country name : ");
	 Scanner sc= new Scanner(System.in); 
	 String country= sc.nextLine();
	return country;
	 
	}
	 

	public static String Bind_Url() {
		String country=getname();
	   String f="https://restcountries.eu/rest/v2/name/";
	     String spec =f+country+ "?fields=name;capital;population";
		return spec;
	}
	
	
	
	public static String Read_From_API(HttpURLConnection con) throws IOException {
	 BufferedReader in = new BufferedReader(
		       new InputStreamReader(con.getInputStream()));
		     String inputLine;
		    
		     while ((inputLine = in.readLine()) != null) {
		     	response.append(inputLine);
		     }
		     
		     in.close();
			return inputLine;
	}
	
	public static void call_me(String country) throws Exception {
     String spec=Bind_Url();
     URL obj = new URL(spec);
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
  
     con.setRequestMethod("GET");
  
     con.setRequestProperty("User-Agent", "Mozilla/5.0");
     int responseCode = con.getResponseCode();
     System.out.println("\n Sending a request to API : " + spec);
     System.out.println("Response Code : " + responseCode);
     Read_From_API(con);
   
     }

public String getresponse() {
	 return response.toString();

   }


}