// SumOfNthRow
// import scanner 
// read input for n
// First number on nth row = n(n - 1) + 1
// Last number on nth row = n * n + (n - 1)
// sum = 0 
// for loop row = first; row <= last; row++

import java.util.Scanner;
public class SumOfOddNthRow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the row number: ");
		int rowNumber = input.nextInt();
		
		int first = rowNumber * (rowNumber - 1) + 1;
		int last = rowNumber * rowNumber + (rowNumber - 1);

		int sum = 0;
		
		for ( int row = first; row <= last; row+=2) {  
			
			sum += row; 
		}
		System.out.println("Sum of nth row is:" + sum);
	}
}