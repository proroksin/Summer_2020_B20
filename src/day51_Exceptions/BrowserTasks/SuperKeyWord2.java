package day51_Exceptions.BrowserTasks;

class B{

    public B(){
        System.out.println("Super class' default constructor");
    }

}


public class SuperKeyWord2 extends B{

    public SuperKeyWord2(){
        //super();// calls the super class constructor
        System.out.println("Sub class' default constructor");
    }

    public static void main(String[] args){
        new SuperKeyWord2();

    }

}
