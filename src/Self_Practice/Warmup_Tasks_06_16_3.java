package Self_Practice;

public class Warmup_Tasks_06_16_3 {
    public static void main(String[] args) {
        /*
        1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
         */
        int a = 50;
        int b = 30;
        int c = 65;

        if( a > b && a > c) {
            System.out.println(a + " is the maximum number");
        }

        if( b > a && b > c){
            System.out.println(b+ " is the maximum number");
        }

        if( c > a && c > b ){
            System.out.println(c+ " is the maximum number");
        }
/*
2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
 */
        if( a < b && a < c) {
            System.out.println(a + " is the minimum number");
        }

        if( b < a && b < c){
            System.out.println(b+ " is the minimum number");
        }

        if( c < a && c < b ){
            System.out.println(c+ " is the minimum number");
        }
        /*
        3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
         */
        if( a > b && a < c) {
            System.out.println(a + " is the mediam number");
        }

        if( b > a && b < c){
            System.out.println(b+ " is the mediam number");
        }

        if( c > a && c < b ){
            System.out.println(c+ " is the mediam number");
        }
/*
 write a java program that can identify if a person is eligible to buy alcohol
 */

        int age = 20;
        boolean ElligibleToBuy = age >= 21;
        System.out.println(ElligibleToBuy);





    }
}
