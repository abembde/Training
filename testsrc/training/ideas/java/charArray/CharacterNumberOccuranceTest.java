package training.ideas.java.charArray;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharacterNumberOccuranceTest {
    @Test
    public void find_occurance() {
        char[] A = {'a', 'b', 'c', 'a', 'b', 'c', 'd'};
        char B='b';
        int expectedoccurance=2;
        Assert.assertEquals(expectedoccurance,CharacterNumberOccurance.getoccurance(A,B));

    }

    @Test
    public void find_occurance1() {
        char[] A = {'a', 'b', 'c', 'a', 'b', 'c', 'd'};
        char B='z';
        int expectedoccurance=0;
        Assert.assertEquals(expectedoccurance,CharacterNumberOccurance.getoccurance(A, B));


    }
}




