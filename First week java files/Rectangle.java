import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the length: ");
	int l = input.nextInt();

	System.out.print("Enter the width: ");
	int w = input.nextInt();
	
	System.out.printf("Perimeter: %d%n Area: %d%n Diagonal: %f%n", 2*(l + w), l * w, (l + w)/1.41421); 
	}
}