import java.util.Scanner;
public class SquareCube {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integer: ");
	int number = input.nextInt();

	int square = number * number;
	int cube = number * number * number;
	
	System.out.printf("Square is %d Cube is %d", square, cube);
	}
}