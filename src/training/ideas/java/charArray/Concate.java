package training.ideas.java.charArray;

/**
 * Created by idnamb on 19-08-2014.
 */
public class Concate {
        public static char[] stringConcate(char[] X, char[] Y)
    {

                int str1=X.length;
                int str2=Y.length;
                char[] output = new char[str1+str2];
                System.arraycopy(X,0,output,0,str1);
                System.arraycopy(Y,0,output,str1,str2);
                return output;

    }
}
