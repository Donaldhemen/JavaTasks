// Question 35 Whether its a leap year
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter year : ");
	int year = input.nextInt();
	
	if (year % 4 == 0  && year % 400 == 0) {
	if (year % 4 == 0 && year % 100 == 0) {	
	System.out.printf("%d is a leap year", year);
	}
	else if (year % 4 != 0 || year % 100 == 0) {
	System.out.printf("%d is not a leap year", year);
	}
}
}
	