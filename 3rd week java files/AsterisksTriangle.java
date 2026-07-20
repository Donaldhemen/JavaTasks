 // import scanner
// prompt to input length of triangle from 1 to 10
// set input of length 
// set counter to one
// while counter is less than or equal to length
// import scanner
// collect length inp[ut from user 
// if length is less than one or greater than break
// set column to 1
// inner while column is less than or equal to length
// print "*"
// column ++
// display print line 
// set counter ++ 

import java.util.Scanner;
public class AsterisksTriangle {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter length between 1 and 10: ");
	int length = input.nextInt();
	int counter = 1;
	

		while (counter <= length) { 
			if (length < 1 && length < 10) {
			break;
			}
			int column = 1;
			while (column <= counter){
			System.out.print("*");
			column++;
			}
			System.out.println();
			counter++ ;
		}
	}
}