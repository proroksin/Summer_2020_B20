package Self_Practice;

import java.util.Scanner;

public class String_selfpractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter something:");
        String something = scan.nextLine();
        char first = something.charAt(0);

        int lastIndexNumber = something.length()-1;
        System.out.println(lastIndexNumber);

        char lastChar = something.charAt(lastIndexNumber);
        System.out.println("First and last letters are: "+first+lastChar);
    }
}
