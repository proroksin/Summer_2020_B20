package day58_Polymorphism;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Cylinder;
import day55_Abstraction.ShapeTask.Shape;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOf_Keyword {

    public static void main(String[] args) {

        Animal animal1 = new Animal(10,'F');
        Animal animal2 = new Dog("Winston", 4, 'M');
        Animal animal3 = new Cat("Snow", 4, 'M');

        //verify animal3 is the object of Animal class
        boolean r1 = animal3 instanceof Animal; // IS A relation ==>true
        System.out.println(r1);

        //verify that animal3 is the pbject of the cat class
        boolean r2 = animal3 instanceof Cat;
        System.out.println(r2);

        //verify animal3 is the object of Dog class
        boolean r3 = animal3 instanceof Dog; /// there is no "IS A relation" ==>false
        System.out.println(r3);

        boolean r4 = animal2 instanceof Animal;// Dog is Animal
        System.out.println(r4);

        System.out.println(animal1 instanceof Dog); // Dog is dog

        System.out.println(animal1 instanceof Dog); //Animal is A Dog

        System.out.println(animal2 instanceof Cat); // Dog is Cat

        System.out.println("========================================================");

        Shape shape1 = new Circle(3);

        identifyShape(shape1);
    }

    public static void identifyShape(Shape shape){
        if(shape instanceof Circle){
            System.out.println("The shape is circle");
        }else if(shape instanceof Cylinder){
            System.out.println("The shape is cylinder");
        }else{
            System.out.println("The shape is rectangle");
        }
    }

    public static boolean equalsShape(Shape shape1, Shape shape2){
        boolean result = false;

        boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;

        if(bothCircle){


        }

        return result;
    }
}
