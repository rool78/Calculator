import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        CalculatorParametrizedTest.class
})
public class TestSuite {
}
