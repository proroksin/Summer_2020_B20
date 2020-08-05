package day11_NestedIf_Ternary;
//write a programm that can find the number of days in a month
//must apply nested if

public class DaysInMonth2 {
    public static void main(String[] args) {

        int month = 12;
        boolean validNumber = month>= 1 && month <= 12;

        boolean days28 = month == 2; // for the month that has 28 days
        boolean days30 = month == 4 || month == 6 || month == 9|| month == 11;

        String result = "";

        if(validNumber){// for 28 days or 30 or 31 days
            if(days28){
                result = "28 Dys";
            }else if(days30){
                result = "30 Days";
            }else{
                result = "31 Days";
            }


        }else { // invalid month
            result = "Invalid";
        }


    }
}
