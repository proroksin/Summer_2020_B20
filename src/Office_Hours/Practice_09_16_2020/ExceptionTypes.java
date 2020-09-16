package Office_Hours.Practice_09_16_2020;

import java.lang.Exception;
import java.lang.Object;
import java.util.NoSuchElementException;

public class ExceptionTypes {

    public static void main(String[] args) {
        //System.out.println("Cybertek".charAt(200)); // unchecked==> unexpected

        //Thread.sleep(3000);// checked ==> unwanted, MUST be handled immediately

        try{
            System.out.println(9/0);
        }catch(RuntimeException e){
            System.out.println("Exception is caught: " +e.getMessage());
        }

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("catch block1 handled it");
        }catch (Exception e){
            System.out.println("catch block2 handled it");
        }
        int[]arr = {1,2,3};
        try{
            System.out.println(arr[25]);
        }catch (RuntimeException e){
            System.out.println("RuntimeException is handled: "+e.getMessage());
        }finally {
            System.out.println("Finally completed");
        }

        System.out.println("Test Case 1 Completed ");


        try{// A
            System.out.println(9/0);
        }catch (ClassCastException e){// B
            System.out.println("class cast exception is handled ");
        }catch (NoSuchElementException e){// C
            System.out.println("No such element exception is handled");
        }catch (IndexOutOfBoundsException e){// D
            System.out.println("index out of bound exception is handled");
        }catch (RuntimeException e) {// Ultimate solution
            System.out.println("Runtime exception is nahdled");
        }finally {
            System.out.println("finally block");
        }

    }


}
