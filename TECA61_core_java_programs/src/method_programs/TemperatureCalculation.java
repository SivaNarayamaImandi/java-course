package method_programs;

public class TemperatureCalculation {
	public static double CelciusToFahrenheit(int celcius)
	{
		double fahrenheit = (celcius*(9/5.0))+32;
		return fahrenheit;
	}
	public static double FahrenheitToCelcius(int fahrenheit)
	{
		double celcius = (fahrenheit-32)*(5/9.0);
		return celcius;
	}
	public static void main(String[] args) 
	{
		System.out.println(CelciusToFahrenheit(32));
		System.out.println(FahrenheitToCelcius(100));
	}

}
