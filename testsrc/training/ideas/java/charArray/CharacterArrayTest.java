package training.ideas.java.charArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 21-08-2014.
 */
public class CharacterArrayTest {

    @Test
    public void find_characterArray()
    {
        char[] given ={'a','b','c','a','b','c','d'};
        int index=3;
        char []  expected={'a','b','c','d'};
        Assert.assertArrayEquals(expected, CharacterArray.getchar(given, index));
    }


}




