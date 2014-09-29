package training.ideas.java.collections;

import java.util.*;

/**
 * Created by idnamb on 17-09-2014.
 */
public class FPLOSCal {


    public Map<String, Map<String, String>> calculate(Map<String, List<Double>> occupancyDateLRVMap, Map<String, Double> rateCodeRateValueMap) {
//        Map<String, Double> rateCodeRateValue
//
// Map)
        {

            Map<String, Map<String, String>> decisionMap= new HashMap<String,Map<String, String>>();
            Map<String, String> rateCodePattern = new HashMap<String, String>();

            Set<String > rateCodeKeySet=  rateCodeRateValueMap.keySet();
            Set<String > occupancyDateKey= occupancyDateLRVMap.keySet();
            for(String occupancyDate:occupancyDateKey)
            {
                List<Double> lrvList = occupancyDateLRVMap.get(occupancyDate);
                for (String rateCode : rateCodeKeySet)
                {
                    Fplos fplos = new Fplos();
                    List<Double> rateValue1 = new ArrayList<Double>(Arrays.asList(rateCodeRateValueMap.get(rateCode)));
                    String pattern = fplos.get(lrvList,rateValue1);
                    rateCodePattern.put(rateCode, pattern);
                    decisionMap.put(occupancyDate,rateCodePattern);
                }
            }
            return decisionMap;
        }
    }

}


