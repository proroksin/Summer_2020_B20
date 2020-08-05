package day08_LogicalOperator;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Khabib";
        String lastName = "Legend";
        int age = 17;
        String citizen1 = "Russian";
        String citizen2 = "USA";

        boolean eligibleAge = age >= 18;
                               //12>= 18 => false

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
                            // "USA" == "USA" || "France" == "USA" ==> false
                            //       true     ||   false    ==> true

        boolean eligibleToVote = eligibleAge && usCitizen;
        //                         false     &&  true ==> false
        String fullName = firstName+ " "+lastName;
        System.out.println(fullName+ " is eligible to vote for Trump: " +eligibleToVote);
         // Conor McNugget is eligible to vote for Trump: false




    }
}
