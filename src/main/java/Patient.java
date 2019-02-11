import java.util.Random;

public class Patient implements HasVitals {

	private String patientID;
	private String patientName;
	private String ward;
	private int bloodLevel;
	private int healthLevel;
	private boolean isDead;

	public Patient(String patientID, String patientName, String ward) {

		this.patientID = patientID;
		this.patientName = patientName;
		this.ward = ward;
		this.bloodLevel = (BLOOD_LEVEL - randzeroToFifteen());
		this.healthLevel = HEALTH_LEVEL;
		this.isDead = isDead;
	}

	public int randzeroToFifteen() {
		Random randy = new Random();
		int randomTenTwenty = randy.nextInt(16);
		return randomTenTwenty;
	}

	public void patientSummary() {
		System.out.println(

				"[Room#:" + this.getPatientID() + "]\t[Name: " + this.getPatientName() + "]\t[Ward:" + this.getWard()
						+ "]\t[Health Rating" + this.getHealthLevel() + "]\t[Blood Level: " + this.getBloodLevel());

	}

	public String getPatientID() {
		return patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getWard() {
		return ward;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		if (this.bloodLevel <= 0) {
			this.healthLevel = 0;
		} else if (this.bloodLevel > 0 && this.bloodLevel <= 19) {
			this.healthLevel = 5;
		} else if (this.bloodLevel >= 20 && this.bloodLevel <= 29) {
			this.healthLevel = 10;
		} else if (this.bloodLevel >= 30 && this.bloodLevel <= 39) {
			this.healthLevel = 15;
		} else if (this.bloodLevel >= 40) {
			this.healthLevel = 20;
		}
		return healthLevel;
	}

	public void die() {
		if (this.healthLevel <= 0) {
			this.isDead = true;
		} else {
			this.isDead = false;
		}
	}

	public boolean getIsDead() {
		this.die();
		return isDead;
	}

	@Override
	public void isBitten() {
		this.bloodLevel -= 10;

	}

	public void treatPatient() {
		this.bloodLevel += 4;

	}

	public void receiveInfusion(int x) {
		this.bloodLevel += x;
		return;

	}

	public void hasSurgery() {
		this.bloodLevel = 60;
	}

	public void patientTick() {
		this.getHealthLevel();
		this.healthLevel -= 1;
		this.chanceIncounter();
		this.getHealthLevel();
	}

	public void chanceIncounter() {

		Random rand = new Random();
		int a = rand.nextInt(8);

		if (a == 2) {

			this.isBitten();
			System.out.println(this.getPatientName() + " has lost a lot of blood for some reason..");

		}

	}

	public void medicatePatient(int i) {
		this.bloodLevel += i;
		return;
	}

}
