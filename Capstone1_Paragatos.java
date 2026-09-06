import java.util.Scanner;

public class Capstone1_Paragatos {

    static Scanner input = new Scanner(System.in);
    static double balance = 100.00;

    public static void main(String[] args) {

        System.out.println("Dial *143# to access Sun Services");
        System.out.print("Enter USSD Code: ");

        String ussd = input.nextLine();

        if (ussd.equals("*143#")) {
            mainMenu();
        } else {
            System.out.println("Invalid USSD Code.");
        }
    }

    public static void mainMenu() {

        int choice;

        do {
            System.out.println("\n** Load Registration **");
            System.out.println("[1] Unli Text");
            System.out.println("[2] Unli Call");
            System.out.println("[3] Unli Call N Text");
            System.out.println("[4] Check Balance");
            System.out.println("[5] Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    unliText();
                    break;

                case 2:
                    unliCall();
                    break;

                case 3:
                    unliCallNText();
                    break;

                case 4:
                    System.out.println("\nRemaining load balance: P" + balance);
                    break;

                case 5:
                    System.out.println("\nThank you for using our service!");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 5);
    }

    public static void unliText() {

        System.out.println("\n** Enjoy Unli Text **");
        System.out.println("[1] 1 Day for P10");
        System.out.println("[2] 3 Days for P30");
        System.out.println("[3] 5 Days for P50");
        System.out.println("[4] Back");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();

        double price = 0;
        int days = 0;

        switch (choice) {

            case 1:
                price = 10;
                days = 1;
                break;

            case 2:
                price = 30;
                days = 3;
                break;

            case 3:
                price = 50;
                days = 5;
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("\n-> Get Unli Text good for " + days
                + " day/s for only P" + price);

        System.out.println("[1] Subscribe");
        System.out.println("[2] Back");
        System.out.println("[3] Exit");
        System.out.print("Enter choice: ");

        int subscribeChoice = input.nextInt();

        if (subscribeChoice == 1) {

            if (balance >= price) {

                balance -= price;

                System.out.println("\nYou have successfully registered to Unli Text.");
                System.out.println("Promo duration: " + days + " day/s.");
                System.out.println("Remaining load balance: P" + balance);
                System.out.println("Thank you for using our service!");

                System.out.print("\nPress Enter to continue...");
                input.nextLine();
                input.nextLine();

            } else {
                System.out.println("\nInsufficient load balance.");
            }

        } else if (subscribeChoice == 3) {
            System.exit(0);
        }
    }

    public static void unliCall() {

        System.out.println("\n** Enjoy Unli Call **");
        System.out.println("[1] 1 Day for P15");
        System.out.println("[2] 3 Days for P40");
        System.out.println("[3] 5 Days for P60");
        System.out.println("[4] Back");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();

        double price = 0;
        int days = 0;

        switch (choice) {

            case 1:
                price = 15;
                days = 1;
                break;

            case 2:
                price = 40;
                days = 3;
                break;

            case 3:
                price = 60;
                days = 5;
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("\n-> Get Unli Call good for " + days
                + " day/s for only P" + price);

        System.out.println("[1] Subscribe");
        System.out.println("[2] Back");
        System.out.println("[3] Exit");
        System.out.print("Enter choice: ");

        int subscribeChoice = input.nextInt();

        if (subscribeChoice == 1) {

            if (balance >= price) {

                balance -= price;

                System.out.println("\nYou have successfully registered to Unli Call.");
                System.out.println("Promo duration: " + days + " day/s.");
                System.out.println("Remaining load balance: P" + balance);
                System.out.println("Thank you for using our service!");

                System.out.print("\nPress Enter to continue...");
                input.nextLine();
                input.nextLine();

            } else {
                System.out.println("\nInsufficient load balance.");
            }

        } else if (subscribeChoice == 3) {
            System.exit(0);
        }
    }

    public static void unliCallNText() {

        System.out.println("\n** Enjoy Unli Call N Text **");
        System.out.println("[1] 1 Day for P20");
        System.out.println("[2] 3 Days for P50");
        System.out.println("[3] 5 Days for P80");
        System.out.println("[4] Back");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();

        double price = 0;
        int days = 0;

        switch (choice) {

            case 1:
                price = 20;
                days = 1;
                break;

            case 2:
                price = 50;
                days = 3;
                break;

            case 3:
                price = 80;
                days = 5;
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("\n-> Get Unli Call N Text good for " + days
                + " day/s for only P" + price);

        System.out.println("[1] Subscribe");
        System.out.println("[2] Back");
        System.out.println("[3] Exit");
        System.out.print("Enter choice: ");

        int subscribeChoice = input.nextInt();

        if (subscribeChoice == 1) {

            if (balance >= price) {

                balance -= price;

                System.out.println("\nYou have successfully registered to Unli Call N Text.");
                System.out.println("Promo duration: " + days + " day/s.");
                System.out.println("Remaining load balance: P" + balance);
                System.out.println("Thank you for using our service!");

                System.out.print("\nPress Enter to continue...");
                input.nextLine();
                input.nextLine();

            } else {
                System.out.println("\nInsufficient load balance.");
            }

        } else if (subscribeChoice == 3) {
            System.exit(0);
        }
    }
}