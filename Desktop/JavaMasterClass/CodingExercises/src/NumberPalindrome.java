public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123443));
        System.out.println(isPalindrome("mam"));
        System.out.println(isPalindrome(123321));
    }
    public static boolean isPalindrome(int number) {
        int absoluteValue = Math.abs(number);
        String numberString = Integer.toString(absoluteValue);
        StringBuilder reversed = new StringBuilder();

        for (int i = numberString.length(); i > 0; i--) {
            reversed.append(numberString.charAt(i - 1));
        }

        return numberString.contentEquals(reversed);
    }

    public static boolean isPalindrome(String textInput) {
        StringBuilder reversed = new StringBuilder();

        for (int i = textInput.length(); i > 0; i--) {
            reversed.append(textInput.charAt(i - 1));
        }

        return textInput.contentEquals(reversed);
    }

}
