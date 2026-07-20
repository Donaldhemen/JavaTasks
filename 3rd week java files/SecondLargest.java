public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
        int number = input.nextInt();
 
	int largestNumber = number;
	int secondLargest = 0;

        int numberCounter = 1;

        while (numberCounter <= 10) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number > largestNumber) {
                secondSmallest = largestNumber;
		largestNumber = number;
            }

	if (number > secondLargest && number < largestNumber) {
		secondLargest = number;
            numberCounter++; 
        }

        System.out.printf("Smallest number is %d%n Second Smallest is %d%n", largestNumber, secondLargest);
	}
        
    }
}