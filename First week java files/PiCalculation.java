public class PiCalculation {
	public static void main(String[] args) {
	double firstResult = 4 * (1.00 - 1.00/3 + 1.00/5 - 1.00/7 + 1.00/9 - 1.00/11);

	double secondResult = 4 * (3465.0 - 1155.0 + 693.0 - 495.0 + 385.0 - 315.0) / 3465;

	System.out.printf("First result is %f Second result is %f", firstResult, secondResult);
}
}