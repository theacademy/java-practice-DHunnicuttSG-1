package org.example.Day4.ReadWriteFileList;

public class Student {
    String id;
    String firstName;
    String lastName;
    String cohort;

    public Student() {}

    public Student(String id, String firstName, String lastName, String cohort) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cohort = cohort;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}
