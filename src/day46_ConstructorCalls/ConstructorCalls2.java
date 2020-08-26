package day46_ConstructorCalls;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("A");
    }

    public ConstructorCalls2(int a){ // AB

        //ConstructorCalls2();
        this(); // calling default constructor
        System.out.println("B"); // B

    }

    public ConstructorCalls2(String str){
        this(4); // AB
        System.out.println("C"); // C

    }

    public ConstructorCalls2(char a){
        this(); // A
        System.out.println("D"); // D
    }

    public ConstructorCalls2(double a){
        System.out.println("E");
        //this(10);
    }

    public static void main(String[] args) {

        new ConstructorCalls2('A');
    }

}
