package training.ideas.java.calculator;

/**
 * Created by idnamb on 21-07-2014.
 */
public class Addition {

    private static double[] a;

    public static double add(double first, double second) {

        return first + second;
    }

    public static double add(int first, double second, double third) {

        return first + second + third;
    }

    public static int add(int... numbers) {
        int sum=0;

        for (int i = 0; i<numbers.length;i++)
        {

            sum = sum + numbers[i];
        }
        return sum;

    }

//For Loop
    public static double add(double[] numbers) {
        double sum=0;

        for (int i = 0; i<numbers.length;i++)
        {

            sum = sum + numbers[i];
        }
        return sum;
    }

}

        //While
//        int i=0;
//
//        while(i<a.length)
//        {
//            sum = sum + a[i++];
//       OR     i++;

//Do While

//        int i=0;
//
//        do {
//
//        }
//        while (i < a.length);
//        {
//            sum = sum + a[++];
//
//    }


            // calculate full LOS pattern when given 1 rate , lrv for 7 days


