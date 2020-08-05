package day08_LogicalOperator;

public class Practice3 {
    public static void main(String[] args) {
        int b = 2;// b =3,then 2, then 1
        boolean res = ++b == 2 || --b == 2 && --b == 2;
        //              3 == 2 || 2  == 2 &&  1 ==2
        //               false || true   &&   false
        //                     fals      && false ==> false
        System.out.println(res);
        System.out.println(b);

        System.out.println("============================");

        int c =5; //c = 6, then 5
        boolean r2 = c++ ==6 || c-- == 5 || c == 5;
        //      r2 = 5 == 6  || 6 == 5   || 5 == 5
        //             false || false    || true
        System.out.println(r2);

        boolean A = true;
        boolean B = !A;

        boolean C = A != B        && A ==!B       && !A == B;
        //     C = true != false && true == true  && false == false
        //               true    &&  true         && true
        System.out.println(C);






    }
}
