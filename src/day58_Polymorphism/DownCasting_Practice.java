package day58_Polymorphism;


import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new Iphone("11", "6", 1000);
        Iphone iphone = (Iphone)phone1;


        System.out.println(phone1);
        System.out.println(iphone);

        phone1.faceTiming(123456);
        iphone.faceTiming(1234556);

    }

}
