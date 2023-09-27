public class FlourPackProblem {
    public static void main(String[] args) {

        System.out.println(canPack(4, 5, 25));

    }

    public static boolean canPack(int bigCount, int smallCount, int Goal){
        if (bigCount<0||smallCount<0||Goal<0) return false;
        boolean rest = Goal%5<=smallCount;
        return (bigCount*5+smallCount>=Goal)? rest : false;
    }
}
