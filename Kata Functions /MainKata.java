import java.util.Scanner;
public class MainKata {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
// 1. is Even function 
        System.out.print("Enter integer to check if even: ");
        int number0 = scanner.nextInt();

        boolean isEvenResult = Kata.isEven(number0);
        System.out.println(isEvenResult);
// 3. subtract function & 
// 4. divide function
        System.out.print("Enter integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter integer: ");
        int num2 = scanner.nextInt();

        int subtractResult = Kata.subtract(num1, num2);
        System.out.println("The difference of " +num1 +" and "+ num2 + " is " + subtractResult);

        float divideResult = Kata.divide(num1, num2);
        System.out.println("The quotient of " +num1 +" and "+ Snum2 + " is " + divideResult);
// 5. factorOf function
        System.out.print("Enter integer to count factors: ");
        int number1 = scanner.nextInt();

        int factorOfResult = Kata.factorOf(number1);
        System.out.println(factorOfResult);
// 6. isSquare function
         System.out.print("Enter integer to check if its a square number: ");
         int number2 = scanner.nextInt();

         boolean isSquareResult = Kata.isSquare(number2);
         System.out.println(isSquareResult);
// 7. isPalindrome function
         System.out.print("Enter five-digit integer to check if its a Palindrome: ");
        int fiveDigit = scanner.nextInt();

        boolean isPalindromeResult = Kata.isPalindrome(fiveDigit);
        System.out.println(isPalindromeResult);
// 8. factorialOf function &
// 9. squareOf function
        System.out.print("Enter integer: ");
        int number3 = scanner.nextInt();

        long factorialResult = Kata.factorialOf(number3);
        System.out.println("The factorial of " + number3 + " is " + factorialResult);
        
        int squareResult = Kata.squareOf(number3);
        System.out.println("The square of " + number3 + " is " + squareResult);

         
    }
    

}
