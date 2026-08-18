//collect ten integers from user to get an array using for loop with loop condition < 10
// declare reverse array
//use decrement and >= 9 to reverse it in a for loop

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter ten integers: ");
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = scanner.nextInt();
        }
        
        for(int index = numbers.length-1; index >= 0; index--){
            System.out.print(numbers[index] + " ");
            
        }
    }
}
