import java.util.ArrayList;
import java.util.Arrays;
public class ArrayKata{
// 1. maximumIn(ArrayOfIntegers)
    public static int maximumIn(int[] numbers){
        int largest = numbers[0];
    
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
// 2. minimumIn(ArrayOfIntegers)
      public static int minimumIn(int[] numbers){
        int smallest = numbers[0];
    
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
// 3. sumOfArray(ArrayOfIntegers)
    public static int sumOf(int[] numbers){
        int total = 0;
        for(int count = 0; count < numbers.length; count++){
             total += numbers[count];   
        }
        return total;
    }
// 4. sumOfEvenNumbersIn(ArrayOfIntegers)
    public static int sumOfEvenNumbersIn(int[] numbers){
        int total = 0;
        for(int count = 0; count < numbers.length; count++){
             if(numbers[count] % 2 == 0){
                total += numbers[count];
             }   
        }
        return total;
    }   
// 5. sumOfOddNumbersIn(ArrayOfIntegers)
    public static int sumOfOddNumbersIn(int[] numbers){
        int total = 0;
        for(int count = 0; count < numbers.length; count++){
             if(numbers[count] % 2 != 0){
                total += numbers[count];
             }   
        }
        return total;
    }
// 6. maximumAndMinimumOf(ArrayOfIntegers)
    public static int[] maximumAndMinimumOf(int[] numbers){
        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
    
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return new int[] {largest, smallest}; 
    }
// 7. noOfOddNumbersIn(ArrayOfIntegers)
     public static int noOfOddNumbersIn(int[] numbers){
        int counter = 0;
        for(int count = 0; count < numbers.length; count++){
             if(numbers[count] % 2 != 0){
                counter ++;
             }   
        }
        return counter;
    }
// 8. noOfEvenNumbersIn(ArrayOfIntegers)
    public static int noOfEvenNumbersIn(int[] numbers){
        int counter = 0;
        for(int count = 0; count < numbers.length; count++){
             if(numbers[count] % 2 == 0){
                counter ++;
             }   
        }
        return counter;
    }
// 9. evenNumbersIn(ArrayOfIntegers)
     public static int[] evenNumbersIn(int[] numbers){
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] % 2 == 0){
                evenList.add(numbers[count]);
            }
        }

        int[] evenNumbersArray = new int[evenList.size()];

        for(int count = 0; count < evenList.size(); count++){
            evenNumbersArray[count] = evenList.get(count);
        }
        return evenNumbersArray;
    }
// 10. oddNumbersIn(ArrayOfIntegers)
    public static int[] oddNumbersIn(int[] numbers){
        ArrayList<Integer> oddList = new ArrayList<>();

        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] % 2 != 0){
                oddList.add(numbers[count]);
            }
        }

        int[] oddNumbersArray = new int[oddList.size()];

        for(int count = 0; count < oddList.size(); count++){
            oddNumbersArray[count] = oddList.get(count);
        }
        return oddNumbersArray;
    }
// 11. squareNumbersIn(ArrayOfIntegers)
    public static void squareNumbersIn(int[] numbers){
       for(int count = 0; count < numbers.length; count++){
           numbers[count] = numbers[count] * numbers[count]; 
       }
    }

    public static void main(String[] args){
        int[] myNumbers = {30, 40, 10, 23, 11};

        int maxResult = maximumIn(myNumbers);
        int minResult = minimumIn(myNumbers);
        int sumResult = sumOf(myNumbers);
        int evenSumResult = sumOfEvenNumbersIn(myNumbers);
        int oddSumResult = sumOfOddNumbersIn(myNumbers);
        int[] maxAndMinResult = maximumAndMinimumOf(myNumbers);
        int noOfOddResult = noOfOddNumbersIn(myNumbers);
        int noOfEvenResult = noOfEvenNumbersIn(myNumbers);
        int[] evenNumbersArrayResult = evenNumbersIn(myNumbers);
        int[] oddNumbersArrayResult = oddNumbersIn(myNumbers);
        squareNumbersIn(myNumbers);

        System.out.println("The largest element is: " + maxResult);
        System.out.println("The smallest element is: " + minResult);
        System.out.println("The sum of all the elements is: "+ sumResult);
        System.out.println("The sum of all the even elements is: " + evenSumResult);
        System.out.println("The sum of all the odd elements is: " + oddSumResult);
        System.out.println("The maximum and minimum elements are: "+ Arrays.toString(maxAndMinResult));
        System.out.println("The number of odd elements is: "+ noOfOddResult);
        System.out.println("The number of even elements is: "+ noOfEvenResult);
        System.out.println("The even elements are: "+ Arrays.toString(evenNumbersArrayResult));
        System.out.println("The odd elements are: "+ Arrays.toString(oddNumbersArrayResult));
        System.out.println(Arrays.toString(myNumbers));

    }
}
