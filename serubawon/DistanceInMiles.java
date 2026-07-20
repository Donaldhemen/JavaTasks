// import scanner
// read distance in miles
// convert the distance in kilometres = mile * 1.60934
// print both values labelled

import java.util.Scanner;
public class DistanceInMiles {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter distance in miles: ");
	double miles = input.nextDouble();

	double kilometres = miles * 1.60934;
	

	System.out.printf("%f miles is %f kilometres", miles, kilometres);
	}
} 