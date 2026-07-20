// import scanner
// initialise and print main menu 
// read main menu choice as integer from user
// switch case 1 to 13 for main menu list
// insert phone book menu string value in main menu switch case 1 and break
// print phone book menu 
// read phone book menu choice as integer from user
// switch case 1 to 10 for phone book menu list 
// insert options menu string value in phone book switch case 8  before break 
// print options menu 
// read options menu choice as integer from user
// insert Messages menu string value in main menu switch case 2 and break
// print message menu 
// read message menu choice as integer from user
// switch case 1 to 10 for message menu list
// insert message settings string value in switch case 7 between break
// print message settings menu
// read message settings menu choice as integer from user
// switch case 1 and 2 for message settings menu list
// insert set menu string value in switch case 1 between break
// print set menu
// read set menu choice as integer from user
// switch case 1 to 3 for set menu list
// insert common menu string value in message setting menu case 2
// print common menu 
// read common menu value as integer from user
// switch case 1 to 3 for common menu list
// insert call register menu string value in main menu case 3 before break
// 

import java.util.Scanner;
public class Nokia3310MenuBackUp{
	
	public static void main(String... args){
		Scanner inputCollector = new Scanner(System.in);

		String mainMenu = """
List of menu functions

1. Phone book
2. Messages
3. Chat
4. Call Register
5. Tones
6. Settings
7. Call divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profiles
13. SIM services
""";
		System.out.println(mainMenu);
		int mainMenuChoice = inputCollector.nextInt();

		switch(mainMenuChoice){
		case 1 : System.out.println("Phone book menu");
			String phoneBookMenu = """

1. Search
2. Service Nos 
3. Add name 
4. Erase
5. Edit
6. Assign tone
7. Send b'card
8. Options
9. Speed dials
10. Voice tags
""";
			System.out.println(phoneBookMenu);
			int phoneBookMenuChoice = inputCollector.nextInt();

			switch(phoneBookMenuChoice) {
			case 1 : System.out.println("Search"); break;
			case 2 : System.out.println("Service Nos"); break;
			case 3 : System.out.println("Add name"); break;
			case 4 : System.out.println("Erase"); break;
			case 5 : System.out.println("Edit"); break;
			case 6 : System.out.println("Assign tone"); break;
			case 7 : System.out.println("Send b'card"); break;
			case 8 : System.out.println("Options"); 
					String optionsMenu = """

1. Type of view
2. Memory status 
""";
					System.out.println(optionsMenu);
					int optionsMenuChoice = inputCollector.nextInt();

					switch(optionsMenuChoice){
					case 1 : System.out.println("Type of view"); break;
					case 2 : System.out.println("Memory status"); break;
					default : System.out.println("Invalid input");
					}
					break;
			case 9 : System.out.println("Speed dials"); break;
			case 10 : System.out.println("Voice tags"); break;
			default : System.out.println("Invalid input");
			} 
			break;

		case 2 : System.out.println("Messages"); 
			String messagesMenu = """

1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info Service
9. Voice mailbox number
10. Service command editor
""";
				System.out.println(messagesMenu);
				int messagesMenuChoice = inputCollector.nextInt();

			switch(messagesMenuChoice){
			case 1 : System.out.println("Write messages"); break;
			case 2 : System.out.println("Inbox"); break;
			case 3 : System.out.println("Outbox"); break;
			case 4 : System.out.println("Picture messages"); break;
			case 5 : System.out.println("Templates"); break;
			case 6 : System.out.println("Smileys"); break;
			case 7 : System.out.println("Message settings"); 
					String messagesSettingsMenu = """
1. Set 1
2. Common
""";
					System.out.println(messagesSettingsMenu);
					int messagesSettingsMenuChoice = inputCollector.nextInt();

					switch(messagesSettingsMenuChoice){
					case 1 : System.out.println("Set 1"); 
							String set1Menu = """
1. Message centre Number
2. Messages sent as
3. Message validity
""";
							System.out.println(set1Menu);
							int set1MenuChoice = inputCollector.nextInt();

							switch(set1MenuChoice){
							case 1 : System.out.println("Message centre Number"); break;
							case 2 : System.out.println("Messages sent as"); break;
							case 3 : System.out.println("Message validity"); break;
							default : System.out.println("Invalid input");
								}
							break;
					case 2 : System.out.println("Common"); 
								String commonMenu = """
1. Delivery reports
2. Reply via same centre
3. Character support
""";
							System.out.println(commonMenu);
							int commonMenuChoice = inputCollector.nextInt();

								switch(commonMenuChoice){
								case 1 : System.out.println("Delivery reports"); break;
								case 2 : System.out.println("Reply via same centre"); break;
								case 3 : System.out.println("Character support"); break;
								default : System.out.println("Invalid input");
								}
							break;
						default : System.out.println("Invalid input");
						}
					break;
			case 8 : System.out.println("Info Service"); break;
			case 9 : System.out.println("Voice mailbox number"); break;
			case 10 : System.out.println("Service command editor"); break;
			default : System.out.println("Invalid input");
				} 
			break;
		case 3 : System.out.println("Chat"); break;
		case 4 : System.out.println("Call Register"); 
				String callRegisterMenu = """

1. Missed calls
2. Recieved calls
3. Dialled calls
4. Erase recent calls lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepaid credit
""";
				System.out.println(callRegisterMenu);
				int callRegisterMenuChoice = inputCollector.nextInt();

				switch(callRegisterMenuChoice){
				case 1 : System.out.println("Missed calls"); break;
				case 2 : System.out.println("Recieved calls"); break;
				case 3 : System.out.println("Dialled calls"); break;
				case 4 : System.out.println("Erase recent calls lists"); break;
				case 5 : System.out.println("Show call duration"); 
						String showCallDurationMenu = """
1. Last call duration
2. All calls duration
3. Recieved calls duration
4. Dialled calls duration
5. Clear timers
""";
						System.out.println(showCallDurationMenu);
						int showCallDurationMenuChoice = inputCollector.nextInt();

						switch(showCallDurationMenuChoice){
						case 1 : System.out.println("Last call duration"); break;
						case 2 : System.out.println("All calls duration"); break;
						case 3 : System.out.println("Recieved calls duration"); break;
						case 4 : System.out.println("Dialled calls duration"); break;
						case 5 : System.out.println("Clear timers"); break;
						default : System.out.println("Invalid input");
						}
					break;
				case 6 : System.out.println("Show call costs"); 
						String showCallCostsMenu = """
1. Show last call costs
2. All calls costs
3. Clear counters
""";
						System.out.println(showCallCostsMenu);
						int showCallCostsMenuChoice = inputCollector.nextInt();

						switch(showCallCostsMenuChoice){
						case 1 : System.out.println("Show last call costs"); break;
						case 2 : System.out.println("All calls costs"); break;
						case 3 : System.out.println("Clear counters"); break;
						default : System.out.println("Invalid input");
						}
					break;
				case 7 : System.out.println("Call cost settings"); 
						String callCostSettingsMenu = """
1. Call cost limit
2. Show costs in
""";
						System.out.println(callCostSettingsMenu);
						int callCostSettingsMenuChoice = inputCollector.nextInt();

						switch(callCostSettingsMenuChoice){
					case 1 : System.out.println("Call cost limit"); break;
					case 2 : System.out.println("Show costs in"); break;
					default : System.out.println("Invalid input");
					}
					break;
				case 8 :System.out.println("Prepaid credit"); break;
				default : System.out.println("Invalid input"); 
				}
			break;
		case 5 : System.out.println("Tones"); 
				String tonesMenu ="""
1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Composer
5. Message alert tone
6. Keypad tones
7. Warning and game tones
8. Vibrating alert
9. Screen saver
""";
				System.out.println(tonesMenu);
				int tonesMenuChoice = inputCollector.nextInt();

				switch(tonesMenuChoice){
				case 1 : System.out.println("Ringing tone"); break;
				case 2 : System.out.println("Ringing volume"); break;
				case 3 : System.out.println("Incoming call alert"); break;
				case 4 : System.out.println("Composer"); break;
				case 5 : System.out.println("Message alert tone"); break;
				case 6 : System.out.println("Keypad tones"); break;
				case 7 : System.out.println("Warning and game tones"); break;
				case 8 : System.out.println("Vibrating alert"); break;
				case 9 : System.out.println("Screen saver"); break;
				default : System.out.println("Invalid input");
				}
			break;
		case 6 : System.out.println("Settings"); 
				String settingsMenu = """
1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
""";
				System.out.println(settingsMenu);
				int settingsMenuChoice = inputCollector.nextInt();

				switch(settingsMenuChoice){
				case 1 : System.out.println("Call settings"); 
						String callSettingsMenu = """
1. Automatic redial
2. Speed dialling
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer
""";
						System.out.println(callSettingsMenu);
						int callSettingsMenuChoice = inputCollector.nextInt();

						switch(callSettingsMenuChoice){
						case 1 : System.out.println("Automatic redial"); break;
						case 2 : System.out.println("Speed dialling"); break;
						case 3 : System.out.println("Call waiting options"); break;
						case 4 : System.out.println("Own number sending"); break;
						case 5 : System.out.println("Phone line in use"); break;
						case 6 : System.out.println("Automatic answer"); break;
						default : System.out.println("Invalid input");
						}
					break;
				case 2 : System.out.println("Phone settings"); 
						String phoneSettingsMenu = """
1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Lights
6. Confirm SIM service actions
""";
						System.out.println(phoneSettingsMenu);
						int phoneSettingsMenuChoice = inputCollector.nextInt();

						switch(phoneSettingsMenuChoice){
						case 1 : System.out.println("Language"); break;
						case 2 : System.out.println("Cell info display"); break;
						case 3 : System.out.println("Welcome note"); break;
						case 4 : System.out.println("Network selection"); break;
						case 5 : System.out.println("Lights"); break;
						case 6 : System.out.println("Confirm SIM service actions"); break;
						default : System.out.println("Invalid input");
						}
					break;
				case 3 : System.out.println("Security settings"); 
						String securitySettingsMenu = """
1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Phone security
6. Change access codes
""";
						System.out.println(securitySettingsMenu);
						int securitySettingsMenuChoice = inputCollector.nextInt();

						switch(securitySettingsMenuChoice){
						case 1 : System.out.println("PIN code request"); break;
						case 2 : System.out.println("Call barring service"); break;
						case 3 : System.out.println("Fixed dialling"); break;
						case 4 : System.out.println("Closed user group"); break;
						case 5 : System.out.println("Phone security"); break;
						case 6 : System.out.println("Change access codes"); break;
						default : System.out.println("Invalid input");
						}
					break;
				case 4 : System.out.println("Restore factory settings"); break;
				default : System.out.println("Invalid input");
				}
			break;
		case 7 : System.out.println("Call divert"); break;
		case 8 : System.out.println("Games"); break;
		case 9 : System.out.println("Calculator"); break;
		case 10 : System.out.println("Reminders"); break;
		case 11 : System.out.println("Clock"); 
				String clockMenu = """
1. Alarm clock
2. Clock settings
3. Date settings
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
""";
				System.out.println(clockMenu);
				int clockMenuChoice = inputCollector.nextInt();

				switch(clockMenuChoice){
				case 1 : System.out.println("Alarm clock"); break;
				case 2 : System.out.println("Clock settings"); break;
				case 3 : System.out.println("Date settings"); break;
				case 4 : System.out.println("Stopwatch"); break;
				case 5 : System.out.println("Countdown timer"); break;
				case 6 : System.out.println("Auto update of date and time"); break;
				default : System.out.println("Invalid input");
				}
			break;
		case 12 : System.out.println("Profiles"); break;
		case 13 : System.out.println("SIM services"); break;
		default : System.out.println("Invalid input");	
		}
	}
}