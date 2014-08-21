package training.ideas.java.math;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 12-08-2014.
 */
public class CeilingTest {

    @Test

    public void ceil() {
        double given = 36.24;
        Assert.assertEquals(36.25, Ceiling.getCelingValue(given), 0.0);

    }

    @Test

    public void ceil1() {
        double given = 40.28;
        Assert.assertEquals(40.30, Ceiling.getCelingValue(given), 0.0);
    }

    @Test

    public void ceil2() {
        double given = 20.25;
        Assert.assertEquals(20.25, Ceiling.getCelingValue(given), 0.0);

    }


}