package Office_Hours.Practice_07_13_2020;

public class Frequency_ofChar1 {

    public static void main(String[] args) {
        String str = " OOPQQ"; //"O2P1Q2"
        String nonDup = "";                      // "OPQ"

        //remove duplicates:
        for(int i = 0; i <=str.length()-1;i++){
            //         i<= 4
            String s = ""+str.charAt(i); // O O P Q Q
            if( !nonDup.contains(s) ){// if the character is not already exists then we concate it to nonDup
                nonDup+=s;
            }
            System.out.print(s);

        }


        String result = ""; // O2P1Q2

        // nonDup = "OPQ"      strn    = "OOPQQ"     ==>    O2P1Q2

        for(int j = 0; j<=nonDup.length()-1; j++){
            char ch1 = nonDup.charAt(j); // O
            int count = 0; // 1+1 = 2
            for(int i =0; i<=str.length()-1; i++){ // counting the frequency of the char
                char each =  str.charAt(i); // O O P Q Q
                if(each == ch1){
                    count +=1;
                }
            }
            char each = str.charAt(j);
            result += ""+ch1+count;
        }

        char ch1 = nonDup.charAt(0); // O
        int count = 0; // 1+1 = 2
        for(int i =0; i<=str.length()-1; i++){ // counting the frequency of the char
          char each =  str.charAt(i); // O O P Q Q
            if(each == ch1){
                count +=1;
            }
        }
        result += ""+ch1+count;


        System.out.println(result);

        /*
        char ch2 = nonDup.charAt(1); // P
        int count2 = 0;
        for(int i = 0; i<= str.length()-1; i++){
            char each = str.charAt(i);
            if(each ==ch2){
                count2 +=1;

            }

        }
        result+= ""+ch2+count2;

        char ch3 = nonDup.charAt(2);
        int count3 = 0;
        for(int i =0; i<=str.length()-1; i++){
            char each = str.charAt(i);
            if(each==ch3){

            }
        }
        System.out.println(result);

         */
    }
}
