
public class LivePerson extends Person {

	// Constructor to initialize a LivePerson
	public LivePerson(String iD, String name, int age, String gender, String address, String contactinfo) {
		super(iD, name, age, gender, address, contactinfo);
	}

	// Override toString method of LivePerosn
	@Override
	public String toString() {
		return "LivePerson [getRole()=" + getRole() + ", getID()=" + getID() + ", getName()=" + getName()
		+ ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getAddress()=" + getAddress()
		+ ", getContactinfo()=" + getContactinfo() + "]";
	}



}
