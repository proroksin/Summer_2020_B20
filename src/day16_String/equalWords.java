package day16_String;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String first = scan.next();

        System.out.println("Enter your second word");
        String second = scan.next();

        String result = (first.equals(second)) ? "Equal" : "Not egual";
        System.out.println(result);






    }

}
