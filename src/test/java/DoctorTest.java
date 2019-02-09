import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DoctorTest {
	
	
	Doctor doctorTest = new Doctor("1", "Test", true, "Practitioner");
	
	
	@Test
	public void empIDshouldReturnNum() {
		String answer = doctorTest.getEmpID();
		assertEquals(answer, "1"); 
	
		
	}
	@Test
	public void empNameshouldReturnName() {
		String answer = doctorTest.getEmpName();
		assertEquals(answer, "Test"); 
	
		
	}
	@Test
	public void AvailableShouldReturnFalse() {
		doctorTest.busy();
		boolean answer = doctorTest.getIsAvailable();
		assertEquals(answer, false); 
		
	}
	
	@Test
	public void docSpecialtyShouldReturnPractioner() {
		String answer = doctorTest.getSpecialty();
		assertEquals(answer, "Practitioner"); 
		
	}
	
	@Test
	public void bloodLevelShouldReturn15() {
		doctorTest.bloodIsDrawn();
		int answer = doctorTest.getBloodLevel();
		assertEquals(answer, 15); 
		
	}
	
	@Test
	public void HealthLevelShouldReturn20() {
		doctorTest.receivesCare();
		int answer = doctorTest.getHealthLevel();
		assertEquals(answer, 20); 
		
	}
	
	
	
}
