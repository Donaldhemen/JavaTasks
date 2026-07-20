// initialise loop variable to user input
// set loop condition to >= 1 and decrement
// display counter 
// display blast off

import java.util.Scanner;
public class CountdownSimulation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int userInput = input.nextInt();
		
		for (int counter = userInput; counter >= 1; counter--) {
			System.out.printf("%n%d", counter);
			
		}
		System.out.println();
		System.out.println("Blast off");
	}
}