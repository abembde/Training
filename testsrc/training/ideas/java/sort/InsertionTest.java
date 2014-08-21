package training.ideas.java.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnamb on 05-08-2014.
 */
public class InsertionTest {

         @Test

        public void sort_given_by_asc() {
            int actual[] = {4, 1, 2, 5, 3};
            int expected[] = {1, 2, 3, 4, 5};

            Assert.assertArrayEquals(expected, InsertionSort.sortASC(actual));
        }


    @Test

    public void sort_given_by_dec() {
        int actual[] = {4, 1, 2, 5, 3};
        int expected[] = {5,4,3,2,1};

        Assert.assertArrayEquals(expected, InsertionSort.sortDESC(actual));
    }
}

