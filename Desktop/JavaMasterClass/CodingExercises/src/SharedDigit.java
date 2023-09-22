public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(29, 99));

    }
    public static boolean hasSharedDigit(int x, int y){
        if (x<10 || x>=100 || y<10 || y>=100) {
            return false;
        }

        for (int i = x; i > 0; i /= 10) {
            for (int j = y; j > 0; j /= 10) {
                if(i%10==j%10){
                    return true;
                }
            }
        }
        return false;
    }
}
