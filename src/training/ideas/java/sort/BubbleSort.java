package training.ideas.java.sort;

/**
 * Created by idnamb on 30-07-2014.
 */
public class BubbleSort {

    private enum order {ASC, DESC}

    public static int[] bubbleSortASC(int[] actual) {

        sort(actual,order.ASC);
        return actual;
    }
private static boolean verifyASCorDESC(int lhs, int rhs, order sortingOrder){
   if (sortingOrder==order.ASC){
       return lhs>rhs;
   }
    return lhs<rhs;
}

    private static void sort(int[] actual, order sortingOrder) {
        for (int pass = 0; pass < actual.length; pass++) {

            for (int counter = 0; counter < actual.length - 1; counter++) {

                  if (verifyASCorDESC(actual[counter],actual[counter+1],sortingOrder)) {
//                if (actual[counter] > actual[counter + 1]) {
                    int temp = actual[counter];
                    actual[counter] = actual[counter + 1];
                    actual[counter + 1] = temp;

                }
            }
        }
    }
    public static int[] bubbleSortDESC(int[] actual) {

        sort(actual, order.DESC);
        return actual;
    }
}








