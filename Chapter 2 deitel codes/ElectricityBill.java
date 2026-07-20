import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Units Consumed: ");
	double unitsConsumed = input.nextDouble();
	
	System.out.print("Enter Cost per Unit: ");
	double rate = input.nextDouble();

	double totalBill = unitsConsumed * rate;

	System.out.print("Total Bill:" +totalBill);
}
}