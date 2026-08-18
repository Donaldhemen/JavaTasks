public class PalindromeCheck {
    public static boolean isPalindrome(int number) {
    
        if (number < 0 ) {
            return false;
        }

        int reversed = 0;
        int original = number;

        
        while (original > 0) {
            int lastDigit = original % 10;
            reversed = (reversed * 10) + lastDigit;
            original /= 10;
        }
        
       
        return number == reversed;
    }
    public static void main(String[] args){
        int value = 12345;
        System.out.println(isPalindrome(value));
    }
}
