package testNG;

import testNG.BaseTestForTestng;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalTest extends BaseTestForTestng {

    @Test
    public void sumOfDoubleNumberTest() {
        double result = calculator.sum(5.7, 9.6);
        Assert.assertEquals(result, 15.3, "Invalid result of sum operation");
    }

    @Test(dataProvider = "valuesForSumTest")
    public void sumOfLongNumberTest(long number1, long number2, long expectedValue) {
        long result = calculator.sum(number1, number2);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {5L, 4L, 9L},
                {2L, 5L, 7L},
                {-5L, -1L, -6L},
                {4L, 0L, 4L},
        };
    }
}