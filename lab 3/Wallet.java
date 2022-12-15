package org.example;

import java.util.Objects;

public class Wallet implements Comparable<Wallet> {
    private User user;
    private int id;
    private double amount;
    private String currency;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "user=" + user +
                ", id='" + id + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wallet)) return false;
        Wallet wallet = (Wallet) o;
        return id == wallet.id && Double.compare(wallet.amount, amount) == 0 && user.equals(wallet.user) && currency.equals(wallet.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, id, amount, currency);
    }

    @Override
    public int compareTo(Wallet o) {
        Integer x = id;
        return x.compareTo(o.getId());
    }
}
