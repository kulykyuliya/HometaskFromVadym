package JavaCore.MultMethodsAndTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultTests {
    @Test
    public void multPositiveInt() {
        MultMethodsInt multMethodsInt = new MultMethodsInt();
        Assert.assertTrue(16== multMethodsInt.mult(4,4));
    }

    @Test
    public void multNegativeInt() {
        MultMethodsInt multMethodsInt = new MultMethodsInt();
        Assert.assertFalse(100== multMethodsInt.mult(23, 34));
    }

    @Test
    public void multPositiveDouble() {
        MultMethodsDouble multMethodsDouble = new MultMethodsDouble();
        Assert.assertTrue(334.11== multMethodsDouble.multdouble(11.1, 30.1));
    }

    @Test
    public void multNegativeDouble() {
        MultMethodsDouble multMethodsDouble = new MultMethodsDouble();
        Assert.assertFalse(2334.3== multMethodsDouble.multdouble(34.5, 44.9));
    }
}
