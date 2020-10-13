package day60_Collection;

import java.util.*;

public class SetPractice {
// write a program that can remover duplicates from string
    public static void main(String[] args) {
        String str = "dddcccccaaaabbbb"; // abcd
        String [] arr = str.split("");

        System.out.println(Arrays.toString(arr)); // [a,a,a,a,b,b,b,c,c,c,c,d,d,d,d,e,e,e]
        // {a,b,c,d,e};
        Set<String> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr));
        System.out.println(s1);

        System.out.println("=======================");

        String str2 = "zzzzzzyyyyxxx";
        str2 = new LinkedHashSet<>(Arrays.asList( str2.split("") ) ).toString();
        System.out.println(str2);

        str2 = str2.replace("[","").replace(", ","").replace("]","");
        System.out.println(str2);



    }

}
