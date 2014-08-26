package training.ideas.java.matrix;

/**
 * Created by idnamb on 26-08-2014.
 */
public class MatrixTranspose {
    public static Object[] getTranspose(int[][] given) {
        int expected [][]=new int[given.length][given.length];
        for (int i=0;i<given.length;i++){
            for (int j=0;j<given.length;j++){
                expected[i][j]=given[j][i];
            }
        }

        return expected;
    }
}
