public class AllFactors {

    public static void main(String[] args) {
        printFactors(17);
    }
    public static void printFactors(int x){
        if(x < 1){
            System.out.println("Invalid Value");
        }
        for(int i = 1; i<=x ;i++){
            if(x % i == 0){
                System.out.println(i);
            }
        }
    }
}
