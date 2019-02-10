
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientCollectionTest {

	PatientCollection testCollection = new PatientCollection();
	Patient test1 = new Patient("123", "Bob", "ICU");
	Patient test2 = new Patient("456", "Suzy", "Maternity");

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
	public void shouldRemovePatient() {
		testCollection.addPatient(test2);
		testCollection.addPatient(test1);
		System.out.println(test1.getHealthLevel());
		test1.isBitten();
		test1.isBitten();
		test1.isBitten();
		test1.isBitten();
		test1.isBitten();
		test1.isBitten();
		test1.isBitten();
		System.out.println(test1.getHealthLevel());
		testCollection.removeDeadPatients();
		int answer = testCollection.getCollectionLength();
		assertEquals(answer, 1);

	}
	

}
