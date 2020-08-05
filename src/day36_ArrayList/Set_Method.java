package day36_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Set_Method {
/*
1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
 */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(10);// 0
            list1.add(20);// 1
            list1.add(30);// 2
            list1.add(40);// 3
            list1.add(50);// 4

        list1.set(4,0);
        System.out.println(list1);

        System.out.println("==============================");

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i =1; i<= 20; i++){
            list2.add(i);
        }
        System.out.println(list2);

        for(int i = 0;i<= list2.size()-1; i++){// i: index numbers
            Integer each = list2.get(i); // each element in the list

            if(each % 2 !=0){
                list2.set(i,each*2);
            }else{
                list2.set(i,each*3);
            }

        }
        System.out.println(list2);
    }
}
