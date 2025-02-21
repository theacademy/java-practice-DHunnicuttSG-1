package org.example.Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExample {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Meleeshiya");
//        names.add("Gabriel");
//        names.add("Blaise");
//
//        System.out.println(names);
//
//        for(String item : names) {
//            System.out.println(item);
//        }

        Map<Integer, String> myList = new HashMap<>();
        myList.put(1, "Test");
        myList.put(2, "Test");
        myList.put(3, "Test3");
        myList.remove(2);

        System.out.println(myList.keySet());
        System.out.println(myList.entrySet());

    }
}
