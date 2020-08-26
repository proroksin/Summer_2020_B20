package day46_ConstructorCalls;

public class ConstructorCall3 {

    public ConstructorCall3(){
        System.out.println("X");
    }

    public ConstructorCall3(int a){
        this();
        System.out.println("Y");
    }

    public ConstructorCall3(double a){
        //this();
        this(10);
    }


    public void method1(){
        //ConstructorCalls3();  // cannot be called by name
        // this(); // can only be used in a constructor
    }
}