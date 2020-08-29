package day47_Encapsulation;

public class Credentials {

    public String name;
    public int age;
    private String userName;
    private String password;

    public static String companyName;

    static{
        companyName = "Facebook";
    }

    public Credentials(String name, int age) {

        this.name = name;
        this.age = age;


    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }




}
