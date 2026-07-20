// set counter to 9
// do declaration and prompt print
// counter+=9 
// while counter is less than or equal to 200



public class DivisibleBy9DoWhile {
	public static void main(String[] args) {
		int counter = 9;

		do {
			System.out.printf("%d%n", counter);
			counter +=9;
		} while (counter <= 200);

		System.out.println();
	}
}