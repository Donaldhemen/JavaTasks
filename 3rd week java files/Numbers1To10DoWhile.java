// set counter to 1
// do declaration and ++counter 
// while counter is less than or equal to 10
// 



public class Numbers1To10DoWhile {
	public static void main(String[] args) {
		int counter = 1;

		do {
			System.out.printf("%d ", counter);
			++counter;
		} while (counter <= 10);

		System.out.println();
	}
}