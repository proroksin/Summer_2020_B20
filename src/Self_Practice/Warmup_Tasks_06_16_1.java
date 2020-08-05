package Self_Practice;

public class Warmup_Tasks_06_16_1 {
    public static void main(String[] args) {
        /*
        write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
            output:
                Good
        HINT: you will need && logic
         */
        int num = 75;

        if(num>90){
            System.out.println("Excellent");
        }

        if(num<90 && num>70){
            System.out.println("Good");
        }

        if(num>60 && num<70){
            System.out.println("Pass");
        }

        if(num<60){
            System.out.println("Fail");
        }
    }

}
