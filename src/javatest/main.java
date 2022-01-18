package javatest;

import java.util.Scanner; // java tools untuk membuat hasil input

public class main {
    public static void main(String[] args) {
        // Variable and Data Types
        // primitive data type
        /*
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
         */

        // Basic Operators

        /*
         * int x = 5;
         * int y = 7;
         * double z = 10; // bilangan koma
         * int v = 15;
         * int u = 53;
         * int sum = x + y;
         * double sum2 = z / y; // hasil menjadi double jika salah satu data type nya
         * double, penampung hasil
         * // operasi wajib double
         * double sum3 = v / (double) y; // v / y = hasil integer, jika pakai
         * typecasting (double), hasil menjadi double
         * int sum4 = u % x; // u / x = hasil -> x * hasil(tanpa koma) = hasil modulus
         * 
         * double d = Math.pow(y, x); // y pangkat x = hasil
         * 
         * System.out.println(sum);
         * System.out.println(sum2);
         * System.out.println(d);
         * System.out.println(sum3);
         * System.out.println(sum4);
         */

        Scanner sc = new Scanner(System.in); // data type Scanner dari tools Scanner, dinamakan sc dan selanjutnya cara
                                             // menggunakannya
        String scanned = sc.next(); // ini cara dan tempat untuk mendapat input dari user, simpan di variabel
                                    // scanned
        // int scanned = sc.nextInt(); // input menyesuaikan dengan data type yang
        // dipakai
        // boolean scanned = sc.nextBoolean();
        // double scanned = sc.nextDouble();
        int x = Integer.parseInt(scanned); // cara untuk mengubah input dari variabel scanned yaitu data type string,
                                           // menjadi input dan output integer dan di simpan di variabel x

        System.out.println(x);

    }
}