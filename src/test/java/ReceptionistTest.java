
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {

	Receptionist testR = new Receptionist(1, "Test", true);
	
	@Test
	public void empIDshouldReturnNum() {
		int answer = testR.getEmpID();
		assertEquals(answer, 1); 
		
	}

	@Test
	public void empIDNameReturnName() {
		String answer = testR.getEmpName();
		assertEquals(answer, "Test"); 
		
	}
	
	@Test
	public void AvailableShouldReturnTrue() {
		boolean answer = testR.getIsAvailable();
		assertEquals(answer, true); 
		
	}
	
	@Test
	public void AvailableShouldReturnFalse() {
		testR.busy();
		boolean answer = testR.getIsAvailable();
		assertEquals(answer, false); 
		
	}
	
	@Test
	public void bloodLevelShouldReturn15() {
		testR.bloodIsDrawn();
		int answer = testR.getBloodLevel();
		assertEquals(answer, 15); 
		
	}
	
	@Test
	public void HealthLevelShouldReturn20() {
		testR.receivesCare();
		int answer = testR.getHealthLevel();
		assertEquals(answer, 20); 
		
	}
	


	
}






