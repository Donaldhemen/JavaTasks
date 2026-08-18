// write a method that adds all the prime factors of an integer a
// int sum = 0;
// for count = 2; the first prime number
// count * count <= a condition and count++
// while a % count == 0 sum += count 
// a/=count divides the number before next iteration
// if a > 1 sum += a
// return sum
// use sumPrimeFactor method in progam
// display sumPrimeFactorsResult

public class SumPrimeFactors {
    public static int sumPrimeFactor(int number){
        int sum = 0;
        for(int count = 2; count * count <= number; count++){
            while(number % count == 0){
                sum += count;
                a /= count;
            }
        } 
         if (number> 1) {
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args){
       int sumPrimeFactorsResult = sumPrimeFactor(50);
        System.out.println(sumPrimeFactorsResult);
    }
}
