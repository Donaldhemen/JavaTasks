import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integer: ");
	int number = input.nextInt();

	int remainder = number % 2;
	if(remainder == 0) {
	System.out.print("Number is even");
	}
	if(remainder != 0) {
	System.out.print("Number is odd");
	}
}
}
