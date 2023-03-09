import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionalTest {

    // https://en.wikipedia.org/wiki/Factorial

    private final Recursion recursion = new Recursion();


    @Test
    void fibonacciRecursive0() {
        assertEquals(0, recursion.fibonacciRecursive(0));
    }

}