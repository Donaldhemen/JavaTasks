// Question 52
// import scanner
// prompt to enter a number or zero to quit
// initialise number
// while counter is not equal to 0
// collect next number in loop
// counter++
//


import java.util.Scanner;
public class AskingForNumberUntil0Total {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number or 0 to quit: ");		 		
		int number = input.nextInt();		
		int counter = 1;
		int total = 0;
		while (number != 0) {
			System.out.print("Enter a number or 0 to quit: ");		 		
			number = input.nextInt();
			total += number;
			counter++;
		} 

		System.out.println("Total entered:" +total);
	}
}