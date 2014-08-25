package training.ideas.java.charArray;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharacterOccuranceTest {

    @Test
    public void findcharindex(){
        char[] chararray={'a','b','c','a','b','c'};
        int index=1;
        int expectedindex=4;
        Assert.assertEquals(expectedindex, CharacterOccurance.getOccurance(chararray, index));
    }

    @Test
    public void findcharindex1(){
        char[] chararray={'a','b','c','a','b','c'};
        int index=4;
        int expectedindex=-1;
        Assert.assertEquals(expectedindex, CharacterOccurance.getOccurance(chararray, index));
    }

    @Test
    public void findcharindex2(){
        char[] chararray={'a','b','c','a','b','c'};
        int index=3;
        int expectedindex=-1;
        Assert.assertEquals(expectedindex, CharacterOccurance.getOccurance(chararray, index));
    }

    @Test
    public void findcharindex3(){
        char[] chararray={'a','b','c','a','b','c'};
        int index=2;
        int expectedindex=5;
        Assert.assertEquals(expectedindex, CharacterOccurance.getOccurance(chararray, index));
    }

}
