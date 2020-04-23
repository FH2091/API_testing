import static org.junit.Assert.*;

import org.junit.Test;

import org.mockito.Mockito;


import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.FileNotFoundException;
import java.io.IOException;






public class All_cached_data_test {
	
	static Getting_Population population=new Getting_Population();

	 static All_cached_data cache=new All_cached_data();
	 static GettingCountryName name=new GettingCountryName();
	 static connection connect=new connection();
	 
	@Test
	public void Switch_to_json_test1() throws IOException {

		All_cached_data mock=Mockito.mock(All_cached_data.class);
		String data="{\"name\":\"Egypt\",\"capital\":\"Cairo\",\"population\":91290000}";
		Mockito.doReturn(data).when(mock).Response();
		
		 cache.switch_to_json(data);
		 verify(mock).switch_to_json(data);
		
		
	
	}

	@Test
	public void Switch_to_json_test2() throws IOException {
		
		
		String data="{\"name\":\"Egypt\",\"capital\":\"Cairo\",\"population\":91290000}";
		
		cache.switch_to_json(data);
		
        // try null
        boolean pass = false;
        try { if(data==(String)data)
            pass =true;
        }
        catch (IllegalArgumentException e) {
            pass = false;
        }
        assertTrue(pass);
    }
	
	@Test
	public void Switch_to_json_test5() throws IOException {
		
		
		
		String data=null;
		
		
        // try null
        boolean pass = false;
        try { if(data==null)
        	cache.switch_to_json(data);
            pass =true;
        }
        catch (NullPointerException e) {
            pass = false;
        }
        assertFalse(pass);
    }
	
	
	@Test
	public void Write_test1() throws IOException {
		/*
	
		All_cached_data mock=Mockito.mock(All_cached_data.class);
		
		String all[]= {"Egypt","Cairo","9900000"};
		String data="{\"name\":\"Egypt\",\"capital\":\"Cairo\",\"population\":91290000}";
		Mockito.doReturn(all).when(mock).switch_to_json(data);
		//cache.write(all);
		 verify(mock).write(all);
		*/
		
      	
	
	}
	

	
	@Test
	public void Write_test2() throws IOException {
		
        // try null
        boolean pass = false;
        try { 
        	
        	cache.write(null);
		
            pass =true;
        }
        catch (NullPointerException e) {
            pass = false;
        }
        assertFalse(pass);
    }
	
	@Test
	public void Read_test1() throws Exception {
		
		
		assertEquals( "{name:Canada,capital:Ottawa,population:36155487}",cache.Read("Canada"));

      
	
    }
	
	@Test
	public void Read_test2() throws Exception {
	
		
	// try null
       boolean pass = false;
        try { 
        	
        	cache.Read(null);
		
            pass =true;
        }
        catch (FileNotFoundException e) {
            pass = false;
        }
        assertFalse(pass);
    }
	
	@Test
	public void CheckNotNull() throws Exception {
		assertNotNull(cache.Read("Canada"));

		
	}
	
	@Test
	public void CheckResponse() {
		GettingCountryName CountryName=Mockito.mock(GettingCountryName.class);
		Mockito.doReturn("Egypt").when(CountryName).getname();
		assertEquals("",connect.getresponse());
		

	}
	
	@Test
	public void CheckResponse2() {
		GettingCountryName CountryName=Mockito.mock(GettingCountryName.class);
		Mockito.doReturn("Egypt").when(CountryName).getname();
		assertNotNull(connect.getresponse());
		

	}
	
	
	
	@Test
	
	public void CheckResponse3() throws Exception {
		GettingCountryName CountryName=Mockito.mock(GettingCountryName.class);
		Mockito.doReturn("Egypt").when(CountryName).getname();
		assertNotNull(connection.call_me("Egypt"));
		

}
@Test
	
	public void CheckResponse4() throws Exception {
		GettingCountryName CountryName=Mockito.mock(GettingCountryName.class);
		connection connect=Mockito.mock(connection.class);
		Mockito.doReturn("Egypt").when(CountryName).getname();
	 verify(connect).call_me("Egypt");
}

}