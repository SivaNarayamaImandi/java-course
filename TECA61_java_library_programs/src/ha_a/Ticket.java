package ha_a;

public class Ticket {
	int id;
	int cost;
	String boardingPoint;
	String destinationPoint;

	public Ticket(int id, int cost, String boardingPoint, String destinationPoint) {
		this.id = id;
		this.cost = cost;
		this.boardingPoint = boardingPoint;
		this.destinationPoint = destinationPoint;
	}

	public void display() {
		System.out.println("Ticket id : " + id);
		System.out.println("Ticket cost : " + cost);
		System.out.println("Ticket Boarding Point : " + boardingPoint);
		System.out.println("Ticket Destination Point : " + destinationPoint);
		System.out.println("Ticket booked successfully...............");
	}
}
