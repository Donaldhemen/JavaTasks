// collect integer number
// calculate weekday = number % 7
// if weekday == 0 print wednesday
// else if weekday == 1 print thursday
// else if weekday == 2 print friday
// else if weekday == 3 print saturday
// else if weekday == 4 print sunday
// else if weekday == 5 print monday
// else if weekday == 6 print tuesday

import java.util.Scanner;
public class WeekdayFromNumber {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of days: ");
	int number = input.nextInt();
	
	int weekday = (number % 7);

	if (weekday < 0) {
		weekday = 0 - weekday; 
	}

	if (weekday == 0) {
		System.out.printf("%d days from now will be Wednesday", number);
	}
	else if (weekday == 1) {
		System.out.printf("%d days from now will be Thursday", number);
	}
	else if (weekday == 2) {
		System.out.printf("%d days from now will be Friday", number);
	}
	else if (weekday == 3) {
		System.out.printf("%d days from now will be Saturday", number);
	}
	else if (weekday == 4) {
		System.out.printf("%d days from now will be Sunday", number);
	}
	else if (weekday == 5) {
		System.out.printf("%d days from now will be Monday", number);
	}
	else if (weekday == 6) {
		System.out.printf("%d days from now will be Tuesday", number);
	}
}
}