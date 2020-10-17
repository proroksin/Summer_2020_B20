package day62_Maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "abacbdeef";
        Map<String, Integer> map = new LinkedHashMap<>(); // {c=1, d=1, f=1}

        List<String> list = Arrays.asList(str.split("") );


    }
}
/*
 2. write a program that stores the unique characters from a string into a map

        Ex:
            str = "abacbdeef";
            output:
                {c=1, d=1, f=1}

 */