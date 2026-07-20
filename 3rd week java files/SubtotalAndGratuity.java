 // import scanner
// display enter subtotal and gratuity rate 
// collect input for subtotal and gratuity
// gratuity is equal to (subtotal * gratuity rate)/100
// declare total is equal to subtotal plus gratuity
// display gratuity and total

import java.util.Scanner;
public class SubtotalAndGratuity {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter subtotal and gratuity rate: ");

	double subtotal = input.nextDouble(); 
	double gratuityRate = input.nextDouble();
	
	double gratuity = (subtotal * gratuityRate) / 100;
	double total = subtotal + gratuity; 
	
	System.out.printf("The gratuity is %.1f and total is %.1f", gratuity, total);
	}
}