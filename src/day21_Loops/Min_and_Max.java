package day21_Loops;

import java.util.Scanner;

/*
write a program that asks user to enter 5 numbers and returns the maximum number and minimum number
 */
public class Min_and_Max {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    int max = -999999999; // any user entered input will be greater than -999999999
    int min = 999999999;

    for(int i =1; i <= 5; i++){
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(num > max){
            max = num;
        }
        if(num < min){
            min = num;
        }
    }

        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);

    }

}
