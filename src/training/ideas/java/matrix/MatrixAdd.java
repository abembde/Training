package training.ideas.java.matrix;

/**
 * Created by idnamb on 22-08-2014.
 */
public class MatrixAdd {

        public static Object[] add(int[][] MatrixA, int[][] MatrixB) {

            int MatrixC[][] = new int[MatrixA.length][MatrixB.length];

            for (int i = 0; i < MatrixA.length; i++) {

                for (int j = 0; j < MatrixB.length; j++) {

                    MatrixC[i][j] = MatrixA[i][j] + MatrixB[i][j];
                }
            }

            return MatrixC;
        }


}

