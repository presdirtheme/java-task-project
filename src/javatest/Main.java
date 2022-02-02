package javatest;

import java.util.Scanner;

// java tools untuk membuat hasil input

public class Main {
    public static void main(String[] args) {
    /*
        // Variable and Data Types
        // primitive data type
        int helloWorld = 5;
        double num2 = 5.5;
        boolean b = true;
        char c = 'X';

        // non-primitive data type
        String a = "1b%";

        System.out.println(helloWorld);
        System.out.println(num2);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);


        // Basic Operators
        int x = 5;
        int y = 7;
        double z = 10; // bilangan koma
        int v = 15;
        int u = 53;
        int sum = x + y;
        double sum2 = z / y; // hasil menjadi double jika salah satu data type nya double, penampung hasil operasi wajib double
        double sum3 = v / (double) y; // v / y = hasil integer, jika pakai typecasting (double), hasil menjadi double
        int sum4 = u % x; // u / x = hasil -> x  hasil(tanpa koma) = hasil modulus

        double d = Math.pow(y, x); // y pangkat x = hasil

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(d);
        System.out.println(sum3);
        System.out.println(sum4);


        Scanner sc = new Scanner(System.in); // data type Scanner dari tools Scanner, dinamakan sc dan selanjutnya cara menggunakannya
        String scanned = sc.next(); // ini cara dan tempat untuk mendapat input dari user, simpan di variabel scanned
        int scanned = sc.nextInt();
        // input menyesuaikan dengan data type yang dipakai boolean
        scanned = sc.nextBoolean();
        double scanned = sc.nextDouble();
        int x = Integer.parseInt(scanned); // cara untuk mengubah input dari variabel scanned yaitu data type string, menjadi input dan output integer dan di simpan di variabel x

        System.out.println(x);


        // Conditions and Booleans
        int x = 6;
        int y = 7;
        int z = 10;

        int x0 = 5;
        int y0 = 5;

        String x1 = "hello";
        String y2 = "hi";

        // > (lebih besar dari) . < (lebih kecil dari). == (sama dengan). >= (lebih besar atau sama dengan) . <= (lebih kecil atau sama dengan). != (tidak sama dengan)

        boolean compare1 = x < y; // x lebih kecil dari y = true
        boolean compare2 = x > y; // x lebih besar dari y = false
        boolean compare3 = y >= z; // x0 >= y0; // x0 lebih besar atau sama dengan y0 = true | y lebih besar atau sama dengan x = false
        boolean compare4 = y <= z; // x0 <= y0; // x0 lebih kecil atau sama dengan y0 = true | y lebih kecil atau sama dengan x = false
        boolean compare5 = x == z; // x0 == y0; // x0 sama dengan y0 = true | x sama dengan z = false
        boolean compare6 = x1 != y2; // x1 (isinya) tidak sama dengan y2 = true
        boolean compare7 = x > y && z > y; // x lebih besar dari y DAN z lebih besar dari y = false DAN true = false(operator DAN ini jika salah satu/kedua nya false, maka hasil nya false)
        boolean compare8 = x > y || z > y; // x lebih besar dari y ATAU z lebih besar dari y = false ATAU true = false (operator ATAU ini jika salah satu/kedua nya true, maka hasil nya true)
        boolean compare9 = !(x > y || z > y); // hasilnya = false ATAU true = true = false (tidak sama dengan ini berarti kebalikan dari hasil di dalam kurung ini)
        boolean compare10 = (x < y && y > z) || (z + 2 < 5 || x + 7 > y); // operasi pertama: hasilnya = false ATAU true = true (dari hasil 2 operasi dalam kurung ini, hasil akhir nya menjadi true, karena operator ATAU)

        System.out.println(compare5);

    
        // if, else if, else statements

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // JIKA, kondisi di dalam kurung ini TRUE, MAKA lakukan perintah di dalam {}
        if (s.equals("tim")) {
            System.out.println("You typed tim");
        }

        // DAN JIKA / JIKA LAIN, kondisi di dalam kurung diatas itu tidak TRUE, tetapi
        // disini TRUE, maka lakukan perintah di dalam {}
        else if (s.equals("hello")) {
            System.out.println("hi");
        }

        // SELAIN, semua kondisi diatas itu tidak TRUE, maka lakukan perintah di dalam
        // {}
        else {
            System.out.println("prints");
        }
    

        // Nested Statements
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) { // jika input angka lebih dari/sama dengan 18
            System.out.print("Input your fav food: "); // maka input lagi teks disini
            String food = sc.nextLine();

            if (food.equals("Pizza")) { // jika input teks Pizza, maka akan print out Mine too!
                System.out.println("Mine too!");
            } else {
                System.out.println("Not mine.."); // selain itu, Not Mine..
            }
        } else if (age >= 13) { // jika lebih dari/sama dengan 13, maka langsung print You are a teenager!
            System.out.println("You are a teenager!");
        } else { // selain semua ruang lingkup angka diatas, langsung print You are not a teenager or an adult
            System.out.println("You are not a teenager or an adult");
        }
    

        // Arrays
        String[] newArr = new String[5]; // ditandai dengan [] untuk membuat Array // ini cara pertama untuk membuat array
        newArr[0] = "hello"; // ini isi dari array yang sudah dibuat
        newArr[1] = "tim"; // array dimulai/dihitung dari 0, jadi ini kita buat 5 "tempat", lalu isi "tempat tersebut" dimulai dari 0 = hello, 1 = "tim", dll
        newArr[2] = "hi";
        newArr[3] = "joe";
        newArr[4] = "jim";

        String x1 = newArr[0]; // cara untuk mengakses dan menyimpan value dari isi array ke variabel

        int[] nums = {2, 3, 5, 10, 15}; // ini cara kedua untuk membuat dan mengisi element array

        int x2 = nums[4];

        System.out.println(x1);
        System.out.println(x2);
    

        // For Loops
        int[] arr = {1,5,7,6,8,5}; // di dalam array ini ada 5 index, dimulai dari index 0 = 1, index 1 = 5

        for (int i = 0; i < arr.length; i++) { // variabel i isinya = 0; i < ada berapa jumlah index yang ada di variabel arr; isi variabel i (mulai dari 0) ditambahkan 1 berulang-ulang sampai dengan i < jumlah index arr 
            if (arr[i] == 5) { // jika isi variabel i itu 5, index ke berapa di arr yang sama isinya dengan variabel i (i = 0 (1), i = 1 *(5)*, i = 2 (7), i = 3 (6), i = 4 (8), i = 5 *(5)*)
                System.out.println("i found 5 at index: " + i); // maka print index keberapa yang isinya angka 5 seperti isi variabel i itu
            }
        }
    */
        // For Each Loop

        /* int[] arr = {1,5,6,7,8};
        
        int count = 0; // untuk menghitung/cek index ke berapa
        for (int element:arr) { // variabel element akan masuk ke array arr, lalu mengambil dan menyimpan sementara isi arr dari awal sampai akhir
            System.out.println(element + " " + count);
            count++; // variabel count ditambah setiap setelah di print/looping
            System.out.println(element); // isi dari variabel element sesuai setelah ke-berapa kali masuk di arr (looping/masuk pertama kali = 1, masuk kedua kali = 5, dst..)
        } */

        String[] names = new String[5]; // buat 4 "tempat" array kosong
        Scanner sc = new Scanner(System.in); // inisialisasi untuk dapat memakai scanner input

        for (int i = 0; i < names.length; i++) { // variabel i masuk berulang kali ke dalam array names
            System.out.print("Input: "); // beritahu user untuk input
            String input = sc.nextLine(); // tempat user input, dan isi nya disimpan di variabel input
            names[i] = input; // hasil dari input user, akan di masukkan ke dalam array names, sesuai urutan index dari variabel i (user input a pertama kali = i = 0 (index ke 0) = masuk ke index(ruang ke-) 0, looping lagi, user input b = masuk ke index 1, dst..)
        }

        int count = 0;
        for (String n : names) { // variabel n masuk ke dalam array names, dan menyimpan setiap isi dari dalam array names
            System.out.println(n + " " + "index ke: " + count); // lalu menampilkan isi dari array names
            count++;

            if (n.equals("n3")) { // jika variabel n = n3 (sesuai yang diinput user)
                break; // maka berhenti sampai disini, karena n sudah = n3
                // walau user sudah input 5 kali, karena yang akan di print itu variabel n dari isi array names, maka jika n = n3, berhenti untuk print
            }
        }
    }
}