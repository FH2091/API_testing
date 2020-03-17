import static org.junit.Assert.*;

import org.junit.Test;

public class IntegrationTesting {
GetInfo info=new GetInfo();
connection connect=new connection();
	@Test
	public void Integration_for_output() {
		
			assertTrue(info.CapitalName().equalsIgnoreCase("Cairo"));
			assertTrue(info.CountryName().equalsIgnoreCase("Capital"));
			assertTrue(info.population().equals(91290000));
		}
	/*
	public void Connecting_and_returning() {
		
	    assertThat(connect.getresponse(), matches(info.CapitalName()));


	}
*/
}
