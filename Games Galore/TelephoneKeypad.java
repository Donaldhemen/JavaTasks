<<<<<<< HEAD
// import Scanner
// read alphabet from keyboard
// switch alphabet .lowercase() 
// case a, b, and c for number 2
// case d, e, and f for 3
// case g, h and i for 4
// case j, k and l for 5
// case m, n and o for 6
// case pqrs

import java.util.Scanner;
public class TelephoneKeypad {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an alphabet: ");		 		
		String alphabet = input.nextLine();
		
		switch(alphabet) {
		case "a", "b", "c" :
		case "A", "B", "C" : System.out.print(2); break;

		case "d", "e", "f" :
		case "D", "E", "F" : System.out.print(3); break;

		case "g", "h", "i" :
		case "G", "H", "I" : System.out.print(4); break;
		
		case "j", "k", "l" :
		case "J", "K", "L" : System.out.print(5); break;
		
		case "m", "n", "o" :
		case "M", "N", "O" : System.out.print(6); break;

		case "p", "q", "r", "s" :
		case "P", "Q", "R", "S" : System.out.print(7); break;

		case "t", "u", "v" :
		case "T", "U", "V" : System.out.print(8); break;
		
		case "w", "x", "y", "z" :
		case "W", "X", "Y", "Z" : System.out.print(9); break;
		default : System.out.println("Invalid input or non-letters");
		}
	}
=======
// import Scanner
// read alphabet from keyboard
// switch alphabet .lowercase() 
// case a, b, and c for number 2
// case d, e, and f for 3
// case g, h and i for 4
// case j, k and l for 5
// case m, n and o for 6
// case pqrs

import java.util.Scanner;
public class TelephoneKeypad {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an alphabet: ");		 		
		String alphabet = input.nextLine();
		
		switch(alphabet) {
		case "a", "b", "c" :
		case "A", "B", "C" : System.out.print(2); break;

		case "d", "e", "f" :
		case "D", "E", "F" : System.out.print(3); break;

		case "g", "h", "i" :
		case "G", "H", "I" : System.out.print(4); break;
		
		case "j", "k", "l" :
		case "J", "K", "L" : System.out.print(5); break;
		
		case "m", "n", "o" :
		case "M", "N", "O" : System.out.print(6); break;

		case "p", "q", "r", "s" :
		case "P", "Q", "R", "S" : System.out.print(7); break;

		case "t", "u", "v" :
		case "T", "U", "V" : System.out.print(8); break;
		
		case "w", "x", "y", "z" :
		case "W", "X", "Y", "Z" : System.out.print(9); break;
		default : System.out.println("Invalid input or non-letters");
		}
	}
>>>>>>> 9428320 (Add TelephoneKeypad.java file)
}