//pseudocode
// prompt to enter number
// input number
// set number counter to one 
// while number counter is less than or equal to 10
// prompt user to enter next number
// input the next number
// if number less than smallest number
// smallest is equal to number
// add one to number counter
// Print smallest number

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
        int smallestNumber = input.nextInt();
 
	System.out.print("Enter a number: ");
	int secondSmallest = input.nextInt();

        int numberCounter = 1;

        while (numberCounter < 10) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number < smallestNumber) {
                secondSmallest = smallestNumber;
		smallestNumber = number;
            }

	if (number > secondSmallest && number != smallestNumber) {
		secondSmallest = number;
            numberCounter++; 
        }

        System.out.printf("Smallest number is %dn econdSmallest is %d%n", smallestNumber);

        
    }
}