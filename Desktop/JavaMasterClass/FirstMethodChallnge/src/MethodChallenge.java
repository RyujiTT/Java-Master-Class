public class MethodChallenge {
    public static void main(String[] args) {
        int playerPosition1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playerPosition1);

        int playerPosition2 = calculateHighScorePosition(700);
        displayHighScorePosition("Bob", playerPosition2);

        int playerPosition3 = calculateHighScorePosition(400);
        displayHighScorePosition("Lucy", playerPosition3);

        int playerPosition4 = calculateHighScorePosition(13);
        displayHighScorePosition("Mike", playerPosition4);
    }
    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into postion " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }
}
