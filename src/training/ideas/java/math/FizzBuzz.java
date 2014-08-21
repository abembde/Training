package training.ideas.java.math;

/**
 * Created by idnamb on 12-08-2014.
 */
public class FizzBuzz {
    public static String findFizzBizz(int given) {
        String output = "";
        for (int counter = 1; counter <= given; counter++) {
            if ((counter ) % 3 == 0 || (counter) % 5 == 0) {
                if ((counter) % 3 == 0) {
                    output+= "Fizz";
                }
                if ((counter) % 5 == 0) {
                    output+= "Buzz";
                }
            }
            else {
                output+= counter + "";
            }
           }
        return output;
    }
}
