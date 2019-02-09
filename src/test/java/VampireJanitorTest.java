
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VampireJanitorTest {

	Janitor testV = new Janitor("1", "TestV", true);

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

}
