// set counter to 1
// for loop condition counter <= 10; counter++
// inner for loop initialise column to 1; column <= counter; column++
// inner loop print ("*")
// main loop println

public class TrianglesAsterisks5 {
	public static void main(String[] args) {

		for (int counter = 1; counter <= 10; counter++) {
			
			for (int column = 1; column <= counter; column++) {
				System.out.print("*");
			}
			for (int space = 10; space >= counter; space--) {
				System.out.print(" ");
			}
			for (int column = 10; column >= counter; column--) {
				System.out.print("*");
			}
			for (int space = 1; space <= counter; space++) {
				System.out.print(" ");
			}
			for (int space = 1; space <= counter; space++) {
				System.out.print(" ");
			}
			for (int column = 10; column >= counter; column--) {
				System.out.print("*");
			}
			for (int space = 10; space >= counter; space--) {
				System.out.print(" ");
			}
			for (int column = 1; column <= counter; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}