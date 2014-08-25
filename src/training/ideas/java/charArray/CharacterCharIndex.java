package training.ideas.java.charArray;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharacterCharIndex {

    public static int indexForChar(char[] chararray, char A) {

        for(int counter=0;counter<chararray.length;counter++){
            if(chararray[counter]==A){
                return counter;
            }
        }

        return -1;
    }
}


