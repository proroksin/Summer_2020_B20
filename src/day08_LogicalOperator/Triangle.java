package day08_LogicalOperator;

public class Triangle {

    public static void main(String[] args) {
        double angel1 = 100;
        double angel2 = 60;
        double angel3 = 21;

        boolean valid = angel1 + angel2 + angel3 == 180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Triangle");
        }

        if(invalid){
            System.out.println("Invalid Triangle");
        }




    }
}
