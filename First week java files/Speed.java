import java.util.Scanner;
public class Speed {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter driver speed: ");
	int speed = input.nextInt();
	
	if(speed <= 120) {
	System.out.print("No violation");
	}
	if(speed >= 121 && speed <= 140) {
	System.out.print("Warning-fine: N5000");
	}
	if(speed >= 141 && speed <= 160) {
	System.out.print("Serious violation-fine: N15000");
	}
	if(speed > 160) {
	System.out.print("Dangerous driving-fine: N50000 and licence suspension");
	}
}
}