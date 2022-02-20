package com.epam.jwd.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class MobileTariff extends Tariff {

    private int numberOfFreeMinutes;
    private int numberOfFreeSms;
    private int mobileDataLimit;

    public MobileTariff(String name, BigDecimal price, int numberOfClients) {
        super(name, price, numberOfClients);
    }

    public int getNumberOfFreeMinutes() {
        return numberOfFreeMinutes;
    }

    public void setNumberOfFreeMinutes(int numberOfFreeMinutes) {
        this.numberOfFreeMinutes = numberOfFreeMinutes;
    }

    public int getNumberOfFreeSms() {
        return numberOfFreeSms;
    }

    public void setNumberOfFreeSms(int numberOfFreeSms) {
        this.numberOfFreeSms = numberOfFreeSms;
    }

    public int getMobileDataLimit() {
        return mobileDataLimit;
    }

    public void setMobileDataLimit(int mobileDataLimit) {
        this.mobileDataLimit = mobileDataLimit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MobileTariff that = (MobileTariff) obj;
        return numberOfFreeMinutes == that.numberOfFreeMinutes
                && numberOfFreeSms == that.numberOfFreeSms
                && mobileDataLimit == that.mobileDataLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFreeMinutes, numberOfFreeSms, mobileDataLimit);
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
