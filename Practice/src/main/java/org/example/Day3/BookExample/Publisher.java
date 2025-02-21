package org.example.Day3.BookExample;

public class Publisher {
    private String name;
    private Address address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "\nName='" + name + "\n" +
                "Address=" + address +
                "Phone='" + phone + "\n" +
                "}";
    }
}
