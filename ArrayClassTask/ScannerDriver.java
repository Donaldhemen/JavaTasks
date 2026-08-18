//import java.util.Scanner;
//import static java.lang.System.in;
// static belongs to a class
// non-static belongs to an object of a class

public class ScannerDriver{
	public static void main(String... args){
		java.util.Scanner inputCollector = new java.util.Scanner(in);

		Scanner rubbishScanner = new Scanner(); // create the object

		System.out.println("What is the name of this cohort?");
		String nameOfCohort = inputCollector.nextLine();
		String fakeName = rubbishScanner.nextLine();

		int fakeNumber = rubbishScanner.nextInt();

		System.out.println(nameOfCohort);
		System.out.println(fakeName);
		System.out.println(fakeNumber);
	}
}