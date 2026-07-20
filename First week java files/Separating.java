import java.util.Scanner;
public class Separating {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Integer: ");
	int number = input.nextInt();
	
	int d1 = number / 1000;
	int d2 = (number / 100) %10;
	int d3 = (number / 10) %10;
	int d4 = number %10;
	
	System.out.printf("%d   %d   %d   %d", d1, d2, d3, d4);
	}
}