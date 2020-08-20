package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResource.*; // imports all statics from HumanRace

public class BankOfAzerbaijan {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        /*
        list.add( HumanResource.employee1);
        list.add( HumanResource.employee3);
        list.add( HumanResource.employee5);
        */

        /*
        list.addAll(Arrays.asList( HumanResource.employee1,employee2, employee5));
                    // by using static import we are able to import static members , so can call the without the class
        */

        list.addAll(Arrays.asList(HumanResource.employee1, HumanResource.employee3, HumanResource.employee5));

        System.out.println("Total Numbers of Employees: "+list.size());

        System.out.println("=====================================================================================");

        for(Employee each : list){
            System.out.println(each.name+" : "+each.salary);
        }

    }
}
