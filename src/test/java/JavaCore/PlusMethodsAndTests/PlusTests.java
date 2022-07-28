package JavaCore.PlusMethodsAndTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusTests {
    @Test
    public void plusPositiveInt() {
        PlusMethodsInt plusMethods = new PlusMethodsInt();
        Assert.assertTrue(50 == plusMethods.plus(25, 25));
    }

    @Test
    public void plusNegativeInt() {
        PlusMethodsInt plusMethods = new PlusMethodsInt();
        Assert.assertFalse(30 == plusMethods.plus(12, 12));
    }

    @Test
    public void plusPositiveDouble() {
        PlusMethodsDouble plusMethodsDouble = new PlusMethodsDouble();
        Assert.assertTrue(22.2 == plusMethodsDouble.doubleplus(11.1, 11.1));
    }

    @Test
    public void plusNegayiveDouble() {
        PlusMethodsDouble plusMethodsDouble = new PlusMethodsDouble();
        Assert.assertFalse(33.4 == plusMethodsDouble.doubleplus(22.2, 33.2));
    }

    @Test
    public void plusString() {
        PlusMethodsString plusMethodsString = new PlusMethodsString();
        Assert.assertEquals("yuliyakulyk", plusMethodsString.plusString("yuliya", "kulyk"));
    }

    @Test
    public void plusNewString() {
        PlusMethodsString plusMethodsString = new PlusMethodsString();
        Assert.assertEquals("romanshapran", plusMethodsString.plusString("roman", "shapran"));
    }
}
