// set counter to 2
// do declaration and prompt print
// counter+=2 
// while counter is less than or equal to 40



public class EvenNumbers2To40DoWhile {
	public static void main(String[] args) {
		int counter = 2;

		do {
			System.out.printf("%d ", counter);
			counter +=2;
		} while (counter <= 40);

		System.out.println();
	}
}