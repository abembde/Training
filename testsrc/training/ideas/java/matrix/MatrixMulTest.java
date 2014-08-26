package training.ideas.java.matrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 25-08-2014.
 */
public class MatrixMulTest {

    @Test

    public void MatrixMul() {

        int MatrixA[][] = {{1, 4, 6}, {2, 5, 9}, {3, 6, 9}};
        int MatrixB[][] = {{8, 7, 6}, {5, 4, 3}, {8, 3, 1}};
        int MatrixC[][] = {{76,41,24}, {48,61,36},{126,72,45}};
        Assert.assertArrayEquals(MatrixC, MatrixMul.Mul(MatrixA, MatrixB));
    }

}

