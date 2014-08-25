package training.ideas.java.charArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharArrStartEndIndexTest {

//    @Test
//    public void findcharacter1() {
//
//        char[] A = {'a', 'b', 'c', 'a', 'b', 'c', 'd'};
//        int startindex = 1;
//        int endindex = 3;
//        char[] expectedarr = {'b', 'c', 'a'};
//        Assert.assertArrayEquals(expectedarr, CharArrStartEndIndex.getsubstrindex(A, startindex, endindex));
//    }

    @Test
    public void findcharacter() {

        char[] A = {'a', 'b', 'c', 'a',};
        int startindex = 0;
        int endindex = 1;
        char[] expectedarr = {'a','b'};
        Assert.assertArrayEquals(expectedarr, CharArrStartEndIndex.getsubstrindex(A, startindex, endindex));
    }


}
