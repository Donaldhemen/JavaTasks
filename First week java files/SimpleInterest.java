import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the Principal: ");
	double principal = input.nextDouble();
	
	System.out.print("Enter the rate: ");
	double rate = input.nextDouble();
	
	System.out.print("Enter the time: ");
	int time = input.nextInt();
	
	double interest = (principal * rate * time) / 100;
	System.out.printf("Interest is %f", interest);
	}
}