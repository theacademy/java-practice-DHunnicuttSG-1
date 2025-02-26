package org.example.EnumsDateBigDLambda;

public class Person {
    String firstName;
    String lastName;
    int age;
    String eyeColor;

    public Person() {}

    public Person(String firstname, String lastName, int age, String eyeColor) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
