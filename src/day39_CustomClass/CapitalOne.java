package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employee6 = new Employee();

        employee1.setEmployeeInfo("Roman", 'M', "123564785","QA", 120000);
        employee2.setEmployeeInfo("Meerim",'F',"124312325","QA",120000.5);
        employee3.setEmployeeInfo("Musa", 'M', "123456789", "SDET", 135000);
        employee4.setEmployeeInfo("Ramazan", 'M', "123121456", "QA", 150000);
        employee5.setEmployeeInfo("Tetiana", 'F', "987654321", "SDET", 125000);
        employee6.setEmployeeInfo("Virginia",'F', "123457689", "QA", 150000.7);




        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6));

        double max = Integer.MIN_VALUE;
        String name = "";
        for(Employee each: employeeList){
            double eachSalary = each.salary;
            if(eachSalary > max){
                max = eachSalary;
                name = each.name;
            }
        }

        System.out.println(max);
        System.out.println(name);

        System.out.println("===========================");
        //employeeList.removeIf(p-> p.salary>135000);
        //employeeList.removeIf(p->p.jobTitle.equals("QA"));
        //employeeList.removeIf(p->p.name.toLowerCase().contains("m"));
        //employeeList.removeIf(p->p.name.charAt();

        for(Employee each: employeeList){
            //each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }






    }
}
