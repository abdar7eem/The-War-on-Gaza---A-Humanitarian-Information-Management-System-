
public class Martyr extends Person {

	private String DateOfMasrtyrdom;
	private String CauseOfDeath;
	private String PlaceOfDeath;

	// Constructor to initialize a Martyr object
	public Martyr(String iD, String name, int age, String gender, String address, String contactinfo,
			String dateOfMasrtyrdom, String causeOfDeath, String placeOfDeath) {
		// Call the constructor of the superclass (Person)
		super(iD, name, age, gender, address, contactinfo);
		this.DateOfMasrtyrdom = dateOfMasrtyrdom;
		this.CauseOfDeath = causeOfDeath;
		this.PlaceOfDeath = placeOfDeath;
	}

	// Getter for the date of martyr
	public String getDateOfMasrtyrdom() {
		return DateOfMasrtyrdom;
	}

	// Getter for the cause of death
	public String getCauseOfDeath() {
		return CauseOfDeath;
	}

	// Getter for the place of death
	public String getPlaceOfDeath() {
		return PlaceOfDeath;
	}

	// Override toString method 
	@Override
	public String toString() {
		return "Martyr [DateOfMasrtyrdom=" + DateOfMasrtyrdom + ", CauseOfDeath=" + CauseOfDeath + ", PlaseOfDeath="
				+ PlaceOfDeath + "]";
	}


}
