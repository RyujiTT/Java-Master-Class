public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAilen = false;
        if (isAilen == true) {
            System.out.println("It is not an alien!");
        }else {
            System.out.println("It is an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar/*isCar == false*/){
            System.out.println(("This is supposed to happen"));
        }
    }
}
