package day47_Encapsulation;

public class MyCredentials {

    public static void main(String[] args) {

        Credentials obj = new Credentials("Mike", 34);

        //obj.userName = "cybertek";
        obj.setUserName("Cybertek");
        obj.setPassword("CyberTek12345");

        //System.out.println(obj.userName);
        //System.out.println(obj.password);

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);


    }
}
