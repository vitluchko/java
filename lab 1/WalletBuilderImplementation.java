package org.example;

public class WalletBuilderImplementation implements WalletBuilder {
    Wallet wallet = new Wallet();

    @Override
    public WalletBuilder setUser(User user) {
        wallet.setUser(user);
        return this;
    }

    @Override
    public WalletBuilder setId(int id) {
        wallet.setId(id);
        return this;
    }

    @Override
    public WalletBuilder setAmount(double amount) {
        wallet.setAmount(amount);
        return this;
    }

    @Override
    public WalletBuilder setCurrency(String currency) {
        wallet.setCurrency(currency);
        return this;
    }

    @Override
    public Wallet build() {
        return wallet;
    }
}
