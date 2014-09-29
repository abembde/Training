package training.ideas.java.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


/**
 * Created by idnamb on 17-09-2014.
 */
public class FPLOSCalTest {

    Map<String, List<Double>> occupancyDateLRVMap = new HashMap<String, List<Double>>();
    Map<String, Double> rateCodeRateValueMap = new HashMap<String, Double>();
    Map<String, String> rateCodeFpLOSPatternForDayOne = new HashMap<String, String>();
    Map<String, String> rateCodeFpLOSPatternForDayTwo = new HashMap<String, String>();
    Map<String, Map<String, String>> expectedDecisionMap = new HashMap<String, Map<String, String>>();
    FPLOSCal fPLOS = new FPLOSCal();

    @Test
    public void rate_is_closed_for_all_los_when_rateValue_less_than_all_LRV_for_a_Single_Day_And_Single_Rate_Code() {
        occupancyDateLRVMap.put("2014-01-01", Arrays.asList(10.1, 0.0, 13.9, 14.0, 8.10, 0.0, 17.0));
        rateCodeRateValueMap.put("Rate1", 2.0);
        rateCodeFpLOSPatternForDayOne.put("Rate1", "NNNNNNN");
        expectedDecisionMap.put("2014-01-01", rateCodeFpLOSPatternForDayOne);
        Assert.assertEquals(expectedDecisionMap, fPLOS.calculate(occupancyDateLRVMap, rateCodeRateValueMap));


    }
    }
