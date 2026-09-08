import java.util.Scanner;

public class Activity12_paragatos {

    // 1. Identify if a number is odd or even
    public static void oddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN.");
        } else {
            System.out.println(number + " is ODD.");
        }
    }

    // 2. Print your name 50 times
    public static void printName50Times() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". Mariss Stephanie Anne A. Paragatos");
        }
    }

    // 3. Get the square root of a variable
    public static void squareRoot(double number) {
        System.out.println("Square root: " + Math.sqrt(number));
    }

    // 4. Get the power using base and exponent
    public static void power(double base, double exponent) {
        System.out.println("Power: " + Math.pow(base, exponent));
    }

    // 5. Print a random number between 1 and 100
    public static void randomNumber() {
        int random = (int) (Math.random() * 100) + 1;
        System.out.println("Random number: " + random);
    }

    // 6. Get the area of a circle
    public static void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    // 7. Identify if a person is a voter or not
    public static void voter(int age) {
        if (age >= 18) {
            System.out.println("The person is a VOTER.");
        } else {
            System.out.println("The person is NOT A VOTER.");
        }
    }

    // 8. Get the length of a certain word
    public static void wordLength(String word) {
        System.out.println("Length of word: " + word.length());
    }

    // 9. Print a certain word in reverse order
    public static void reverseWord(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("Reversed word: " + reversed);
    }

    // 10. Print your full name and age
    public static void nameAndAge() {
        System.out.println("Full Name: Mariss Stephanie Anne A. Paragatos");
        System.out.println("Age: 19");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== ACTIVITY 12 =====");

        System.out.print("\nEnter a number: ");
        int number = input.nextInt();
        oddEven(number);

        System.out.println("\nName 50 times:");
        printName50Times();

        System.out.print("\nEnter a number for square root: ");
        double sqrtNumber = input.nextDouble();
        squareRoot(sqrtNumber);

        System.out.print("\nEnter base: ");
        double base = input.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = input.nextDouble();

        power(base, exponent);

        System.out.println("\nRandom Number:");
        randomNumber();

        System.out.print("\nEnter radius: ");
        double radius = input.nextDouble();
        circleArea(radius);

        System.out.print("\nEnter age: ");
        int age = input.nextInt();
        voter(age);

        input.nextLine();
        System.out.print("\nEnter a word: ");
        String word = input.nextLine();
        wordLength(word);

        System.out.print("\nEnter a word to reverse: ");
        String reverse = input.nextLine();
        reverseWord(reverse);

        System.out.println("\nFull Name and Age:");
        nameAndAge();

        input.close();
    }
}