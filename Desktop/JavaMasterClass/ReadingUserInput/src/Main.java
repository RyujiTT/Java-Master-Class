import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int currentYear = 2023;

//        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
//        String userDateOfBirth = "2000";
//
//        int dateOfBirth = Integer.parseInt(userDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWithPartialYear);
    }

//    public static String getInputFromConsole(int currentYear){
//
//        String name = System.console().readLine("Hi, what's your Name?");
//        System.out.println("Hi " + name + ", Thanks for taking the course!");
//
//        String dateOfBirth = System.console().readLine("What year were you born?");
//        int age = currentYear - Integer.parseInt(dateOfBirth);
//
//        return "So you are " + age + " years old";
//    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);
//        String name = System.console().readLine("Hi, what's your Name?");
        System.out.println("Hi, what's your Name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

//        String dateOfBirth = System.console().readLine("What year were you born?");
        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
}