package com.epam.jwd.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class FamilyMobileTariff extends MobileTariff {

    private int maxNumberOfSimCards;
    private int percentDiscount;

    public FamilyMobileTariff(String name, BigDecimal price, int numberOfClients) {
        super(name, price, numberOfClients);
    }

    public int getMaxNumberOfSimCards() {
        return maxNumberOfSimCards;
    }

    public void setMaxNumberOfSimCards(int maxNumberOfSimCards) {
        this.maxNumberOfSimCards = maxNumberOfSimCards;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        FamilyMobileTariff that = (FamilyMobileTariff) o;
        return maxNumberOfSimCards == that.maxNumberOfSimCards && percentDiscount == that.percentDiscount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxNumberOfSimCards, percentDiscount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tariff {");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", price=").append(getPrice());
        sb.append(", numberOfClients=").append(getNumberOfClients());
        sb.append('}');
        return sb.toString();
    }
}
