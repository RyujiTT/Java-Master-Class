public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(424));
    }

    public static boolean isPerfectNumber (int n) {
        if(n < 1) return false;
        int sum = 0;
        double k = Math.sqrt(n);
        for(int i = 1; i <= k; i++) {
            if(n % i == 0) sum += i;
            if(i != (n / i) && n % (n / i) == 0 && (n / i) != n) sum += n / i;
        }
        return sum == n;
    }
}
