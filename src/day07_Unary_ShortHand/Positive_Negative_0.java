package day07_Unary_ShortHand;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Positive_Negative_0 {
        public static void main(String[] args) {

            int number = 120;

            boolean positive = number >= 0;
            boolean negative = number <= 0;
            boolean zero = number == 0;

            System.out.println(number + " is a posotive number? " + positive);
            System.out.println(number + " is a negative number? " + negative);
            System.out.println(number + " is a zero number? " + zero);


        }
}
