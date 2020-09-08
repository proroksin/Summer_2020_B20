package day52_Exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        int[] arr = {10,20};

        try{
            System.out.println(arr[20]);

        }catch (ArithmeticException e){
            System.out.println("Airtmetic Exception is handled");

        }catch(ClassCastException e) {
            System.out.println("Class Cast Exception is handled");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception");

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out of Bond Exception");

        }catch (RuntimeException e){
            System.out.println("Run Time Eception");
        } // catch(NoSuchElementException e){ }

        System.out.println("=======================================");

        String str = "Cybertek";
        try {
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }




    }
}
