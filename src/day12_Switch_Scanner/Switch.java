package day12_Switch_Scanner;

public class Switch {

    public static void main(String[] args) {

        switch(1){

            case 5:
                System.out.println(5);
                break;
            case 1:
                System.out.println(1);

            default: // !!! <- can locate any where even before case
                System.out.println("Invalid case");


        }


    }
}
