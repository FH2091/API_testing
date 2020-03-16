import static org.junit.Assert.*;

import org.junit.Test;

public class CountryName {

GetInfo info=new GetInfo();
	@Test
	public void testNullName() {
		assertNotNull(" The countryName is not null ",info.CountryName());
	}
	@Test
	public void testSameCountry() {
		assertEquals("Egypt", info.CountryName());
		
	}
}
