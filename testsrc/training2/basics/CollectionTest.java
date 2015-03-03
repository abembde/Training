package training2.basics;

import org.junit.Test;

import java.util.*;


/**
 * Created by idndde on 2/23/2015.
 */
public class CollectionTest {

    @Test
    public void listBasics() {
        List myList = new ArrayList();
        myList.add("abc");
        myList.add(20);
        myList.add("xyz");
        myList.add("abcxyz");
        myList.add("abc");
        for(Object x:myList)
        {
            System.out.println(myList);
        }


    }


    @Test
    public void mapBasics() {
        Map<String,String> myMap=new HashMap<String,String>();
        myMap.put("Key1","Value1");
        myMap.put("Key2","value2");
        //System.out.println(myMap.get("Key1"));
        Map<String,String> mySortedMap= new TreeMap<String, String>();
        mySortedMap.putAll(myMap);

        Set<String> myKeys=myMap.keySet();

        for (String myKey : myKeys) {

            System.out.println(myKey + " contains " + myMap.get(myKey));


        }

    }

    @Test
    public void mapTreeBasics() {
        Map<String,String> myMap=new TreeMap<String, String>();
        myMap.put("Key1","Value1");
        myMap.put("Key2","value2");
        //System.out.println(myMap.get("Key1"));

        Set<String> myKeys=myMap.keySet();

        for (String myKey : myKeys) {

            System.out.println(myKey + " contains " + myMap.get(myKey));


        }

    }

    @Test
    public void mapTest(){

        String myStr="I love my India India is my Country";

        String arr1[]= myStr.split(" ");
        for(int i=0;i<arr1.length;i++)
        System.out.println(arr1[i]);

        Map<String,Integer> valueMap= new HashMap<String, Integer>();
        for (String string : arr1)

        System.out.println(valueMap.get(arr1));

        }

    @Test

    public void wordCount()
    {
        String[] words = {"ace", "boom", "ace", "dog", "eon"};

        List<String> wordList = Arrays.asList(words);

        for (String e : wordList)
        {
            System.out.println(e);
        }
    }


}
