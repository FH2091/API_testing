
public class APImain {
	static connection connect=new connection();
	static GetInfo info=new GetInfo();
	
	public static void main(String[] args) {
	     try {
	        connect.call_me();
	         info.CountryName(); 
	        info.CapitalName();    
	        info.population(); 
	        } catch (Exception e) {
	         e.printStackTrace();
	       }
	     }
}
