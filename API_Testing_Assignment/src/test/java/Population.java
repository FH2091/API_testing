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
	
	public void testfailRange3() {
		assertTrue(-1<info.population());
	}
	
	
	/*public void CorrectRange() {
		
		assertThat(new Long(connect.population())).isBetween(800,1268301605 );
	}*/
	
	
	
	
	/*public static <T> void assertThat(String reason,
            T 2000,
            Matcher<T> (800,12))68301605
	
	*/
	
	public void CorrectRange1() {
		assertTrue(800 <= 1000 && 1000 <= 1268301605);
			
		}
	
	
	
	
	
	public void CorrectRange2() {
		assertEquals(10000,1268301605,1.0);
	}
	
	public void testNotNull() {
		assertNotNull(info.population());
		
	}
	
}
