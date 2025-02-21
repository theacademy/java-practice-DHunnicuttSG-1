package org.example.Day3;

public class HashApp {
    public static void main(String[] args) {
        MyIncorrectHashCode obj1 = new MyIncorrectHashCode(1, "Alice");
        MyIncorrectHashCode obj2 = new MyIncorrectHashCode(1, "Bob"); // Same id, different name

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // false (because names are different)
        System.out.println("obj1.hashCode() == obj2.hashCode(): " + (obj1.hashCode() == obj2.hashCode())); // true! (because hashCode only uses id)

        // Now, let's see what happens with a HashSet
        java.util.Set<MyIncorrectHashCode> set = new java.util.HashSet<>();
        set.add(obj1);
        set.add(obj2); // obj2 should be a duplicate, but it gets added anyway!

        System.out.println("HashSet size: " + set.size()); // Output: 2 (Incorrect!)
        System.out.println("1: " + obj1.hashCode());
        System.out.println("2: " + obj2.hashCode());
    }
}
