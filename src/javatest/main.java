package javatest;

public class main {
    public static void main(String[] args) {
        // Variable and Data Types
        // primitive data type
        /**
         * int helloWorld = 5;
         * double num2 = 5.5;
         * boolean b = true;
         * char c = 'X';
         * 
         * // non-primitive data type
         * String a = "1b%";
         * 
         * System.out.println(helloWorld);
         * System.out.println(num2);
         * System.out.println(b);
         * System.out.println(c);
         * System.out.println(a);
         **/

        // Basic Operators
        int x = 5;
        int y = 7;
        double z = 10;
        int v = 15;
        int sum = x + y;
        double sum2 = z / y;
        double sum3 = v / (double) y;

        double d = Math.pow(y, x);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(d);
    }
}