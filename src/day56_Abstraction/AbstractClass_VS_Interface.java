package day56_Abstraction;


public abstract class AbstractClass_VS_Interface {

    public int a;
    protected static int b;

    public void method1(){ }
    public static void method2(){ }

    public abstract void method3();

    public AbstractClass_VS_Interface(int a, int b){
        this.a = a;
    }

    static {b = 300;} // static block

    {
        a = 3000;
    } // instance block

    public static void main(String[] args) {
        double b = Math.PI;
        int a = Integer.MAX_VALUE;
    }



}

interface A{
    int a= 10; // public static final
    // public void method1(){ }

    public static void method2(){ } // public

    abstract void method3();// public
                    int method3_2(int b);// public abstract
                    // abstract method is only recommendation in interface

    public default void method4(){ }

    // public A(){ }

    // static { }



}
