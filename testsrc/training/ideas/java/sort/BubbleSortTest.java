package training.ideas.java.sort;

//import junit.framework.Assert;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 30-07-2014.
 */
public class BubbleSortTest {

    @Test

    public void sort_given_by_asc() {
        int actual[] = {4, 1, 2, 5, 3};
        int expected[] = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expected, BubbleSort.bubbleSortASC(actual));
    }

    @Test
    public void sort() {
        int actual[] = {10, 5, 4, 9, 3, 2, 7};
        int expected[] = {2, 3, 4, 5, 7, 9, 10};

        Assert.assertArrayEquals(expected, BubbleSort.bubbleSortASC(actual));
    }

    @Test

    public void sort1() {
        int actual[] = {10, -5, 4, -9, 3, 2, -7};
        int expected[] = {-9, -7, -5, 2, 3, 4, 10};

        Assert.assertArrayEquals(expected, BubbleSort.bubbleSortASC(actual));
    }

    @Test

    public void sort2() {
        int actual[] = {99, 55, 0, -1, 78, 35};
        int expected[] = {-1, 0, 35, 55, 78, 99};

        Assert.assertArrayEquals(expected, BubbleSort.bubbleSortASC(actual));
    }


    @Test

    public void sort3() {
        int actual[] = {4, 1, 2, 5, 3};
        int expected[] = {5, 4, 3, 2, 1};

        Assert.assertArrayEquals(expected, BubbleSort.bubbleSortDESC(actual));

    }
}

