 // set counter to 5
// while counter is less than or equal to 1
// set counter * 5 in print prompt 
// set counter --

public class Number5FactorialWhileLoop {
    public static void main(String[] args) {

	int factorial = 1;
	int counter = 5;

		while (counter >= 1) { 
			factorial *= counter;
			
			counter-- ;
		}
		System.out.printf("%d ", factorial);
	}
}