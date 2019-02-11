
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {

	Receptionist testR = new Receptionist("1", "Test", true);
	
	@Test
	public void empIDshouldReturnNum() {
		String answer = testR.getEmpID();
		assertEquals(answer, "1"); 
		
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
	public void bloodLevelShouldReturn30() {
		testR.isBitten();
		int answer = testR.getBloodLevel();
		assertEquals(answer, 30); 
		
	}

	
	@Test
	public void BusyStatusShouldReturnSout() {
		testR.busyStatus();
		testR.busy();
		testR.busyStatus();
		
	}
	


	
}






