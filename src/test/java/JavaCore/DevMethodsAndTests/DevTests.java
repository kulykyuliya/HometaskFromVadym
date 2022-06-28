package JavaCore.DevMethodsAndTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DevTests {
    @Test
    public void devPositiveInt() {
        DevMethodsInt devMethodsInt = new DevMethodsInt();
        Assert.assertTrue(20==devMethodsInt.devision(100, 5));
    }

    @Test
    public void devNegativeInt() {
        DevMethodsInt devMethodsInt = new DevMethodsInt();
        Assert.assertFalse(12==devMethodsInt.devision(23,4));
    }

    @Test
    public void devPositiveDouble() {
        DevMethodsDouble devMethodsDouble = new DevMethodsDouble();
        Assert.assertTrue(12.8==devMethodsDouble.devisiondouble(468.48, 36.6));
    }

    @Test
    public void devNegativeDouble() {
        DevMethodsDouble devMethodsDouble = new DevMethodsDouble();
        Assert.assertFalse(23.4==devMethodsDouble.devisiondouble(23.4, 56.5));
    }
}
