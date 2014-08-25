package training.ideas.java.charArray;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharacterSubsetTest {

    @Test
    public void findsubset(){
        char[]chararray1={'a','b','c','a','b','c','d'};
        char [] chararray2={'c','d'};
        int expectedindex=0;
        Assert.assertEquals(expectedindex, CharacterSubset.indexForTwoCharArr(chararray1, chararray2));
    }

    @Test
    public void findsubset1(){
        char[]chararray1={'a','b','c','a','b','c','d'};
        char [] chararray2={'a','b'};
        int expectedindex=0;
        Assert.assertEquals(expectedindex, CharacterSubset.indexForTwoCharArr(chararray1, chararray2));
    }


}
