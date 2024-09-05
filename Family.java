import java.util.ArrayList;

public class Family {

	// Instance variables
	private String familyName ;
	private ArrayList <Person> parents = new ArrayList<Person>();
	private ArrayList <Person> members = new ArrayList<Person>();

	// Constructor to initialize Family with a name
	public Family( String Name) {
		this.familyName = Name;
	}

	// Method to add a member to the family and checking his role
	public boolean addMember(Person member,String role) {
		if (role.equalsIgnoreCase("MOM")|| role.equalsIgnoreCase("DAD")) {
			members.add(member);
			parents.add(member);
			member.setRole(role);
			return true;

		}
		else if( role.equalsIgnoreCase("DAUGHTER") || role.equalsIgnoreCase("SON")) {
			members.add(member);
			return true;
		}
		else {
			return false;}
	}
	
	// Getter for the list of family members
	public ArrayList <Person> getMembers() {
		return members;
	}

	// Method to remove a member from the family
	public boolean romveMember(Person member) {
		members.remove(member);
		System.out.println("Member removed Successfully ...");
		return true;
	}
	
	// Method to add a parent to the family
	public void addParent(Person Parent ) {
		parents.add(Parent) ;
		System.out.println("Added Successfully ...");
	}
	
	// Method to remove a parent from the family
	public void removeParent(Person Parent ) {
		parents.remove(Parent);
		System.out.println("Removed Successfully ...");
	}
	
	// Getter for the family name
	public String getFamilyName() {
		return familyName;
	}

	// Setter for the family name
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	// Getter for the list of parents
	public ArrayList <Person> getParents() {
		return parents;
	}

	// Method to get the role of a member in the family
	public String getMemberRole(Person member,String role) {
		return role;
	}

	// Override toString method
	@Override
	public String toString() {
		return "Family [familyName=" + familyName + ", members=" + members + ", parents=" + parents + ", getMembers()="
				+ getMembers() + ", getFamilyName()=" + getFamilyName() + ", getParents()=" + getParents()
				+ ", calculateTotalMartyrs()=" + Martyrscount()  + "]";
	}

	// Override equals method to compare families based on Martyrs count
	@Override
	public boolean equals(Object o) {
		if( o instanceof Family) {
			if(this.Martyrscount()  == ((Family)o).Martyrscount() )
				return true;
		}

		return false;
	}

	// Method to return the number of Martyrs in the family
	public int Martyrscount() {
		int Count=0;
		for(int j=0;j<getMembers().size();j++) {
			if(getMembers().get(j) instanceof Martyr) {
				Count++;
			}
		}
		return Count;
	}

	// Method to check if both mother and father are living persons
	public int Check(ArrayList <Person> parents) {
		boolean mother= true;
		boolean father= true;

		for(int i=0;i<parents.size();i++) {	
			if(parents.get(i).getRole().equalsIgnoreCase("mom") && parents.get(i)instanceof LivePerson) {
				mother=false;
			}
			else if(parents.get(i).getRole().equalsIgnoreCase("dad") && parents.get(i)instanceof LivePerson) {
				father=false;
			}

		}

		if(mother==true && father==true) {
			return 1;
		}
		else
			return 0;

	}
}

