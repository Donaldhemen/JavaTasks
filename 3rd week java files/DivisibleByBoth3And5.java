// set control variable to 1
// set loop condition to less than or equal to 100
// set counter increment counter++
// if counter%3 and counter %5 == 0
// prompt display print counter



public class DivisibleByBoth3And5 {
	public static void main(String[] args) {
		

		for (int counter = 1; counter <= 100; counter++) { 
			if ( counter % 3 == 0 && counter % 5 == 0) {	 
			System.out.printf("%d ", counter);
			}
				
			
		}
		System.out.println();
	}
}