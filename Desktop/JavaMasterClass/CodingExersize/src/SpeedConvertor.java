public class SpeedConvertor {
    public static void main(String[] args) {
        printConversion(2542d);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) return -1;

        double milesPerHour = kilometersPerHour / 1.609;

        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = SpeedConvertor.toMilesPerHour(kilometersPerHour);
        if(milesPerHour == -1) {
            System.out.println("Invalid Value");
            return;
        }
//        System.out.printf("%1.2f km/h = %d mi/h", kilometersPerHour, milesPerHour);
        System.out.print(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
