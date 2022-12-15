package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        User user = new UserBuilderImplementation()
                .setName("Vladislav")
                .setIdCode("12345")
                .setCountry("Australia")
                .build();

        User us = new UserBuilderImplementation()
                .setName("Artem")
                .setIdCode("67890")
                .setCountry("France")
                .build();

        Wallet VladUSD = new WalletBuilderImplementation().setId(1).setAmount(532.24).setCurrency("USD").setUser(user).build();
        Wallet VladEUR = new WalletBuilderImplementation().setId(2).setAmount(245.24).setCurrency("EUR").setUser(user).build();
        Wallet VladUAH = new WalletBuilderImplementation().setId(3).setAmount(12343.24).setCurrency("UAH").setUser(user).build();
        Wallet ArtemEUR = new WalletBuilderImplementation().setId(4).setAmount(142.24).setCurrency("EUR").setUser(us).build();
        Wallet ArtemUAH = new WalletBuilderImplementation().setId(5).setAmount(25115.24).setCurrency("UAH").setUser(us).build();

        List<Wallet> wallets = new ArrayList<>();
        {
            wallets.add(VladUAH);
            wallets.add(ArtemEUR);
            wallets.add(VladUSD);
            wallets.add(VladEUR);
            wallets.add(ArtemUAH);
        }

        StreamWalletCollections wlcl = new StreamWalletCollections(wallets);

        System.out.println("\nSorted wallets:");
        List<Wallet> res = wlcl.sortedWallets();
        for (var i : res) {
            System.out.println(i.toString());
        }

        System.out.println("\nSearch by id:");
        Wallet searchWallet = wlcl.searchById(4);
        System.out.println(searchWallet);

        System.out.println("\nAmount bigger than:");
        List<Wallet> priceBiggerThan = wlcl.amountBiggerThan(700.0);
        for (var i : priceBiggerThan) {
            System.out.println(i.toString());
        }
    }
}
