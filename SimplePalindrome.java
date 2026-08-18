public class SimplePalindrome{
    public static void main(String[] args){
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int number){
        int original = number;
        int lastDigit = 0;
        int reversed = 0;
        
        while(original > 0){
            lastDigit = original % 10;
            reversed = (reversed * 10) + lastDigit;
            original /= 10;
        }
        if(number != reversed){
        return false;
        }
        else {
        return true;
        }
    }
}
