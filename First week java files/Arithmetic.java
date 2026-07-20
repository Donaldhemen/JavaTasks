import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer: ");
	int num1 = input.nextInt();
	
	System.out.print("Enter second integer: ");
	int num2 = input.nextInt();
	
	System.out.print("Enter third integer: ");
	int num3 = input.nextInt();


	System.out.print("Enter fourth integer: ");
	int num4 = input.nextInt();

	int sum = num1 + num2 + num3 + num4;
	int average = (num1 + num2 + num3 + num4) / 4;
	int product = num1 * num2 * num3 * num4;
	
	if(num1 < num2 && num1 < num3 && num1 < num4) {
		if(num2 > num3 && num2 > num4) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num1, num2);	
		}
		if(num3 > num2 && num3 > num4) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num1, num3);
		}
		if(num4 > num2 && num4 > num3) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num1, num4);
		}
	}
	if(num2 < num1 && num2 < num3 && num2 < num4) {
		if(num1 > num3 && num1 > num4) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num2, num1);	
		}
		if(num3 > num1 && num3 > num4) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num2, num3);
		}
		if(num4 > num1 && num4 > num3) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num2, num4);
		}
	}
	if(num3 < num1 && num3 < num2 && num3 < num4) {
		if(num1 > num2 && num1 > num4) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num3, num1);	
		}
		if(num2 > num1 && num2 > num4) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num3, num2);
		}
		if(num4 > num1 && num4 > num2) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num3, num4);
		}
	}
	if(num4 < num1 && num4 < num2 && num4 < num3) {
		if(num1 > num2 && num1 > num3) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num4, num1);	
		}
		if(num2 > num1 && num2 > num3) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num4, num2);
		}
		if(num4 > num1 && num3 > num2) {
		System.out.printf("Sum: %d%n Average: %d%n Product: %d%n Smallest: %d%n Largest:%d%n", sum, average, product, num4, num3);
		}
	}
	}
}