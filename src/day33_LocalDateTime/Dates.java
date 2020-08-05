package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(2020,7,24);
        // year  month-days
        System.out.println(DOB);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        Scanner scan = new Scanner(System.in);
        LocalDate y = LocalDate.of(2020,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);
        System.out.println("=========================");
        System.out.println("Enter birth year, birth month, birth day");

        LocalDate d = LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());

        System.out.println(d);

    }

}
