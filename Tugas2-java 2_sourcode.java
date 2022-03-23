


{
    "java.project.sourcePaths": ["src"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/*/.jar"
    ]
}
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package com;
import java.util.Scanner;

public class Waktu {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totJam, jam, totMen, menit, detik, konversi;

        System.out.print("Masukkan total detik : ");
        konversi = input.nextInt();

        detik = konversi % 60;
        totMen = konversi / 60;
        menit = totMen % 60;
        totJam = totMen / 60;
        jam = totJam % 24;

        System.out.println("Detik sekarang  : " +detik+ " detik");
        System.out.println("Total menit     : " +totMen+ " menit");
        System.out.println("Menit sekarang  : " +menit+ " menit");
        System.out.println("Total jam       : " +totJam+ " jam");
        System.out.println("Jam sekarang    : " +jam+ " jam");
        System.out.println("Tampil waktu    : " + jam + ":" + menit + ":" + detik);
    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas1;

public class Asgdll {

    /**
     * @param args
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        float f=20.0f;
        double fll;

        /* Algoritma */
        fll= 10.0f;
        System.out.println("f : " +f+ "\nfll: " +fll);
    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas10;

public class Hello {

    /**
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        /* menuliskan hello ke layar */
        System.out.print ("Hello");

        /* menuliskan hello dan ganti baris */
        System.out.print ("\nHello");

        /* menuliskan hello dan ganti baris */
        System.out.println("World");

        System.out.println("Welcome");

    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas11;

/* Effek dari operator ++ */
public class Incr {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int i, j;

        /* Program */
        i = 3;
        j = i++;

        System.out.println("Nilai i : " + (++i) + "\nNilai j : " + j);
    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas12;

/* pemakaian beberapa operator terhadap bit */
public class Oper1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */

        int n = 10; /* 1010 */

        int x = 1;  /* 1 */

        int y = 2;  /* 10 */

        /* ALGORITMA */

        System.out.println("n = "+ n);
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        System.out.println("n & 8 = "+ (n & 8));    /* 1010 AND 1000 */
        System.out.println("x & ~ 8 = "+ (x & ~8)); /* 1 AND 0111 */
        System.out.println("y << 2 = "+ (y << 2));  /* 10 ==> 1000 = 8 */
        System.out.println("y >> 3 = "+ (y >> 3));  /* 10 ==> 0000 = 0 */
    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas13;

/* pemakaian beberapa operator terhadap RELATIONAL DAN bit */
public class Oper2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */
        char i, j;

        /* ALGORITMA */
        i = 3;          /* 00000011 dalam biner */
        j = 4;          /* 00000100 dalam biner */

        System.out.println("i = "+ (int) i);
        System.out.println("j = "+ j);


        System.out.println("i & j = "+ (i & j));       /* 0: 00000000 dalam biner */
        System.out.println("i | j = "+ (i | j));       /* 7: 00000111 biner */
        System.out.println("i ^ j = "+ (i ^ j));       /* 7: 00000111 biner Ingat!!! operator "^" pada bahasa java bukan sebagai pangkat*/
        System.out.println(Math.pow(i, j));            /* Class Math memiliki method pow(a,b) untuk pemangkatan*/
        System.out.println(" ~i = "+ ~i);              /* -4: 11111100 biner */
    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas14;

public class Oper3 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Algoritma */
        if (true && true){ System.out.println(true && true); }      /* true = true and true */
        if (true & true) { System.out.println(true & false); }      /* true & true */
        if (true) { System.out.println(true); }                     /* true */
        if (true || true){ System.out.println(true); }              /* true = true or true */
        if (true|false) { System.out.println(true|false); }         /* true|false */

    }
}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas15;

/* Operator terner */
public class Oper4 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */

        int i = 0;      /* perhatikan int i,j=0 bukan seperti ini */
        int j = 0;

        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i>j) ? i: j);
        /* ALGORITMA */

        System.out.print ("Nilai e = "+ e);
        System.out.print ("\nNilai k = "+ k);
        i = 2;
        j = 3;

        k = ((i++>j++) ? i: j) ;

        System.out.print ("\nNilai k = "+ k);

    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas16;

/* contoh pengoperasian variabel bertype dasar */
public class Oprator {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */

            boolean Bool1, Bool2, TF ; int i,j, hsl ;
            float x,y,res;

        /* Algoritma */
            System.out.println      ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
            System.out.println("Operasi Logika");
            //AND
            System.out.println("==AND==");
            Bool1 = true; Bool2 = false;
            TF = Bool1 && Bool2 ;   /* Boolean AND */
            System.out.println(Bool1 + " && " + Bool2 + " = " + TF);
            //OR 
            System.out.println("==OR==");
            Bool1 = true; Bool2 = false;
            TF = Bool1 || Bool2 ;   /* Boolean OR */
            System.out.println(Bool1 + " || " + Bool2 + " = " + TF);
            //NOT
            System.out.println("==NEGASI==");
            Bool1 = true; Bool2 = false;
            TF = ! Bool1 ;          /* NOT */
            System.out.println(" ! " + Bool1 + " = " + TF);
            //XOR
            System.out.println("==XOR==");
            Bool1 = true; Bool2 = false;
            TF = Bool1 ^Bool2;      /* XOR */
            System.out.println(Bool1 + " ^" + Bool2 + " = " + TF);


        /* operasi numerik */
            System.out.println("Operasi Numerik");
            //Penjumlahan
            i = 5; j = 2 ;
            hsl = i + j; 
            System.out.println(i + " + " + j + " = " + hsl);
            //Pengurangan
            i = 5; j = 2;
            hsl = i - j;
            System.out.println(i + " - " + j + " = " + hsl);
            //Perkalian
            i = 5; j = 2;
            hsl = i * j;
            System.out.println(i + " * " + j + " = " + hsl);
            //Pembagian pecahan
            i = 5; j = 2;
            float hasil = (float) i / j;
            System.out.println(i + " / " + j + " = " + hasil);
            //Pembagian bulat
            i = 5; j = 2;
            hsl = i / j;
            System.out.println(i + " / " + j + " = " + hsl);
            //Modulo
            i = 5; j = 2;
            hsl = i % j;
            System.out.println(i + " % " + j + " = " + hsl);


        /* operasi numerik */
            System.out.println("Operasi Numerik");
            //Penjumlahan
            x = 5 ; y = 5 ;
            res = x + y; 
            System.out.println(x + " + " + y + " = " + res); 
            //Pengurangan
             x = 5 ; y = 5 ;
             res = x - y; 
             System.out.println(x + " - " + y + " = " + res); 
            //Pembagian
            x = 5 ; y = 5 ;
            res = x / y; 
            System.out.println(x + " / " + y + " = " + res); 
            //Perkalian
             x = 5 ; y = 5 ;
             res = x * y; 
             System.out.println(x + " * " + y + " = " + res); 


        /* operasi relasional numerik */
            System.out.println("Operasi Relasional Numerik");
            //Persamaan
            i = 5; j = 2;
            TF = (i==j);
            System.out.println(i + " == " + j + " : " + TF);
            //Pertidaksamaan
            i = 5; j = 2;
            TF = (i!=j);
            System.out.println(i + " != " + j + " : " + TF);
            //Kurang dari
            i = 5; j = 2;
            TF = (i < j);
            System.out.println(i + " < " + j + " : " + TF);
            //Lebih dari
            i = 5; j = 2;
            TF = (i > j);
            System.out.println(i + " > " + j + " : " + TF);
            //Kurang dari atau sama dengan
            i = 5; j = 2;
            TF = (i <= j);
            System.out.println(i + " <= " + j + " : " + TF);
            //Lebih dari atau sama dengan
            i = 5; j = 2;
            TF = (i >= j);
            System.out.println(i + " >= " + j + " : " + TF);


        /* operasi relasional numerik */
            System.out.println("Operasi Relasional Numerik");
            //Persamaan
            x = 5; y = 5;
            TF = (x == y);
            System.out.println(x + " == " + y + " : " + TF);
            //Pertidaksamaan
            x = 5; y = 5;
            TF = (x != y);
            System.out.println(x + " != " + y + " : " + TF);
            //Kurang dari
            x = 5; y = 5;
            TF = (x < y);
            System.out.println(x + " < " + y + " : " + TF);
            //Lebih dari
            x = 5; y = 5;
            TF = (x > y);
            System.out.println(x + " > " + y + " : " + TF);
            //Kurang dari atau sama dengan
            x = 5; y = 5;
            TF = (x <= y);
            System.out.println(i + " <= " + y + " : " + TF);
            //Lebih dari atau sama dengan
            x = 5; y = 5;
            TF = (x >= y);
            System.out.println(x + " >= " + y + " : " + TF);

    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas2;

public class Asign {

    /**
     * @param args
     */


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* kamus */
        int i;
        /* Program */
        System.out.print("hello\n"); i=5;
        System.out.println("Ini nilai i : " +i);
    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas3;

public class ASIGNi {

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* KAMUS */
        short ks = 1;
        int ki = 1;
        long kl = 10000;
        char c = 65;    /* inisialisasi karakter dengan integer */
        char cl ='Z';   /* inisialisasi karakter dengan karakter */
        double x = 50.2f;
        float y = 50.2f;

        /* Algoritma */

        /* penulisan karakter sebagai integer */
        System.out.println("Karakter = " +c);
        System.out.println("Karakter = " +cl);

        /* penulisan karakter sebagai integer */
        System.out.println("Karakter = " +c);
        System.out.println("Karakter = " +cl);

        System.out.println("Bilangan integer (short) = " +ks);
        System.out.println("\t(int) = " +ki);
        System.out.println("\t(long) = " +kl);
        System.out.println("Bilangan Real x = " +x);
        System.out.println("Bilangan Real y = " +y);

    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas4;
import java.util.Scanner;

public class BacaData {

    /**
     * @param args
     */

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print("Contoh membaca dan menulis, ketik nilai integer : \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); Apa akibatnya?*/
        System.out.print("Nilai yang dibaca : " +a);
    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.*;

public class Bacakar {

    /**
    * @param args
    * @throws IOException
    */

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* Kamus */
        char cc;
        int bil;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        // atau
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        /* Algoritma */
        System.out.print ("hello\n");
        System.out.print("baca 1 karakter : ");

        //perintah baca karakter cc
        cc =dataIn.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");

        //perintah baca bil
        bil =Integer.parseInt(datAIn.readLine());
        /*String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        System.out.println(kar);*/
        //JOptionPane.showMessageDialog(null, "hello");
        System.out.print (cc +"\n" +bil+"\n");
        System.out.print ("bye \n");

    }
}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas6;

/Casting menggunakan tipe data primitif/
public class Casting1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int a=5, b=6;
        float d=2.f, e=3.2f;
        char g='5';
        double k=3.14;

        System.out.println((float)a);   // int <-- float

        System.out.println((double)b);  // int <-- double
        System.out.println((int)d);     // float <-- int
        System.out.println((double)e);  // float <-- double
        System.out.println((int)g);     // char <-- int  (ASCII)
        System.out.println((float)g);   // char <-- float (ASCII)
        System.out.println((double)g);  // char <-- double (ASCII)
        System.out.println((int)k);     // double <-- int
        System.out.println((float)k);   // double <-- float

    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas7;

/* Casting menggunakan tipe data Class */
public class Casting2 {

    /**
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        int a=8, b=9;
        float d=2.f, e=3.2f;
        char g='5';
        double k=3.14;
        String n="67", m="45", l="100";

        a = Integer.parseInt(n);    /Konversi String ke Integer/
        k = Double.parseDouble(m);  /Konversi String ke Double/
        d = Float.parseFloat(l);    /Konversi String ke Float/
        System.out.println("a : "+a+"\nk : "+k+"\nd : "+d);

        n = String.valueOf(b);      /Konversi Integer ke String/
        m = String.valueOf(g);      /Konversi String ke Double/
        l = String.valueOf(e);      /Konversi Float ke String/
        System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);

        k = Double.valueOf(a).intValue();   /Konversi Integer ke Double/
        double c = Integer.valueOf(b).doubleValue();
        System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);

    }

}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas8;

/* Pemakaian operator kondisional */
public class Ekspresi {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */
        int x = 1;
        int y = 2;
        /* ALGORITMA */
        System.out.print("x = "+ x + "\n");
        System.out.print("y = "+ y + "\n");
        System.out.print("hasil ekspresi = (x<y)?x:y = "+ ((x < y) ? x : y)); 
        /Gunakan dalam kurung "(statement dan kondisi)" untuk menyatakan satu kesatuan pernyataan/
    }
}

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tugas9;

/* pembagian integer casting */
public class Ekspresi1 {

    /**
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        /* KAMUS */
        int x = 1; int y = 2; float fx; float fy;

        /* ALGORITMA */
        System.out.print ("x/y (format integer) = "+ x/y);
        System.out.print ("\nx/y (format float) = "+ x/y);
        /* Supaya hasilnya tidak nol */
        fx=x;
        fy=y;

        System.out.print ("\nx/y (format integer) = "+ fx/fy);
        System.out.print ("\nx/y (format float) = "+fx/fy);
        /* casting */

        System.out.print ("\nfloat(x)/float(y) (format integer) = "+(float)x/(float)y);
        System.out.print ("\nfloat(x)/float(y) (format float) = "+(float)x/(float)y);

        x = 10; y = 3;

        System.out.print ("\nx/y (format integer) = "+ x/y);
        System.out.print ("\nx/y (format float)   = "+ x/y);

    }

}

{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Launch Tempair",
            "request": "launch",
            "mainClass": "tgs19.Tempair",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch SubProgram",
            "request": "launch",
            "mainClass": "tgs18.SubProgram",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch PrintXWhile",
            "request": "launch",
            "mainClass": "tgs17.PrintXWhile",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch PrintXRepeat",
            "request": "launch",
            "mainClass": "tgs16.PrintXRepeat",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch PrintXinterasi",
            "request": "launch",
            "mainClass": "tgs15.PrintXinterasi",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch PrintWhile1",
            "request": "launch",
            "mainClass": "tgs14.PrintWhile1",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch PrintWhile",
            "request": "launch",
            "mainClass": "tgs13.PrintWhile",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch PrintRepeat",
            "request": "launch",
            "mainClass": "tgs12.PrintRepeat",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch PrintIterasi",
            "request": "launch",
            "mainClass": "tgs11.PrintIterasi",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch PriFor",
            "request": "launch",
            "mainClass": "tgs10.PriFor",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch Max2",
            "request": "launch",
            "mainClass": "tgs9.Max2",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch Konstant",
            "request": "launch",
            "mainClass": "tgs8.Konstant",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch KasusSwitch",
            "request": "launch",
            "mainClass": "tgs7.KasusSwitch",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch KasusBoolean",
            "request": "launch",
            "mainClass": "tgs6.KasusBoolean",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch If3",
            "request": "launch",
            "mainClass": "tgs5.If3",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch If2",
            "request": "launch",
            "mainClass": "tgs4.If2",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch If1",
            "request": "launch",
            "mainClass": "tgs3.If1",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch Current File",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "Launch BacaString",
            "request": "launch",
            "mainClass": "tgs1.BacaString",
            "projectName": "Java 2_b1fe803e"
        },
        {
            "type": "java",
            "name": "Launch ForEver",
            "request": "launch",
            "mainClass": "tgs2.ForEver",
            "projectName": "Java 2_b1fe803e"
        }
    ]
} 

{
    "java.project.sourcePaths": ["src"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/*/.jar"
    ]
}


/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {

    /**
    * @param args
    * @throws IOException
    */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* Kamus */
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        /* Program */

        System.out.print ("\nBaca string dan Integer: \n");
        System.out.print("masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs10;
import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */
public class PriFor {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int i,N;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        /* program */

        System.out.print ("Baca N, print 1 s/d N ");
        System.out.print ("N = ");

        N=masukan.nextInt();

        for (i = 1; i <= N; i++){
        System.out.println (i); };
        System.out.println ("Akhir program \n");

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs11;
import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan ITERATE */
public class PrintIterasi {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N > 0 = ");     /* Inisialisasi*/
        N = masukan.nextInt();

        i = 1;      /* First Elmt */
        System.out.print ("Print i dengan ITERATE : \n");
        for (;;){
            System.out.println(i); /* Proses */
            if (i == N)
                /* Kondisi Berhenti */ break;
            else {
                i++; /* Next Elmt */
            }
        }       /* (i == N) */
    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs12;
import java.util.Scanner;

public class PrintRepeat {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Nilai N > 0 = ");
        /* Inisialisasi */
        N = masukan.nextInt();

        i = 1;
        /* First Elmt */
        System.out.print ("Print i dengan REPEAT: \n");
        do{
            System.out.print (i+"\n");  /* Proses */
            i++;    /* Next Elmt */
        } while (i <= N);   /* Kondisi pengulangan */

    }

}
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs13;
import java.util.Scanner;

/* Baca N, Print i = 1 s/d N dengan WHILE */
public class PrintWhile {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Nilai N > 0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1;  /* First Elmt */

        System.out.print ("Print i dengan WHILE: \n");
        while (i <= N)   /* Kondisi pengulangan */ {
            System.out.println (i);     /* Proses */
            i++;    /* Next Elmt */
        };          /* (i > N) */

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs14;
import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i = 1;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Nilai N > 0 = ");
        N = masukan.nextInt();
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i <= N){
            System.out.println (i++);
        }   /* (i > N)*/

    }
}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs15;
import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXinterasi {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum=0;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); /* First Elmt */
        if (x == 999){
            System.out.print ("Kasus kosong \n");
        }else{          /* MInimal ada satu data yang dijumlahkan*/
            Sum = x;    /* Inisialisasi; invariant !! */
            for (;;){
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
                if(x==999)
                    break;
                else{
                    Sum = Sum + x; /* Proses */
                }
            }
        }

        System.out.println("Hasil penjumlahan = "+ Sum);
        /* Terminasi */

    }
}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs16;
import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXRepeat {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);
        /* Program */

        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();  /* First Elmt */
        if (x == 999){
            System.out.print("Kasus kosong \n");
        }else {     /* MInimal ada satu data yang dijumlahkan*/
            Sum = 0; /* Inisialisasi; invariant !! */
            do{
                Sum = Sum + x;  /* Proses */
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt();  /* Next Elmt */
            } while (x != 999);     /* Kondisi pengulangan */
                System.out.println ("Hasil penjumlahan = "+Sum);

        }/* Terminasi */

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs17;
import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        Sum = 0;    /* Inisialisasi */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();      /* First Elmt*/
        while (x != 999)    /* Kondisi berhenti */ {
            Sum = Sum + x; /* Proses */
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();  /* First Elmt*/
        }
        System.out.println("Hasil penjumlahan = "+ Sum);    /*Terminasi */

    }
}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs18;
import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */
/* prosedur/fungsi */
public class SubProgram {

    /**
    * @param args
    */

    public static int maxab (int a, int b){
        /* mencari maksimum dua bilangan bulat */
        return ((a >= b) ? a : b);
    }

    public static void tukar (int a, int b){    /* menukar dua bilangan bulat */
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println ("Ke dua bilangan setelah tukar: a = "+ a +" b = "+ b);
    }

    /* Program Utama */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Membaca dua bilangan integer */
        /* Menuliskan maksimum dua bilangan yang dibaca dg memanggil fungsi */
        /* Menukar kedua bilangan dengan 'prosedur' */
        int a, b;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Maksimum dua bilangan\n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println ("Ke dua bilangan : a = "+ a +" b = "+ b);
        System.out.println ("Maksimum = " + (maxab(a, b)));
        System.out.print("Tukar kedua bilangan...\n");
        tukar (a, b);

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs19;
import java.util.Scanner;

/* contoh pemakaian IF tiga kasus : wujud air */
public class Tempair {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int T;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Contoh IF tiga kasus \n");
        System.out.print ("Temperatur (der. C) = ");
        T=masukan.nextInt();
        if (T < 0) {
            System.out.print ("Wujud air beku \n"+ T);
        }else if ((0 <= T) && (T <= 100)){
            System.out.print ("Wujud air cair \n"+ T);
        }else if (T > 100){
            System.out.print ("Wujud air uap/gas \n"+ T);
        };

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs2;

public class ForEver {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Program */
        System.out.println("Program akan looping, akhiri dengan ^c");
        while (true){
            System.out.print ("Print satu baris ....\n");
        }

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs3;
/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;

public class If1 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        Scanner masukan=new Scanner(System.in);
        int a;
        /* Program */

        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs4;
import java.util.Scanner;
/* contoh pemakaian IF dua kasus komplementer */
/* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >=0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

public class If2 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();

        if (a >= 0){
            System.out.println ("Nilai a positif "+ a);
        }else {         /* a < 0 */
            System.out.println ("Nilai a negatif "+ a);
        }

    }
}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs5;
import java.util.Scanner;
/* contoh pemakaian IF tiga kasus / / Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */
/* 'Nilai Nol , nilai a', jika a = 0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

public class If3 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Contoh IF tiga kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();
        if (a > 0){
            System.out.println ("Nilai a positif "+ a);
        }else if (a == 0){
            System.out.println ("Nilai Nol "+ a);
        }else /* a > 0 */ {
            System.out.println ("Nilai a negatif "+ a);
        }

    }
}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs6;

/* Eksrpesi kondisional dengan boolean */
public class KasusBoolean {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        boolean bool;
        /* Algoritma */
        bool = true;
        if(bool) {
            System.out.print("true\n");
        } else
            System.out.print("false\n");
        if(!bool) {
            System.out.print("salah\n");
        } else
            System.out.print("benar\n");

    } 
}
 

/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs7;
import java.util.Scanner;

public class KasusSwitch {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        char cc;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
        cc=masukan.next().charAt(0);
        switch (cc) {
            case 'a': { System.out.print (" Yang anda ketik adalah a\n"); break;}
            case 'u': { System.out.print (" Yang anda ketik adalah u\n"); break;}
            case 'e': { System.out.print (" Yang anda ketik adalah e\n"); break;}
            case 'i': { System.out.print (" Yang anda ketik adalah i\n"); break;}
            case 'o': { System.out.print (" Yang anda ketik adalah o\n"); break;}
            default:
                System.out.print (" Yang anda ketik adalah huruf mati\n");
        }

    }
}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs8;
import java.util.Scanner;

/* Membaca jari-jari, menghitung luas lingkaran */
/* latihan pemakaian konstanta */
public class Konstant {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
            final float PHI = 3.1415f;
            float r;
            Scanner masukan=new Scanner(System.in);
        /* program / / baca data */
            System.out.print ("Jari-jari lingkaran =");
            r = masukan.nextFloat();
        /* Hitung dan tulis hasil */
            System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
            System.out.print ("Akhir program \n");

    }

}
 
/*NIM   : 13020200269
Nama    : Virga Cahyani Putri
Hari/Tgl: Selasa, 22 Maret 2022
Waktu   : 20:40 PM*/
package tgs9;
import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */
public class Max2 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a, b;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Maksimum dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN :\n");
        a=masukan.nextInt();
        b=masukan.nextInt();
        System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
        if (a >= b){
            System.out.println ("Nilai a yang maksimum "+ a);
        }else /* a > b */{
            System.out.println ("Nilai b yang maksimum : "+ b);
        }

    }

}
08.58
