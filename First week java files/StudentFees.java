import java.util.Scanner;
public class StudentFees {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter total fees: ");
	int fees = input.nextInt();
	
	System.out.printf("Total fees has %d N1000 notes%n", fees / 1000);
	System.out.printf("Total fees has %d N500 notes%n", fees / 500);
	System.out.printf("Total fees has %d N200 notes%n", fees / 200);
	System.out.printf("Total fees has %d N100 notes%n", fees / 100);
	System.out.printf("Total fees has %d N50 notes%n", fees / 50);
}
} 