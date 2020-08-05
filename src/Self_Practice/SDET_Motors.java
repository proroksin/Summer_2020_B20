package Self_Practice;
/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998,
2001-2002,  2004-2006 and 2015-2017.
write a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false
 */

public class SDET_Motors {
    public static void main(String[] args) {
        int modelYear = 1992;
        if(1995<=modelYear && modelYear <=1998 || 2001<=modelYear && modelYear>=2002 || 2004<=modelYear && modelYear>=2006 || 2015<=modelYear && modelYear>=2017){
            System.out.println("true");
        }else{
            System.out.println("false");

        }
    }
}
