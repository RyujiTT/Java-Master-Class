public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(-25983l);

    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            int day = (int)minutes / 1440;

            int year = day / 365;

            int remainingDay = day % 365;

            System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d ");
        }
    }
}
