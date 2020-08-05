package day07_Unary_ShortHand;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int A =10;
        System.out.println(++A);//11
        System.out.println(A);// 11
        System.out.println("===============]");


        int b = 10;
        System.out.println(b++);//10
        System.out.println(b);//11
        System.out.println("===================");
        int c = 25;
        int d = c++;//d=25 c=26
        System.out.println(c);
        System.out.println(d);
        System.out.println("===================");
        int e =25;
        e++;
        System.out.println(e);
        System.out.println("===================");

        int x = 8;
        int y = x--;//y = 8
        System.out.println(y);
        System.out.println(x);//7
        System.out.println("===================");

        int B = 1;// A=0
        A = -A-- + A++ / -A-- * --A;
        //A=-1   + 0  / -1 * -1
        //A = -1 + 0 * -1
        // A = -1 + 0 = -1
        System.out.println(A);

        System.out.println("===================");
        int z = 50;
        z = --z + z++ + z-- + z++;
        // --z - pre decrement decrease value immidiatly(--z=49)
        // z++ - post increment passes current then will increase(z++=49)
        //z-- - post decrement increase the value (z--=50)
        //z++ i post increment passes current value(z++=49)
        //z = 49+49+50+49
        //z  = 197



        //z = 49 + 50 + 50 + 49
        System.out.println(z);


        int a =1;
        a = -a-- + a++ / -a-- * --a;
        //a = 2 / -1 = -2
        //a = -2 * 0
        //a = 0-1=-1





    }


}
