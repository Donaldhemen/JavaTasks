// import scanner
// read radius from user
// calculate the area of circle = pi * r2
// print to 2 decimal places using printf

import java.util.Scanner;
public class AreaOfACircle {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter radius: ");
	double radius = input.nextDouble();

	double area = Math.PI * radius * radius;
	

	System.out.printf("Area is %f", area);
	}
} 