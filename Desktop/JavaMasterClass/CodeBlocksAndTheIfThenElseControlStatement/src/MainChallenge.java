public class MainChallenge {
    public static void main(String[] args) {

        calculateScore(true, 2000, 6, 2342);

        int score = 10000;
        int finalScore = score;
        boolean gameOver = true;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

//        boolean newGameOver = true;
//        int newFinalScore = 1000;
//        int newLevelCompleted = 82;
//        int newBonus = 20;
//
//        if (newGameOver) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }

    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}