import java.util.Scanner;
public class UserAge {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter user's age: ");
	int age = input.nextInt();
	
	System.out.printf("User will be %d years old next year", age + 1);
}
}