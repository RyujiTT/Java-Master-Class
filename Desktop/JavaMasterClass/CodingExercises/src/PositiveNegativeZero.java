public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(3);

    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("postive");
        } else if (number < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
