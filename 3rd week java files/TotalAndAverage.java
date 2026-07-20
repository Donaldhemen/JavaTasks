// set largest number to first input
// set second largest number to zero
// set counter to one 
// while counter is equal to or less than nine
// prompt to input next number
// input next number
// total is total added to the number
// if number is greater than largest number then second largest is largest
// largest is equal to number
// if number is less than largest number and greater than second largest
// counter plus one
// print largest number and second largest number and average

import java.util.Scanner;
public class TotalAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestNumber = 1;
 	int secondLargest = 0;
	int total= 0;
        int numberCounter = 1;

        while (numberCounter <= 10) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
		total = total + number;

            if (number > largestNumber) {
               secondLargest = largestNumber;
		largestNumber = number;
            }

	if (number > secondLargest && number < largestNumber) {
		secondLargest = number;
		}
            numberCounter++; 
        }

	double average = (double) total / 10;	
        System.out.printf("Largest number is %d%nSecond Largest is %d%nAverage is %f%n", largestNumber, secondLargest, average);
        
    }
}