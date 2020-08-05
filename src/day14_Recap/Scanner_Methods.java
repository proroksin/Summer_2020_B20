package day14_Recap;

import java.util.Scanner;

public class Scanner_Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        // double num = input.nextDouble();

        //boolean num = input.nextBoolean();

        System.out.println("Do you want to learn Java?");
        //String num = input.next();
        String num = input.nextLine();

        System.out.println("You have entered "+num);



    }
}
