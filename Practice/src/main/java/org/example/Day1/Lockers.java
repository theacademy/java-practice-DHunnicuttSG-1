package org.example.Day1;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Lockers {
    // hall of 100 lockers - Open or shut?
    // true = open, false = closed
    /*
    I had not written the code for this so decided to give it a try.
    Tried int arrays first.  I did not like it. Tried boolean arrays...
    close but it did not give the locker number with open/closed status.
    settled on Maps.  I like this one.  I then added some lambda functions
    to filter and count.
     */

    public static void main(String[] args) {
        Map<Integer, Boolean> lockers = new HashMap<>();

        // Initialize all lockers to closed
        for(int i = 1; i <= 100; i++) {
            lockers.put(i, false);
        }

        // Iterate through each "round" (1 to 100)
        for (int round = 1; round <=100; round++) {
            //Iterate through each locker
            for (int lockerNumber : lockers.keySet()) {
                if (lockerNumber % round == 0) {
                    lockers.put(lockerNumber, !lockers.get(lockerNumber));  //Toggle locker
                }
            }
            //System.out.println("Round " + round + ": " + lockers);
        }
        //Final state of lockers
        //Prints out all the lockers
        //Used this for debugging
        // System.out.println("\nFinal Locker States: " + lockers);

        //Filter only open lockers
        Map<Integer, Boolean> openLockers = lockers.entrySet().stream()
                .filter(Map.Entry::getValue)
                .collect(Collectors.toMap(Map.Entry::getKey, isOpen -> true));

        System.out.println("\nOpen Lockers: " + openLockers);

        // count all the open lockers
        long openLockerCount = lockers.values().stream()
                .filter(isOpen -> isOpen)
                .count();
        System.out.println("\nNumber of Open Lockers: " + openLockerCount);

        //You can print a sorted list if you use a TreeMap
        TreeMap<Integer, Boolean> sortedMap = new TreeMap<>(openLockers);
        // Print the sorted tree map
        System.out.println("\nOpen Lockers: " + sortedMap);

        //Print items on each line
        //for (Map.Entry<Integer, Boolean> item : sortedMap.entrySet()){
        //    System.out.println(item.getKey() + ": " + item.getValue());
        //}

    }
}
