public class Activity3_Paragatos {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isHoliday = false;

        boolean noClasses = isWeekend || isHoliday;

        System.out.println("No classes today: " + noClasses);
    }
}