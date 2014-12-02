package training2.basics;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 01-12-2014.
 */
public class CalculatorTest {
    Calculator2 calc = new Calculator2();
    @Test

    public void add_number_2_and_5() {

        int actual = calc.performAdd(2, 5);
        Assert.assertEquals("Addition not matched", 7, actual);
        calc.performAdd(2, 5);
        calc.performAdd(2, 5);
        calc.performAdd(2, 5);
        Assert.assertEquals(4, calc.getCount());
    }
    @Test
    public void sub_number_3_and_2() {
        int actual = calc.performSub(3, 2);
        Assert.assertEquals("Subtraction not matched", 1, actual);
        calc.performAdd(3, 2);
        calc.performAdd(3, 2);
        Assert.assertEquals(3, calc.getCount());
    }

    @Test

    public void mul_number_3_and_2() {
        int actual = calc.performMul(3, 2);
        Assert.assertEquals("Multiplication not matched", 6, actual);
        calc.performAdd(3, 2);
        calc.performAdd(3, 2);
        calc.performAdd(3, 2);
        Assert.assertEquals(4, calc.getCount());
    }

    @Test

    public void mul_number_6_and_2() {
        int actual = calc.performDiv(6, 2);
        Assert.assertEquals("Division not matched", 3, actual);
        calc.performAdd(6, 2);
        calc.performAdd(6, 2);
        calc.performAdd(6, 2);
        Assert.assertEquals(4, calc.getCount());


    }

}
