package training2.basics;

import org.junit.Test;

/**
 * Created by idnamb on 23-12-2014.
 */


   public class test {
//    @Test
//    public void test1()
//
//    {
//       int i=5;
//
//        for (int j=1; j <= 10; j++) {
//
//            System.out.println(j*i);
//
//        }
//    }
@Test
    public void test2()

    {
        int i = 1;
        int j=  5;

        for (i = 1; i <= 10; i++)
        {
            for ( j= 1;j <=10; j++) {

                System.out.print("\t" + j);
            }

            System.out.print("\t" + i+"\n");
        }

        }
    }
