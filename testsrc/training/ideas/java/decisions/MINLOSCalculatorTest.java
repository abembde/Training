package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;


public class MINLOSCalculatorTest {

    @Test
    public void given_FPLOS_is_YYYYYYY_then_MINLOS_is_1() {
        String FPLOS = "YYYYYYY";
        Assert.assertEquals(1, MINLOSCalculator.MINLOValue(FPLOS));
    }



    @Test
    public void given_FPLOS_is_NNYYYYY_then_MINLOS_is_3() {
        String FPLOS = "NNYYYYY";
        Assert.assertEquals(3, MINLOSCalculator.MINLOValue(FPLOS));
    }



    @Test
    public void given_FPLOS_is_NNNNYYY_then_MINLOS_is_5() {
        String FPLOS = "NNNNYYY";
        Assert.assertEquals(5, MINLOSCalculator.MINLOValue(FPLOS));
    }

}

