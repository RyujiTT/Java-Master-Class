import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the number of lottery numbers and the range of values
        int numberOfNumbers = 6;
        int maxNumber = 49;

        // Generate winning numbers
        int[] winningNumbers = generateWinningNumbers(numberOfNumbers, maxNumber);

        System.out.println("Welcome to the Lottery Ticket App!");
        System.out.println("You will need to select " + numberOfNumbers + " numbers between 1 and " + maxNumber);

        // Get the user's lottery ticket numbers
        int[] userNumbers = getUserNumbers(scanner, numberOfNumbers, maxNumber);

        // Check if the user's numbers match the winning numbers
        int matchingNumbers = countMatchingNumbers(userNumbers, winningNumbers);

        // Display the results
        System.out.println("Winning Numbers: " + Arrays.toString(winningNumbers));
        System.out.println("Your Numbers: " + Arrays.toString(userNumbers));
        System.out.println("Matching Numbers: " + matchingNumbers);

        if (matchingNumbers == numberOfNumbers) {
            System.out.println("Congratulations! You've won the lottery!");
        } else {
            System.out.println("Sorry, you did not win this time. Try again!");
        }
    }

    // Generate random winning lottery numbers
    private static int[] generateWinningNumbers(int numberOfNumbers, int maxNumber) {
        int[] winningNumbers = new int[numberOfNumbers];
        Random random = new Random();

        for (int i = 0; i < numberOfNumbers; i++) {
            int randomNumber;
            do {
                // Generate a random number between 1 and maxNumber
                randomNumber = random.nextInt(maxNumber) + 1;
            } while (contains(winningNumbers, randomNumber)); // Ensure no duplicates

            winningNumbers[i] = randomNumber;
        }

        // Sort the winning numbers in ascending order
        Arrays.sort(winningNumbers);
        return winningNumbers;
    }

    // Get the user's lottery numbers
    private static int[] getUserNumbers(Scanner scanner, int numberOfNumbers, int maxNumber) {
        int[] userNumbers = new int[numberOfNumbers];
        System.out.println("Please enter " + numberOfNumbers + " distinct numbers between 1 and " + maxNumber);

        for (int i = 0; i < numberOfNumbers; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    int number = scanner.nextInt();
                    if (number >= 1 && number <= maxNumber && !contains(userNumbers, number)) {
                        userNumbers[i] = number;
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input
                }
            }
        }

        // Sort the user's numbers in ascending order
        Arrays.sort(userNumbers);
        return userNumbers;
    }

    // Count the number of matching numbers between user numbers and winning numbers
    private static int countMatchingNumbers(int[] userNumbers, int[] winningNumbers) {
        int count = 0;
        for (int userNumber : userNumbers) {
            if (contains(winningNumbers, userNumber)) {
                count++;
            }
        }
        return count;
    }

    // Check if an array contains a specific number
    private static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

