// import scanner
// read integer between 1 and 7
// if number greater than 7 or less than 1
// if/else for 1= Monday through 7 = Sunday 


import java.util.Scanner;
public class Vowels {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a character: ");
	String s = input.nextLine();
	
	String s1 = "a";
	String s2 = "e";
	String s3 = "i";
	String s4 = "o";
	String s5 = "u";
	
	if (s.equalsIgnoreCase(s1) || s.equalsIgnoreCase(s2)|| s.equalsIgnoreCase(s3) || s.equalsIgnoreCase(s4) || s.equalsIgnoreCase(s5)) {
		
	System.out.println("Vowel");
	}
	else if (! s.equalsIgnoreCase(s1) || s.equalsIgnoreCase(s2)|| s.equalsIgnoreCase(s3) || s.equalsIgnoreCase(s4) || s.equalsIgnoreCase(s5)) {
		
	System.out.println("Consonant");
	}
	else {
	System.out.println("Not a letter");
	}

}
}