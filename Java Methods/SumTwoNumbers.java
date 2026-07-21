// write a method sumTwoNumbers to add two integers a and b
// calculate sumResult in the program
// display sumResult

public class SumTwoNumbers {
    public static int sumTwoNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        int sumResult = sumTwoNumbers(10, 8);
        System.out.println(sumResult);
    }
}
