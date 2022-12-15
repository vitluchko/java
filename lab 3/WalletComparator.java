package org.example;

import java.util.Comparator;
import java.lang.Integer;

public class WalletComparator implements Comparator<Wallet> {

    @Override
    public int compare(Wallet o1, Wallet o2) {
        Integer x = o1.getId();
        return x.compareTo(o2.getId());
    }
}
