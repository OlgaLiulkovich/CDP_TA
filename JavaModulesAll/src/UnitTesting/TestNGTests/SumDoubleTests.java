package UnitTesting.TestNGTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Unit tests for sumDouble method using TestNG
 *
 * @author Olga_Liulkovich
 */
public class SumDoubleTests {

    protected Calculator calc;

    @BeforeClass
    public void setUp() {
        calc = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        // empty)
    }

    @Test(dataProvider = "testSumDoubleProvider")
    public void testSumDouble(double a, double b, double expResult) {

        double sum = calc.sum(a, b);
        Assert.assertEquals(sum, expResult);
        Assert.assertEquals(sum, expResult, "Expected: " + a + " + " + b + " = " + expResult + " Actual result: " + sum); /// what's wrong here?

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
                {-1.79769313486231570E+308, -1.79769313486231570E+308, Double.NEGATIVE_INFINITY}, // exception?
                {1.7976931348623157E308, 1.7976931348623157E308, Double.POSITIVE_INFINITY} // exception

        };
    }

    @DataProvider(name = "testSumDoubleProviderString")
    public Object[][] testSumDoubleProviderString() {
        return new Object[][]{
                {"1", "1", 2}
        };
    }

    @Test(dataProvider = "testSumDoubleProviderString")
    public void testSumDoubleString(String a, String b, double expResult){
        double sum = calc.sum(Double.parseDouble(a),Double.parseDouble(b));
        Assert.assertEquals(sum, expResult);

    }

}
