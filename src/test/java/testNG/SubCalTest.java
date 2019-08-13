package testNG;

import testNG.BaseTestForTestng;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalTest extends BaseTestForTestng {

    @Test
    public void subOfDoubleNumberTest() {
        double result = calculator.sub(19.8, 20.9);
        double expectedValue = 19.8 - 20.9;
        Assert.assertEquals(result, expectedValue, "Invalid result of sub operation");
    }

    @Test(dataProvider = "valuesForSubTest")
    public void subOfLongNumberTest(long number1, long number2, long expectedValue) {
        long result = calculator.sub(number1, number2);
        Assert.assertEquals(result, expectedValue, "Invalid result of sub operation");
    }

    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {5L, 4L, 1L},
                {-5L, 1L, -6L},
                {4L, 0L, 4L},
                {50L, 59L, -9L}
        };
    }
}
