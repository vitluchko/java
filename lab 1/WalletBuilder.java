package org.example;

public interface WalletBuilder {
    WalletBuilder setUser(User user);
    WalletBuilder setId(int id);
    WalletBuilder setAmount(double amount);
    WalletBuilder setCurrency(String currency);

    Wallet build();
}
