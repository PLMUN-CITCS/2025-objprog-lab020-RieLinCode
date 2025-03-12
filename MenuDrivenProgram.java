import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            displayMenu();
            
            if (userInput.hasNextInt()) {
                int choice = userInput.nextInt();
                handleMenuChoice(choice);
            } else {
                System.out.println("Invalid input! Please enter a valid choice (1-3).\n");
                userInput.next(); // Clear invalid input
            }
        }
    }
    

    public static void displayMenu() {
        System.out.print("\nMenu:\n" + "1. Greet User\n" + "2. Check Even/Odd\n" + "3. Exit\n" + "Enter your choice (1-3): " );
       
    }

    // Method to handle user choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // Validate input
        if (userInput.hasNextInt()) {
            int number = userInput.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
            userInput.next(); // Clear invalid input
        }
    }
}
