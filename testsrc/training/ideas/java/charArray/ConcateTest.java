package training.ideas.java.charArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 19-08-2014.
 */
public class ConcateTest {

    @Test
    public void concatenate() {
        char[] X = {'A','B','C'};
        char[] Y = {'L','M','N'};
        char[] expected = {'A','B','C','L','M','N'};
        Assert.assertArrayEquals(expected, Concate.stringConcate(X, Y));

    }
}