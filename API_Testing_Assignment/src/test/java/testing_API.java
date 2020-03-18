import static org.junit.Assert.*;

import org.junit.Test;

public class testing_API {
	Responses IntegrationTesting=new Responses();
	@Test

		    public void testingAPI() throws Exception {
						assertEquals("Egypt",IntegrationTesting.testconnect() );	
					}
	}


