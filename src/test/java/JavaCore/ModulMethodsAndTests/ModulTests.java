package JavaCore.ModulMethodsAndTests;

import JavaCore.ModulMethodsAndTests.ModulMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModulTests {
    @Test
    public void modulTest() {
        ModulMethods modulMethods = new ModulMethods();
        Assert.assertEquals(modulMethods.modul(-3), 3);
    }

    @Test
    public void modulNewTest() {
        ModulMethods modulMethods = new ModulMethods();
        Assert.assertEquals(modulMethods.modul(3), 3);
    }
}
