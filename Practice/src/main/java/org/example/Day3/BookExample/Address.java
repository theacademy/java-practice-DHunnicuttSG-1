package org.example.Day3.BookExample;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Address() {}

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "\nstreet='" + street + '\'' +
                "city='" + city + '\'' +
                "state='" + state + '\'' +
                "zip='" + zip + '\'' +
                "}\n";
    }
}
