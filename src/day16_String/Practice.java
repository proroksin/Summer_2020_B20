package day16_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employed? ");
        String answer = scan.next().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("Employeed");
        } else {
            System.out.println("Not employeed");
        }
    }
}
