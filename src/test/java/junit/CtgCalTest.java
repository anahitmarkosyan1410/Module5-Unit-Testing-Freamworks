package junit;

import org.junit.Assert;
import org.junit.Test;

public class CtgCalTest extends BaseTestForJunit {
    @Test
    public void ctgCalTest() {
        double result = calculator.ctg(45);
        double expectedValue = Math.cos(45) / Math.sin(45);
        Assert.assertEquals(result, expectedValue, 0.00001);
    }
}

