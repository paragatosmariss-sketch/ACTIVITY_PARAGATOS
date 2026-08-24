public class Activity_3_Paragatos {
    public static void main(String[] args) {

        
        System.out.println("--- Task 2: Event Entry Check ---");

        boolean allowedToEnter = true;
        System.out.println("Allowed to enter the event: " +
                (allowedToEnter ? "Yes" : "No"));

        System.out.println();

        System.out.println("--- Task 3: Class Status Check ---");

        boolean noClassesToday = true;
        System.out.println("Are there no classes today? " +
                (noClassesToday ? "Yes, no classes." : "No, there are classes."));

        System.out.println();

        System.out.println("--- Task 4: Pass or Fail Check ---");

        int score = 85;
        System.out.println("Score: " + score);

        if (score >= 75) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        System.out.println();

        System.out.println("--- Task 5: Larger Number Check ---");

        int number1 = 10;
        int number2 = 25;

        System.out.println("Number 1: " + number1 + ", Number 2: " + number2);

        if (number1 > number2) {
            System.out.println("The larger number is: " + number1);
        } else {
            System.out.println("The larger number is: " + number2);
        }
    }
}