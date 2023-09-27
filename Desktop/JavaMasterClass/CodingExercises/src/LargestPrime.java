public class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(345));

    }

    public static int getLargestPrime(int number){
        if (number < 2) {
            return -1;
        }

        int i = 2;
        while(i <= number/2) {
            if (number % i == 0) {
                number /= i;
                continue; // if divisor found, skip the i++
            }
            i++; // increment when divisor isn't found
        }
        return number;
    }
}
