package day11_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
       /*
90 ~ 100 ==> A
80 ~ 89 ==> B
70 ~ 79 ==> C
60 ~ 69 ==> D
0 ~ 59 ==> F
other ==>  Invalid
        */
        int score = 100;
        String result = "";

        if (score >= 0 && score <= 100) { // valid score

            if (score >= 90) {
                result = "A";
            } else if (score >= 80 && score < 90) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }


        } else { // invalid score
            result = "Invalid";

        }
        System.out.println(result);
        System.out.println("===================================");

        /*
        precondition: minimum salary of 30k
        sub condition: minimum 2 years of job history
         */
        double salary = 30000;
        int JobHistory = 2;
        String result1 = "";

        if (salary >= 30000) {
            if (JobHistory >= 2) {
                result1 = "eligible";
            } else {
                result1 = "not eligible";
            }
            System.out.println(result1);
        }
        System.out.println("=======================");

        int day = 3;
        String result2 = "";
        if (day > 0 && day < 8) {
            if (day == 1) {
                result2 = "Monday";
            } else if (day == 2) {
                result2 = "Tuesday";
            } else if (day == 3) {
                result2 = "Wednesday";
            } else if (day == 4) {
                result2 = "Thursday";
            } else if (day == 5) {
                result2 = "Friday";
            } else if (day == 6) {
                result2 = "Saturday";
            } else if (day == 7) {
                result2 = "Sunday";
            } else {
                result2 = "There is no such a day";
            }
            System.out.println(result2);


        }
    }
}
