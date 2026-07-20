import java.util.Scanner;
public class Cubes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		
		int cube1 = number1 * number1 * number1;
		int cube2 = number2 * number2 * number2;
		
		int product = cube1 * cube2;
		
		if(cube1 > cube2) {
		int remainder = cube1 % cube2;
		System.out.printf("First cube: %d%n Second cube: %d%n Product of cubes: %d%n Remainder: %d%n", cube1, cube2, product, remainder);
		}
		if(cube1 < cube2) {
		int remainder = cube2 % cube1;
		System.out.printf("First cube: %d%n Second cube: %d%n Product of cubes: %d%n Remainder: %d%n", cube1, cube2, product, remainder);
		}
	}
}