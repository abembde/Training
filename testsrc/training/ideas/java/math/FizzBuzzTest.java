package training.ideas.java.math;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 12-08-2014.
 */
public class FizzBuzzTest {

    @Test

    public void fizzbuzz_Problem() {
        int given=15;
        String expected="12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
        Assert.assertEquals("Not Matched",expected,FizzBuzz.findFizzBizz(given));
    }
}