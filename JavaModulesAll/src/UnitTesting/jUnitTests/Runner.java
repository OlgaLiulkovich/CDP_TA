package UnitTesting.jUnitTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Test Runner for unit tests run under jUnit
 *
 * @author Olga_Liulkovich
 */
public class Runner {

    private Calculator calc = new Calculator();

    @Test(dataProvider = "isPositiveTestDataProvider")
    public void isPositiveTest(long param, boolean expResult) {
        boolean res = calc.isPositive(param);
        Assert.assertEquals(res, expResult);

    }

    @DataProvider(name = "isPositiveTestDataProvider")
    public Object[][] isPositiveTestDataProvider() {
        return new Object[][]{
                {1, true},
                {-1, false},
                {0, false}//,
                //{9223372036854775807, false} // how to make it accept long?
        };
    }

    ;


}
