// set largest number to first input
// set second to one number to zero
// set counter to one 
// while counter is equal to or less than nine
// prompt to input next number
// input next number
// if number is less than smallest number then second smallest is smallest
// smallest is equal to number
// if number is less than second smallest number and greater than smallest
// counter plus one
// print smallest number and second smallest number

import java.util.Scanner;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int smallestNumber = input.nextInt();
 	int secondSmallest = 1;

        int numberCounter = 1;

        while (numberCounter <= 9) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number < smallestNumber) {
               secondSmallest = smallestNumber;
		smallestNumber = number;
            }

	if (number < secondSmallest && number > smallestNumber) {
		secondSmallest = number;
		}
            numberCounter++; 
        }

        System.out.printf("Smallest number is %d%n Second Smallest is %d%n", smallestNumber, secondSmallest);
        
    }
}