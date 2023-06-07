package Day_3_Arrays_part3;

public class power {

    public double myPow(double x, int n) {
        // base case
        if (n == 0)
            return 1.0;

        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                // If n is Integer.MIN_VALUE, handle it separately
                x = x * x;
                n = n / 2;
            }
            x = 1 / x;
            n = -n;
        }

        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1)
                result *= x;
            x *= x;
            n /= 2;
        }

        return result;
    }
}
