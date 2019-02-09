import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {

	Nurse testN = new Nurse("1", "TestN", true);
	
	@Test
	public void empIDshouldReturnNum() {
		String answer = testN.getEmpID();
		assertEquals(answer, "1"); 
		
	}

	@Test
	public void empIDNameReturnName() {
		String answer = testN.getEmpName();
		assertEquals(answer, "TestN"); 
		
	}
	
	@Test
	public void AvailableShouldReturnFalse() {
		testN.busy();
		boolean answer = testN.getIsAvailable();
		assertEquals(answer, false); 
		
	}
	
	@Test
	public void bloodLevelShouldReturn15() {
		testN.bloodIsDrawn();
		int answer = testN.getBloodLevel();
		assertEquals(answer, 15); 
		
	}
	
	@Test
	public void HealthLevelShouldReturn20() {
		testN.receivesCare();
		int answer = testN.getHealthLevel();
		assertEquals(answer, 20); 
		
	}
}