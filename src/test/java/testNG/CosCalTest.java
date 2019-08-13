package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"trigonometric functions"})
public class CosCalTest extends BaseTestForTestng {
    public void cosCalTest() {
        double result = calculator.cos(45);
        double expectedValue = Math.cos(45);
        Assert.assertEquals(result, expectedValue, 0.00001);
    }
}
