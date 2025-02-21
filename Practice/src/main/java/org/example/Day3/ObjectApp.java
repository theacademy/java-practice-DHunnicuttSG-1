package org.example.Day3;

import java.util.Objects;

public class ObjectApp {

    //Compare objects
    public static void main(String[] args) {
        Dog dog1 = new Dog("bingo", "hound", 3);
        Dog dog2 = new Dog("Brick", "Doberman");
        Dog dog3 = new Dog("bingo", "hound", 4);

        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals((dog3)));

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog3.hashCode());
    }

}
