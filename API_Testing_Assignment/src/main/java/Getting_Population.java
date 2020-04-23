import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Getting_Population {

	 static StringBuffer response = new StringBuffer();	
	   static connection connect=new connection();
	   static All_cached_data cache=new All_cached_data();

		public static String Bind_Url(String country) {
			
		   String f="https://restcountries.eu/rest/v2/name/";
		     String spec =f+country+ "?fields=population";
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
			     System.out.println("\n"+getresponse());
				return inputLine;
		}
		
		public static void call_me(String country) throws Exception {
	     String spec=Bind_Url(country);
	     URL obj = new URL(spec);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	  
	     con.setRequestMethod("GET");
	  
	     con.setRequestProperty("User-Agent", "Mozilla/5.0");
	     int responseCode = con.getResponseCode();
	     System.out.println("\n Sending a request to API : " + spec);
	     System.out.println("Response Code : " + responseCode);
	     Read_From_API(con);
	   
	     }

	public static String getresponse() {
		 return response.toString();

	   }
	
	public void Read(String Name) throws Exception {
	  boolean aExists=false;
    BufferedReader bufferedReader;

    bufferedReader = new BufferedReader(new FileReader("db.txt"));

    String line2;
    String line1;
    String line3;

 

        while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null) {

            if (line1.equalsIgnoreCase(Name) ) {

                aExists = true;

                break;
            }
        }
        

        if (aExists) {
        	//String info=line1+line2+line3;
        	//  org.json.JSONObject js=new org.json.JSONObject(info);
         //  System.out.println(js);
            System.out.println("{name:"+line1+",population:"+line3+"}");
            //System.out.println(line3);
            
        } else {
           connection.call_me(Name);
           String STR= Response();
           cache.switch_to_json(STR);
         
           System.out.println("After filtering the required info is : \n");
           call_me(Name);
        }
	 

	}
	
	public String Response() {
		 String Str=connect.getresponse();
  	     String jsonn=Str.substring(1, Str.length()-1);
  	     System.out.println(jsonn);
  	     return jsonn;
	 }
}
