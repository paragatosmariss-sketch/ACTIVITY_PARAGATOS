public class Activity3_Paragatos {
    public static void main(String[] args) {
        int age = 20;
        boolean hasValidID = true;

        boolean allowedToEnter = age >= 18 && hasValidID;

        System.out.println("Allowed to enter: " + allowedToEnter);
    }
}