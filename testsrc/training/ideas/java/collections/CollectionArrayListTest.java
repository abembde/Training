package training.ideas.java.collections;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idnamb on 27-08-2014.
 */
public class CollectionArrayListTest
{

    @Test
    public void nameList() {

        List<String> unsortedList = new ArrayList<String>();
        unsortedList.add("AMOL");
        unsortedList.add("KIRTESH");
        unsortedList.add("NIKHIL");
        unsortedList.add("RAHUL");
        unsortedList.add("GEETANJALI");
        unsortedList.add("111");

        List<String> sortedList = new ArrayList<String>();
        sortedList.add("111");
        sortedList.add("AMOL");
        sortedList.add("GEETANJALI");
        sortedList.add("KIRTESH");
        sortedList.add("NIKHIL");
        sortedList.add("RAHUL");
        Assert.assertEquals(sortedList, CollectionLL.getSortList(unsortedList));
    }

}
