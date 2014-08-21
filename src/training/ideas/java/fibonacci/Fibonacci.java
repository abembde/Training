package training.ideas.java.fibonacci;

/**
 * Created by idnamb on 06-08-2014.
 */
public class Fibonacci {
    public static int[] findFib(int number) {

        int n =0,m=1;
        int [] actual=new int[number];
        actual[0]=n;
        actual[1]=m;

        for (int counter=1;counter<=number-2;counter++){
            int sum = n+m;
            n=m;
            m=sum;
            actual[1+counter]=sum;


        }

        return actual;
    }
}
