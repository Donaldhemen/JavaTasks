import java.util.Scanner;
public class SeparateString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter text: ");
		String text = input.nextLine();

		for (int name = text.length()- 1; name >= 0; name--) {
			char letter = text.charAt(name);
			System.out.println(letter);
		}
	}
}