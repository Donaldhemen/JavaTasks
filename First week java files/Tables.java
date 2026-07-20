public class Tables {
	public static void main(String[] args) {

	int num1 = 1;
	
	int num2 = 2;

	int num3 = 3;
	
	int num4 = 4;
	
	int num5 = 5;

	System.out.printf("%s %s %s%n", "Number", "Square", "Cube");
	System.out.printf("%-7d %-7d %-5d%n", num1, num1 * num1, num1 * num1 * num1);
	System.out.printf("%-7d %-7d %-5d%n", num2, num2 * num2, num2 * num2 * num2);
	System.out.printf("%-7d %-7d %-5d%n", num3, num3 * num3, num3 * num3 * num3);
	System.out.printf("%-7d %-7d %-5d%n", num4, num4 * num4, num4 * num4 * num4);
	System.out.printf("%-7d %-7d %-6d%n", num5, num5 * num5, num5 * num5 * num5);  	
	}
}