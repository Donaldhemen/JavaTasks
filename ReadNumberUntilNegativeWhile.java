// import scanner
// prompt to enter a number or negative to quit
// initialise number
// while counter is greater than or equal to 0
// collect next number in loop
// counter++
//


import java.util.Scanner;
public class ReadNumberUntilNegativeWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number or negative number to quit: ");		 		
		int number = input.nextInt();		
		int counter = 1;
		double total = 0;
		while (number >= 0) {
			System.out.print("Enter a number or negative number to quit: ");		 		
			number = input.nextInt();
			counter++;
			total += number;
		} 
		double average= total / (counter + 1) ;
		System.out.printf("Average is %f", total, average);
	}
}