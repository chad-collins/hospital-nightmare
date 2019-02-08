
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

	Employee test = new Employee(1, "Test", true);
	@Test
	public void empIDshouldReturnNum() {
		
		
		int answer = test.getEmpID();
		
		
		assertEquals(answer, 1); 
		
	}

	@Test
	public void empIDNameReturnName() {
		
		
		String answer = test.getEmpName();
		
		
		assertEquals(answer, "Test"); 
		
	}
	
	@Test
	public void AvailableShouldReturnTrue() {
		
		
		boolean answer = test.getIsAvailable();
		
		
		assertEquals(answer, true); 
		
	}
	
	
	
	@Test
	public void AvailableShouldReturnFalse() {
		
		test.availableToggle();
		
		boolean answer = test.getIsAvailable();
		
		
		assertEquals(answer, false); 
		
	}
	


	
}






