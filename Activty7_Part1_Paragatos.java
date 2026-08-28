import java.util.Scanner;

public class Activty7_Part1_Paragatos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the multiplication table you want: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
}
