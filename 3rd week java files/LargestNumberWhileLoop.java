// set largest number to zero
// set counter to one 
// while counter is less than or equal to 10
// prompt user to enter next number
// input the next number
// if number greater than largest number
// largest is equal to number
// add one to counter
// Print largest number

import java.util.Scanner;
public class LargestNumberWhileLoop {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int largestNumber = 0;
	int counter = 1;
	
	while (counter <= 10) {
	System.out.print("Enter next number: ");
	int number = input.nextInt();
	if (number > largestNumber) {
		largestNumber = number;
	}
	counter++;
	}
	System.out.printf("Largest number is %d", largestNumber);
}
}