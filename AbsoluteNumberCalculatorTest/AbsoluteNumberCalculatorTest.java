import com.sun.org.apache.xpath.internal.objects.XNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test input 0")
    public void testWithInput0() {
        int inputNumber = 0;
        int expected = 0;
        int actual = AbsoluteNumberCalculator.findAbsolute(inputNumber);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("test input 1")
        public void testWithInput1() {
            int inputNumber = 1;
            int expected = 1;
            int actual = AbsoluteNumberCalculator.findAbsolute(inputNumber);
            assertEquals(expected, actual);
        }


    @Test
    @DisplayName("test input -1")
    public void testWithInputNegative1() {
        int inputNumber = -1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.findAbsolute(inputNumber);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("test input -10")
    public void testWithInputNegative10() {
        int inputNumber = -10;
        int expected = 10;
        int actual = AbsoluteNumberCalculator.findAbsolute(inputNumber);
        assertEquals(expected, actual);
    }
}
