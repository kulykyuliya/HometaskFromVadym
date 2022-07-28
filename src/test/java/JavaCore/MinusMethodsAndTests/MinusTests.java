package JavaCore.MinusMethodsAndTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinusTests {
    @Test
    public void minusPositiveInt() {
        MinusMethodsInt minusMethodsInit = new MinusMethodsInt();
        Assert.assertTrue(100== minusMethodsInit.minus(150, 50));
    }

    @Test
    public void minusNegativeInt() {
        MinusMethodsInt minusMethodsInit = new MinusMethodsInt();
        Assert.assertFalse(230== minusMethodsInit.minus(250, 23));
    }

    @Test
    public void minusPositiveDouble() {
        MinusMethodsDouble minusMethodsDouble = new MinusMethodsDouble();
        Assert.assertTrue(20.2==minusMethodsDouble.doubleminus(25.9, 5.7));
    }

    @Test
    public void minusNegativeDouble() {
        MinusMethodsDouble minusMethodsDouble = new MinusMethodsDouble();
        Assert.assertFalse(200.8== minusMethodsDouble.doubleminus(23.3, 55.5));
    }
}
