import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Principal: ");
	double principal = input.nextDouble();
	
	System.out.print("Enter Rate: ");
	double rate = input.nextDouble();

	System.out.print("Enter Time: ");
	double time = input.nextDouble();

	
	double simpleInterest = (principal * rate * time) / 100;
	double totalAmount = simpleInterest + principal;

	System.out.printf("Simple Interest is %f%n Total amount is %f%n", simpleInterest, totalAmount);
}
}