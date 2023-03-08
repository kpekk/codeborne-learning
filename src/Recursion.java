public class Recursion {

    public int fibonacciRecursive(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        }
        return fibonacciRecursive(a - 1) + fibonacciRecursive(a - 2);
    }

    public int fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for (int i = 1; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.fibonacciRecursive(5);
    }

}
