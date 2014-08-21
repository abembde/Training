package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by idnamb on 21-07-2014.
 */
public class AdditionTest {

    @Test
    public void addTwoIntegers() {
        Assert.assertEquals(5.0, Addition.add(2, 3));
    }

    @Test

    public void addTwoDecimal() {

        Assert.assertEquals(43.5, Addition.add(10.5, 33.0));

    }

    @Test

    public void addThreeInt ()
    {
        Assert.assertEquals(10.0, Addition.add(3, 3.5, 3.5));
    }

    @Test

    public void addTwoMinus() {

        Assert.assertEquals(-16.0, Addition.add(-10, -6));

    }

    @Test

    public void addAny ()
    {
        Assert.assertEquals(15, Addition.add(3,4,3,2,3));
    }




    @Test
    public void addArray(){

        double [] A  ={1.0,2.0,3.0,4.0,5.0};


        Assert.assertEquals(15.0, Addition.add(A));

     }

//    @Test
//    public void verifyFpLOS(){
//        Assert.assertEquals("YNNNNNNN",CalFPLOS.FPLOS());
//    }
//

}