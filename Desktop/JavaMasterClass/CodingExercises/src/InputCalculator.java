import java.util.Scanner;
public class InputCalculator {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        long average = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int nextEntry = scanner.nextInt();
                count++;
                sum += nextEntry;
            } else {
                break;
            }
            scanner.nextLine(); // should use, but not necessary for this use case
        }
        average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
