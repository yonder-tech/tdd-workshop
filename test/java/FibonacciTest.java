import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void calculate1() {
        Fibonacci fibonacci = new Fibonacci();
        int testIndex = 1;
        int expectedResult = 1;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }

    @Test
    public void calculate2() {
        Fibonacci fibonacci = new Fibonacci();
        int testIndex = 2;
        int expectedResult = 2;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }

    @Test
    public void calculate3() {
        Fibonacci fibonacci = new Fibonacci();
        int testIndex = 3;
        int expectedResult = 3;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }

    @Test
    public void calculate4() {
        Fibonacci fibonacci = new Fibonacci();
        int testIndex = 4;
        int expectedResult = 5;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }

    @Test
    public void calculate6() {
        Fibonacci fibonacci = new Fibonacci();
        int testIndex = 6;
        int expectedResult = 13;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }
}
