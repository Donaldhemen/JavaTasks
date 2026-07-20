// Question 55 Multiplication Table of any inputed number

import java.util.Scanner;
public class MultiplicationTableAnyInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter number: ");
		int number = input.nextInt();

		for (int counter = 1; counter <= 12; counter++) { 
			 
		System.out.printf("%d ", counter * number);	
			
		}
		System.out.println();
	}
}