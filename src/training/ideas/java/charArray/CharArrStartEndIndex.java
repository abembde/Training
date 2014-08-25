package training.ideas.java.charArray;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharArrStartEndIndex {

    public static char[] getsubstrindex(char[] a, int startindex, int endindex) {

        int Len=a.length-startindex-endindex;
        char output[]=new char[Len];
        for(int counter=startindex;counter<=Len;counter++){
            output[counter-startindex]=a[counter];

        }
        return output;

    }


}
