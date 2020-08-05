package day11_NestedIf_Ternary;
//precondtinion  minumum salsry 30k
// sub condition min 2 years of job history
public class NestedIf_Practice1 {
    public static void main(String[] args) {

        double salary = 29999;
        double jobHistory = 20;

        if(salary >= 30000) {
            if (jobHistory >= 2) {
                System.out.println("You are qualified");
            } else {// job history < 2
                System.out.println("You must have been on the job at least two years");
            }
        }else{
                System.out.println("You must learn at least $30k");
        }





    }

}
