package day15_String;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=input.next();//cybertek

        System.out.println("Enter your last name: ");
        String lastName = input.next();//school

        String fullName = firstName+" "+lastName;//cybertek school

        fullName = fullName.toUpperCase();// cybertek school

        System.out.println(fullName);

    }
}
