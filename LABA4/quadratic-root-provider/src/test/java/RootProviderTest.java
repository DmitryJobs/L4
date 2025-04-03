

import org.example.RootProvider;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class RootProviderTest {

    @Test
    public void testGetGreaterRootTwoRealRoots() throws Exception {
        QuadraticEquation eq = new QuadraticEquation(1, -3, 2); // x^2 - 3x + 2 = 0
        RootProvider provider = new RootProvider(eq);
        assertEquals(2, provider.getGreaterRoot());
    }

    @Test
    public void testGetGreaterRootOneRealRoot() throws Exception {
        QuadraticEquation eq = new QuadraticEquation(1, -2, 1); // x^2 - 2x + 1 = 0
        RootProvider provider = new RootProvider(eq);
        assertEquals(1, provider.getGreaterRoot());
    }

    @Test
    public void testGetGreaterRootNoRealRoots() {
        QuadraticEquation eq = new QuadraticEquation(1, 0, 1); // x^2 + 1 = 0
        RootProvider provider = new RootProvider(eq);
        assertThrows(Exception.class, provider::getGreaterRoot);
    }
}
