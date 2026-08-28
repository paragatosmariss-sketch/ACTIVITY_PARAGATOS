public class Activity7_Part2_Paragatos {
    public static void main(String[] args) {

        for (int table = 1; table <= 10; table++) {

            System.out.println("\nMultiplication Table of " + table);

            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " * " + i + " = " + (table * i));
            }
        }
    }
}