package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTestForTestng {

    @Test(dependsOnMethods = {"sqrtCalTest"})
    public void sqrtByNegativeNumberCalTest() {
        double result = calculator.sqrt(-25);
        Assert.assertNotEquals(result, 5);
    }

    @Test(dataProvider = "valuesForSqrtTest")
    public void sqrtCalByDoubleNumberTest(double number, double expectedValue) {
        double result = calculator.sqrt(number);
        Assert.assertEquals(result, expectedValue);
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForSqrt() {
        return new Object[][]{
                {25, Math.sqrt(25)},
                {0, Math.sqrt(0)},
                {698, Math.sqrt(698)},
        };
    }
}
