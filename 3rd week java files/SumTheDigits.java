 // import scanner
// display enter integer between 0 and 1000 
// collect input for integer
// separate three digits using modulo 
// declare sum is addition of the three digits
// display sum of the digits

import java.util.Scanner;
public class SumTheDigits {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter integer between 0 and 1000: ");
	int number = input.nextInt(); 

	int digitOne = number / 100;
	int digitTwo = (number / 10) % 10;
	int digitThree = number % 10;

	int sum = digitOne + digitTwo + digitThree;
	
	System.out.printf("The sum of the digits is %d", sum);
	}
}