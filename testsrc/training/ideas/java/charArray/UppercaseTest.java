package training.ideas.java.charArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 19-08-2014.
 */
public class UppercaseTest {
    @Test
    public void lower_to_upper(){
        char [] given={'a','b','c','x'};
        char [] expected ={'A','B','C','X'};
        Assert.assertArrayEquals(expected, Uppercase.getupper(given));
    }
}
