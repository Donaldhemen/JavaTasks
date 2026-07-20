// set control variable to 1
// set loop condition to less than or equal to 100
// set counter increment counter++
// if counter %6 != 0
// prompt display print counter



public class SkippingMultiplesOf6While {
	public static void main(String[] args) {
		
		int counter = 1;

		while (counter <= 100) { 
			if ( counter % 6 != 0) {	 
			System.out.printf("%d ", counter);
			}
				
			counter++;
		}
		System.out.println();
	}
}