package day19_ForLoop;
/*
4. PRINT ODD NUMBERS BETWEEN 1 TO 50
5. print even numbers bettwen 1 to 50
 */
public class OddEven2 {

    public static void main(String[] args) {

        for(int i = 1; i <=50; i++){ // in order to print even we can choose to skip odd number

            if( i % 2 !=0){// if the number is odd then skip it
                continue;
            }

            System.out.print(i+" ");
        }

        for(int i = 1; i <=50; i++){// in order to print odd we can choose to skip even number

            if( i % 2 ==0){// if the number is even then skip it
                continue;
            }

            System.out.print(i+" ");
        }


    }
}
