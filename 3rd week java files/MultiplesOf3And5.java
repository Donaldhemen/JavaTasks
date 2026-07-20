 // set counter to 1
// print line multiples of of 3 and 5 are 
// while counter is greater than or equal to 100
// if counter is divisible by both 3 and 5
// print counter 
// set counter ++ 

public class MultiplesOf3And5 {
    public static void main(String[] args) {

	int counter = 1;
	System.out.println("Multiples of 3 and 5 are: ");

		while (counter <= 100) { 
			if (counter % 3 == 0 && counter % 5 == 0) {
				System.out.printf("%d ", counter);
			}
			counter++ ;
		}
	}
}