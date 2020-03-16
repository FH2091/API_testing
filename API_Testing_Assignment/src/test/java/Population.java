import static org.junit.Assert.*;

import org.junit.Test;

public class Population {
	GetInfo info=new GetInfo();
	@Test
	public void testfailPopulation() {
		assertFalse(info.population()<0);
	}
	public void testfailRange() {
		assertFalse(info.population()>1268301605);
	}
	public void testfailRange2() {
		assertTrue(800<info.population());
	}
	
	//public void CorrectRange() {
	//	assertThat(new Long(connect.population())).isBetween(800,1268301605 );
	//}
	
	public void testNotNull() {
		assertNotNull(info.population());
		
	}
	
}
