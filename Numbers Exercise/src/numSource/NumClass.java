package numSource;

import java.util.Random;
import java.util.Scanner;

public class NumClass {

	public static void main(String[] args) {
		
		// Declaring of variables to be used later.
		int NUM_OF_POSITIVE_NUMS = 0;
		int NUM_OF_NEGATIVE_NUMS = 0;
		double TOTAL = 0;
		int ARRAY_COUNT = 0;

		// Grabbing user input
		Scanner userInput = new Scanner(System.in);
		int USER_INPUT_NUM;	
		
		// Doing input validation on the user input
		do 
		{
			System.out.println("Enter how many numbers you wish to generate." + '\n' + "Positive numbers only.");
			while (!userInput.hasNextInt()) 
			{
				System.out.println("Please enter a number.");
				userInput.next();
			}
			
			USER_INPUT_NUM = userInput.nextInt();			
		} while (USER_INPUT_NUM <= 0);
		userInput.close();
		
		// Generating random numbers 1-100 and putting them into an array
		Random rd = new Random();
		double[] randomArray = new double[USER_INPUT_NUM];
		for (int i = 0; i < randomArray.length; i++)
		{
			randomArray[i] = rd.nextInt((10 + 10) + 1) - 10;
			
			// Checking to see if the number is positive
			if (randomArray[i] > 0)
			{
				NUM_OF_POSITIVE_NUMS = NUM_OF_POSITIVE_NUMS + 1;
			}
			System.out.println(randomArray[i]);
			ARRAY_COUNT = ARRAY_COUNT + 1;
			TOTAL = TOTAL + randomArray[i];			
		}
		
		// Getting the number of negative numbers as well as the average
		NUM_OF_NEGATIVE_NUMS = ARRAY_COUNT - NUM_OF_POSITIVE_NUMS;
		double averageNum = TOTAL / randomArray.length;
		
		// Display the info to the user
		System.out.println('\n' + "The array has this many elements: " + ARRAY_COUNT);
		System.out.println("The array has this many positive numbers: " + NUM_OF_POSITIVE_NUMS);
		System.out.println("The array has this many negative numbers: " + NUM_OF_NEGATIVE_NUMS);
		System.out.println("Total inside the TOTAL variable: " + TOTAL);
		System.out.format("The average for the numbers in the array is: %.1f", averageNum);
	}
}