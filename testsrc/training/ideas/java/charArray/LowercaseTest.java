package training.ideas.java.charArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 19-08-2014.
 */
public class LowercaseTest {

    @Test
    public void upper_to_lower(){
        char [] given={'S','D','G','Y'};
        char [] expected ={'s','d','g','y'};
        Assert.assertArrayEquals(expected, Lowercase.getLower(given));
    }



}

