package day47_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicVariable);// public is accessible when
        AccessModifiers.publicMethod();

        System.out.println( AccessModifiers.defaultVariable ); // deafult is accessible with in the same package
        AccessModifiers.defaultMethod();

        // System.out.println( AccessModifiers.privateVariable ); // private is not visible outside its class
        // AccessModifiers.privateMethod();


    }
}
