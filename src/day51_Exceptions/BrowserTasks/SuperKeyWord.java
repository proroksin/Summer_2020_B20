package day51_Exceptions.BrowserTasks;

class Test{
    int a;//200

    public void method(){
        System.out.println("Hello");
    }

    public void m(){
        this.method();
        //super.method(); // test class does not have super class SuperKeyword
    }
}


public class SuperKeyWord extends Test{
//a =300
    public void print1(){
        //System.out.println(this.a);
        System.out.println(a); //superkeyword a => 300
    }

    public void print2(){
        System.out.println(super.a); // test' a => 200
    }

    public void method2(){
        super.method();
        System.out.println("Hola");
    }

    public void method3(){
        this.method2();
        super.method();// hello
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 200;

        SuperKeyWord obj2 = new SuperKeyWord();
        obj2.a = 300;

        obj2.print1();
        obj2.print2();

        obj2.method2();
        System.out.println("===============================");
        obj2.method3();
    }
}
