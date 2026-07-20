public class CustomerService {
	static void main(String... args) {
		Scanner inputCollector = new Scanner(System.in);
		String mainMenu = """
Welcome to Orion Customer Service
Press 1 for English
Press 2 for Yoruba
Press 3 for Igbo
Press 4 for Hausa

""";
System.out.println(mainMenu);
int mainMenuChoice = inputCollector.nextInt();


switch(mainMenuChoice) {
case 1 -> System.out.print("English Menu");
case 2 -> System.out.print("Yoruba Menu");
case 3 -> System.out.print("Igbo Menu");
case 4 -> System.out.print("Hausa Menu");
}
}
}