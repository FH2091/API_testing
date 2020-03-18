import static org.junit.Assert.*;

import org.junit.Test;

public class Population {
	GetInfo info=new GetInfo();
	@Test
	public void testfailPopulation() {
		assertFalse(info.population()<0);
	}
	@Test
	public void testfailRange() {
		assertFalse(info.population()>1268301605);
	}
	@Test
	public void testfailRange2() {
		assertTrue(800<info.population());
	}
	
	@Test
	public void testValidRange() {
		
	assertTrue(info.population()<1268301605);
}
	
@Test
	
	public void testNotNull() {
		assertNotNull(info.population());
		
	}
	
	
}
