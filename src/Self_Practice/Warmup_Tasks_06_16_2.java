package Self_Practice;

public class Warmup_Tasks_06_16_2 {
    public static void main(String[] args) {
        /*
        Write a program that can calcuate the grade based on the score
        if score is between 90 to 100 ==> A
        if score is between 80 to 90 ==> B
        if score is between 70 to 80 ==> C
        if score is between 60 to 70 ==> D
        if score is below 60 ==> F
        Ex: score = 85;
            output:
                Your grade is B
         */
    int num = 85;

    if(num>=90 && num<=100){
        System.out.println("Your Grade is A");
    }

    if(num<89 && num>=80){
        System.out.println("Your Grade is B");
    }

    if(num<79 && num>=70){
        System.out.println("Your Grade is C");
    }

    if(num<69 && num>=60){
        System.out.println("Your Grade is D");
    }

    if(num<59){
        System.out.println("Your Grade is F");
    }
    }
}
