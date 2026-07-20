//pseudocode
// set positives to zero
// set negatives to zero
// set largest number to one
// set number counter to one
// while number counter is less than or equal to 10
// prompt user to enter next number
// input the next number
// if number greater than largest number
// largest is equal to number
// if number > -1 positive else negative
// add one to number counter
// Print largest number positives and negatives

import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int positives = 0;
	int negatives = 0;
	int largestNumber = 1;
	int numberCounter = 1;
	
	while (numberCounter <= 10) {
	System.out.print("Enter next number: ");
		int number = input.nextInt();
	if (number > largestNumber) {
		largestNumber = number;
	}
	if (number > -1) {
		positives = positives + 1;
	} else {
		negatives = negatives + 1;
	}

	numberCounter = numberCounter + 1;
	}
	System.out.printf("Largest number is %d Positives: %d Negatives: %d", largestNumber, positives, negatives);
}
}