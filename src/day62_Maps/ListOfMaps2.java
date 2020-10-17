package day62_Maps;

import java.util.*;
import java.time.LocalDate;

public class ListOfMaps2 {
    public static void main(String[] args) {

        String[] friends = {};
        LocalDate[] DOBFriends = {};

        String[] classMates = {};
        LocalDate[] DOBClassMates = {};

        String[] family = {};
        LocalDate[] DOBFamily = {};



        List<Map<String, LocalDate>> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ) );


        System.out.println(list);







    }
}
