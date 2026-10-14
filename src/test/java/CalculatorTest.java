
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    void testAddition() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, c.subtract(10, 5));
    }
}
