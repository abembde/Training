package training.ideas.java.charArray;

/**
 * Created by idnamb on 19-08-2014.
 */
public class Lowercase {
    public static char[] getLower(char[] given)
        {
               for(int counter=0;counter<given.length;counter++)
            {
                given[counter]=Character.toLowerCase(given[counter]);
            }

            return given;

    }
}
