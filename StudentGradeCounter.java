// import scanner
// declare gradecounter = 0
// declare grade count for A, B, C and D
// for loop variable = 1, condition <= 5, increment
// read student name 
// read student grade
// ++gradeCounter
// inside the for loop switch case A: ++aCount
// case B: ++bCount
// case C: ++cCount
// case D: ++dCount and default for invalid grade
// print summary of grades outside loop

import java.util.Scanner;
public class StudentGradeCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;
		int invalidGradeCount = 0;
		int total = 0;
		int gradeCounter = 0;
		
		System.out.print("Enter number of students: ");
		int numberOfStudents = input.nextInt();

		for (int counter = 1; counter <= numberOfStudents; counter++) {
			System.out.println("Enter name of student: ");
			String name = input.next();

			System.out.println("Enter grade of " + name + ": ");
			int grade = input.nextInt();
			total += grade;
			++gradeCounter;
			
			switch (grade/10) {
			case 9 :
			case 8 : ++aCount; break;
			case 7 :	
			case 6 : ++bCount; break;
			case 5 :
			case 4 : ++cCount; break;
			case 3 :
			case 2 : ++dCount; break;
			case 1 : ++fCount; break;
			default : ++invalidGradeCount;
			}
		} 
		System.out.printf("Total of %d grades is %d%n", gradeCounter, total);
		System.out.println("==== Summary of Grades ====");
		System.out.printf("%n%d%s%n%n%d%s%n%n%d%s%n%n%d%s%n%n%d%s%n%n%d%s%n",
				aCount, " Students got A 'Excellent'",
				bCount, " Students got B 'Very Good'",
				cCount, " Students got C 'Good'",
				dCount, " Students got D 'Pass'",
				fCount, " Students got F 'Fail'",
				invalidGradeCount, " Invalid grades");
	}
}