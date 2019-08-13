package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeNumberCalTest extends BaseTestForTestng {

    @Test(dependsOnMethods = {"isNegotive"})
    public void isNegotiveTrueTest() {
        Assert.assertTrue(calculator.isNegative(-500L));
    }

    @Test(dataProvider = "valuesForIsNegativeTest")
    public void isNegotiveFalseTest(long number) {
        Assert.assertFalse(calculator.isNegative(number));
    }

    @DataProvider(name = "valuesForIsNegativeTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {0L},
                {189L},
        };
    }
}

