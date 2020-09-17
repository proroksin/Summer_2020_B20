package day55_Abstraction.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
       // Shape shape1 = new Shape();
        Circle circle1 = new Circle(2.5);

        System.out.println(circle1);
        System.out.println("Circle has volume: " + Circle.hasVolume);

        Circle circle2 = new Circle(5.5);
        System.out.println(circle2);

        System.out.println("===========================");

        Rectangle rectangle1 = new Rectangle(10,5);
        System.out.println(rectangle1);

        System.out.println("============================");

        Cylinder cylinder1 = new Cylinder(5,10);
        System.out.println(cylinder1);

    }
}
