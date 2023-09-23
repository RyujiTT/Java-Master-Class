public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 225, 249));

    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        }

        int lastDigitX = x % 10;
        int lastDigitY = y % 10;
        int lastDigitZ = z % 10;

        if ((lastDigitX == lastDigitY) || (lastDigitX == lastDigitZ) || (lastDigitZ == lastDigitY)) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
