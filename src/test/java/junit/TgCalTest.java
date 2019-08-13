package junit;

import org.junit.Assert;
import org.junit.Test;

public class TgCalTest extends BaseTestForJunit {
    @Test
    public void tgCalTest() {
        double result = calculator.tg(30);
        double expectedValue = Math.tan(30);
        Assert.assertEquals(result, expectedValue, 0.01);
    }
}
