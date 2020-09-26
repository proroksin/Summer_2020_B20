package day58_Polymorphism;

import day51_Exceptions.BrowserTasks.WebDriver;
import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class TypeCastings {

    public static void main(String[] args) {

        Dog dog1 = new Dog("A",2,'F');
        Cat cat1 = new Cat("A",2, 'F');

        Animal animal = dog1; // done implicitly,

        Animal animal2 = (Animal) cat1; // converting sub type to super type, implicitly

        //WebDriver driver = new ChromeDriver();
        // driver = new FireFoxDriver();

        //ChromeDriver driver1 = new ChromeDriver();
        //WebDriver driver2 = driver1;
        System.out.println("==========================================================");

        int x = 100;
        byte y = (byte) x;

        Animal animal3 = new Dog("A",2,'F');
        //animal3.bark();

        Dog dog2 = (Dog)animal3;
        dog2.bark();


        Animal animal4 = new Cat("A", 2, 'F');
        //Dog dog3 = (Dog)animal4;
        System.out.println("=======================================");

        Iphone phone1 = new Iphone("12","6", 1200);
        Phone phone2 = phone1; // upcasting, implicitly

        Phone phone3 = new Samsung("s20","9", 1100);
        Samsung phone4 = (Samsung) phone3;// manually, down casting

        Iphone phone5 = (Iphone)phone3;

        //WebDriver driver new ChromeDriver();
        //TakeScreenshot ts = TakeScreenShot)driver;




    }
}
