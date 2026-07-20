import java.util.Scanner;
public class UserBio {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter name of user: ");
	String userName = input.nextLine();
	
	System.out.print("Enter age of user: ");
	int userAge = input.nextInt();

	

	if (userAge < 18) {
		System.out.printf("%s is a child", userName);
	}
	else if (userAge >= 18) {
		System.out.printf("%s is an adult", userName);
	}
}
}