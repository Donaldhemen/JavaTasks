import java.util.Scanner;
public class BmiCalculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter weight: ");
	int weight = input.nextInt();
	
	System.out.print("Enter height: ");
	int height = input.nextInt();
	int bmi = weight / (height * height);
	
	if(bmi < 18) {
	System.out.print("Underweight");
	}
	if(bmi >= 18 && bmi <= 24) {
	System.out.print("Normal");
	}
	if(bmi >= 25 && bmi <= 29) {
	System.out.print("Underweight");
	}
	if(bmi >= 30) {
	System.out.print("Underweight");
	}
}
}