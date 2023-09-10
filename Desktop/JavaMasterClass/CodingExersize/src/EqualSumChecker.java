public class EqualSumChecker {
    public static void main(String[] args) {
        boolean foo = hasEqualSum(2,3,5);
        if(foo){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return num1 + num2 == num3;
    }
}
