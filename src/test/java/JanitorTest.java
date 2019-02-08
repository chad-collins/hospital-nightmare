
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {

	Janitor testJ = new Janitor(1, "TestJ", true);
	@Test
	public void empIDshouldReturnNum() {
		
		
		int answer = testJ.getEmpID();
		
		
		assertEquals(answer, 1); 
		
	}

	@Test
	public void empIDNameReturnName() {
		
		
		String answer = testJ.getEmpName();
		
		
		assertEquals(answer, "Test"); 
		
	}
	
	@Test
	public void AvailableShouldReturnTrue() {
		
		
		boolean answer = testJ.getIsAvailable();
		
		
		assertEquals(answer, true); 
		
	}
	
	
	
	@Test
	public void AvailableShouldReturnFalse() {
		
		testJ.busy();
		
		boolean answer = testJ.getIsAvailable();
		
		
		assertEquals(answer, false); 
		
	}
	


	
}






