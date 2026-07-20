// import scanner
// display enter amount of water in kilograms
// collect input for amount of water in kilograms 
// display enter initial temperature
// collect input for initial temperature
// display enter final temperature
// collect input for final temperature
// declare energy needed = M * (finalTemperature - initialTemperature) * 4184
// display energy needed

import java.util.Scanner;
public class EnergyNeeded {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of water in kilograms: ");
	double waterInKg = input.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter the final temperature: "); 
	double finalTemperature = input.nextDouble(); 

	double energyNeeded = waterInKg * (finalTemperature - initialTemperature) * 4184;
	
	System.out.printf("The energy needed is %.1f", energyNeeded);
	}
}