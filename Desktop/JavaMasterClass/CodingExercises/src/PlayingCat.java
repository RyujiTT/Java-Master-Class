public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 45));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
//        if(summer && (temperature >= 25 && temperature <= 45)){
//            return true;
//        } else if(!(summer) && (temperature >= 25 && temperature <= 35)){
//            return true;
//        }
//        return false;
        // refactored code.
        return temperature >= 25 && temperature <= (summer ? 45 : 35);
    }
}
