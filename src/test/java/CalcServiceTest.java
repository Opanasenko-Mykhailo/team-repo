import com.team.calc.service.CalcService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcServiceTest {
    private final CalcService calcService = new CalcService();

    @Test
    void testDivideWithValidNumbers() {
        double result = calcService.divide(10, 2);

        assertEquals(5.0, result);
    }

    @Test
    void testDivideWithNegativeNumbers() {
        double result = calcService.divide(-10, 2);

        assertEquals(-5.0, result);
    }

    @Test
    void testDivideWithDecimalNumbers() {
        double result = calcService.divide(7.5, 2.5);

        assertEquals(3.0, result);
    }

    @Test
    void testDivideByZeroThrowsException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calcService.divide(10, 0));

        assertEquals("Division by zero", exception.getMessage());
    }
}
