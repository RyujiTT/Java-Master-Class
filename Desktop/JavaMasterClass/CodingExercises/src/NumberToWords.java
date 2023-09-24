public class NumberToWords {
    public static void main(String[] args) {

    }

    public static void numberToWords(int number){
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Invalid Value"};
        if (number >= 0) {
            String numStr = Integer.toString(number);
            for(int i=0; i<numStr.length(); i++){
                System.out.print(words[Character.getNumericValue(numStr.charAt(i))] + " ");
            }
        } else {
            System.out.print(words[10]); // to print "Invalid Value"
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + number % 10; // store the last digit in the reversed variable
            number /= 10;                           // remove the last digit
        }
        return reverse;
    }
    public static int getDigitCount(int number) {
        if(number < 0) return -1;                  // if number is negative, return -1 to indicate an invalid value
        int count = 0;
        do {                                       // use do-while loop to execute the code once, before checking condition ( include number 0 )
            count ++;
            number /= 10;
        } while (number > 0);
        return count;
    }

}
