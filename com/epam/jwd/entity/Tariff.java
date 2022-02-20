package com.epam.jwd.entity;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Tariff {

    private String name;
    private BigDecimal price;
    private int numberOfClients;

    public Tariff(String name, BigDecimal price, int numberOfClients) {
        this.name = name;
        this.price = price;
        this.numberOfClients = numberOfClients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tariff tariff = (Tariff) o;
        return numberOfClients == tariff.numberOfClients
                && Objects.equals(name, tariff.name) && Objects.equals(price, tariff.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, numberOfClients);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tariff {");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", numberOfClients=").append(numberOfClients);
        sb.append('}');
        return sb.toString();
    }
}
