package training.ideas.java.fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 06-08-2014.
 */
public class FibonacciTest {

    @Test

    public void fibonacci() {

        int number = 7;
        int expected[] = {0, 1, 1,2,3,5,8};

        Assert.assertArrayEquals(expected, Fibonacci.findFib(number));

    }



    }


