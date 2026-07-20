import java.util.Scanner;
public class Electricity {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter kWh consumed: ");
	int kWh = input.nextInt();

	if(kWh >= 0 && kWh <= 50) {
	System.out.printf("Electricity bill is %d", kWh * 25);
	}
	
	if(kWh >= 51 && kWh <= 150) {
	System.out.printf("Electricity bill is %d", kWh * 45);
	}
	if(kWh > 150) {
	System.out.printf("Electricity bill is %d", kWh * 68);
	}
}
}