

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;
public class connection {
	static StringBuffer response = new StringBuffer();
	
public static void call_me() throws Exception {

    
 System.out.println("enter the country name : ");
 	
 
 Scanner sc= new Scanner(System.in); 
 String country= sc.nextLine();
 
     String f="https://restcountries.eu/rest/v2/name/";
    String spec =f+country+ "?fields=name;capital;population";
     
     URL obj = new URL(spec);
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
  
     con.setRequestMethod("GET");
  
     con.setRequestProperty("User-Agent", "Mozilla/5.0");
     int responseCode = con.getResponseCode();
     System.out.println("\n Sending a request to API : " + spec);
     System.out.println("Response Code : " + responseCode);
     BufferedReader in = new BufferedReader(
             new InputStreamReader(con.getInputStream()));
     String inputLine;
     //StringBuffer response = new StringBuffer();
     while ((inputLine = in.readLine()) != null) {
     	response.append(inputLine);
     }
     in.close();
     
    // System.out.println(response.toString());
    	 
     
     }
  


   public String getresponse() {
	   	   
    return response.toString();
	 
  }


}