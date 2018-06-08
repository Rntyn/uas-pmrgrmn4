package io.github.rymanalu.pemrograman4;

public class Customer extends User {

    private String email;

    private String address;

    private String phoneNumber;

    @Override
    public String getUsername() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
