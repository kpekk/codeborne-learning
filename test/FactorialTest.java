import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    // https://en.wikipedia.org/wiki/Factorial

    private final Factorial factorial = new Factorial();

    @Test
    void calculate_0() {
        assertEquals(BigInteger.ONE, factorial.calculateFactorial_helper(0));
    }

    @Test
    void calculate_1() {
        assertEquals(BigInteger.ONE, factorial.calculateFactorial_helper(1));
    }

    @Test
    void calculate_2() {
        assertEquals(BigInteger.TWO, factorial.calculateFactorial_helper(2));
    }

    @Test
    void calculate_200() {
        String expected200Factorial = "788657867364790503552363213932185062295135977687173263294742533244359449963403342920304284011984623904177212138919638830257642790242637105061926624952829931113462857270763317237396988943922445621451664240254033291864131227428294853277524242407573903240321257405579568660226031904170324062351700858796178922222789623703897374720000000000000000000000000000000000000000000000000";
        assertEquals(new BigInteger(expected200Factorial),
                factorial.calculateFactorial_helper(200));
    }

    @Test
    void calculate_string() {
        assertThrows(RuntimeException.class, () -> factorial.calculateFactorial_helper(-1), "asasd");
    }

    @Test
    void divideFactorialsNoDiff() {
        assertEquals(BigDecimal.ONE, factorial.divideFactorials(7,7));
    }

    @Test
    void divideFactorialsSmallDiff() {
        assertEquals(BigDecimal.valueOf(5), factorial.divideFactorials(5,4));
    }

    @Test
    void divideFactorialsMediumDiff() {
        assertEquals(BigDecimal.valueOf(720), factorial.divideFactorials(10,7));
    }

    @Test
    void divideFactorialsBigDiff() {
        assertEquals(BigDecimal.valueOf(604800), factorial.divideFactorials(10,3));
    }

    @Test
    void divideFactorialsSwapped() {
        assertEquals(BigDecimal.valueOf(0.2), factorial.divideFactorials(4,5));
    }

    @Test
    void divideFactorialsSwappedSmall() {
        assertEquals(BigDecimal.ONE.divide(BigDecimal.valueOf(604800),10, RoundingMode.HALF_UP), factorial.divideFactorials(3,10));
    }

    @Test
    void divideFactorialsRecursive() {
        assertEquals(5, factorial.divideFactorialsRecursive(5,4));
    }
     @Test
    void divideFactorialsRecursiveMinus() {
         assertThrows(RuntimeException.class, () -> factorial.divideFactorialsRecursive(-4, -4));
     }
}