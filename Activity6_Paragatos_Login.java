import java.util.Scanner;

public class Activity6_Paragatos_Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid username or password.");

                if (attempt == 3) {
                    System.out.println("Maximum attempts reached. Access denied.");
                } else {
                    System.out.println("Attempts remaining: " + (3 - attempt));
                }
            }
        }

        input.close();
    }
}
