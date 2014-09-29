
package training.ideas.java.decisions;

/**
 * Created by idnamb on 7/25/2014.
 */
public class MINLOSCalculator {
    public static int MINLOValue(String fplos) {
        return fplos.toUpperCase().indexOf("Y")+1;
        //return fplos.indexOf("Y")+1;

    }


}
