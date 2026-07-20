// import scanner
// display enter three points of a triangle
// collect input for points (x1, y1), (x2, y2), (x3, y3) 
// calculate a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))
// calculate side1 = Math.pow(a, 0.5)
// calculate b = ((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3))
// calculate side2 = Math.pow(b, 0.5)
// calculate c = ((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3))
// calculate side3 = Math.pow(c, 0.5)
// calculate s = (side1 + side2 + side3) / 2
// calculate d = s(s-side1) * (s-side2) * (s-side3)
// calculate area = Math.pow(d, 0.5)
// display The area of the triangle 

import java.util.Scanner;
public class AreaOfTheTriangle {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter three points of a triangle: ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();

	double x2 = input.nextDouble();
	double y2 = input.nextDouble();

	double x3 = input.nextDouble();
	double y3 = input.nextDouble();

	double a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
	double side1 = Math.pow(a, 0.5);

	double b = ((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3));
	double side2 = Math.pow(b, 0.5);

	double c = ((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3));
	double side3 = Math.pow(c, 0.5);

	double s = (side1 + side2 + side3) / 2;
	double d = s * (s - side1) * (s - side2) * (s - side3);
	
	double area = Math.pow(d, 0.5);
	System.out.printf("The area of the triangle is %.1f", area);
	}
}