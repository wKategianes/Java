package conversions;

public class Fahrenheit {
	
	public static double fahrenheitTOCelsius(double fahrenheit)
	{
		double total = ((5.0 / 9) * (fahrenheit - 32));		
		return total;		
	}
}