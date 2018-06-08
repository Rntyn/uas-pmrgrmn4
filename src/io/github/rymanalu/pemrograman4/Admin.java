package io.github.rymanalu.pemrograman4;

public class Admin extends User {

    private String role;

    private String username;

    @Override
    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

}
