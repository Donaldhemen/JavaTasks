public class Method {
	public static int add(int a, int b){
		int sum = a + b;
		return sum;
	}

	public static int subtract(int a, int b){
		int sub = a - b;
		return sub;
	}
//	Exercise 1
	public static void printWelcomeMessage(){
		String welcomeMessage = "Welcome to Java!";
		System.out.println(welcomeMessage);
	}
//	Exercise 2
	public static int doubleIt(int a) {
		int twice = a * 2;
		return twice;
	}
//	Exercise 3
	public static boolean isNegative(int n){
		if (n < 0) {
			return true;
		}
		else {
			return false;
		}
	}
//	Exercise 4
	public static int printTimesTable(int a){
		int multiples = 1;
		for (int i = 1; i <= 5; i++)
				multiples = a * i;
				System.out.println(multiples);
		return multiples++;
	}
//	Exercise 5
	public static int average(int a, int b, int c){
		int mean = (a + b + c) / 3;
		return mean;
	}
//	Exercise 6
	public static boolean range(int a, int low, int high){
		if (a > low && a < high) {
			return true;
		}
		else {
			return false;	
		}
		
	}
	public static void main(String[] args) {
		int sumResult = add(10, 5);
		int subtractResult = subtract(12, 7);
		printWelcomeMessage();
		int doubleResult = doubleIt(7);
		boolean negativeResult = isNegative(-9);
		int timeTable = printTimesTable(5);
		int averageResult = average(4, 5, 6);
		boolean rangeResult = range(5, 3, 7);
		System.out.println(sumResult);
		System.out.println(subtractResult);

		System.out.println(doubleResult);
		System.out.println(negativeResult);
		System.out.println(timeTable);
		System.out.println(averageResult);
		System.out.println(rangeResult);
	}
}