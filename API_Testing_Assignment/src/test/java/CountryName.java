import static org.junit.Assert.*;

import org.junit.Test;

public class CountryName {

GetInfo info=new GetInfo();
	@Test
	public void testNullName() {
		assertNotNull(" The countryName is not null ",info.CountryName());
	}

	public void testSameCountry() {
		assertEquals("The Country Name is Egypt ", info.CountryName());
		
	}
}
