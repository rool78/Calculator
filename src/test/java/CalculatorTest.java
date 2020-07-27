import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {

    @Test
    public void add() {
        assertEquals(Calculator.add(2,2),4);
    }
}