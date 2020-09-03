package day50_Inheritance_Overriding.CarTask;
/*
Jeep:
    start(): Call Mechanic
             Oil change
             jump start
 */
public class Jeep extends Car{

    public void start(){
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("jump start");
    }


}
