// loop variable = 1
// loop condition <= 1000
// prime numbers selection
// if number is divisible by 1 and itself

public class TwinPrimes {
	public static void main(String[] main) {
	
		for(int number = 2; number <= 1000; number++) {
			if (number % 2 != 0 && number % 3 !=0  && number % 5 != 0){
			System.out.printf("%d ", number);
			}
//n mod prime != 0;
		}
	}
}
