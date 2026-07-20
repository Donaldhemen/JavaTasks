 // set counter to 3
// set sum to 0 
// while counter is greater than or equal to 30
// sum is equal to sum plus counter 
// set counter += 3 
// display sum in print prompt

public class SumMultiplesOf3To30 {
    public static void main(String[] args) {

	int counter = 3;
	int sum = 0;

	while (counter <= 30) { 
		sum = sum + counter;
		counter +=3;
		}
	System.out.printf("%d ", sum);
	}
}