package training.ideas.java.matrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 26-08-2014.
 */
public class MatrixTransposeTest {
    @Test
    public void transpose() {
        int[][] given = {{1, 4, 6}, {2, 5, 9}, {3, 6, 9}};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {6, 9, 9}};
        Assert.assertArrayEquals(expected, MatrixTranspose.getTranspose(given));
    }

}
