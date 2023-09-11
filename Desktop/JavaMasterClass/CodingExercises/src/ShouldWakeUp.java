public class ShouldWakeUp {
    public static void main(String[] args) {
        shouldWakeUp(false, 5);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        return barking && hourOfDay>=0 && (hourOfDay<8 || hourOfDay==23);

    }

}
