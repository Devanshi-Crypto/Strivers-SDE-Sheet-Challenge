package Day_3_Arrays_part3;

public class modularExponentiation {

    public static int modularExponent(int x, int n, int m) {
        // Write your code here.
        if (n == 0) {
            return 1 % m;
        }

        long result = 1;
        long base = x % m;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * base) % m;
            }
            base = (base * base) % m;
            n /= 2;
        }

        return (int) result;
    }
}