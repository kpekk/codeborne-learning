import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursionTest {

    // https://en.wikipedia.org/wiki/Factorial

    private final Recursion recursion = new Recursion();

    @Test
    void fibonacciRecursive0() {
        assertEquals(0, recursion.fibonacciRecursive(0));
    }

    @Test
    void fibonacciRecursive1() {
        assertEquals(1, recursion.fibonacciRecursive(1));
    }

    @Test
    void fibonacciRecursive2() {
        assertEquals(1, recursion.fibonacciRecursive(2));
    }

    @Test
    void fibonacciRecursive13() {
        assertEquals(233, recursion.fibonacciRecursive(13));
    }

    @Test
    void fibonacciRecursive5() {
        assertEquals(5, recursion.fibonacciRecursive(5));
    }

    @Test
    void fibonacciRecursive19() {
        assertEquals(4181, recursion.fibonacciRecursive(19));
    }

    @Test
    void fibonacci2() {
        assertEquals(1, recursion.fibonacci(2));
    }

    @Test
    void fibonacci19() {
        assertEquals(4181, recursion.fibonacci(19));
    }

    @Test
    void fibonacciRecursiveCache19() {
        assertEquals(4181, recursion.fibonacciRecursiveCache(19));
    }

    @Test
    void fibonacciRecursiveCache13() {
        assertEquals(233, recursion.fibonacciRecursiveCache(13));
    }

    @Test
    void fibonacciRecursiveCache5() {
        assertEquals(5, recursion.fibonacciRecursiveCache(5));
    }

    @Test
    void fibonacciRecursiveCache1() {
        assertEquals(1, recursion.fibonacciRecursiveCache(1));
    }

    @Test
    void fibonacciRecursiveCache0() {
        assertEquals(0, recursion.fibonacciRecursiveCache(0));
    }
}