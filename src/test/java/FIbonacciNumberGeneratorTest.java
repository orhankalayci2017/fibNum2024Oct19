import com.FibNum2025Oct19.FibonacciNumberGenerator;
import com.FibNum2025Oct19.RecursiveFibonacciStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class FIbonacciNumberGeneratorTest {

    private FibonacciNumberGenerator fibonacciGenerator;

    @BeforeEach
    public void setUp() {
        fibonacciGenerator = new FibonacciNumberGenerator();  // Or pass a specific strategy
    }

    // Parameterized test with @CsvSource to test multiple cases
    @ParameterizedTest
    @CsvSource({
            "0, 0",   // F(0) = 0
            "1, 1",   // F(1) = 1
            "2, 1",   // F(2) = 1
            "3, 2",   // F(3) = 2
            "4, 3",   // F(4) = 3
            "5, 5",   // F(5) = 5
            "6, 8",   // F(6) = 8
            "7, 13",  // F(7) = 13
            "10, 55", // F(10) = 55
            "20, 6765" // F(20) = 6765
    })
    public void testValidFibonacciNumbers(int index, int expected) {
        assertEquals(expected, fibonacciGenerator.getFibNum(index),
                "Fibonacci number at index " + index + " should be " + expected);
    }

    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)  // Fail if the method takes more than 200ms
    public void testFibonacciTimeoutFor44() {
        int expected = 701408733;  // The expected Fibonacci number for 44
        assertEquals(expected, fibonacciGenerator.getFibNum(44));
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, -1, -99})  // List of negative indices to test
    public void testNegativeIndexThrowsException(int negativeIndex) {
        assertThrows(IllegalArgumentException.class, () -> {
            fibonacciGenerator.getFibNum(negativeIndex);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {46, 50, 100})  // Test with multiple values greater than 45
    public void testMaxIndexExceededThrowsException(int index) {
        assertThrows(IllegalArgumentException.class, () -> {
            fibonacciGenerator.getFibNum(index);  // Index exceeds the max allowed (45)
        });
    }
}
