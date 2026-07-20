// import scanner
// read integer between 1 and 7
// if number greater than 7 or less than 1
// if/else for 1= Monday through 7 = Sunday 


import java.util.Scanner;
public class DayOfTheWeek {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integer between 1 and 7: ");
	int number = input.nextInt();
	
	if (number <= 7 && number >= 1) {
		
		 if (number == 1) {
		System.out.println("Monday");
		}
		else if (number == 2) {
		System.out.println("Tuesday");
		}
		else if (number == 3) {
		System.out.println("Wednesday");
		}
		else if (number == 4) {
		System.out.println("Thursday");
		}
		else if (number == 5) {
		System.out.println("Friday");
		}
		else if (number == 6) {
		System.out.println("Saturday");
		}
		else if (number == 7) {
		System.out.println("Sunday");
		}
	}
	else {
		System.out.println("Invalid input");
	}
}
}