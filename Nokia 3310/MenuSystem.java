import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runMainMenu = true;

        // 1. Outer While Loop for Main Menu
        while (runMainMenu) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Go to Reports Sub-Menu");
            System.out.println("2. System Settings");
            System.out.println("3. Exit Program");
            System.out.print("Select an option: ");
            
            int mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    boolean runSubMenu = true;
                    
                    // 2. Inner While Loop for Sub-Menu
                    while (runSubMenu) {
                        System.out.println("\n--- REPORTS SUB-MENU ---");
                        System.out.println("1. View Sales Report");
                        System.out.println("2. View User Logs");
                        System.out.println("3. Back to Main Menu");
                        System.out.print("Select a sub-option: ");
                        
                        int subChoice = scanner.nextInt();

                        switch (subChoice) {
                            case 1:
                                System.out.println("[Action] Displaying Sales Report...");
                                break;
                            case 2:
                                System.out.println("[Action] Displaying User Logs...");
                                break;
                            case 3:
                                System.out.println("Returning to Main Menu...");
                                // 3. Breaking this loop returns control to the Main Menu
                                runSubMenu = false; 
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break; // Breaks out of Main Menu case 1, keeping Main Menu running

                case 2:
                    System.out.println("[Action] Opening System Settings...");
                    break;

                case 3:
                    System.out.println("Exiting application. Goodbye!");
                    runMainMenu = false; // Terminates the program loop entirely
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
