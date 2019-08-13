package junit;

import org.junit.Assert;
import org.junit.Test;

public class PowCalTest extends BaseTestForJunit {
    @Test
    public void powCalTest() {
        double result = calculator.pow(24, 3);
        double expectedValue = Math.pow(24, 3);
        Assert.assertEquals(result, expectedValue, 0.01);
    }

    @Test
    public void powByZeroCalTest() {
        double result = calculator.pow(5, 0);
        double expectedValue = Math.pow(5, 0);
        Assert.assertEquals(result, expectedValue, 0.01);
    }
}
