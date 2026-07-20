//pseudocode
// set largest number to zero
// set number counter to one 
// while number counter is less than or equal to 10
// prompt user to enter next number
// input the next number
// if number greater than largest number
// largest is equal to number
// add one to number counter
// Print largest number

import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int largestNumber = 0;
	int numberCounter = 1;
	
	while (numberCounter <= 10) {
	System.out.print("Enter next number: ");
	int number = input.nextInt();
	if (number > largestNumber) {
		largestNumber = number;
	}
	numberCounter = numberCounter + 1;
	}
	System.out.printf("Largest number is %d", largestNumber);
}
}