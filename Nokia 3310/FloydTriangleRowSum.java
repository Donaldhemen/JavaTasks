import java.util.Scanner;

public class FloydTriangleRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row number (n): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Row number must be positive.");
            return;
        }

        // Calculate starting and ending numbers of the nth row
        int start = (n * (n - 1)) / 2 + 1;
        int end = (n * (n + 1)) / 2;

        int sum = 0;
        // Sum numbers in the nth row using a for loop
        for (int i = start; i <= end; i++) {
 //           sum += i;
            System.out.print(" " +i);
        }
        //System.out.println("Sum of row " + n + " in Floyd's Triangle is: " + sum);
    }
}
