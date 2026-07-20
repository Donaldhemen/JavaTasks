// set counter to 1
// for loop condition counter <= 10; counter++
// inner for loop initialise column to 10; column >= counter; column--
// inner loop print ("*")
// main loop println

public class TrianglesAsterisks2 {
	public static void main(String[] args) {

		for (int counter = 1; counter <= 10; counter++) {
			
			for (int column = 10; column >= counter; column--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}