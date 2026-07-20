import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter temperature in Kelvin: ");
	double kelvin = input.nextDouble();
	
	double celsius = kelvin - 273.15;
	double fahrenheit = ((kelvin - 273.15) * 9/5 + 32);
	
	System.out.printf("Value in Kelvin: %f%n Value in Celsius: %f%n Value in Fahrenheit: %f%n", kelvin, celsius, fahrenheit);
	}
}