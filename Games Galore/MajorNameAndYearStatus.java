// import scanner 
// read String I, C or A from user
// switch case I, C and A
// read Integers 1, 2, 3 or 4 from user
// switch case 1, 2, 3 and 4 fall through to case I, C and A
// display the full major name and year status

import java.util.Scanner;
public class MajorNameAndYearStatus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String majorName = """
	Major names
I Information Management
C Computer Science
A Accounting
""";
		System.out.print(majorName);

		System.out.print("Enter Letter to Select Major: ");
		String majorChoice = input.nextLine();
		
		switch(majorChoice.toLowerCase()) {
		case "i" :
		case "c" :
		case "a" : System.out.println("Information Management");
			String yearStatus = """
1. Freshman
2. Sophomore
3. Junior
4. Senior
""";
			System.out.println(yearStatus);
			int yearStatusChoice = input.nextInt();
			
			switch(yearStatusChoice) {
			case 1 : System.out.println("Freshman"); break;
			case 2 : System.out.println("Sophomore"); break;
			case 3 : System.out.println("Junior"); break;
			case 4 : System.out.println("Senior"); break;
			default : System.out.println("Invalid input");
			}
			break;
		
		default : System.out.println("Invalid input");
		}
	}
}
	
