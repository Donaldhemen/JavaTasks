// import scanner
// read username and password integer
// if username is admin and password is 1234
// print access granted 
// else print access denied

import java.util.Scanner;
public class UsernameAndPassword {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter username: ");
	String username = input.nextLine();

	System.out.print("Enter password: ");
	int password = input.nextInt();
	
	if (username == "admin" && password == 1234) {
		System.out.println("Access Granted");
	}
	else {
		System.out.println("Access denied");
	}
}
}