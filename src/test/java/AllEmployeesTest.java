import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
public class AllEmployeesTest {

	Employee doctorTest = new Doctor("1", "Test", true, "Practitioner");
	Employee testJ = new Janitor("2", "TestJ", true);
	AllEmployees testgroup = new AllEmployees();
	
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

	Employee x = testgroup.getEmployee("1");
		
		assertEquals(x.getEmpName(), "Test"); 
	}
	
	
	@Test
	public void shouldRemoveEmployeeFromMap() {
		testgroup.addEmployee(testJ);
		testgroup.addEmployee(doctorTest);
		testgroup.removeEmployee(doctorTest);

		int answer = testgroup.getAllEmployeesLength();
		
		
		assertEquals(answer, 1); 
	}
	
}
