package training.ideas.java.charArray;

/**
 * Created by idnamb on 19-08-2014.
 */
public class Uppercase {
    public static char[] getupper(char[] given) {
        for(int counter=0;counter<given.length;counter++)
        {
            given[counter]=Character.toUpperCase(given[counter]);
        }

        return given;

    }
}
