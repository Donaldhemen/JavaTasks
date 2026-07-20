// import scanner
// collect two numbers from user
// calculate the sum, difference, product and quotient 
// print the sum, difference, product and quotient

import java.util.Scanner;
public class SumDifferenceProductQuotient {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	double number1 = input.nextDouble();

	System.out.print("Enter second number: ");
	double number2 = input.nextDouble();

	double sum = number1 + number2;
	double difference = number1 - number2;
	double product = number1 * number2;
	double quotient = number1 / number2;

	System.out.printf("Sum is %f%nDifference is %f%nProduct is %f%nQuotient is %f", sum, difference, product, quotient);
	}
} 