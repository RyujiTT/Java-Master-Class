public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean foo = hasTeen(53,41,11);
        if(foo){
            System.out.println("There is teenager!");
        }else{
            System.out.println("There is no teenager");
        }

    }
    public static boolean hasTeen(int age1, int age2, int age3){
        return (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19);
    }

    public static boolean isTeen(int age1){
        return (age1 >= 13 && age1 <= 19);
    }
}
