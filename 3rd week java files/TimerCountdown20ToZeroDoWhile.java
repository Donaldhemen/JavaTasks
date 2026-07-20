// set counter to 20
// do declaration and prompt print
// counter--
// while counter is greater than or equal to 0



public class TimerCountdown20ToZeroDoWhile {
	public static void main(String[] args) {
		int counter = 20;

		do {
			System.out.printf("%d%n", counter);
			counter--;
		} while (counter >= 0);

		System.out.println();
	}
}