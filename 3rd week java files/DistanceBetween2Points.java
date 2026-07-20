// import scanner
// display enter points x1 and y1
// collect input for points x1 and y1 
// display enter points x2 and y2
// collect input for points x2 and y2
// declare distance = square root of (x2 - x1) + (y2 - y1)
// display the distance between two points

import java.util.Scanner;
public class DistanceBetween2Points {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter points x1 and y1: ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();

	System.out.print("Enter points x2 and y2: ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble(); 

	double a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
	double distance = Math.pow(a, 0.5);
	
	System.out.printf("The distance between the two points is %.15f", distance);
	}
}