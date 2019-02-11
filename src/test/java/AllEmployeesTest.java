import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class AllEmployeesTest {

	AllEmployees testgroup = new AllEmployees();
	Employee doctorTest = new Doctor("1", "Test", true, "Practitioner");
	Employee testJ = new Janitor("2", "TestJ", true, 0);

	@Test
	public void shouldAddEmployeeToEmployees() {

		testgroup.addEmployee(doctorTest);
		testgroup.addEmployee(testJ);
		int answer = testgroup.getAllEmployeesLength();
		assertEquals(answer, 2);
	}

	@Test
	public void shouldGetEmployeeFromMap() {
		testgroup.addEmployee(doctorTest);
		testgroup.getAllEmployeesLength();
		assertEquals(doctorTest.getEmpName(), "Test");
	}

	@Test
	public void shouldRemoveEmployeeFromMap() {
		testgroup.addEmployee(testJ);
		testgroup.addEmployee(doctorTest);
		testgroup.remove(doctorTest.getEmpID());
		int answer = testgroup.getAllEmployeesLength();
		assertEquals(answer, 1);
	}

}
