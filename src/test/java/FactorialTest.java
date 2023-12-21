import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnMinusOneIfTheNumberIsLessThanZero() {
        Factorial factorial = new Factorial(-1);

        int fact = factorial.getFactorial();

        assertEquals(-1,fact);
    }

    @Test
    void shouldReturnOneIfTheNumberIsZero() {
        Factorial factorial = new Factorial(0);
        int fact = factorial.getFactorial();

        assertEquals(1,fact);
    }

    @Test
    void shouldReturn6IfTheNumberIs3() {
        Factorial factorial = new Factorial(3);

        int fact = factorial.getFactorial();

        assertEquals(6,fact);
    }
}
