package training.ideas.java.sort;

/**
 * Created by idnamb on 05-08-2014.
 */
public class InsertionSort {

    private enum order {ASC, DESC}
    public static int[] sortASC(int[] actual) {

        sortOrder(actual,order.ASC);
        return actual;
          }

    private static boolean verifyASCorDESC(int lhs, int rhs, order sortingOrder) {
        if (sortingOrder == order.ASC) {
            return lhs > rhs;
        }
        return lhs < rhs;
    }

    private static void sortOrder(int[] actual, order sortingOrder) {
        for (int counter = 1; counter < actual.length; counter++) {
            int index = actual[counter];
            int j = counter;

                while (j > 0 && verifyASCorDESC(actual[j - 1],index,sortingOrder))
                {
                    actual[j] = actual[j-1];
                    j--;
                }
                actual[j] = index;
            }
        }

        public static int[] sortDESC ( int[] actual){

            sortOrder(actual, order.DESC);
            return actual;
        }

    }


