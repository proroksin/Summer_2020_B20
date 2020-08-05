package day15_String;

import java.lang.String;
import java.util.Scanner;

public class String_intro {
    public static void main(String[] args) {
        String str = "Cybertek";
        Scanner input = new Scanner(System.in);

        String s1 = "Cat";// string literal
        String s2 = "Cat";// string literal

        System.out.println( s1 == s2);

        String d1 = "Dog"; // string literal
        String d2 = "dog"; // string literal

        System.out.println(d1==d2);

        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println(t1==t2);
        //                 new String("Tiger) == new String("Tiger")=>false
        System.out.println("========================================================");

        String c1 = "Cybertek"; // string pool
        String c2 = new String("Cybertek"); // java heap
        String c3 = new String("Cybertek"); // java heap
        String c4 = "Cybertek"; // String pool
        String c5 = "cybertek"; //string pool


        System.out.println(c1 == c2);// false
        // "Cybertek" == new String ("Cybertek")
        System.out.println(c2==c3); // false
        // new String("Cybertek") == new String("Cybertek")
        System.out.println(c1==c4);// "Cybertek" == "Cybertek" => true

        System.out.println(c4==c5);
        //              "Cybertek"=="cybertek"==> false
        System.out.println("=================================");

        String str1 = "Java";
        str1 = "JavaScript";
        System.out.println(str1);

        str1 ="Java";
        System.out.println(str1);



    }
}
