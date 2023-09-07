public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int finalScore = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//
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
}