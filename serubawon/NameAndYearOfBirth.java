// import scanner
// read user's first name, last name and year of birth
// calculate age, assume current year is 2025
// print using printf

import java.util.Scanner;
public class NameAndYearOfBirth {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first name and last name: ");
	String firstName = input.nextLine();
	String lastName = input.nextLine();
	
	System.out.print("Enter year of birth: ");
	int year = input.nextInt();

	int age = 2025 - year;
	

	System.out.printf("First name: %s%nLast name: %s%nAge: %d%n", firstName, lastName, age);
	}
} 