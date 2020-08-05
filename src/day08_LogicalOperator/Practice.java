package day08_LogicalOperator;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Sin";
        String lastName = "Kim";
        int age = 30;
        String citizenship = "Thailand";

        boolean ElligibleToVote = age >= 18 && citizenship == "USA";
        //                         19 >= 18 &&  "USA"    == "USA"
        //                            true  &&    true    == true
        String fullName = firstName+" "+lastName;
        System.out.println(ElligibleToVote);
        System.out.println(fullName+ " is elligible to vote: "+ElligibleToVote);
        // Aaron Daniel is elligible to vote: true
        System.out.println("==================================");






    }


}
