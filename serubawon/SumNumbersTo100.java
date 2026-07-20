// Question 50 sum of 1 to 100 for loop
// declare total to zero
// set counter to 1
// for counter is greater than or equal to 100
// set total += counter 
// set counter ++
// print total

public class SumNumbersTo100 {
    public static void main(String[] args) {

	int total = 0;

		for (int counter = 1; counter <= 100; counter++ ) { 
			
			total += counter;

		}
		System.out.printf("%d ", total);
	}
}