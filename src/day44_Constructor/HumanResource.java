package day44_Constructor;
/*
Create a class called HumanResources
                declare 5 variables of Employee as static
                use static block to:
                            1. initialize those static variables
                            2. sett all the info of the Employees
 */
public class HumanResource {

    static Employee employee1; // we can call it from the class name
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    //employee1 = new Employee();
    //employee1.setEmployeeInfo();

    static{ // as soon as the class called, the static variables need to be set
        employee1= new Employee();
        employee2= new Employee();
        employee3= new Employee();
        employee4= new Employee();
        employee5= new Employee();

        employee1.setEmployeeInfo("Muhammed",12312,456432894,"SDET",120000,'M');
        employee2.setEmployeeInfo("Erkan",45678,123987652,"QA",115000,'M');
        employee3.setEmployeeInfo("Asiya",56431,657098364,"Instructor",99000,'F');
        employee4.setEmployeeInfo("Ayse",17876,342567215,"SDET",125000,'F');
        employee5.setEmployeeInfo("Ahmet",67543,987654784,"Developer",140000,'M');

    }

}
