import java.util.Scanner;
public class Comparing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer: ");
		int number = input.nextInt();
		int cube = number * number * number;
		
		if(number > 500 && cube > 500) {
		System.out.printf("%d and %d is greater than 500", number, cube);
		}
		if(number == 500 && cube == 500) {
		System.out.printf("%d and %d is equal to 500", number, cube);
		} 
		if(number < 500 && cube < 500) {
		System.out.printf("%d and %d is less than 500", number, cube);
		}
	}
}