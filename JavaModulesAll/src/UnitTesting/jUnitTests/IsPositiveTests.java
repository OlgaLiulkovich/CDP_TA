package UnitTesting.jUnitTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Unit tests for IsPositive method using jUnit
 *
 * @author Olga_Liulkovich
 */

public class IsPositiveTests {

    protected Calculator calc;

    @BeforeClass
    public void setUp() {
        calc = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        //empty
    }

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
                {0, false},
                {9223372036854775807L, true},
                {-9223372036854775807L, false}
        };
    }

    ;

}

