import java.util.Scanner;

public class Activity4_If_Paragatos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Main Menu ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        System.out.println();

        if (choice == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game");
        } else if (choice == 3) {
            System.out.println("You selected Option 3: Settings");
        } else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }
}