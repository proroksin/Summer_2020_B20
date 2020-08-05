package day10_ifStatements;

public class Character_Identify {
    public static void main(String[] args) {
        char character = '@';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //                      upper case letters    || lower case letter

        // System.out.println(isAlphabetic);
                 //48<= character <=57
        boolean isDigit = character >= 48 && character <= 57;

        boolean specialChar = isAlphabetic == false && isDigit ==false;
                //!isAlphabetic && !isDigit;

        String alphabet = "";

        if (isAlphabetic == true) {
            //System.out.println(character + " is Alphabetic character");
        alphabet = character+ " is Alphabetic character";
        } else {
            alphabet = character+ " is Not Alphabetic character";
            //if(!isAlphabetic == false)
           // System.out.println(character + " is not Alphabetic character");
        }
        System.out.println(alphabet);

        String digit = "";

        if(isDigit == true ){
            digit = character + " is a digit";
        }else{
            digit = character + " is not digit";
        }
        System.out.println(digit);

        String specialCharacter = "";
        if(specialChar == true) {
            specialCharacter = character + " is a special character";
        }else{
            specialCharacter = character+ " is a not special character";
        }

        System.out.println(specialCharacter);



    }

}
