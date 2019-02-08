import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class PatientTest {

	Patient test = new Patient(1, "Sicky", "Psych Ward");
	
	@Test
	public void patientIDShouldReturnOne() {
		
		
		int answer = test.getPatientID();
		
		
		assertEquals(answer, 1); 
		
		
	}
	@Test
	public void patientNameShouldReturnSicky() {
		
		
		String answer = test.getPatientName();
		
		
		assertEquals(answer, "Sicky"); 
	
		
	}
	
	@Test
	public void patientWardShouldReturnPsychWard() {
		
		
		String answer = test.getWard();
		
		
		assertEquals(answer, "Psych Ward"); 
	
		
	}
}
