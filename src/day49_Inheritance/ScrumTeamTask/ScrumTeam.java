package day49_Inheritance.ScrumTeamTask;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers) );
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(long ID){
        testers.removeIf(p-> p.ID == ID);
    }

    public void removeDeveloper(int ID){
        developers.removeIf(p->p.ID ==ID);
    }

    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);// removes thee tester from the list
        removeDeveloper(developerID);// removes the developer from the list
    }


}
