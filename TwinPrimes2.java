// loop variable = 1
// loop condition <= 1000
// prime numbers selection
// if number is divisible by 1 and itself

public class TwinPrimes2 {
    public static void main(String[] args) {
        System.out.println("Twin Prime numbers between 1 and 1000:");
        
        // Loop from 1 up to 998 (so i + 2 does not exceed 1000)
        for (int i = 2; i <= 998; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
