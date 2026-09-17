import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager_Paragatos {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Todo Manager Menu ---");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("--- All Tasks ---");

                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.print("Enter the task number to update: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        if (index >= 1 && index <= tasks.size()) {
                            System.out.print("Enter the new task: ");
                            String newTask = scanner.nextLine();

                            tasks.set(index - 1, newTask);

                            System.out.println("Task updated successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.print("Enter the task number to remove: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        if (index >= 1 && index <= tasks.size()) {
                            tasks.remove(index - 1);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks cleared successfully!");
                    break;

                case 0:
                    System.out.println("Exiting TodoManager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}