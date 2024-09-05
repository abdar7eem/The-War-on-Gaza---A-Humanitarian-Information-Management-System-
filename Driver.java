import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// Create a manager
		Manager manger = new Manager();

		//set a name for family2
		//set a name for family2
		System.out.println("Enter First family name: ");
		String f1=input.next();


		// Create persons for family1
		System.out.println("Enter ID,Name,age,gender,adress,contac info");
		Person person1 = new LivePerson(input.next(),input.next(),input.nextInt(),input.next(),input.next(),input.next());
		System.out.println("Enter ID,Name,age,gender,adress,contac info");
		Person person2 = new LivePerson(input.next(),input.next(),input.nextInt(),input.next(),input.next(),input.next());
		System.out.println("Enter ID,Name,age,gender,adress,contac info,Date of Death,Cause of Death,Place of death");

		//set a name for family2
		Person person3 = new Martyr(input.next(),input.next(),input.nextInt(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next());
		System.out.println("Enter Second family name: ");
		String f2=input.next();

		// Create families1
		Family family1 = new Family(f1);
		family1.addMember(person1,"dad");
		family1.addMember(person2,"mom");
		family1.addMember(person3,"son");

		//create persons for family2
		System.out.println("Enter ID,Name,age,gender,adress,contac info,Date of Death,Cause of Death,Place of death");
		Person person4= new Martyr(input.next(),input.next(),input.nextInt(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next());
		System.out.println("Enter ID,Name,age,gender,adress,contac info,Date of Death,Cause of Death,Place of death");
		Person person5 = new Martyr(input.next(),input.next(),input.nextInt(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next());
		System.out.println("Enter ID,Name,age,gender,adress,contac info");
		Person person6 = new LivePerson(input.next(),input.next(),input.nextInt(),input.next(),input.next(),input.next());
		System.out.println("Enter ID,Name,age,gender,adress,contac info");
		Person person7 = new LivePerson(input.next(),input.next(),input.nextInt(),input.next(),input.next(),input.next());


		// Create families2
		Family family2 = new Family("f2");
		family2.addMember(person4, "dad");
		family2.addMember(person5, "Mom");
		family2.addMember(person6, "son");
		family2.addMember(person7, "daughter");


		// Add families to the manager
		manger.addFamily(family1);
		manger.addFamily(family2);


		//Displaying methods


		// Display global statistics
		System.out.println("\nGlobal Statistics:");
		System.out.println("[Number of Martyr is: "+manger.calculateGlobalStatistics().get(0) +"] [Number of Live Person is: "+manger.calculateGlobalStatistics().get(1) +"] [Number of Orphans are: " +manger.calculateGlobalStatistics().get(2)+"]");

		System.out.println();

		// Display family statistics
		System.out.println("Family Statistics for Family 1 :");
		System.out.println("[Number of Martyr is: "+manger.calculateFamilyStatistics("Atar").get(0) +"] [Number of Live Person is: "+manger.calculateFamilyStatistics("Atar").get(1) +"] [Number of Orphans are: " +manger.calculateFamilyStatistics("Atar").get(2)+"]");

		System.out.println();

		//Testing Manger class toString
		System.out.println("Manger toString method Test");
		System.out.println(manger.toString());

		System.out.println();
		
		//Testing Family class toString
		System.out.println("Family toString method Test for family1");
		System.out.println(family1.toString());
		System.out.println("Family toString method Test for family2");
		System.out.println(family2.toString());

		//Testing getMembers method
		System.out.println("print Family 1 members");
		
		System.out.println();
		
		ArrayList <Person> arr=family1.getMembers();
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}

		System.out.println();
		//Testing removeMember method
		family1.romveMember(person1);

		System.out.println();

		//Testing removeParent method
		family1.removeParent(person4);

		System.out.println();

		//Testing get familyName method
		System.out.print("Family 2 name: ");
		System.out.println(family2.getFamilyName());

		System.out.println();

		//Testing getParents method
		System.out.println("Family 2 parents");
		ArrayList <Person> abc=family2.getParents();
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}

		System.out.println();

		//Testing equals method (If family 1 have the same number of martyr in family 2 it will return true)

		if(family1.equals(family2)){
			System.out.println("Family1 equals Family2");
		}
		else {
			System.out.println("Not equal");
		}



	}


}
