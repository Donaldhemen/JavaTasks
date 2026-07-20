// import scanner
// read score out of 50
// convert score out of 100 (scaled score)
// print both original and scaled values

import java.util.Scanner;
public class OriginalAndScaledScore {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter student's score: ");
	double originalScore = input.nextDouble();
	

	double scaledScore = originalScore * 2;
	

	System.out.printf("Original marks: %f%nScaled marks: %f%n", originalScore, scaledScore);
	}
} 