package day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyeColor = "Brown";
    final String bloodType = "A";

    //final int x; //  final instance variables need to be initialized right away
    //final static int y; // final instance variables need to be initialized right away

    public static void main(String[] args) {

        final LocalDate dateOfBirth = LocalDate.of(2000,5,7);

        //dateOfBirth = LocalDate.of(1990,6,5); cannot reassigned

        System.out.println(dateOfBirth);

        final long ssn = 78954123;
        //ssn = 789654123;

        System.out.println(ssn);

        final double PI = 3.14;
        //PI = 2.14

        System.out.println(PI);

        final char gender = 'M';
        //gender = 'F'

        final String birthPlace = "USA";
        //birthPlace = "England";

    }
}
