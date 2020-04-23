import java.util.Scanner;

public class Main_Menu {

	static All_cached_data cache=new All_cached_data();
	static GettingCountryName countryName=new GettingCountryName();
	static Getting_capital_Name capital=new Getting_capital_Name();
	static Getting_Population population=new Getting_Population();
	 public void display_menu() 
	    {
		System.out.println("1)Get all info \n2)Get capital name only \n3)Get population number only");
		System.out.print("Selection: ");
	    }
	    
	    public void question() throws Exception
	    {
		System.out.println("Would you like to proceed or quit?");
		System.out.println("To proceed enter 9.");
		System.out.println("If you wish to quit enter 0.");
		Scanner q = new Scanner(System.in);
	       
		switch (q.nextInt()) 
		{
		    case 0:
		    System.out.println ("Thank you and godbye.");
		    break;
	  
		    case 9:
		    System.out.println ("Please proceed.");
		    String country=countryName.getname();
		    Menu(country);
		    break;
		    
		    default:
		    System.err.println ( "Unrecognized option" );
		    break;
		}
	    }
	 
	    public void Menu(String Country) throws Exception 
	    {
		Scanner in = new Scanner(System.in);
	        display_menu();
	  
		switch (in.nextInt()) 
		{
		    case 1:
		    System.out.println ( "You picked option 1 \n" );
		    cache.Read(Country);
		    question();
		    break;
	  
		    case 2:
		    System.out.println ( "You picked option 2 \n" );
		    capital.Read(Country);
		    question();
		    break;
	  
		    case 3:
		    System.out.println ( "You picked option 3 \n " );
		    population.Read(Country);
		    question();
		    break;
		    
		    default:
		    System.err.println ( "Unrecognized option" );
		    break;
		}
	    }
	 
	    
	}
	
	

