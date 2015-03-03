package training2.basics;

import org.junit.Test;
import org.junit.Test;

/**
 * Created by idnamb on 16-01-2015.
 */
public class Get_Temp {
//
//    public static void main(String args[]) {
//        int temp1 = -50;
//        int temp2 = -60;
//
//        if (temp1 <= 0 && temp2 >= 100 ||temp1 >= 100 && temp2 <= 0 ) {
//            System.out.println("TRUE");
//        } else {
//            System.out.println("FALSE");
//        }
//    }
//}



@Test

public void temperature(){
        int temp1 = -50;
        int temp2 = -60;

        if (temp1 <= 0 && temp2 >= 100 ||temp1 >= 100 && temp2 <= 0 ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }




    public boolean temperature1(int temp1 ,int temp2){


        if (temp1 <= 0 && temp2 >= 100 ||temp1 >= 100 && temp2 <= 0 ) {
            return true;
        } else {
            return false;

        }
    }

    @Test

    public void test()
    {
        System.out.println(temperature1(-50,-60));
    }
}