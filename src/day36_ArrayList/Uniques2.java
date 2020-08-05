package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // {1,1,2,3,3}
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();// {2}

        for (int i = 0; i <= list.size() - 1; i++) {

            Integer element = list.get(i);// 1


            for (Integer each : list) {// finds the frequency of element
                int count = Collections.frequency(list, each);
                if (each == element) {
                    count++;
                }

                if (count == 1) {// to verify if element is unique
                    uniques.add(element);
                }
            }

            System.out.println(uniques);
        }
    }
}
