package UnitTesting;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Runner class contains all unit tests for a calculator
 *
 * @author Olga_Liulkovich
 */
public class RunnerTestNG {

    private Calculator calc = new Calculator();

    @Test(dataProvider = "testSumDoubleProvider")
    public void testSumDouble(double a, double b, double expResult) {

        double sum = calc.sum(a, b);
        Assert.assertEquals(sum, expResult);
        //Assert.assertEquals(sum, expResult,"Expected: " + a = " + " + b + " = " + expResult = " Actual result: " + sum); /// what's wrong here?

    }

    @DataProvider(name = "testSumDoubleProvider")
    public Object[][] testSumDoubleProvider() {
        return new Object[][]{
                {3, 5, 8.0},
                {3, -5, -2.0},
                {0.00, -1, -1.0},
                {-1.79769313486231570E+308, 0, -1.79769313486231570E+308},
                {0, -1.79769313486231570E+308, -1.79769313486231570E+308},
                {2147483647, 0, 2147483647},
                {0, 2147483647, 2147483647},
                {-1.79769313486231570E+308, -1.79769313486231570E+308, 5}, // exception?
                {1.7976931348623157E308, 1.7976931348623157E308, 5} // exception?

        };
    }

    @Test(dataProvider = "testDivLongPositiveDataProvider")
    public void testDivLongPositive(long a, long b, long expResult) {
        long div = calc.div(a, b);
        Assert.assertEquals(div, expResult);
    }

    @DataProvider(name = "testDivLongPositiveDataProvider")
    public Object[][] testDivLongPositiveDataProvider() {
        return new Object[][]{
                {2, 8, 0},
                {8, 2, 4},
                {-2147483648, 1, -2147483648},
                {1, -2147483648, 0},
                {0, 7, 0}
        };

    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testDivLongNegative() {
        calc.div(2, 0);
    }
}


// sum tests to contain check for exeptions as well
