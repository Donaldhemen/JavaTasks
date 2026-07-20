import java.util.Scanner;
public class TravelCost {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Destination: ");
	String destination = input.nextLine();

	System.out.print("Enter total distance: ");
	double totalDistance = input.nextDouble();

	System.out.print("Enter price of fuel: ");
	double fuelPrice = input.nextDouble();
	
	System.out.print("Enter Car Mileage: ");
	double carMileage = input.nextDouble();
	
	double fuelNeeded =  totalDistance / carMileage;
	
	double totalCost = fuelPrice * fuelNeeded;
	
	double splitCost = totalCost / 2;
	
	System.out.printf("Fuel needed to go to %s is %.2f litres%n Total cost is N%.2f and split cost is N%.2f%n", destination, fuelNeeded, totalCost, splitCost); 
}
}