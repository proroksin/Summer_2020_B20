package day12_Switch_Scanner;

import java.util.Scanner;

public class User_InputPractice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter uour number: ");
        double num = scan.nextDouble();

        String result = (num %2 ==0) ? num+ " is Even number": num+ " is Odd number";
        System.out.println(result);

        }




    }

