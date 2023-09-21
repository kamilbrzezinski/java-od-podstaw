package org.example;

import java.util.Objects;

public final class MoneyClass {
    private final int value;
    private final String currency;

    public MoneyClass(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoneyClass money = (MoneyClass) o;

        if (value != money.value) return false;
        return Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    public int getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "value=" + value +
                ", currency='" + currency + '\'' +
                '}';
    }
}
