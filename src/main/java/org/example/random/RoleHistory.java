package org.example.random;

//import org.javatuples.Tuple;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

// get role history and return date to roles map
public class RoleHistory {

    public HashMap<LocalDateTime, String> getRoleDatesMap(HashMap<LocalDateTime, String> roleHistory, List<LocalDateTime> dates) {
        HashMap<LocalDateTime, String> dateRoles = new HashMap<>();
      //  HashMap<LocalDateTime, String> dateRoles2 = new HashMap<>();

/*
        HashMap<LocalDateTime, String> dateRoles1 = dates.stream()
                .flatMap(date -> roleHistory.entrySet().stream().sorted(Map.Entry.comparingByKey())
                        .filter(entry -> entry.getKey().isBefore(date) || entry.getKey().equals(date))
                       // .limit(1)
                        .map(entry -> Map.entry(date, entry.getValue())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, HashMap::new));
*/
        //  Collections.reverseOrder(Map.Entry.comparingByKey());
        for (LocalDateTime date : dates) {
            roleHistory.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(x -> {
                        if (x.getKey().isBefore(date) || x.getKey().equals(date)) {
                            dateRoles.put(date, x.getValue());
                        }
                    });
            /*
            for (HashMap.Entry<LocalDateTime, String> entry : roleHistory.entrySet().) {
                if (entry.getKey().isBefore(date) || entry.getKey().equals(date)) {
                    dateRoles2.put(date,entry.getValue());
                    break;
                }else {
               //     break;
                }


            }*/

        }
        System.out.print("New Map dateroles: \n---------------------------\n");

        dateRoles.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.print("New Map dateroles1: \n---------------------------\n");
/*
        dateRoles1.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.print("New Map dateroles2: \n---------------------------\n");

        dateRoles2.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
*/
        return dateRoles;
    }

    public HashMap<LocalDateTime, String> getRoleDatesMap1(HashMap<LocalDateTime, String> roleHistory, List<LocalDateTime> dates) {

        //create hashmap
        HashMap<LocalDateTime, String> dateAndRoles = new HashMap<>();

        //   Collections.reverseOrder(Map.Entry.comparingByKey());
        //sort hashmap in desc
        // loop over date
        /*
        for (LocalDateTime date : dates) {

            roleHistory.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(
                    x -> {
                        if (x.getKey().isBefore(date) || x.getKey().equals(date)) {
                            dateAndRoles.put(date, x.getValue());
                        }
                    }

            );
        }

        dates.stream().forEach( y->
        {
            roleHistory.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(
                    x -> {
                        if (x.getKey().isBefore(y) || x.getKey().equals(y)) {
                            dateAndRoles.put(y, x.getValue());
                        }
                    }

            );
        });
*/
        dates.stream().forEach( y->
        {
            roleHistory.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                    filter(x-> x.getKey().isBefore(y) || x.getKey().equals(y)  )
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        });


        dateAndRoles.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        return dateAndRoles;
        //loop over hashmap
        //  if map.key is before date, thta menas his role in this date is the key
        // not?  move to next element

        //print new hash
    }
}
