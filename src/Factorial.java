import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Factorial {

    public BigInteger calculateFactorial_helper(int n) {
        if (n < 0) {
            throw new RuntimeException("eeeeee");
        } else {
            return calculateFactorial(n);
        }
    }

    public BigInteger calculateFactorial(int n) {

        if (n > 1) {
            return BigInteger.valueOf(n).multiply(calculateFactorial(n - 1));
        }
        return BigInteger.ONE;
    }


    public BigDecimal divideFactorials(int a, int b) {

        if (a < 0 || b < 0){
            throw new RuntimeException("Can't find the factorial of a negative number!");
        }

        if (a > b) {
            return calculateInRange(a, b);
        }
        else if (b > a) {
            return BigDecimal.ONE.divide(calculateInRange(b, a), 10,RoundingMode.HALF_UP);
        }
        return BigDecimal.ONE;
    }

    public BigDecimal calculateInRange(int start, int stop) {
        BigDecimal product = BigDecimal.ONE;
        for (int i = start; i > stop; i--) {
            product = product.multiply(BigDecimal.valueOf(i));
        }
        return product;
    }

    public double divideFactorialsRecursive(int a, int b) {

        if (a < 0 || b < 0){
            throw new RuntimeException("Can't find the factorial of a negative number!");
        }

        if (a > b) {
            return factorialInRangeRecursive(a, b);
        }
        else if (b > a) {
            return 1/ factorialInRangeRecursive(b, a);
        }
        return 1;
    }

    public double factorialInRangeRecursive(int start, int stop) {
        if (start > stop) {
            return start * factorialInRangeRecursive(start - 1, stop);
        }
        return 1;
    }
}