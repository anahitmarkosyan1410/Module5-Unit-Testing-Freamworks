package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalTest extends BaseTestForTestng {

    @Test(dataProvider = "valuesForDoubleNumberDivTest")
    public void divByDoubleNumberTest(double number1, double number2, double expectedValue) {
        double result = calculator.div(number1, number2);
        Assert.assertEquals(result, expectedValue, "Invalid result of div operation");
    }

    @Test(dataProvider = "valuesForDivLongNumberTest")
    public void divByLongNumberTest(long number1, long number2, long expectedValue) {
        long result = calculator.div(number1, number2);
        System.out.println(result);
        Assert.assertEquals(result, expectedValue, "Invalid result of div operation");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divByZeroTest() {
        calculator.div(5, 0);
    }

    @Test
    public void divByDoubleNumberNegativeTest() {
        double result = calculator.div(178.9, 3.9);
        Assert.assertNotEquals(result, 5, "Invalid result of div operation");
    }

    @DataProvider(name = "valuesForDivLongNumberTest")
    public Object[][] valuesForLongNumberDiv() {
        return new Object[][]{
                {5L, 4L, 5 / 4},
                {2L, 5L, 2 / 5},
                {-5L, -1L, -5 / (-1)},
        };
    }

    @DataProvider(name = "valuesForDoubleNumberDivTest")
    public Object[][] valuesForDoubleNumberDiv() {
        return new Object[][]{
                {58.7, 20.7, 58.7 / 20.7},
                {750.4, 7.0, 750.4 / 7.0},
        };
    }
}
