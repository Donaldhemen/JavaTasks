import java.util.Scanner;
public class AreaAndPerimeter {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first side: ");
	int sideA = input.nextInt();
	
	System.out.print("Enter base: ");
	int sideB = input.nextInt();
	
	System.out.print("Enter third side: ");
	int sideC = input.nextInt();
	
	System.out.print("Enter height: ");
	int height = input.nextInt();

	int perimeter = sideA + sideB + sideC;
	int area = sideB * height / 2;
	
	System.out.printf("Area: %d Perimeter: %d", area, perimeter);
}
}