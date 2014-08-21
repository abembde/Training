package training.ideas.java.math;

/**
 * Created by idnamb on 12-08-2014.
 */
public class Ceiling {

    public static double getCelingValue(double given) {
        if(given*100%5==0)
        {
            return given;
        }
        return (given*100+5-(given*100%5))/100;
    }
}
