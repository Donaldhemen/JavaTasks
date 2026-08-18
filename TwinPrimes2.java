// loop variable = 1
// loop condition <= 1000
// prime numbers selection
// if number is divisible by 1 and itself

public class TwinPrimes2 {
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int count = 2; count <= Math.sqrt(number); count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        for (int count = 2; count <= 998; count++) {
            if (isPrime(count) && isPrime(count + 2)) {
                System.out.printf("(%d, %d)\n", count, count + 2);
            }
        }
    }
}
