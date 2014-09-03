package training.ideas.java.collections;

import org.junit.Test;

import java.util.*;

/**
 * Created by idnamb on 03-09-2014.
 */
public class FPLOSCalculatorTest {

@Test

    public void calFPLOS()
{
//    Set<Date> occupancyDate = new HashSet<Date>();
//    occupancyDate.add(java.sql.Date.valueOf("2014-09-01"));
//    occupancyDate.add(java.sql.Date.valueOf("2014-09-02"));
//    occupancyDate.add(java.sql.Date.valueOf("2014-09-03"));

//    Map<Date,List<String>> ratecode = new HashMap<Date,List<String>>();
//
//    ratecode.put(java.sql.Date.valueOf("2014-09-01"),Arrays.asList("A","B","C"));
//    ratecode.put(java.sql.Date.valueOf("2014-09-02"),Arrays.asList("A","B","C"));
//    ratecode.put(java.sql.Date.valueOf("2014-09-03"),Arrays.asList("A","B","C"));
//
//    Map<Date,List<Double>> datewiserates = new HashMap<Date,List<Double>>();
//
//    datewiserates.put(java.sql.Date.valueOf("2014-09-01"), Arrays.asList(70.4,104.0,50.5));
//    datewiserates.put(java.sql.Date.valueOf("2014-09-02"), Arrays.asList(70.4,104.0,50.5));
//    datewiserates.put(java.sql.Date.valueOf("2014-09-03"), Arrays.asList(70.4,104.0,50.5));

    Map<String, Double> codewiseRate = new HashMap<String, Double>();

    codewiseRate.put("A",50.5);
    codewiseRate.put(("B"),140.0);
//    codewiseRate.put(("C"),70.4);

    Map<String,List<Double>> datewiseLRVmap = new HashMap<String,List<Double>>();

    datewiseLRVmap.put("2014-09-01", Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0));
//    datewiseLRVmap.put("2014-09-02", Arrays.asList(50.9, 60.8, 70.4, 40.7, 100.0, 20.2, 30.6));
//    datewiseLRVmap.put("2014-09-03", Arrays.asList(70.4, 40.7, 100.0, 60.8, 40.7, 50.9, 60.8));


    Map<Date, Map<Double,String>> FPLOSDecision = new TreeMap<Date,Map<Double,String>>();

    Map<String,   Map<String,String> > output= new FPLOSCalculator().getFPLOSPattern(codewiseRate, datewiseLRVmap);

   }

}


