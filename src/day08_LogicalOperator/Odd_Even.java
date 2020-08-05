package day08_LogicalOperator;

public class Odd_Even {
    public static void main(String[] args) {
        int number = 100;

        boolean even = number % 5 ==0;
        boolean odd = !even;

        if(even){
            System.out.println(number+" is even number");
        }

        if(odd){
            System.out.println(number + " is odd number");
        }
        System.out.println("=========================");



    }
}
