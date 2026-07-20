// import scanner
// collect student name as string and age as integer
// print 'Hello, [name]. you are [age] years old.'

import java.util.Scanner;
public class StudentNameAndAge {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter student's name: ");
	String name = input.nextLine();

	System.out.print("Enter student's age: ");
	int age = input.nextInt();

	System.out.printf("'Hello %s. You are %d years old'", name, age);
	}
} 