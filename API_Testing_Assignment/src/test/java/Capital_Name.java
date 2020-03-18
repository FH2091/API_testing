import static org.junit.Assert.*;

import org.junit.Test;

public class Capital_Name {

GetInfo info=new GetInfo();
	@Test
	public void testNull() {
		assertNull("Capital Name is null ",info.CapitalName());
	}
	@Test
	public void testpass() {
		assertEquals("Capital Name is Cairo",info.CapitalName());
	}
	
	@Test
	public void testpass2() {
		assertEquals("Cairo",info.CapitalName());
	}
	
}
