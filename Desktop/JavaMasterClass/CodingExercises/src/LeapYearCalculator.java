public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean leapYear= isLeapYear(2012);

        if (leapYear){
            System.out.println("This year is leap!");
        } else {
            System.out.println("This year is invalid or not leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

}
