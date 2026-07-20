// set counter to 100 
// while counter is greater than or equal to 1
// set ++ counter in print prompt 
// set counter ++ 

public class CountDownFrom100To1 {
    public static void main(String[] args) {
	
	int counter = 100;

		while (counter >= 1) { 
			System.out.printf("%d ", counter);
			--counter;
		}
	}
}