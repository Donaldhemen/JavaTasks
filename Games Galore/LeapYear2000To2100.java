// set leap year to 2000
// set leap year <= 2100 
// set increment += 4
// print 10 per line


public class LeapYear2000To2100 {
	public static void main(String[] args) {
	

		for (int leapYear = 2000; leapYear <= 2100; leapYear+=4) { 
			
			System.out.print(leapYear + " ");

			if (leapYear % 40 == 0){

				System.out.println();
			}
		}
		
	}
}