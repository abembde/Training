package training2.basics;

/**
 * Created by idnamb on 06-01-2015.
 */
public class CalculateToffies {

    public static void main(Strings args[]) {
        int givenDAys = 11;
        int rate =2;
        int toffee =givenDAys/rate;

        int wrapper = toffee;
        int remainder;
        int offer = 2;

        while(wrapper >=offer)
        {
            remainder=toffee%offer;
            wrapper=(wrapper+remainder)/offer;
            toffee=toffee+wrapper;
        }

        System.out.println("Total number of toffee = " + toffee);
        System.out.println();
    }
}