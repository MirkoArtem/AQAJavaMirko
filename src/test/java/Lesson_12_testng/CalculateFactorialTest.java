package Lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculateFactorialTest {

    private Factorial factorial;

    @BeforeMethod
    public void setup() {
        factorial = new Factorial();
    }

    @DataProvider(name = "Data-Provider-Negative-Number")
    public Object[][] negativeNumber(){
        return new Object[][]{{-1, -1}};
    }

    @Test(dataProvider = "Data-Provider-Negative-Number", expectedExceptions = IllegalArgumentException.class)
    public void factorialNegative(int in, int out) {
        Assert.assertEquals(out, factorial.calculateFactorial(in));
    }

    @DataProvider(name = "Data-Provider-Factorial")
    public Object[][] numbersFactorial() {
        return new Object[][]{{1, 1}, {2, 2}, {3, 6}};
    }

    @Test(dataProvider = "Data-Provider-Factorial")
    public void parametrTest(int input, int result) {
        Assert.assertEquals(result, factorial.calculateFactorial(input));
    }
}

