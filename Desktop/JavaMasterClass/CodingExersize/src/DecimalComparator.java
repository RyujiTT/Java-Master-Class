public class DecimalComparator {
    public static void main(String[] args) {
        boolean Decimal = areEqualByThreeDecimalPlaces(435d,235d);
        if(Decimal){
            System.out.println("hello");
        }else {
            System.out.println("Apple");
        }


    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        return (int)(num1*1000) == (int)(num2*1000);
    }
}
