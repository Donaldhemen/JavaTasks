import java.util.Arrays;

public class FibonacciArray{
    public static int[] getFibonacciOfFirst(int number){
        int firstNumber = 0;
        int secondNumber = 1;
        int[] array = new int[number];
        for (int count = 0; count < number; ++count){
            array[count] = firstNumber;
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            
        }
        return array;
    }


}
