// Question 48
// import scanner
// prompt to enter a positive number
// initialise number
// do declaration and prompt to enter a positive number
// collect next number in loop
// counter++
// while counter is greater than or equal to 0


import java.util.Scanner;
public class AskingForPositiveNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive number: ");		 		
			int number = input.nextInt();		
		int counter = 1;

		do {
			System.out.print("Enter a positive number: ");		 		
			 number = input.nextInt();
			counter++;
		} while (number > 0);

		System.out.println();
	}
}