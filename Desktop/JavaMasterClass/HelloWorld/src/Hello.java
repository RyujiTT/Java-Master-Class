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

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
