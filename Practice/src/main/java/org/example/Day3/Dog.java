package org.example.Day3;

import java.util.Objects;

public class Dog {
    String name;
    String breed;
    int age;
    float weight;
    float height;
    boolean isFemale;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    //Add Getters and Setters
    // Add toString, Equals, and Hashcode

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public Dog() {}

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Float.compare(weight, dog.weight) == 0 && Float.compare(height, dog.height) == 0 && isFemale == dog.isFemale && Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }
//    @Override
//    public int hashCode() {
//        int result = 31; // Start with a prime number
//        result = 31 * result + id; // Hash code of the 'id' field
//        result = 31 * result + (name == null ? 0 : name.hashCode()); // Hash code of 'name'
//        return result;
//    }

}
