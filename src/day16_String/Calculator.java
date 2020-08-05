package day16_String;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("enter your second number: ");
        double num2 = scan.nextDouble();

        System.out.println("enter your math operator: ");

        char operator = scan.next().charAt(0);
        //@ , ~

        boolean Valid = operator == '*' || operator == '/' || operator == '%' || operator == '+' || operator == '-';
        if(Valid){
            switch(operator){
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;

            }

        }else{
            System.out.println("Invalid operator");
        }

    }
}
