// write a method differenceOfTwoNumbers to subtract second integer from first
// subtract = a - b and return subtract
// calculate differenceResult where a = 9, b = 5
// display differenceResult

public class DifferenceOfTwoNumbers {
    public static int differenceOfTwoNumbers(int a, int b){
        int subtract = a - b;
        return subtract;
    }
    public static void main(String[] args){
        int differenceResult = differenceOfTwoNumbers(9, 5);
        System.out.println(differenceResult);
    }
}
