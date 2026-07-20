// import scanner
// prompt to enter a username
// collect input for username
// prompt to enter password
// initialise username
// initialise password
// do loop condition and
// collect next number in loop
// counter++
// while counter is greater than or equal to 1


import java.util.Scanner;
public class LoginSimulationDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");		 		
		String userInput = input.nextLine();

		System.out.print("Enter password: ");		 		
		String passwordInput = input.nextLine();
		
		String username = "hemendonald";
		String password = "twitter3";
		
		int counter = 1;

		do {
			if (userInput == username && passwordInput == password) {
			System.out.print("Login Successful");
			} 
			else {
			System.out.print("Incorrect username or password");
			} 
			counter++;
		} while (counter <= 1);

		System.out.println();
	}
}