package training2.basics;

/**
 * Created by idnamb on 13-01-2015.
 */
public class GetRange {
    public static void main(Strings args[]) {
        int a = 10;
        int b = 9;

        range(a, b);
    }

    private static void range(int a, int b) {
        if (a >= 10 && a <= 20 || b >= 10 && b <= 20) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}