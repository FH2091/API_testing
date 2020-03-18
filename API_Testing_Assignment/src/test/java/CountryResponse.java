import static org.junit.Assert.*;

import org.junit.Test;

public class CountryResponse {
Responses IntegrationTesting=new Responses();
GetInfo info=new GetInfo();
	@Test
	public void integration_test_all() {
		assertEquals(" Country's  Name is Egypt of Capital Cairo and the current population is 91290000",IntegrationTesting.Testing_all_output() );
		
	}
	@Test
	public void integration_name_Capital() {
		assertEquals(" Country's  Name is Egypt of Capital Cairo",IntegrationTesting.Testing_Country_Capital() );
		
	}
	@Test
	public void integration_name_population() {
		assertEquals(" Country's  Name is Egypt and the current population is 91290000",IntegrationTesting.Testing_Country_Population() );
		
	}
	@Test
	public void integration_Capital_population() {
		assertEquals("Capital of Cairo and the current population is 91290000",IntegrationTesting.Testing_Capital_Population() );
		
	}
	 @Test
	
    public void internet_connection() throws Exception {
				assertEquals("Egypt",IntegrationTesting.testconnect() );	
			}
	 @Test
    public void integrationtesting() throws Exception {
		assertEquals(true,info.CountryName_CapitalName() );	
	}
	
	
}
