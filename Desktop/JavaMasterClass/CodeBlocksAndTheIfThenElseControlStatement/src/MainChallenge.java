public class MainChallenge {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 2000, 6, 2342);
        System.out.println("The high score is " + highScore);

        System.out.println("The next high score is " +  calculateScore(true, 1000, 82, 20));

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
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }

        return finalScore;
    }
}