import java.util.Scanner;
public class UserName {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first name: ");
	String firstName = input.nextLine();
	
	System.out.print("Enter last name: ");
	String lastName = input.nextLine();

	System.out.printf("\"Hello, %s %s\"", firstName, lastName); 
}
}