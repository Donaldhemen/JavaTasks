import java.util.Scanner;
public class Multiple {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer: ");
	int num1 = input.nextInt();
	
	System.out.print("Enter second integer: ");
	int num2 = input.nextInt();
	int remainder = (num1 * num1) % (num2 * num2 * num2);
	
	if(remainder == 0) {
	System.out.print("First number squared is divisible by second number cubed");
	}
	
	if(remainder != 0) {
	System.out.print("First number squared is not divisible by second number cubed");
	}
	
}
}