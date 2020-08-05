package Self_Practice;
/*
1. A triangle is valid if the sum of all the
three angles is equal to 180 degrees.
Write a program that declares three integers
as angles and check whether a triangle
is valid or not.
​
        Note: MUST use if&else statement
 */

public class Triangle_06_17 {
    public static void main(String[] args) {
        double angle1, angle2, angle3;
        angle1= 45;
        angle2= 45;
        angle3 =90;

        if(angle1+angle2+angle3==180){
            System.out.println("Triangle is valid");
        }else{
            System.out.println("Triangle is invalid");
        }
    }

}
