package training.ideas.java.decisions;

public class CalFPLOS {

    public static String FPLOS() {

        int Rate = 100;
        int los =1;
        double Avglrv = 0;
        String pattern="";
        double LRV[] = {100.0, 150.0, 200.0, 250.0, 300.0, 350.0, 400.0, 450.0};

        for (int counter = 0; counter < LRV.length; counter++ ){
            Avglrv+= LRV[counter];

            if (Avglrv/los <= Rate){
                pattern += "Y";
                System.out.println('Y');
            }
            else {
                pattern += "N";
                System.out.println('N');
            }
            los++;

        }

        return pattern;

    }

}


