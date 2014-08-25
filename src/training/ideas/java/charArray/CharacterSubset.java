package training.ideas.java.charArray;

/**
 * Created by idnamb on 22-08-2014.
 */
public class CharacterSubset {

    public static int indexForTwoCharArr(char[] chararray1, char[] chararray2) {

        for(int counter1=0;counter1<chararray1.length-chararray2.length+1;counter1++) {
            boolean matched=true;

            for (int counter2 = 0; counter2 < chararray2.length; counter2++) {

                if(chararray1[counter1+counter2]!=chararray2[counter2])
                {
                    matched=false;
                }
                matched=true;

            }
            if (matched)
                return counter1;
        }

        return -1;

    }
}
