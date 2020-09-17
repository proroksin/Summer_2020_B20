package day55_Abstraction;

final class A{ // can create object
    int a = 10;
    static int b = 20;

    public void method1(){ }

    public static void method2(){ }

    static { }

    public A(){ }

    //public abstract void method3();


}

abstract class B{// cannot create object from it
    int a = 10;
    static int b = 20;

    public void method1(){ }

    public static void method2(){ }

    static { }

    public B(){ }

    public abstract void method3();
}

public class AbstractClass_VS_ReguralClass {

}
