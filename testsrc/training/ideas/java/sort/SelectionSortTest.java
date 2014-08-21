package training.ideas.java.sort;

import org.junit.Assert;
import org.junit.Test;

/**
* Created by idnamb on 04-08-2014.
*/
public class SelectionSortTest {
    @Test

    public void sort_given_by_asc() {
        int actual[] = {84,69,76,86,94,91};
        int expected[] = {69,76,84,86,91,94};

        Assert.assertArrayEquals(expected, SelectionSort.sortAsc(actual));
    }


    @Test

    public void sort() {
        int actual[] = {10, -5, 4, -9, 3, 2, -7};
        int expected[] = {-9, -7, -5, 2, 3, 4, 10};

        Assert.assertArrayEquals(expected, SelectionSort.sortAsc(actual));
    }

    @Test

    public void sort1() {
        int actual[] = {4, 1, 2, 5, 2};
        int expected[] = {1, 2, 2, 4, 5};

        Assert.assertArrayEquals(expected, SelectionSort.sortAsc(actual));
    }

    @Test

    public void sort_given_by_desc() {
        int actual[] = {4, 1, 2, 5, 2};
        int expected[] = {5,4,2,2,1};

        Assert.assertArrayEquals(expected, SelectionSort.sortDesc(actual));
    }




}