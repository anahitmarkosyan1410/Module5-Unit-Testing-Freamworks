package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"trigonometric functions"})
public class SinCalTest extends BaseTestForTestng {
    public void sinCalTest() {
        double result = calculator.sin(180);
        double expectedValue = Math.sin(180);
        Assert.assertEquals(result, expectedValue, 0.01);
    }
}
