// set total to zero
// set counter to 2
// while counter is less than or equal to 99 
// set counter ++
//  print total prompt

public class TotalNumbersBetween1To100WhileLoop {
    public static void main(String[] args) {

	int total = 0;
	int counter = 2;

		while (counter <= 99) { 
			total += 1;
			
			counter++ ;
		}
		System.out.printf("%d ", total);
	}
}