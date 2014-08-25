package training.ideas.java.charArray;

/**
 * Created by idnamb on 19-08-2014.
 */
public class Concate {
        public static char[] charConcate(char[] X, char[] Y)
    {

                int len1=X.length;
                int len2=Y.length;
                char[] output = new char[len1+len2];
                System.arraycopy(X,0,output,0,len1);
                System.arraycopy(Y,0,output,len1,len2);
                return output;

    }
}
