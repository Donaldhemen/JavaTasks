 // import scanner
// display enter number in pounds 
// collect input for pound
// declare kilograms is equal to pounds divided by 0.454
// display pounds is kilograms

import java.util.Scanner;
public class PoundsToKg {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number in pounds: ");

	double pounds = input.nextDouble();
	double kilograms = pounds / 0.454;
	
	System.out.printf("%f pounds is %.3f kilograms", pounds, kilograms);
	}
}