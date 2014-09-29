package training.ideas.java.collections;

import java.util.List;

/**
 * Created by idnamb on 18-09-2014.
 */
public class Fplos {
    public String get(List<Double> lrv, List<Double> rates) {

        Double lrvSum = 0.0;
        Double ratesSum = 0.0;
        String fpLOSDecision = "";


        for (int counter = 0; counter < lrv.size(); counter++) {
            lrvSum += lrv.get(counter);
            if (rates.size() == 1) {
                ratesSum = rates.get(0) * (counter + 1);
            } else {
                ratesSum += rates.get(counter);
            }
            if (ratesSum >= lrvSum) {
                fpLOSDecision = fpLOSDecision + "Y";
            } else fpLOSDecision = fpLOSDecision + "N";
        }
        return fpLOSDecision;

}
}
