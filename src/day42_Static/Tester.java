package day42_Static;

public class Tester {

    String name;
    long employeeID;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, long employeeID, String jobTitle, double salary){
        this.employeeID = employeeID;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }

    public void smokeTesting(){
        System.out.println(name+" smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary: "+salary+", Employee ID: "+employeeID;
    }
}
