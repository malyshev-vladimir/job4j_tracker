package ru.job4j.bank;

import java.util.Objects;

/**
 * The class describes account with a requisite and a balance.
 */
public class Account {
    /**
     * The class attributes consist of requisite and balance.
     */
    private String requisite;
    private double balance;

    /**
     * The constructor of the class "User".
     * @param requisite account's requisite
     * @param balance account's balance
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}