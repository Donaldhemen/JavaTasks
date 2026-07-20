public class SumOfNumbersTen {
	public static void main(String[] args) {
	int sum = 0;
	int number = 10;
	
	while (number <= 20) {

		sum += number;
		++ number;
		}
	System.out.print("Sum of numbers 10 to 20 is " +sum);
	}
}