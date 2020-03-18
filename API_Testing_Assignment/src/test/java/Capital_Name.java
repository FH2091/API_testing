import static org.junit.Assert.*;

import org.junit.Test;

// import com.sun.tools.javac.util.Assert;


public class Capital_Name {

	
	GetInfo info=new GetInfo();
	@Test
	public void testNull() {
		assertNotNull("Capital Name is null ",info.CapitalName());
	}

	@Test
	public void testCorrectName() {
         assertEquals("Cairo",info.CapitalName());        
	}
	
	
	
	@Test
	public void testEndLetter() {
		assertTrue(info.CapitalName().endsWith("o"));
	}
	
	@Test
	
	public void TestStartLetter() {
		
	assertTrue(info.CapitalName().contains("a"));
	
	 }
	
}
