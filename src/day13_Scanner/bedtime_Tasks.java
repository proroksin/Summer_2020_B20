package day13_Scanner;

import java.util.Scanner;

public class bedtime_Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter make of your car: ");
        String make = scan.next();

        System.out.println("Enter model: ");
        String model = scan.next();

        System.out.println("Enter year: ");
        int year = scan.nextInt();

        System.out.println("Enter color: ");
        String color = scan.next();

        System.out.println("Enter mileage: ");
        int mileage = scan.nextInt();

        System.out.println("Enter price: ");
        int price = scan.nextInt();


    }
}
