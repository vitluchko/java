package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamWalletCollections {
    private List<Wallet> wallets;

    public StreamWalletCollections(List<Wallet> wallets) {
        this.wallets = wallets;
    }

    public List<Wallet> sortedWallets() {
        return wallets.stream().sorted(new WalletComparator()).collect(Collectors.toList());
    }

    public Wallet searchById(int id) {
        return wallets.stream().filter(wallet -> (id == wallet.getId()))
                .findFirst()
                .orElse(null);
    }

    public List<Wallet> amountBiggerThan(double amount) {
        return wallets.stream().filter(wallet -> wallet.getAmount() > amount).collect(Collectors.toList());
    }
}
