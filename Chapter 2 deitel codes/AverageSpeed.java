import java.util.Scanner;
public class AverageSpeed {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter distance: ");
	double distance = input.nextDouble();
	
	System.out.print("Enter hours: ");
	double hours = input.nextDouble();
	System.out.print("Enter minutes: ");
	double minutes = input.nextDouble();
	
	double time = hours + minutes / 60;
	double averageSpeed = distance / time;
	
	System.out.printf("Average speed is: %.2f km/h", averageSpeed);
}
}