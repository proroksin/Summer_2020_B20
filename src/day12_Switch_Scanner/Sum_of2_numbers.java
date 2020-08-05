package day12_Switch_Scanner;

import java.util.Scanner;

public class Sum_of2_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();

        String result = "";
        System.out.println("Summary is: " + (num1+num2));
    }
}
