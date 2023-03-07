import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    void calculate_0() {
        assertEquals(1, factorial.calculate(0));
    }

    @Test
    void calculate_1() {
        assertEquals(1, factorial.calculate(1));
    }
}