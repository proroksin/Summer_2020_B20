package day15_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.next();// sam

        System.out.println("Enter last name:");
        String lastName = scan.next();// kim

        // String fullName = firstName.concat(" ".concat(lastName));// samkim
            String fullName = firstName+" "+lastName;


        //System.out.println("Your full name is: "+fullName);//concat(fullName)
        System.out.println("Your full name: "+fullName);
    }
}
