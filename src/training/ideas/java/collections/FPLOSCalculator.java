package training.ideas.java.collections;

import java.util.*;

/**
 * Created by idnamb on 03-09-2014.
 */
public class FPLOSCalculator {
    public  Map<String,   Map<String,String> >  getFPLOSPattern(Map<String, Double> codewiseRate, Map<String, List<Double>> datewiseLRVmap) {


            double Rate = 0;
            int los =1;
            double Avglrv = 0;
            String pattern="";
//            double LRV[] = {100.0, 150.0, 200.0, 250.0, 300.0, 350.0, 400.0, 450.0};

        Map<String,String> output = new HashMap<String,String>();
        Map<String,   Map<String,String> > output1 = new HashMap<String,   Map<String,String> >();
        Set<String> codeKey = codewiseRate.keySet();
        Set<String> dateKey = datewiseLRVmap.keySet();

        for (String date : dateKey)
        {output = new HashMap<String,String>();
            for (String rateKey : codeKey) {
                pattern="";
                Rate = codewiseRate.get(rateKey);
                List<Double> LRVList = datewiseLRVmap.get(date);


                for (int counter = 0; counter < LRVList.size(); counter++) {
                    Avglrv += LRVList.get(counter);

                    if (Avglrv / los <= Rate) {
                        pattern += "Y";
                        // System.out.println('Y');
                    } else {
                        pattern += "N";
                        // System.out.println('N');
                    }
                    los++;

                }

                System.out.println(pattern);
                output.put(rateKey, pattern);
            }
            output1.put(date, output);
            }

       return output1;
        }
}
