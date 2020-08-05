package day12_Switch_Scanner;

import java.util.Scanner;

public class Rate_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        System.out.println("Enter how many hours you work in a week?: ");
         int weeklyHour = scan.nextInt();
         int totalHours = weeklyHour*52;

        String hourRate = "";
        System.out.println("hourRate is: $" + salary/totalHours);
    }
}
