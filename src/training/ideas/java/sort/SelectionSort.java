package training.ideas.java.sort;

/**
 * Created by idnamb on 04-08-2014.
 */
public class SelectionSort {

    private enum order {ASC,DESC}


    public static int[] sortAsc(int[] actual) {

        sorting(actual,order.ASC);
        return actual;
    }
    private static boolean verifyASCorDESC(int lhs, int rhs, order sortingOrder) {
        if (sortingOrder == order.ASC) {
            return lhs > rhs;
        }
        return lhs < rhs;
    }

    public static void sorting(int[] actual, order sortingOrder) {
        for (int counter = 0; counter < actual.length - 1; counter++) {

            {
                int min = counter;
                int minnumber = actual[counter];
                for (int index = counter + 1; index < actual.length; index++) {

                    if (verifyASCorDESC(minnumber, actual[index],sortingOrder)) {
                        minnumber = actual[index];
                        min = index;

                    }
                }
                int temp = actual[counter];
                actual[counter] = actual[min];
                actual[min] = temp;
            }
        }
    }

    public static int[] sortDesc(int[] actual) {

        sorting(actual, order.DESC);
        return actual;
    }
}




