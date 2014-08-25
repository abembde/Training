package training.ideas.java.charArray;

/**
 * Created by idnamb on 21-08-2014.
 */
public class CharacterArray {
    public static char[] getchar(char[] given, int index) {
        char[] output=new char[given.length-index];
        for(int counter=index;counter<given.length;counter++)
        {
            output[counter-index]=given[counter];
        }

        return output;
    }
}
