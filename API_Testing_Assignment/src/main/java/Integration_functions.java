
public class Integration_functions {
	GetInfo GetInfo =new GetInfo();
	public boolean CountryName_CapitalName() {
		GetInfo.CountryName();
		GetInfo.CapitalName ();
		return true; 	
	}
	
	public boolean CountryName_population() {
		GetInfo.CountryName();
		GetInfo.population();
		return true; 	
	}
	
	public boolean Capital_population() {
		GetInfo.CapitalName ();
		GetInfo.population();
		return true; 	
	}
	
	
	
	public boolean country_Capital_population() {
		GetInfo.CountryName();
		GetInfo.CapitalName();
		GetInfo.population();
		return true; 	
	}
}
