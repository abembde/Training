package training.ideas.java.charArray;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharacterNumberOccurance {
    public static int getoccurance(char[] a, char b) {

        int counter=0;
        for(int element=0;element<a.length;element++){
            if(a[element]==b)
                counter=counter+1;
        }
        return counter;

    }

}
