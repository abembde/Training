package training.ideas.java.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by idnamb on 13-08-2014.
 */
public class ClockAngleTest {
    @Test

    public void clockAngle_at_12(){
        int hrtime =12;
        int mintime=0;
        double expectedangle=0;

        Assert.assertEquals(expectedangle,ClockAngle.getAngle(hrtime, mintime), 0.0);

    }
}
