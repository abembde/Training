package training.ideas.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by idnamb on 28-08-2014.
 */
public class ListOperation {

    public static void main(String a[]){

       String[]names = {"AMOL","KIRTESH","NIKHIL","RAHUL","Nilesh","Chetan"};

       List<String> list1 = new ArrayList<String>();

        for (String X : names)
            list1.add(X);

        List<String> list2 = new ArrayList<String>();

        list2.add("one");
        list2.add("two");

        System.out.println("After adding to list:" + list1);

        Collections.reverse(list1);

        System.out.println("After reversing to list:" + list1);

        Collections.shuffle(list1);

        System.out.println("After shuffling to list:"+list1);

        Collections.swap(list1, 2, 5);

        System.out.println("After swap to list:"+list1);

        list1.addAll(list2);

        System.out.println("After adding to list:"+list1);

        List<String> sublist = list1.subList(2, 4);

        System.out.println("Sublist:"+sublist);

        list1.clear();

        System.out.println("After clearing to list:"+list1);


    }
}