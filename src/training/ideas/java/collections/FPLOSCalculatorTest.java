package training.ideas.java.collections;

import com.sun.xml.internal.ws.util.FastInfosetUtil;
import org.junit.Test;

import java.util.*;

/**
 * Created by idnamb on 03-09-2014.
 */
public class FPLOSCalculatorTest {

@Test

    public void calFPLOS()
{
    Set<Date> occupancyDate = new HashSet<Date>();
    occupancyDate.add(java.sql.Date.valueOf("2014-09-01"));
    occupancyDate.add(java.sql.Date.valueOf("2014-09-02"));
    occupancyDate.add(java.sql.Date.valueOf("2014-09-03"));


    Map<Date,List<Double>> datewiseLRVmap = new HashMap<Date,List<Double>>();

    datewiseLRVmap.put(java.sql.Date.valueOf("2014-09-01"), Arrays.asList(100.0, 20.2, 30.6, 40.7, 50.9, 60.8, 70.4));
    datewiseLRVmap.put(java.sql.Date.valueOf("2014-09-02"), Arrays.asList(50.9, 60.8, 70.4, 40.7, 100.0, 20.2, 30.6));
    datewiseLRVmap.put(java.sql.Date.valueOf("2014-09-03"), Arrays.asList(70.4, 40.7, 100.0, 60.8, 40.7, 50.9, 60.8));

    Map<Date,List<Double>> datewiserates = new HashMap<Date,List<Double>>();

    datewiserates.put(java.sql.Date.valueOf("2014-09-01"), Arrays.asList(70.4, 40.7, 100.0, 60.8, 40.7, 50.9, 60.8));
    datewiserates.put(java.sql.Date.valueOf("2014-09-02"), Arrays.asList(100.0, 20.2, 30.6, 40.7, 50.9, 60.8, 70.4));
    datewiserates.put(java.sql.Date.valueOf("2014-09-03"), Arrays.asList(50.9, 60.8, 70.4, 40.7, 100.0, 20.2, 30.6));






}

}


