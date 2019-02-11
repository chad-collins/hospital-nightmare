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

				"[Room#: " + this.getPatientID() 
				+ "]\t[Name: " + this.getPatientName() 
				
				+ "]\t[Health Rating: " + this.getHealthLevel()
				+ "]\t[Blood Level: " + this.getBloodLevel() 
				+ "]\t[Ward: " + this.getWard()
				+ "\t" + this.bodyStillHere());

	}
	
	public String bodyStillHere() {
		this.checkIfDead();
		if (this.getIsDead() == true)
		{return "DECEASED. AWAITING MORTUARY TRANSPORT.";
			
		}else return "";
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


	public void checkIfDead() {
		if (this.healthLevel <= 0) {
		isDead = true;
		
		if (this.healthLevel > 0) {
			isDead = false;
		}}
	}

	public boolean getIsDead() {
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
		this.getBloodLevel();
		this.getHealthLevel();
		this.checkIfDead();
		this.getIsDead();	

	}

	public void chanceIncounter() {

		Random rand = new Random();
		int a = rand.nextInt(10);

		
		Random rand2 = new Random();
		int execution = rand2.nextInt(20);

		if (a == 2) {
			Random rand1 = new Random();
			int b = rand.nextInt(12);

			if (b == 1) {
				this.isBitten();
				System.out.println("---- " + this.getPatientName()
						+ " was reported to be screaming. Strange marks on the neck were reported, as well as a large loss of blood.");
			} else if (b == 2) {
				this.isBitten();
				System.out.println("---- " + this.getPatientName()
						+ "'s body is covered in strange marks. The blood loss is...catastrophic.");
			} else if (b == 3) {
				this.isBitten();
				System.out.println("---- " + this.getPatientName()
						+ "'s family is threatening to move to another hospital if these random marks and blood drops keep occuring.");
			}
		}
		if (execution == 13) {
			this.isDead = true;

			
			System.out.println("---- " + 
					this.getPatientName() + " is dead. Marks from head to toe. Completely drained of blood. ");}
		}

	public void medicatePatient(int i) {
		this.bloodLevel += i;
		return;
	}

}
