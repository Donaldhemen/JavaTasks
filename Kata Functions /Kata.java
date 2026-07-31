public class Kata {
// 1. isEven(integer)
    public static boolean isEven(int number0){
        if (number0 % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
// 3. subtract function
    public static int subtract(int num1, int num2){
        int difference = num1 - num2;
        if (difference > 0){
            return difference;
        }
        else {
            
            return (0 - difference);
        }
    }
// 4. divide(integer, integer)
    public static float divide(int num1, int num2){
        float quotient;
        if (num2 != 0){
            quotient = num1 / num2;
            return quotient;
        } 
        else {
            quotient = 0;
            return quotient;
        }
    }
// 5. factorOf(integer)
     public static int factorOf(int number1){
        int countFactors = 0;
        for(int count = 1; count <= number1; count++){
            if(number1 % count == 0){
                countFactors++;
            }
        }
        return countFactors;
}
// 6. isSquare(integer)
    public static boolean isSquare(int number2){
        int squareRoot = (int) Math.pow(number2, 0.5);
        if (number2 * number2 == squareRoot){
            return true;
        }
        else {
            return false;
        }
        
    }
// 7. isPalindrome(integer)
    public static boolean isPalindrome(int fiveDigit){
       
        int digit0 = fiveDigit / 10000;
        int digit1 = (fiveDigit / 1000) % 10;
        int digit3 = (fiveDigit / 10) % 10;
        int digit4 = fiveDigit % 10;

        if (digit0 == digit4 && digit1 == digit3){
            return true;
        }
        else {
            return false;
        }
    }
// 8. factorialOf(integer)
    public static long factorialOf(int number3){
        long factorial = 1;
        for(int count = number3; count >= 1; count--){
            factorial *= count;
        }
        return factorial;
    }
// 9. squareOf(integer) 
    public static int squareOf(int number3){
        int square = number3 * number3;
        return square;
    }
}
