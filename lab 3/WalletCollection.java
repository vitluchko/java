package org.example;

import java.util.ArrayList;
import java.util.List;

public class WalletCollection {
    private List<Wallet> wallets;

    public WalletCollection(List<Wallet> wallets) {
        this.wallets = wallets;
    }

    public List<Wallet> sortedWallet() {
        wallets.sort(new WalletComparator());
        return wallets;
    }

    public Wallet searchById(int id) {
        for (Wallet wallet: wallets) {
            if (wallet.getId() == id) {
                return wallet;
            }
        }
        return null;
    }

    public List<Wallet> amountBiggerThan (double amount) {
        List<Wallet> res = new ArrayList<>();
        for (Wallet wallet: wallets) {
            if (wallet.getAmount() > amount) {
                res.add(wallet);
            }
        }
        return res;
    }
}
