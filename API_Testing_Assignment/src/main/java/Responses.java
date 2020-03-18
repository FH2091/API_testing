import org.json.JSONObject;


public class Responses {

	
	


	GetInfo info=new GetInfo();
	static JSONObject myResponse = new JSONObject("{\"name\":\"Egypt\",\"t-opLevelDomain\":[\".eg\"],\"alpha2Code\":\"EG\",\"alpha3Code\":\"EGY\",\"callingCodes\":[\"20\"],\"capital\":\"Cairo\",\"altSpellings\":[\"EG\",\"Arab Republic of Egypt\"],\"region\":\"Africa\",\"subregion\":\"Northern Africa\",\"population\":91290000,\"latlng\":[27.0,30.0],\"demonym\":\"Egyptian\",\"area\":1002450.0,\"gini\":30.8,\"timezones\":[\"UTC+02:00\"],\"borders\":[\"ISR\",\"LBY\",\"SDN\"],\"nativeName\":\"Ù…ØµØ±â€Ž\",\"numericCode\":\"818\",\"currencies\":[{\"code\":\"EGP\",\"name\":\"Egyptian pound\",\"symbol\":\"Â£\"}],\"languages\":[{\"iso639_1\":\"ar\",\"iso639_2\":\"ara\",\"name\":\"Arabic\",\"nativeName\":\"Ø§Ù„Ø¹Ø±Ø¨ÙŠØ©\"}],\"translations\":{\"de\":\"Ã„gypten\",\"es\":\"Egipto\",\"fr\":\"Ã‰gypte\",\"ja\":\"ã‚¨ã‚¸ãƒ—ãƒˆ\",\"it\":\"Egitto\",\"br\":\"Egito\",\"pt\":\"Egipto\",\"nl\":\"Egypte\",\"hr\":\"Egipat\",\"fa\":\"Ù…ØµØ±\"},\"flag\":\"https://restcountries.eu/data/egy.svg/%22,/%22regionalBlocs/%22:[%7B/%22acronym/%22:/%22AU/%22,/%22name/%22:/%22African Union\",\"otherAcronyms\":[],\"otherNames\":[\"Ø§Ù„Ø§ØªØ­Ø§Ø¯ Ø§Ù„Ø£Ù�Ø±ÙŠÙ‚ÙŠ\",\"Union africaine\",\"UniÃ£o Africana\",\"UniÃ³n Africana\",\"Umoja wa Afrika\"]},{\"acronym\":\"AL\",\"name\":\"Arab League\",\"otherAcronyms\":[],\"otherNames\":[\"Ø¬Ø§Ù…Ø¹Ø© Ø§Ù„Ø¯ÙˆÙ„ Ø§Ù„Ø¹Ø±Ø¨ÙŠØ©\",\"JÄ�miÊ»at ad-Duwal al-Ê»ArabÄ«yah\",\"League of Arab States\"]}],\"cioc\":\"EGY\"}");


		public String Testing_all_output() {
			
				String CountryInfo = " Country's  Name is " + info.CountryName()+ " of Capital " + info.CapitalName() + " and the current population is "  +info.population();
				return CountryInfo;
			}
		public String Testing_Country_Capital() {
			
			String CountryInfo = " Country's  Name is " + info.CountryName()+ " of Capital " + info.CapitalName();
			return CountryInfo;
		}
		public String Testing_Country_Population() {
			
			String CountryInfo = " Country's  Name is " + info.CountryName()+" and the current population is "  +info.population();
			return CountryInfo;
		}
		public String Testing_Capital_Population() {
			
			String CapitalInfo = "Capital of " + info.CapitalName() + " and the current population is "  +info.population();
			return CapitalInfo;
		}
		
		public String testconnect () throws Exception
		
		{
			
			connection Connection=new connection();
			connection.call_me();
			String name =myResponse.getString("name");
			return name;
			
			
		}
	  /*public String Integration_for_output4() {
		Integration_for_output1();
		Integration_for_output2();
		Integration_for_output3();
			String CapitalInfo = "Capital of " + info.CapitalName() + " and the current population is "  +info.population();
			return CapitalInfo;
		}*/
		
	  
	  
	  
	  
	  



		
		/*public void GET_capital()
	    {
	    
			 System.out.println("capital of " +info.CapitalName());
	    }
		
		
		public void GET_population()
	    {
			
			 System.out.println(" and population of " +info.population());
					
	        
	    }
		public void Get_country_name()
	    {
	    	
			 System.out.println("the country name is " +info.CountryName());

	    }
		*/
		
		
		
	}

	

