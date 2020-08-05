package Self_Practice;
import java.util.*;
public class vito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vehicleYear = scan.nextInt();
        System.out.println("Enter vehicle's year:");

        if(vehicleYear<=1998 || vehicleYear >=1995){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear<=2002 || vehicleYear >=2001){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear<=2006 || vehicleYear >=2004){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear<=2017 || vehicleYear >=2015){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
    }
