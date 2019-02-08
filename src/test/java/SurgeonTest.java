	
	
	import static org.junit.Assert.assertEquals;

	import org.junit.Test;


	
	public class SurgeonTest {
	
		
		
		Surgeon testS = new Surgeon(1, "TestS", true, "Master Lobotomist");
		
		
		@Test
		public void empIDshouldReturnNum() {
			
			
			int answer = testS.getEmpID();
			
			
			assertEquals(answer, 1); 
		
			
		}
		@Test
		public void empNameshouldReturnName() {
			
			
			String answer = testS.getEmpName();
			
			
			assertEquals(answer, "TestS"); 
		
			
		}
		@Test
		public void AvailableShouldReturnFalse() {
			
			testS.busy();
			
			boolean answer = testS.getIsAvailable();
			
			
			assertEquals(answer, false); 
			
		}
		
		@Test
		public void docSpecialtyShouldReturnPractioner() {
			
			
			String answer = testS.getSpecialty();
			
			
			assertEquals(answer, "Master Lobotomist"); 
			
		}
		
		
		
	}



