package testNG;

import testNG.BaseTestForTestng;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalTest extends BaseTestForTestng {
    @Test
    public void multInDoubleNumberTest() {
        double result = calculator.mult(5.69, 19.7);
        double expectedValue = Math.floor(5.69 * 19.7);
        Assert.assertEquals(result, expectedValue, "Invalid result of mult operation");
    }

    @Test(dataProvider = "valuesForMultTest")
    public void multInLongNumberTest(long number1, long number2, long expectedValue) {
        long result = calculator.mult(number1, number2);
        Assert.assertEquals(result, expectedValue, "Invalid result of mult operation");
    }

    @Test
    public void multInLongNumberNegativeTest() {
        Assert.assertNotEquals(calculator.mult(7L, 10L), 69);
    }

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesForMult() {
        return new Object[][]{
                {5L, 4L, 5 * 4},
                {2L, 5L, 2 * 5},
                {-5L, -1L, -5 * (-1)},
                {20L, 0, 0}
        };
    }
}
