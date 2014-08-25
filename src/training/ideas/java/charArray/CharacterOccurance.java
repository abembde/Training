package training.ideas.java.charArray;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharacterOccurance {

    public static int getOccurance(char[] chararray, int index) {

        for(int counter=index+1;counter<chararray.length;counter++){
            if(chararray[counter]==chararray[index]){
                return counter;
            }
        }

        return -1;
    }

}

