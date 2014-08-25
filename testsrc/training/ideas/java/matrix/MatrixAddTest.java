package training.ideas.java.matrix;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 22-08-2014.
 */

public class MatrixAddTest {

    @Test


    public void addMatrix () {

        int MatrixA[][] = {{1,4,6},{2,5,9},{3,6,9}};
        int MatrixB[][] = {{8,7,6},{5,4,3},{8,3,1}};
        int MatrixC[][] = {{9,11,12},{7,9,12},{11,9,10}};
        Assert.assertArrayEquals(MatrixC, MatrixAdd.add(MatrixA, MatrixB));

    }

}
