import java.util.Scanner;
public class Divisible {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integer: ");
	int number = input.nextInt();
	
	if(number % 7 == 0) {
	if(number % 2 != 0) {
	System.out.print("Integer is divisible by 7 and odd");
	}
	if(number % 2 == 0) {
	System.out.print("Integer is divisible by 7 and even");
	}
	}
	if(number % 7 != 0) {
	if(number % 2 != 0) {
	System.out.print("Integer is  not divisible by 7 and odd");
	}
	if(number % 2 == 0) {
	System.out.print("Integer is not divisible by 7 and even");
	}
	}
	if(number < 7 ) {
	if(number % 2 != 0) {
	System.out.print("Integer divided by 7 is 0 and odd");
	}
	if(number % 2 == 0) {
	System.out.print("Integer divided by 7 is 0 and even");
	}
	}
}
}