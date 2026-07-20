 // import scanner
// display prompt to enter five-digit integer
// seperate the first 2 and last 2 digits using modulo ten
// if digit1 and digit5 are equal, and digit2 and digit4 are equal
// prompt print it is a palendrome
// if number is greater than 99999 or less than 10000 
// prompt print error, enter new value 

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter five-digit integer: ");
	int number = input.nextInt();

	if (number > 99999 || number < 10000) {
		System.out.println("Error");
	} 
	else if (number <= 99999 && number >= 10000) {
	
		int digit1 = number / 10000;
		int digit2 = (number / 1000) % 10;
		int digit4 = (number / 10) % 10;
		int digit5 = number % 10;	
		
		if (digit1 == digit5 && digit2 == digit4) {
			System.out.printf("%d is a palindrome", number);	
		}
		else{
			System.out.printf("%d is not a palindrome", number);
		}
	}
}
}