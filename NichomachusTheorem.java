// first number on nth row = n(n-1) + 1
// last number on nth row = n(n+1) + 1

import java.util.Scanner;
public class NichomachusTheorem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter nth row:");
		int rowNumber = input.nextInt();
		
		int oddNumber = 1;

		for (int row = 1; row <= rowNumber; row++) {
			for ( int space = rowNumber; space >= row; space--){
				System.out.print("  ");
			}
			for (int column = 1; column <= row; column++){
				System.out.print(oddNumber + "  ");
				oddNumber+=2;
			}
			System.out.println();
		}
	}
}