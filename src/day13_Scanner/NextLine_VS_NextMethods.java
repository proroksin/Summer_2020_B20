package day13_Scanner;

import java.util.Scanner;

public class NextLine_VS_NextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();//120000

        scan.nextLine();//Enter we use it ti take out the Enters that are left out in the scanner. sp that we can use the next
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);





    }
}
