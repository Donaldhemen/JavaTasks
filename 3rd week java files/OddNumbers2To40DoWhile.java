// set counter to 1
// do declaration and prompt print
// counter+=2 
// while counter is less than or equal to 41



public class OddNumbers2To40DoWhile {
	public static void main(String[] args) {
		int counter = 1;

		do {
			System.out.printf("%d ", counter);
			counter +=2;
		} while (counter <= 41);

		System.out.println();
	}
}