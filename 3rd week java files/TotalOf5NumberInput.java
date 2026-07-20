// import scanner
// set total to zero
// set counter to one 
// while counter is equal to or less than 5
// prompt to input next number
// collect number input
// total is total added to the number
// counter plus one
// print total of 5 numbers

import java.util.Scanner;
public class TotalOf5NumberInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int total= 0;
        int counter = 1;

        while (counter <= 5) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
		total = total + number;

            counter++; 
        }
	
        System.out.printf("Total of 5 numbers is: %d", total);
        
    }
}