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
//	@Test
//	public void AvailableShouldReturnFalse() {
//		doctorTest.busy();
//		boolean answer = doctorTest.getIsAvailable();
//		assertEquals(answer, false); 
//		
//	}
	
	@Test
	public void docSpecialtyShouldReturnPractioner() {
		String answer = doctorTest.getSpecialty();
		assertEquals(answer, "Practitioner"); 
		
	}
	
	@Test
	public void bloodLevelShouldReturn30() {
		doctorTest.isBitten();
		int answer = doctorTest.getBloodLevel();
		assertEquals(answer, 30); 
		
	}
	
	
	@Test
	public void BusyStatusShouldReturnSout() {
		doctorTest.busyStatus();
		doctorTest.busy();
		doctorTest.busyStatus();
		
	}
	
	
	
}
