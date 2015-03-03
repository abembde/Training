package training2.basics;

/**
 * Created by idnamb on 01-12-2014.
 */
public class Calculator2 {
    private int count;

    public int performAdd(int num1, int num2) {
        count++;
        return num1+num2;
    }

    public int getCount() {
        return count;
    }


    public int performSub(int num1, int num2) {
        count++;
        return num1-num2;
    }

        public int performMul(int num1, int num2) {
            count++;
            return num1*num2;
    }

    public int performDiv(int num1, int num2) {
        count++;
        return num1/num2;
    }

    public double performAdd(double num1, double num2) {
        count++;
        return num1+num2;

    }
}
