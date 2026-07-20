import java.util.Scanner;
public class ThreeScores {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();
	
	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
	
	System.out.print("Enter third integer: ");
	int number3 = input.nextInt();

	int total = number1 + number2 + number3;
	int average = total / 3;
	
	System.out.printf("Total is %d and Average is %d", total, average);
	}
}