package Lesson_12_junit_5_test;

import Lesson_12_junit_5.Factorial;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateFactorialTest {

    @Test
    public void factorial(){
        Assert.assertEquals(1, Factorial.calculateFactorial(0));
        Assert.assertEquals(1, Factorial.calculateFactorial(1));
        Assert.assertEquals(24, Factorial.calculateFactorial(4));
        Assert.assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test (expected = IllegalArgumentException.class)
    public void factorialNegative(){
        Factorial.calculateFactorial(-1);
    }
}
