package level1_assignment_programs;

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println("Main method");
		convertToFahrenheit();
	}
	public static void convertToFahrenheit()
	{
		System.out.println("convertToFahrenheit method");
		TemperatureConverter r = new TemperatureConverter();
		r.setCelsiusTemperature();
		r.displayResult();
	}
	public void setCelsiusTemperature()
	{
		System.out.println("setCelsiusTemperature method");
	}
	public void displayResult()
	{
		System.out.println("displayResult method");
	}
}
