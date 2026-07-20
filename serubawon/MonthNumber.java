//Question 45  Month and number of days

// read month number from 1 - 12 
// print number of days in month
// for february ask user for year and acount for leap year
import java.util.Scanner;
public class MonthNumber {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter month number 1 - 12: ");
	int month = input.nextInt();
	
	if (month == 1) {
	System.out.println("31 days");
	}
	if (month == 2) {
		System.out.print("Enter year: ");
		int year = input.nextInt();
		if (year % 4 == 0) {
		System.out.println("29 days");
		}
		else {
		System.out.println("28 days");
		}
	}
	else if (month == 3) {
	System.out.println("31 days");
	}
	else if (month == 4) {
	System.out.println("30 days");
	}
	else if (month == 5) {
	System.out.println("31 days");
	}
	else if (month == 6) {
	System.out.println("30 days");
	}
	else if (month == 7) {
	System.out.println("31 days");
	}
	else if (month == 8) {
	System.out.println("31 days");
	}
	else if (month == 9) {
	System.out.println("30 days");
	}
	else if (month == 10) {
	System.out.println("31 days");
	}
	else if (month == 11) {
	System.out.println("30 days");
	}
	else if (month == 12) {
	System.out.println("31 days");
	}
	else {
	System.out.println("Not a month number");
	}
}
}