package day15_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class substring_method {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789..

        String word1 = sentence.substring(0, 4);
        System.out.println(word1);

        String word2 = sentence.substring(8 , 11);
        System.out.println(word2);
        System.out.println("==========================");

        String sentence2 = "I like Movies and TV Series";
        String word3 = sentence2.substring(7,13);
        System.out.println(word3);
        System.out.println("============================");

        String firstName = "sInAvEr";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length());

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstName);
        System.out.println("============================");

        String lastName = "SCHOOL";
        String firstChar = lastName.substring(0,1); // s
        String remaining = lastName.substring(1); // chool

        lastName = firstChar.toUpperCase()+remaining.toLowerCase();// "School"

        System.out.println(lastName);
        System.out.println("============================");

        String s = "I like Game Of Thrones";
        String first = s.substring(7);
        System.out.println(first);

        String s2 = "I like Java Programming Language";

        String language = s2.substring(7);
        System.out.println(language);



    }

}
