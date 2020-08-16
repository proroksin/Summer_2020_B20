package day42_Static;

public class Developer {

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

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBug(){
        System.out.println(name+" is fixing the bug");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary: "+salary+", Employee ID: "+employeeID;
    }
}
