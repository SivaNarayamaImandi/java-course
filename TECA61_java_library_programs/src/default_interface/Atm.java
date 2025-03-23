package default_interface;

public interface Atm {
	void deposit();

	void withdraw();

	void showBal();

	default void upi() {

	}

	default void loan() {

	}
}
