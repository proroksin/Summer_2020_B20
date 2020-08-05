package day15_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class String_methods {
    public static void main(String[] args) {
        String name = "Cybertek School is great place";
        //             01234567
        // charAt(index):
        char ch1 = name.charAt(0);// 'C'
        char ch2 = name.charAt(5);// 't'
        System.out.println(ch1);
        System.out.println(ch2);

        // length() ==> int
        int l = name.length();
        System.out.println(l);

        int lastIndexNumber = name.length()-1;
        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat(str):
        String schoolName = "Cybertek"; // <- cannot modife it!!!

            schoolName = schoolName.concat(" School");// "Cybertek School"

        System.out.println(schoolName);

        String r1 = "Cybertek"+123+'A'+true;
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");

        System.out.println("================================");

        // toLowerCase:
        String name1 = "CYBERTEK SCHOOL";
                name1 = name1.toLowerCase(); //"cybertek school"

        System.out.println(name1);
        System.out.println("======================================");

        // toUpperCase():
        String name2 = "sam";
        name2= name2.toUpperCase();//"SAM"
        System.out.println(name2);
        System.out.println("======================================");

        // trim():
        String p = "    Cybertek      School   ";
            p=     p.trim(); // "Cybertek School"
        System.out.println(p);







    }
}
