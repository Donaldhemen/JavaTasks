// declare total to zero
// set counter to 1
// while counter is greater than or equal to 50
// set total += counter 
// set counter +=2
// print total

public class SumNumbersTo50While {
    public static void main(String[] args) {

	int total = 0;
	int counter = 1;

		while (counter <= 50) { 
			
			total = total + counter;

			counter++ ;
		}
		System.out.printf("%d ", total);
	}
}