public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2049));
        System.out.println(getDaysInMonth(3,2049));

    }



    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999){

            return false;

        }else{

            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        }



    }

    public static int getDaysInMonth(int month, int year){

        if(month < 1 || month > 12 || year < 1 || year >9999){

            return -1;

        }

        int daysInMonth;

        switch(month){

            case 1: case 3:case 5: case 7 : case 8: case 10: case 12:

                daysInMonth = 31;

                break;

            case 2:

                daysInMonth = isLeapYear(year) ? 29:28;

                break;

            default:

                daysInMonth = 30;

                break;

        }

        return daysInMonth;

    }

}
