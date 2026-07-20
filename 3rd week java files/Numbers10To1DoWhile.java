// set counter to 10
// do declaration and --counter 
// while counter is greater than or equal to 1
// 



public class Numbers10To1DoWhile {
	public static void main(String[] args) {
		int counter = 10;

		do {
			System.out.printf("%d ", counter);
			--counter;
		} while (counter >= 1);

		System.out.println();
	}
}