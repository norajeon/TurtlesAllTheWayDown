package PACKAGE_NAME;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public static void mystery(int n) {
        if (n == 0 || n == 1) return;
        mystery(n-2);
        System.out.println(n);
        mystery(n-1);
    }

    public static void main(String[] args) {
        mystery(3);

    }

}
