

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {

    @Test
    public void testLinearFunction() {
        Function f = new LinearFunction(2, 3, 0, 10);
        assertEquals(23, f.calculate(10), 0.001);
    }

    @Test
    public void testSinusoidalFunction() {
        Function f = new SinusoidalFunction(1, Math.PI, 0, Math.PI);
        assertEquals(-0.4303012170000917, f.calculate(Math.PI), 0.001);
    }

    @Test
    public void testRationalFunction() {
        Function f = new RationalFunction(1, 1, 1, 1, 0, 10);
        assertEquals(1.0, f.calculate(0), 0.001);
    }

    @Test
    public void testExponentialFunction() {
        Function f = new ExponentialFunction(1, 0, 0, 10);
        assertEquals(Math.exp(10), f.calculate(10), 0.001);
    }

    @Test
    public void testSumFunctional() {
        Function f = new LinearFunction(2, 3, 0, 10);
        Functional<Function> functional = new SumFunctional();
        assertEquals(39, functional.calculate(f), 0.001);
    }

    @Test
    public void testIntegralFunctional() {
        Function f = new LinearFunction(2, 3, 0, 10);
        Functional<Function> functional = new IntegralFunctional();
        assertEquals(130, functional.calculate(f), 0.001);
    }
}
