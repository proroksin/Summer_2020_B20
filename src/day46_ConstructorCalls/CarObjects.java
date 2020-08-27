package day46_ConstructorCalls;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CarObjects {
    public static void main(String[] args) {

        System.out.println(new Car("Toyota"));
        System.out.println("====================================");

        System.out.println(new Car("BMW", "X5"));
        System.out.println("=====================================");

        System.out.println(new Car("Audi", "Q8", "White"));
        System.out.println("=====================================");

        System.out.println(new Car("Jeep", "Compas", "Black", 2010));
        System.out.println("=====================================");

        System.out.println(new Car("Honda", "Accord", "Red", 2019, 25000));
        System.out.println("======================================");

    }
}
