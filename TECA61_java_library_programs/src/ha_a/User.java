package ha_a;

public class User {
	String name;
	int age;
	char gender;

	public User(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void userDetails() {
		System.out.println("User Details");
		System.out.println("**********---------------**********");
		System.out.println("Name of the passenger : " + name);
		System.out.println("Age of the passenger : " + age);
		System.out.println("Gender of the passenger : " + gender);
	}

	public void ticketdetails(Ticket t) {
		t = new Ticket(t.id, t.cost, t.boardingPoint, t.destinationPoint);
		System.out.println("\nTicket Details");
		System.out.println("**********---------------**********");
		System.out.println("Ticket id : " + t.id);
		System.out.println("Ticket cost : " + t.cost);
		System.out.println("Ticket Boarding Point : " + t.boardingPoint);
		System.out.println("Ticket Destination Point : " + t.destinationPoint);
		System.out.println("Ticket booked successfully...............");
	}

}
