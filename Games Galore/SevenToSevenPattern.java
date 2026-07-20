// set loop variable: counter = 7
// set condition to >=1 decrement 
// second parallel loop counter = 2 
// condition <= 7
// display on one line

public class SevenToSevenPattern {
	public static void main(String[] args) {
		for (int counter = 7; counter >= 1; counter--) {
			System.out.print(" " + counter);
		}
		for (int counter = 2; counter <= 7; counter++) {
			System.out.print(" " + counter);
		}
	}
}