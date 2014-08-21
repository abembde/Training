package training.ideas.java.math;

/**
 * Created by idnamb on 13-08-2014.
 */
public class ClockAngle {
    public static double getAngle(int hr, int min) {

        int hr_to_min=hr*60;
        int totaltime=hr_to_min+min;
        double hrangle=0.5*totaltime;
        double minangle=6*min;
        double angle=Math.abs(hrangle-minangle);
        angle=360-angle;
        return angle;
    }

}
