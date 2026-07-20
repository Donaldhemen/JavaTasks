// set counter to 1
// for loop condition counter <= 10; counter++
// inner for loop initialise column to 1; column <= counter; column++
// inner loop print ("*")
// main loop println

public class DiamondsAsterisks {
	public static void main(String[] args) {

		for (int counter = 1; counter <= 5; counter++) {
			for (int space = 5; space >= counter; space--){
				System.out.print(" ");
			}
			for (int asterisk = 1; asterisk <= counter; asterisk++){
				System.out.print("*");
			}
			for (int asterisk = 2; asterisk <= counter; asterisk++){
				System.out.print("*");
			}
			for (int space = 5; space >= counter; space--){
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int counter = 1; counter <= 4; counter++) {
			for (int space = 0; space <= counter; space++){
				System.out.print(" ");
			}
			for (int asterisk = 4; asterisk >= counter; asterisk--){
				System.out.print("*");
			}
			for (int asterisk = 3; asterisk >= counter; asterisk--){
				System.out.print("*");
			}
			for (int space = 1; space <= counter; space++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}