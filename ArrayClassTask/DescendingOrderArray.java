
import java.util.Arrays;
public class DescendingOrderArray {
	public static int[] inDescendingOrder(int[] numbers){
		
		for(int count = 0; count < numbers.length; count++){
            int swap = 0;
			for(int compare = 0; compare < numbers.length; compare++){
                if(numbers[count] > numbers[compare]){
                    swap = numbers[count];
                    numbers[count] = numbers[compare];
                    numbers[compare] = swap;
                }
            }
              
		}
		return numbers;
	}
	public static void main(String[] args) {
		int[] eobSampleNumbers = {1, 5, 14, 2, 3, 6};

		int[] descendingNumbersResult = inDescendingOrder(eobSampleNumbers);

		System.out.println("The descending order of the elements is: "+ Arrays.toString(descendingNumbersResult));
	}
}
