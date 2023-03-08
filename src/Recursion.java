import java.util.HashMap;
import java.util.Map;

public class Recursion {

    public int fibonacciRecursive(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        }
        return fibonacciRecursive(a - 1) + fibonacciRecursive(a - 2);
    }

    static Map<Integer, Long> cache = new HashMap<>();

    public long fibonacciRecursiveCache(int a) {

        Long precalculated = cache.get(a);
        if (precalculated != null) {
            return precalculated;
        }
        long result = a < 2 ? a : fibonacciRecursiveCache(a - 1) + fibonacciRecursiveCache(a - 2);
        cache.put(a, result);
        return result;
    }

    public long fibonacci(int n) {
        long previous1 = 0;
        long previous2 = 1;
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum = previous1 + previous2;
            previous1 = previous2;
            previous2 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();

        long startTime = System.nanoTime();
        System.out.println(r.fibonacciRecursive(40));
        long endTime = System.nanoTime();
        System.out.println("f1: " + (endTime-startTime));

        startTime = System.nanoTime();
        System.out.println(r.fibonacciRecursiveCache(50));
        endTime = System.nanoTime();
        System.out.println("f2: " + (endTime-startTime));

        startTime = System.nanoTime();
        System.out.println(r.fibonacci(50));
        endTime = System.nanoTime();
        System.out.println("f3: " + (endTime-startTime));
    }

}
