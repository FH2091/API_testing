import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.tools.javac.util.Assert;

public class Capital_Name {

GetInfo info=new GetInfo();
	@Test
	public void testNull() {
		assertNotNull("Capital Name is null ",info.CapitalName());
	}

	public void testpass() {
		assertEquals("Cairo",info.CapitalName());

	}
	//public void StartWith() {
		
	//	Assert.check(true, info.CapitalName().compareTo("Cairo"));
	//	
	// }
	
}
