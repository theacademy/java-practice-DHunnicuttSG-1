package org.example.EnumsDateBigDLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people = createList(people);

        List<Person> over30 = people.stream()
                .filter(p -> p.getAge() > 30)
                .toList();

        Double averageAge = people.stream()
                .mapToInt(p -> p.getAge())
                .average()
                .orElse(0.0);

        System.out.println(averageAge);
        System.out.println(over30);
    }

    public static List<Person> createList(List<Person> people) {
        Person p = new Person();
        p.setFirstName("David");
        p.setAge(45);
        people.add(p);

        Person p2 = new Person();
        p2.setFirstName("Jane");
        p2.setAge(24);
        people.add(p2);

        Person p3 = new Person();
        p3.setFirstName("Christophe");
        p3.setAge(22);
        people.add(p3);

        Person p4 = new Person();
        p4.setFirstName("Farrah");
        p4.setAge(28);
        people.add(p4);

        Person p5 = new Person();
        p5.setFirstName("Kate");
        p5.setAge(18);
        people.add(p5);

        Person p6 = new Person();
        p6.setFirstName("Farshad");
        p6.setAge(37);
        people.add(p6);

        Person p7 = new Person();
        p7.setFirstName("Somya");
        p7.setAge(33);
        people.add(p7);

        return people;
    }
}
