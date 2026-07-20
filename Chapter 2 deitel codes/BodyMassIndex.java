import java.util.Scanner;
public class BodyMassIndex {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Weight in kg: ");
	double weight = input.nextDouble();
	
	System.out.print("Enter Height in metres: ");
	double height = input.nextDouble();

	double bMI = weight /(height * height);

	System.out.print("BMI:" +bMI);
}
}