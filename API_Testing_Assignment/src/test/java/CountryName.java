import static org.junit.Assert.*;

import org.junit.Test;

public class CountryName {
	IntegrationTesting IntegrationTesting=new IntegrationTesting();
GetInfo info=new GetInfo();
	@Test
	public void testNullName() {
		assertNotNull(" The countryName is not null ",info.CountryName());
	}
	@Test
	public void testSameCountry() {
		assertEquals("Egypt", info.CountryName());
		
	}
	@Test
	public void integration_test() {
		assertEquals(" Country's  Name is Egypt of Capital Cairo and the current population is 91290000",IntegrationTesting.Integration_for_output() );
		
	}
	@Test
	public void integration_test1() {
		assertEquals(" Country's  Name is Egypt of Capital Cairo",IntegrationTesting.Integration_for_output1() );
		
	}
	@Test
	public void integration_test2() {
		assertEquals(" Country's  Name is Egypt and the current population is 91290000",IntegrationTesting.Integration_for_output2() );
		
	}
	@Test
	public void integration_test3() {
		assertEquals("Capital of Cairo and the current population is 91290000",IntegrationTesting.Integration_for_output3() );
		
	}
	 @Test
	
    public void internet_connection() throws Exception {
				assertEquals("Egypt",IntegrationTesting.testconnect() );	
			}
	 @Test
    public void integrationtest4() throws Exception {
		assertEquals(true,info.integrationtest4() );	
	}
	
	
	
	
	
	
	
}
