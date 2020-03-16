import static org.junit.Assert.*;

import org.junit.Test;

public class IntegrationTesting {
GetInfo info=new GetInfo();
	@Test
	public String Integration_for_output() {
		
			String CurrenciesInfo = " Country's Currencies Name is " + info.CountryName()+ " of Capital" + info.CapitalName() + " and the current population is "  +info.population();
			return CurrenciesInfo;
		}
	

}
