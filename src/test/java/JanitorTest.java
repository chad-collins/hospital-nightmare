
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {

	Janitor testJ = new Janitor("1", "TestJ", true);
	@Test
	public void empIDshouldReturnNum() {
		String answer = testJ.getEmpID();
		assertEquals(answer, "1"); 
		
	}

	@Test
	public void empIDNameReturnName() {
		String answer = testJ.getEmpName();
		assertEquals(answer, "TestJ"); 
		
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
	
	@Test
	public void bloodLevelShouldReturn15() {
		testJ.bloodIsDrawn();
		int answer = testJ.getBloodLevel();
		assertEquals(answer, 15); 
		
	}
	
	@Test
	public void HealthLevelShouldReturn20() {
		testJ.receivesCare();
		int answer = testJ.getHealthLevel();
		assertEquals(answer, 20); 
		
	}
	


	
}






