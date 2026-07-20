import java.util.Scanner;
public class SentinelValue {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int totalScore = 0;
	int scoreCounter = 0;

	System.out.print("Enter score or -1 to stop:");
	int score = input.nextInt();

	while (score != -1) {
		totalScore += score;
		System.out.print("Enter another score or -1 to stop: ");
		score = input.nextInt();
		scoreCounter ++;
		}
	System.out.printf("Total is: %d%n", totalScore);
	int average = totalScore / scoreCounter;
	System.out.println("Average score is:" +average);
	}
}