package training.ideas.java.matrix;

/**
 * Created by idnamb on 22-08-2014.
 */
public class MatrixAdd {

        public static Object[] add(int[][] MatrixA, int[][] MatrixB) {

            int MatrixC[][] = new int[MatrixA.length][MatrixB[0].length];

            for (int counter1 = 0; counter1 < MatrixA.length; counter1++) {

                for (int counter2 = 0; counter2 < MatrixB.length; counter2++) {

                    MatrixC[counter1][counter2] = MatrixA[counter1][counter2] + MatrixB[counter1][counter2];
                }
            }

            return MatrixC;
        }
    }

