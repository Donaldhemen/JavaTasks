// import scanner
// prompt to enter a positive number or negative number to quit
// initialise number
// do declaration and prompt to enter a positive number or negative number to quit
// collect next number in loop
// counter++
// while counter is greater than or equal to 0


import java.util.Scanner;
public class ReadNumbersUntilNegativeNumberThenAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number or negative number to quit: ");		 		
		int number = input.nextInt();		
		int counter = ;
		int total = number;

		do {
			System.out.print("Enter a number or negative number: ");		 		
			 number = input.nextInt();
			
			++counter;
			total += number;
		} while (number >= 0);
		int average = total / counter;
		System.out.print(total);
		System.out.println("Average of numbers entered is: " + average);
	}
}