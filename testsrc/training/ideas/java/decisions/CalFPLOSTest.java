package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by idnamb on 29-07-2014.
 */
public class CalFPLOSTest {

    @Test
    public void verifyFpLOS()
    {
        Assert.assertEquals("YNNNNNNN", CalFPLOS.FPLOS());
    }

}
