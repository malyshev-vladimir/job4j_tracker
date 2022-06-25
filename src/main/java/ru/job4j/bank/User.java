package ru.job4j.bank;

import java.util.Objects;

/**
 * The class describes user with a passport number and a username.
 */
public class User {
    /**
     * The class attributes consist of passport number and username.
     */
    private String passport;
    private String username;

    /**
     * The constructor of the class "User".
     * @param passport user's passport number
     * @param username user's username
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}