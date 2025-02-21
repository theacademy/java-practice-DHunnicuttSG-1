package org.example.Day3.BookExample;

public class Author {
    private String FirstName;
    private String lastName;
    private Address address;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "\nFirstName='" + FirstName + "\n" +
                "lastName='" + lastName + "\n" +
                "address=" + address +
                "}\n\n";
    }
}
