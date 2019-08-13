package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveNumberCalTest extends BaseTestForTestng {

    @Test(dataProvider = "valuesForIsPositiveTest")
    public void isPositiveFalseTest(long number) {
        Assert.assertFalse(calculator.isPositive(number));
    }

    @Test(dependsOnMethods = {"isNegotive"})
    public void isPositiveTrueTest() {
        Assert.assertTrue(calculator.isPositive(147L));
    }

    @DataProvider(name = "valuesForIsPositiveTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {0L},
                {-189L},
        };
    }
}

