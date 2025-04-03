
import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    public void testSolveTwoRealRoots() {
        QuadraticEquation eq = new QuadraticEquation(1, -3, 2); // x^2 - 3x + 2 = 0
        double[] roots = eq.solve();
        assertEquals(2, roots.length);
        assertTrue(roots[0] == 2 || roots[0] == 1);
        assertTrue(roots[1] == 2 || roots[1] == 1);
    }

    @Test
    public void testSolveOneRealRoot() {
        QuadraticEquation eq = new QuadraticEquation(1, -2, 1); // x^2 - 2x + 1 = 0
        double[] roots = eq.solve();
        assertEquals(1, roots.length);
        assertEquals(1, roots[0]);
    }

    @Test
    public void testSolveNoRealRoots() {
        QuadraticEquation eq = new QuadraticEquation(1, 0, 1); // x^2 + 1 = 0
        double[] roots = eq.solve();
        assertEquals(0, roots.length);
    }
}
