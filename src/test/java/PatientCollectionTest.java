
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientCollectionTest {

	PatientCollection testCollection = new PatientCollection();

	Patient test1 = new Patient("123", "Bob", "ICU");
	Patient test2 = new Patient("456", "Suzy", "Maternity");
	Patient test3 = new Patient("4564", "Suzy2", "Maternity");


	@Test
	public void shouldGetAPatient() {
		testCollection.addPatient(test2);
		testCollection.addPatient(test1);
		testCollection.getPatient(test1.getPatientID());
		assertEquals("123", test1.getPatientID());

	}

	@Test
	public void shouldAddPatient() {
		testCollection.addPatient(test1);
		testCollection.addPatient(test2);
		int answer = testCollection.getCollectionLength();
		assertEquals(answer, 2);

	}
	
	@Test
	public void shouldRemovePatientaaa() {
		testCollection.addPatient(test1);
		System.out.println(testCollection.getCollectionLength());
		testCollection.remove(test1.getPatientID());
		int answer = testCollection.getCollectionLength();
		assertEquals(answer, 0);

	}
	
	
	
	
	@Test
	public void shouldRemoveDeadPatient() {
		//add 2 patients to collection called sick
		PatientCollection sick = new PatientCollection();
		sick.addPatient(test1);
		sick.addPatient(test2);
		
		//check if test1 is dead. check test1 health level. check size of sick
		System.out.println(test1.getIsDead() + "before");
		System.out.println(test1.getHealthLevel() + "before bite blood");
		System.out.println(sick.getCollectionLength() + "before length");
		
		//bite to drain health
		test1.isBitten();
		test1.isBitten();
		
		//check levels after bite
		System.out.println(test1.getHealthLevel() + "after bite blood");
		System.out.println(test1.getIsDead() + "after");
		sick.remove(test1.getPatientID());
		System.out.println(sick.getCollectionLength() + "after length");
		int answer = sick.getCollectionLength();
		assertEquals(answer, 1);

	}
	

	

}
