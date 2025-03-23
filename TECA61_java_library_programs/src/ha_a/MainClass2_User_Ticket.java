package ha_a;

public class MainClass2_User_Ticket {
	public static void main(String[] args) {
		User u = new User("Siva", 23, 'M');
		u.userDetails();
		u.ticketdetails(new Ticket(97842, 1600, "HYD", "VIJ"));

	}
}
