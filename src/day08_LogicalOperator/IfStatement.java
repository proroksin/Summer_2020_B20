package day08_LogicalOperator;

public class IfStatement {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;


        if( a > b ){
            System.out.println(a+ " is the max number");
        }

        if( b > a ){
            System.out.println(b+" is the max number");

        }
        if( a == b ){
            System.out.println("Both are equal");

        }
        System.out.println("===============================");

        boolean BreakTime = false;

        if(BreakTime == true){
            System.out.println("Take 15 minutes break!");
        }

        if(BreakTime == false){
            System.out.println("Keep Studying Bitches");
        }

        System.out.println("===============================");

        boolean Corona = true;
        if(Corona == true){
            System.out.println("Buy more toilet paper");
            System.out.println("Social Disance");
            System.out.println("Stay At Home");
        }






    }
}
