package training.ideas.java.charArray;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharacterCharIndexTest {
    @Test
    public void findcharindex(){
        char[]chararray={'a','b','c','d'};
        char A='d';
        int expectedindex=3;
        Assert.assertEquals(expectedindex, CharacterCharIndex.indexForChar(chararray, A));
    }

    @Test
    public void findcharindex1(){
        char[]chararray={'a','b','c','d'};
        char A='z';
        int expectedindex=-1;
        Assert.assertEquals(expectedindex, CharacterCharIndex.indexForChar(chararray, A));
    }
}

