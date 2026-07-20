// set counter to 1
// do  prompt print counter * 5
// counter++ 
// while counter is less than or equal to 12



public class MultiplicationOf5DoWhile {
	public static void main(String[] args) {
		int counter = 1;

		do {
			System.out.printf("%d%n", counter * 5);
			counter ++;
		} while (counter <= 12);

		System.out.println();
	}
}