package Self_Practice;
import java.util.Scanner;

public class dfhfddhd {

        public static void main(String[] args) {
            //ENTER CODE HERE
            Scanner scan = new Scanner(System.in);
            int itemPrice = scan.nextInt();
            int acceptance = 100;
            int change = acceptance-itemPrice;
            int quarters = change/25;
            int dimes = change%25/10;
            int nickels = change%25%10/5;

            String value = quarters+" quarters, "+dimes+" dimes, "+"and "+nickels+" nickels.";

            if(itemPrice<25 || itemPrice>100 || itemPrice%5!=0){
                System.out.println("Invalid price!");
            }else{
                System.out.println("Your change is "+value);
            }
        }
    }