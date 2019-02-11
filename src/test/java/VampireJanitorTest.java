
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VampireJanitorTest {

	Janitor testV = new VampireJanitor("1", "TestV", true, 0);

	@Test
	public void empIDshouldReturnNum() {
		String answer = testV.getEmpID();
		assertEquals(answer, "1");

	}

	@Test
	public void empIDNameReturnName() {
		String answer = testV.getEmpName();
		assertEquals(answer, "TestV");

	}

	@Test
	public void AvailableShouldReturnTrue() {
		boolean answer = testV.getIsAvailable();
		assertEquals(answer, true);

	}

	@Test
	public void AvailableShouldReturnFalse() {
		testV.busy();
		boolean answer = testV.getIsAvailable();
		assertEquals(answer, false);

	}
	
	@Test
	public void BusyStatusShouldReturnSout() {
		testV.busyStatus();
		testV.busy();
		testV.busyStatus();
		
	}

}
