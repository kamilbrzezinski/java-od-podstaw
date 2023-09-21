package org.example;

import java.util.Objects;

public class Money {
    private int value;
    private String currency;

    public Money(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (value != money.value) return false;
        return Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
