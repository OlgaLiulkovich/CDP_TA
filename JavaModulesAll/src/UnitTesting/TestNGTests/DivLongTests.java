package UnitTesting.TestNGTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests for divLong method using TestNG
 *
 * @author Olga_Liulkovich
 */
public class DivLongTests {

    protected Calculator calc;

    @BeforeClass
    public void setUp() {
        calc = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        // empty)
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


    @DataProvider(name = "testDivLongPositiveDataProviderString")
    public Object[][] testDivLongPositiveDataProviderString() {
        return new Object[][]{
            {"2", "1", 2}
        };

    }

    @Test(dataProvider = "testDivLongPositiveDataProviderString")
    public void testDivLongPositiveDataString(String a, String b, long expResult){
        long div = calc.div(Long.parseLong(a), Long.parseLong(b));
        Assert.assertEquals(div,expResult);

    }


}
