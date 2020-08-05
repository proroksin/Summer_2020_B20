package day11_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        }else if(num<0){
            result = "Neegative";
        }else{
            result = "Zero";
        }

        String resault2 = (num > 0) ? "Positive" : (num<0) ? "Negative" : "Zero";
        System.out.println(result);
        System.out.println(resault2);

        System.out.println("====================================");
        //write programm that can compare two numbers
        // a= 10, b = 20
        // output: b is greater
        // a= 30, b = 10;
        //out put: a is greater
        //a= 20, b=20
        //output: a is equal to b
        int a = 10;
        int b = 20;

        String r = ( a > b ) ? "a is greater" : ( b > a ) ? "b is greater" : "a is equal to b";
        System.out.println(r);






    }
}
