// import scanner
// read first and second integer
// if/else for larger and smaller, and equal to 
// print number is larger and number is smaller else they are equal

import java.util.Scanner;
public class LargerSmallerEqual {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
	
	if (number1 > number2) {
		System.out.printf("%d is larger and %d is smaller", number1, number2);
	}
	else if (number1 < number2) {
		System.out.printf("%d is larger and %d is smaller", number2, number1);
	}
	else {
		System.out.printf("%d is equal to %d", number1, number2);
	}
}
}