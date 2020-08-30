package day48_Inheritance.AnimalTask;

public class    Dog           extends        Animal {
    //       sub(child)class               super(parent)class

    /*
    variables: 4 => name, age, size, gender
    methods: 3
     */

    public Dog(String name, String size, int age, char gender, String breed){
        setInfo(name,size,age,gender, breed);
    }


    public void bark(){
        System.out.println(name+" is barking");
    }

}
