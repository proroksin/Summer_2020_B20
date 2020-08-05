package Day09_IF_Statement;

public class Vote {

    public static void main(String[] args) {
        int age = 35;
        boolean usCitizen = true;

        if( age >= 18 && usCitizen ) {
            System.out.println("Eligible to vote for Trump");
        }else{
            System.out.println("Not eligible to vote");
        }
        System.out.println("=====================================");

        String eligibleToVote2 = ( age >=18 && usCitizen) ? "Eligible to vote for Trump" : "Not eligible to vote";
        System.out.println(eligibleToVote2);


    }
}
