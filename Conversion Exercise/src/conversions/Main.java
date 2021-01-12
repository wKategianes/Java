package conversions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);		
		int USER_INPUT_NUM;	
		
		// Doing input validation on the user input
		do 
		{
			// Prompting the user
			System.out.println("Please choose the type of measurement you wish to convert from.");
			System.out.println("Enter the number corresponding with your choice." + '\n' + "1. Fahrenheit to Celsius" + '\n' + "2. Celsius to Fahrenheit");
			while (!userInput.hasNextInt())
			{
				System.out.println("Please enter a number.");
				userInput.next();
			}
			
			USER_INPUT_NUM = userInput.nextInt();			
		} while (USER_INPUT_NUM < 1 || USER_INPUT_NUM > 2);		
		
		System.out.println("You have chosen option " + USER_INPUT_NUM + ".");
		
		// Asks the user for the temperature and then converts it
		if(USER_INPUT_NUM == 1)
		{
			double temp = 0;
			
			System.out.println("This choice converts Fahrenheit to Celsius.");
			System.out.println("Please enter the current temperature in Fahrenheit");
			
			temp = userInput.nextInt();
			temp = Fahrenheit.fahrenheitTOCelsius(temp);
			userInput.close();
			
			System.out.printf("The temperature in Celsius is: %.2f", temp);
		} else
		{
			double temp = 0;
			
			System.out.println("This choice converts Celsius to Fahrenheit.");
			System.out.println("Please enter the current temperature in Celsius");
			
			temp = userInput.nextInt();
			temp = Celsius.celsiusToFahrenheit(temp);
			userInput.close();
			
			System.out.printf("The temperature in Fahrenheit is: %.2f", temp);
		}		
	}
}