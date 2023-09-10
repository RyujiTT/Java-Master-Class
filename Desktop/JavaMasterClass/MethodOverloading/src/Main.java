// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Ryuji", 300));
        System.out.println("New score is " + calculateScore(400));
        System.out.println("New score is " + calculateScore());
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }
}