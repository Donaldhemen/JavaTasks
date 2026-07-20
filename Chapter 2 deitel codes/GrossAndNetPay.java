import java.util.Scanner;
public class GrossAndNetPay {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Hours Worked: ");
	double hoursWorked = input.nextDouble();
	
	System.out.print("Enter Hourly Rate: ");
	double hourlyRate = input.nextDouble();

	System.out.print("Enter Bonus Pay: ");
	double bonus = input.nextDouble();

	System.out.print("Enter Tax Rate: ");
	double taxRate = input.nextDouble();

	double grossPay = hoursWorked * hourlyRate + bonus;
	
	double taxAmount = grossPay * taxRate / 100;

	double netPay = grossPay - taxAmount;

	System.out.printf("Gross pay: %f%n Tax amount: %f%n Net pay: %f%n", grossPay, taxAmount, netPay);
}
}